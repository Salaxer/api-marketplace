package com.salaxer.marketplace.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.salaxer.marketplace.domain.ProductDTO;
import com.salaxer.marketplace.domain.repository.DomainProductRepository;
import com.salaxer.marketplace.persistence.crud.ProductCrudRepository;
import com.salaxer.marketplace.persistence.entity.Product;
import com.salaxer.marketplace.persistence.mapper.ProductMapper;


@Repository
public class ProductRepository implements DomainProductRepository{
  
  @Autowired
  private ProductCrudRepository productCrudRepository;
  
  @Autowired
  private ProductMapper mapper;

  @Override
  public List<ProductDTO> getAll(){
    List<Product> products = (List<Product>) productCrudRepository.findAll();
    return mapper.toProducts(products);
  }
  @Override
  public void delete(int idProduct){
    productCrudRepository.deleteById(idProduct);
  }
  @Override
  public Optional<List<ProductDTO>> getByCategory(int categoryId) {
    List<Product> product  = productCrudRepository.findByIdCategoriesOrderByNameAsc(categoryId);
    return Optional.of(mapper.toProducts(
      product
    ));
  }
  @Override
  public ProductDTO save(ProductDTO productDto) {
    Product product = mapper.toProductis(productDto);
    return mapper.toProduct(productCrudRepository.save(product));
  }
  @Override
  public Optional<List<ProductDTO>> getOutOfStock(int quantity) {
    Optional<List<Product>> products = productCrudRepository.findByQuantityLessThanAndState(quantity, 1);
    return products.map(prods -> mapper.toProducts(prods));
  }
  @Override
  public Optional<ProductDTO> getProduct(int productId) {
    return productCrudRepository.findById(productId).map(prod -> mapper.toProduct(prod));
  }
}

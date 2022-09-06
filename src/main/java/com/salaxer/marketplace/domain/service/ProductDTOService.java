package com.salaxer.marketplace.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salaxer.marketplace.domain.dto.ProductDTO;
import com.salaxer.marketplace.domain.repository.ProductDTORepository;

@Service
public class ProductDTOService {
  
  @Autowired
  private ProductDTORepository ProductDTORepository;

  public List<ProductDTO> getAll(){
    return ProductDTORepository.getAll();
  };

  public Optional<ProductDTO> getProduct(int productId){
    return ProductDTORepository.getProduct(productId);
  }

  public Optional<List<ProductDTO>> getByCategory(int categoryId){
    return ProductDTORepository.getByCategory(categoryId);
  }

  public Optional<List<ProductDTO>> getOutOfStock(int quantity){
    return ProductDTORepository.getOutOfStock(quantity);
  }

  public ProductDTO save(ProductDTO product){
    return ProductDTORepository.save(product);
  }

  public boolean delete(int productId){
    try {
      ProductDTORepository.delete(productId);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

}

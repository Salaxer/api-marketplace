package com.salaxer.marketplace.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salaxer.marketplace.domain.ProductDTO;
import com.salaxer.marketplace.domain.repository.DomainProductRepository;

@Service
public class ProductDTOService {
  
  @Autowired
  private DomainProductRepository domainProductRepository;

  public List<ProductDTO> getAll(){
    return domainProductRepository.getAll();
  };

  public Optional<ProductDTO> getProduct(int productId){
    return domainProductRepository.getProduct(productId);
  }

  public Optional<List<ProductDTO>> getByCategory(int categoryId){
    return domainProductRepository.getByCategory(categoryId);
  }

  public Optional<List<ProductDTO>> getOutOfStock(int quantity){
    return domainProductRepository.getOutOfStock(quantity);
  }

  public ProductDTO save(ProductDTO product){
    return domainProductRepository.save(product);
  }

  public boolean delete(int productId){
    try {
      domainProductRepository.delete(productId);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

}

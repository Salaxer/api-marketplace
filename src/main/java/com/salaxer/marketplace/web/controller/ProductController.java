package com.salaxer.marketplace.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salaxer.marketplace.domain.ProductDTO;
import com.salaxer.marketplace.domain.service.ProductDTOService;

@RestController
@RequestMapping("/products")
public class ProductController {
  
  @Autowired
  private ProductDTOService productDTOService;

  @GetMapping
  public List<ProductDTO> getAll(){
    return productDTOService.getAll();
  } 

  public Optional<ProductDTO> getProduct(int productId){
    return productDTOService.getProduct(productId);
  }

  public Optional<List<ProductDTO>> getByCategory(int categoryId){
    return productDTOService.getByCategory(categoryId);
  }

  public Optional<List<ProductDTO>> getOutOfStock(int quantity){
    return productDTOService.getOutOfStock(quantity);
  }

  public ProductDTO save(ProductDTO product){
    return productDTOService.save(product);
  }

  public boolean delete(int productId){
    try {
      productDTOService.delete(productId);
      return true;
    } catch (Exception e) {
      return false;
    }
  }


}

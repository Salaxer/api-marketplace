package com.salaxer.marketplace.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salaxer.marketplace.domain.dto.ProductDTO;
import com.salaxer.marketplace.domain.service.ProductDTOService;

@RestController
@RequestMapping("/products")
public class ProductController {
  
  @Autowired
  private ProductDTOService productDTOService;

  @GetMapping
  public ResponseEntity<List<ProductDTO>> getAll(){
    return new ResponseEntity<>(productDTOService.getAll(), HttpStatus.OK);
  } 

  @GetMapping(path = "{id}")
  public ResponseEntity<ProductDTO> getProduct(@PathVariable("id") int productId){
    return productDTOService.getProduct(productId)
      .map(prod -> new ResponseEntity<>(prod, HttpStatus.OK))
      .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @GetMapping(path = "category/{id}")
  public ResponseEntity<List<ProductDTO>> getByCategory(@PathVariable("id") int categoryId){
    return productDTOService.getByCategory(categoryId)
      .map(prod -> new ResponseEntity<>(prod, HttpStatus.OK))
      .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @GetMapping(path = "stock/{quantity}")
  public Optional<List<ProductDTO>> getOutOfStock(@PathVariable("quantity") int quantity){
    return productDTOService.getOutOfStock(quantity);
  }
  
  @PostMapping()
  public ResponseEntity<ProductDTO> save(@RequestBody ProductDTO product){
    return new ResponseEntity<>(productDTOService.save(product), HttpStatus.CREATED);
  }
  
  @DeleteMapping(path = "{id}")
  public ResponseEntity<Object> delete(@PathVariable("id") int productId){
    return productDTOService.delete(productId)
      ?  ResponseEntity.status(HttpStatus.ACCEPTED).body("Eliminado Correctamente")
      :  ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se ha eliminado Correctamente");
  }

  @PutMapping()
  public ProductDTO update(@RequestBody ProductDTO product){
    return productDTOService.save(product);
  }


}

package com.salaxer.marketplace.domain.repository;

import java.util.List;
import java.util.Optional;

import com.salaxer.marketplace.domain.dto.ProductDTO;

public interface ProductDTORepository {
  public List<ProductDTO> getAll();
  public Optional<List<ProductDTO>> getByCategory(int categoryId);
  public Optional<List<ProductDTO>> getOutOfStock(int quantity);
  public Optional<ProductDTO> getProduct(int productId);
  public ProductDTO save(ProductDTO product);
  public void delete(int productId);
}
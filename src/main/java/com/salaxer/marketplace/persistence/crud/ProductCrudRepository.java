package com.salaxer.marketplace.persistence.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.salaxer.marketplace.persistence.entity.Product;

public interface ProductCrudRepository extends CrudRepository<Product, Integer>{
  public abstract List<Product> findByIdCategoriesOrderByNameAsc(int idCategories);
  public abstract Optional<List<Product>> findByQuantityLessThanAndState(int quantity, int state);
}

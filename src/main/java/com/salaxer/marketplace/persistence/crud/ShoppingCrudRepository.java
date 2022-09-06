package com.salaxer.marketplace.persistence.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.salaxer.marketplace.persistence.entity.Shopping;

public interface ShoppingCrudRepository extends CrudRepository<Shopping, Integer>{
  public abstract Optional<List<Shopping>> findByIdCustomers(Integer idCustomer);
}

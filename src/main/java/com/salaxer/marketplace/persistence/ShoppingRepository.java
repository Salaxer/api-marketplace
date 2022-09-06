package com.salaxer.marketplace.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.salaxer.marketplace.domain.dto.PurchaseDTO;
import com.salaxer.marketplace.domain.repository.PurchaseDTORepository;
import com.salaxer.marketplace.persistence.crud.ShoppingCrudRepository;
import com.salaxer.marketplace.persistence.entity.Shopping;
import com.salaxer.marketplace.persistence.mapper.PurchaseMapper;

@Repository
public class ShoppingRepository implements PurchaseDTORepository{

  @Autowired
  private ShoppingCrudRepository shoppingCrudRepository;

  @Autowired
  private PurchaseMapper mapper;

  @Override
  public List<PurchaseDTO> getAll() {
    return mapper.toPurchases((List<Shopping>) shoppingCrudRepository.findAll());
  }

  @Override
  public Optional<List<PurchaseDTO>> getByClient(Integer clientId) {
    return shoppingCrudRepository.findByIdCustomers(clientId)
    .map(shop -> mapper.toPurchases(shop));
  }

  @Override
  public PurchaseDTO save(PurchaseDTO purchaseDTO) {
    Shopping shopping = mapper.toShopping(purchaseDTO);
    shopping.getProducts().forEach((product) -> product.setShopping(shopping));
    return mapper.toPurchase(shoppingCrudRepository.save(shopping));
  }
  
}

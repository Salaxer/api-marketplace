package com.salaxer.marketplace.persistence.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.salaxer.marketplace.domain.dto.PurchaseDTO;
import com.salaxer.marketplace.persistence.entity.Shopping;

@Mapper(componentModel = "spring", uses = {PurchaseItemMapper.class})
public interface PurchaseMapper {
  @Mappings({
    @Mapping(source = "idShopping", target = "purchaseId"),
    @Mapping(source = "idCustomers", target = "clientId"),
    @Mapping(source = "date", target = "date"),
    @Mapping(source = "paymentMethod", target = "paymentMethod"),
    @Mapping(source = "comment", target = "comment"),
    @Mapping(source = "state", target = "state"),
    @Mapping(source = "products", target = "items"),
  })
  PurchaseDTO toPurchase(Shopping shopping);

  List<PurchaseDTO> toPurchases(List<Shopping> shoppings);

  @InheritInverseConfiguration
  @Mapping(target = "customer", ignore = true)
  Shopping toShopping(PurchaseDTO purchaseDTO);
}

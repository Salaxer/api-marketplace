package com.salaxer.marketplace.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.salaxer.marketplace.domain.dto.PurchaseItemDTO;
import com.salaxer.marketplace.persistence.entity.ProductShopping;

@Mapper(componentModel = "spring")
public interface PurchaseItemMapper {
  
  @Mappings({
    @Mapping(source = "id.idProducts", target = "productId"),
    @Mapping(source = "quantity", target = "quantity"),
    @Mapping(source = "total", target = "total"),
    @Mapping(source = "state", target = "state"),
  })
  PurchaseItemDTO toPurchaseItemDTO(ProductShopping product);

  @InheritInverseConfiguration
  @Mappings({
    @Mapping(target = "id.idShopping", ignore = true),
    @Mapping(target = "shopping", ignore = true),
    @Mapping(target = "product", ignore = true),
  })
  ProductShopping toShopping(PurchaseItemDTO purchase);
}

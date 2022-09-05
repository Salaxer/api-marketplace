package com.salaxer.marketplace.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.salaxer.marketplace.domain.Category;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

  @Mappings({
    @Mapping(source = "idCategories", target = "categoryId"),
    @Mapping(source = "description", target = "category"),
    @Mapping(source = "state", target = "state"),
  })
  Category toCategory(com.salaxer.marketplace.persistence.entity.Category category);

  @InheritInverseConfiguration
  @Mapping(target = "products", ignore = true)
  com.salaxer.marketplace.persistence.entity.Category toCategories(Category category);

}

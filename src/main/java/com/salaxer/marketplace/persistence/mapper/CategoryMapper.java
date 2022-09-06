package com.salaxer.marketplace.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.salaxer.marketplace.domain.dto.CategoryDTO;
import com.salaxer.marketplace.persistence.entity.Category;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

  @Mappings({
    @Mapping(source = "idCategories", target = "categoryId"),
    @Mapping(source = "description", target = "category"),
    @Mapping(source = "state", target = "state"),
  })
  CategoryDTO toCategory(Category category);

  @InheritInverseConfiguration
  @Mapping(target = "products", ignore = true)
  Category toCategories(CategoryDTO category);

}

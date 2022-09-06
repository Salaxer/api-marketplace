package com.salaxer.marketplace.persistence.mapper;

import com.salaxer.marketplace.domain.dto.CategoryDTO;
import com.salaxer.marketplace.persistence.entity.Category;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-05T18:32:11-0500",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220719-0747, environment: Java 17.0.4 (Eclipse Adoptium)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDTO toCategory(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDTO categoryDTO = new CategoryDTO();

        if ( category.getIdCategories() != null ) {
            categoryDTO.setCategoryId( category.getIdCategories() );
        }
        categoryDTO.setCategory( category.getDescription() );
        if ( category.getState() != null ) {
            categoryDTO.setState( category.getState() );
        }

        return categoryDTO;
    }

    @Override
    public Category toCategories(CategoryDTO category) {
        if ( category == null ) {
            return null;
        }

        Category category1 = new Category();

        category1.setIdCategories( category.getCategoryId() );
        category1.setDescription( category.getCategory() );
        category1.setState( category.getState() );

        return category1;
    }
}

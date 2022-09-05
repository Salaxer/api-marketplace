package com.salaxer.marketplace.persistence.mapper;

import com.salaxer.marketplace.persistence.entity.Category;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-04T21:12:28-0500",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220719-0747, environment: Java 17.0.4 (Eclipse Adoptium)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public com.salaxer.marketplace.domain.Category toCategory(Category category) {
        if ( category == null ) {
            return null;
        }

        com.salaxer.marketplace.domain.Category category1 = new com.salaxer.marketplace.domain.Category();

        if ( category.getIdCategories() != null ) {
            category1.setCategoryId( category.getIdCategories() );
        }
        category1.setCategory( category.getDescription() );
        if ( category.getState() != null ) {
            category1.setState( category.getState() );
        }

        return category1;
    }

    @Override
    public Category toCategories(com.salaxer.marketplace.domain.Category category) {
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

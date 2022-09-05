package com.salaxer.marketplace.persistence.mapper;

import com.salaxer.marketplace.domain.ProductDTO;
import com.salaxer.marketplace.persistence.entity.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-04T21:13:26-0500",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220719-0747, environment: Java 17.0.4 (Eclipse Adoptium)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public ProductDTO toProduct(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        if ( product.getIdProduct() != null ) {
            productDTO.setProductId( product.getIdProduct() );
        }
        productDTO.setName( product.getName() );
        if ( product.getIdCategories() != null ) {
            productDTO.setCategoryId( product.getIdCategories() );
        }
        if ( product.getPrice() != null ) {
            productDTO.setPrice( product.getPrice() );
        }
        if ( product.getQuantity() != null ) {
            productDTO.setStock( product.getQuantity() );
        }
        if ( product.getState() != null ) {
            productDTO.setState( product.getState() );
        }
        productDTO.setCategory( categoryMapper.toCategory( product.getCategory() ) );

        return productDTO;
    }

    @Override
    public List<ProductDTO> toProducts(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductDTO> list = new ArrayList<ProductDTO>( products.size() );
        for ( Product product : products ) {
            list.add( toProduct( product ) );
        }

        return list;
    }

    @Override
    public Product toProductis(ProductDTO product) {
        if ( product == null ) {
            return null;
        }

        Product product1 = new Product();

        product1.setIdProduct( product.getProductId() );
        product1.setName( product.getName() );
        product1.setIdCategories( product.getCategoryId() );
        product1.setPrice( product.getPrice() );
        product1.setQuantity( product.getStock() );
        product1.setState( product.getState() );
        product1.setCategory( categoryMapper.toCategories( product.getCategory() ) );

        return product1;
    }
}

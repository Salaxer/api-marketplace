package com.salaxer.marketplace.persistence.mapper;

import com.salaxer.marketplace.domain.dto.PurchaseItemDTO;
import com.salaxer.marketplace.persistence.entity.ProductShopping;
import com.salaxer.marketplace.persistence.entity.ProductShoppingPK;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-05T23:35:01-0500",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220719-0747, environment: Java 17.0.4 (Eclipse Adoptium)"
)
@Component
public class PurchaseItemMapperImpl implements PurchaseItemMapper {

    @Override
    public PurchaseItemDTO toPurchaseItemDTO(ProductShopping product) {
        if ( product == null ) {
            return null;
        }

        PurchaseItemDTO purchaseItemDTO = new PurchaseItemDTO();

        Integer idProducts = productIdIdProducts( product );
        if ( idProducts != null ) {
            purchaseItemDTO.setProductId( idProducts );
        }
        if ( product.getQuantity() != null ) {
            purchaseItemDTO.setQuantity( product.getQuantity() );
        }
        if ( product.getTotal() != null ) {
            purchaseItemDTO.setTotal( product.getTotal() );
        }
        if ( product.getState() != null ) {
            purchaseItemDTO.setState( product.getState() );
        }

        return purchaseItemDTO;
    }

    @Override
    public ProductShopping toShopping(PurchaseItemDTO purchase) {
        if ( purchase == null ) {
            return null;
        }

        ProductShopping productShopping = new ProductShopping();

        productShopping.setId( purchaseItemDTOToProductShoppingPK( purchase ) );
        productShopping.setQuantity( purchase.getQuantity() );
        productShopping.setTotal( purchase.getTotal() );
        productShopping.setState( purchase.getState() );

        return productShopping;
    }

    private Integer productIdIdProducts(ProductShopping productShopping) {
        if ( productShopping == null ) {
            return null;
        }
        ProductShoppingPK id = productShopping.getId();
        if ( id == null ) {
            return null;
        }
        Integer idProducts = id.getIdProducts();
        if ( idProducts == null ) {
            return null;
        }
        return idProducts;
    }

    protected ProductShoppingPK purchaseItemDTOToProductShoppingPK(PurchaseItemDTO purchaseItemDTO) {
        if ( purchaseItemDTO == null ) {
            return null;
        }

        ProductShoppingPK productShoppingPK = new ProductShoppingPK();

        productShoppingPK.setIdProducts( purchaseItemDTO.getProductId() );

        return productShoppingPK;
    }
}

package com.salaxer.marketplace.persistence.mapper;

import com.salaxer.marketplace.domain.dto.PurchaseDTO;
import com.salaxer.marketplace.domain.dto.PurchaseItemDTO;
import com.salaxer.marketplace.persistence.entity.ProductShopping;
import com.salaxer.marketplace.persistence.entity.Shopping;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-05T18:49:21-0500",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220719-0747, environment: Java 17.0.4 (Eclipse Adoptium)"
)
@Component
public class PurchaseMapperImpl implements PurchaseMapper {

    @Autowired
    private PurchaseItemMapper purchaseItemMapper;

    @Override
    public PurchaseDTO toPurchase(Shopping shopping) {
        if ( shopping == null ) {
            return null;
        }

        PurchaseDTO purchaseDTO = new PurchaseDTO();

        if ( shopping.getIdShopping() != null ) {
            purchaseDTO.setPurchaseId( shopping.getIdShopping() );
        }
        if ( shopping.getIdCustomers() != null ) {
            purchaseDTO.setClientId( String.valueOf( shopping.getIdCustomers() ) );
        }
        purchaseDTO.setDate( shopping.getDate() );
        purchaseDTO.setPaymentMethod( shopping.getPaymentMethod() );
        purchaseDTO.setComment( shopping.getComment() );
        purchaseDTO.setState( shopping.getState() );
        purchaseDTO.setItems( productShoppingListToPurchaseItemDTOList( shopping.getProducts() ) );

        return purchaseDTO;
    }

    @Override
    public List<PurchaseDTO> toPurchases(List<Shopping> shoppings) {
        if ( shoppings == null ) {
            return null;
        }

        List<PurchaseDTO> list = new ArrayList<PurchaseDTO>( shoppings.size() );
        for ( Shopping shopping : shoppings ) {
            list.add( toPurchase( shopping ) );
        }

        return list;
    }

    @Override
    public Shopping toShopping(PurchaseDTO purchaseDTO) {
        if ( purchaseDTO == null ) {
            return null;
        }

        Shopping shopping = new Shopping();

        shopping.setIdShopping( purchaseDTO.getPurchaseId() );
        if ( purchaseDTO.getClientId() != null ) {
            shopping.setIdCustomers( Integer.parseInt( purchaseDTO.getClientId() ) );
        }
        shopping.setDate( purchaseDTO.getDate() );
        shopping.setPaymentMethod( purchaseDTO.getPaymentMethod() );
        shopping.setComment( purchaseDTO.getComment() );
        shopping.setState( purchaseDTO.getState() );
        shopping.setProducts( purchaseItemDTOListToProductShoppingList( purchaseDTO.getItems() ) );

        return shopping;
    }

    protected List<PurchaseItemDTO> productShoppingListToPurchaseItemDTOList(List<ProductShopping> list) {
        if ( list == null ) {
            return null;
        }

        List<PurchaseItemDTO> list1 = new ArrayList<PurchaseItemDTO>( list.size() );
        for ( ProductShopping productShopping : list ) {
            list1.add( purchaseItemMapper.toPurchaseItemDTO( productShopping ) );
        }

        return list1;
    }

    protected List<ProductShopping> purchaseItemDTOListToProductShoppingList(List<PurchaseItemDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductShopping> list1 = new ArrayList<ProductShopping>( list.size() );
        for ( PurchaseItemDTO purchaseItemDTO : list ) {
            list1.add( purchaseItemMapper.toShopping( purchaseItemDTO ) );
        }

        return list1;
    }
}

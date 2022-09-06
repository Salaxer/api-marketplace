package com.salaxer.marketplace.persistence.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.salaxer.marketplace.domain.dto.ProductDTO;
import com.salaxer.marketplace.persistence.entity.Product;

// Aqui (lo voy a escribir en spanish para mas rapido:)
// Bueno aqui lo que hacemos es que los nombres del objeto clase lo vamos a renombar por
// los otros nombres de el otro objeto


//le decimo que seran Modelos de spring a MapStruct 
@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {
  
  // Como tenemos mas de un mapeado o reasignacion de nombres
  // Usamos mappings
  @Mappings({
    // Dentro es un objeto con todos los mappings
    // source es el objeto Entity con los nombres directos de la base de datos
    // target es hacia la clase o el nuevo modelo de objeto en el que se estaran
    // Controlando las peticiones y de esa nueva forma es como se estaran respondiendo las peticiones a las
    // Solicitudes
    @Mapping(source = "idProduct", target = "productId"),
    @Mapping(source = "name", target = "name"),
    @Mapping(source = "idCategories", target = "categoryId"),
    @Mapping(source = "price", target = "price"),
    @Mapping(source = "quantity", target = "stock"),
    @Mapping(source = "state", target = "state"),
    @Mapping(source = "category", target = "category"),
  })
  ProductDTO toProduct(Product product);

  List<ProductDTO> toProducts(List<Product> products);
  // asi es como revertimos los datos :)
  @InheritInverseConfiguration
  @Mapping(target = "barCode", ignore = true)
  Product toProductis(ProductDTO product);
}

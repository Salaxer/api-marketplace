package com.salaxer.marketplace.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

// When u have two primary keys
// u need to create a Embeddable Class with a name called example"PK"
// this ensure u are doing the correct practices

@Embeddable
public class ProductShoppingPK implements Serializable {
  
  @Column(name = "id_shopping")
  private Integer idShopping;
  
  @Column(name = "id_products")
  private Integer idProducts;

  public Integer getIdShopping() {
    return idShopping;
  }

  public void setIdShopping(Integer idShopping) {
    this.idShopping = idShopping;
  }

  public Integer getIdProducts() {
    return idProducts;
  }

  public void setIdProducts(Integer idProducts) {
    this.idProducts = idProducts;
  }

  
}

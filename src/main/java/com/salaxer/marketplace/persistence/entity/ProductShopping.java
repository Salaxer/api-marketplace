package com.salaxer.marketplace.persistence.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "products_shopping")
public class ProductShopping {
  
  @EmbeddedId
  private ProductShoppingPK id;

  private Integer quantity;
  private Double total;
  private Integer state;

  @ManyToOne
  @MapsId("idShopping")
  @JoinColumn(name = "id_shopping", insertable = false, updatable = false)
  private Shopping shopping;
  
  @ManyToOne
  @JoinColumn(name = "id_products", insertable = false, updatable = false)
  private Product product;

  public void setShopping(Shopping shopping){
    this.shopping = shopping;
  }

  public Shopping getShopping(){
    return shopping;
  }

  public void setProduct(Product product){
    this.product = product;
  }

  public Product getProduct(){
    return product;
  }

  public ProductShoppingPK getId() {
    return id;
  }
  public void setId(ProductShoppingPK id) {
    this.id = id;
  }
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
  public Double getTotal() {
    return total;
  }
  public void setTotal(Double total) {
    this.total = total;
  }
  public Integer getState() {
    return state;
  }
  public void setState(Integer state) {
    this.state = state;
  }

  
}

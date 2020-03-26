package com.TTNProject.EcommerceWebsite.Entity.Product;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  id;

    private String productType;


    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private Set<Product> productsSet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }


    public Set<Product> getProductsSet() {
        return productsSet;
    }

    public void setProductsSet(Set<Product> productsSet) {
        this.productsSet = productsSet;
    }

}

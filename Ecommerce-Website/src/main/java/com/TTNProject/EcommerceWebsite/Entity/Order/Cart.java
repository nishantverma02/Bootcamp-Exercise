package com.TTNProject.EcommerceWebsite.Entity.Order;

import com.TTNProject.EcommerceWebsite.Entity.Product.ProductVariation;
import com.TTNProject.EcommerceWebsite.Entity.User.User;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int quantity;

    @OneToOne
    @JoinColumn(name = "customer_user_id")
    private User user;


    @OneToOne
    @JoinColumn(name = "product_variation_id")
    private ProductVariation productVariationCart;


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ProductVariation getProductVariationCart() {
        return productVariationCart;
    }

    public void setProductVariationCart(ProductVariation productVariationCart) {
        this.productVariationCart = productVariationCart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

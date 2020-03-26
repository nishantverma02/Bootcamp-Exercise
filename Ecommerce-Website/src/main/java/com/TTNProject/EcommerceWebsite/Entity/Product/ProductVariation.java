package com.TTNProject.EcommerceWebsite.Entity.Product;

import com.TTNProject.EcommerceWebsite.Entity.Order.Cart;

import javax.persistence.*;

@Entity
public class ProductVariation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int quantityavailable;
    private int price;
    private String details;
    private String imagename;

    @OneToOne(mappedBy = "productVariationCart",cascade = CascadeType.ALL)
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantityavailable() {
        return quantityavailable;
    }

    public void setQuantityavailable(int quantityavailable) {
        this.quantityavailable = quantityavailable;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

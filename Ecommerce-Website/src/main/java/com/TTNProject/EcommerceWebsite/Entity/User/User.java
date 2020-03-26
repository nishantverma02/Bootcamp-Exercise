package com.TTNProject.EcommerceWebsite.Entity.User;

import com.TTNProject.EcommerceWebsite.Entity.Order.Cart;
import com.TTNProject.EcommerceWebsite.Entity.Product.Product;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String  email;
    private String first_name;
    private String middle_name;
    private String last_name;
    private String password;
    private boolean deleted;
    private boolean active;

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private Seller seller;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private Set<Address> addresseSet;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role",joinColumns = @JoinColumn(name = "user_id",referencedColumnName = "id")
            ,inverseJoinColumns = @JoinColumn(name = "role_id",referencedColumnName = "id"))
     private Set<Role> roleSet;


    @OneToMany(mappedBy = "productUser",cascade = CascadeType.ALL)
    private Set<Product> productUserSet;


    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private Cart cart;


    public User() {
    }

    public User(String email, String first_name, String middle_name, String last_name, String password, boolean deleted, boolean active) {
        this.email = email;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.password = password;
        this.deleted = deleted;
        this.active = active;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Set<Product> getProductUserSet() {
        return productUserSet;
    }

    public void setProductUserSet(Set<Product> productUserSet) {
        this.productUserSet = productUserSet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Set<Role> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<Role> roleSet) {
        this.roleSet = roleSet;
    }

    public Set<Address> getAddresseSet() {
        return addresseSet;
    }

    public void setAddresseSet(Set<Address> addresseSet) {
        this.addresseSet = addresseSet;
    }
}

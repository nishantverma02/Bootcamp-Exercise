package com.TTNProject.EcommerceWebsite;


import com.TTNProject.EcommerceWebsite.Entity.Order.Cart;
import com.TTNProject.EcommerceWebsite.Entity.Product.Category;
import com.TTNProject.EcommerceWebsite.Entity.Product.Product;
import com.TTNProject.EcommerceWebsite.Entity.Product.ProductVariation;
import com.TTNProject.EcommerceWebsite.Entity.User.Address;
import com.TTNProject.EcommerceWebsite.Entity.User.Role;
import com.TTNProject.EcommerceWebsite.Entity.User.Seller;
import com.TTNProject.EcommerceWebsite.Entity.User.User;
import com.TTNProject.EcommerceWebsite.RepositoryOperation.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

@SpringBootTest
class EcommerceWebsiteApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

   @Test

   public void createEntity(){
		HashSet<User> userHashSet=new HashSet<>();
		User user=new User();
		user.setFirst_name("nishant");
		user.setMiddle_name("Verma");
		user.setLast_name("jr.");
		user.setPassword("ttn");
		user.setEmail("nishant.verma@ttn.com");
		user.setDeleted(true);
		user.setActive(true);
		userHashSet.add(user);




		HashSet<Role> roleslist=new HashSet<>();

		   Role role1=new Role();
		   role1.setAuthority("SELLER");
		   roleslist.add(role1);


		   HashSet<Address> addresseslist=new HashSet<>();
		   Address address1=new Address();
		   address1.setCity("New Delhi");
		   address1.setState("Delhi");
		   address1.setCountry("India");
		   address1.setLabel("home");
		   address1.setPincode(495684);
		   address1.setAddress("insert");
           address1.setUser(user);

		   addresseslist.add(address1);

           user.setAddresseSet(addresseslist);
		   user.setRoleSet(roleslist);


		   Seller seller=new Seller();
		   seller.setCompany_name("TTN");
		   seller.setCompany_contact(1234567890);
		   seller.setGst(4);

		   seller.setUser(user);

		   user.setSeller(seller);





	   Category category=new Category();




	   category.setProductType("electronics");


	   Product product=new Product();
	   product.setName("mobile");
	   product.setActive(true);
	   product.setCancellable("yes");
	   product.setReturnable("yes");
	   product.setBrand("mi");
	   product.setProductUser(user);
	   product.setCategory(category);

	   HashSet<Product> productsList=new HashSet<>();
	   productsList.add(product);



	   HashSet<ProductVariation> productVariationsList=new HashSet<>();




	   ProductVariation productVariation=new ProductVariation();

	   productVariation.setDetails("m1 max ");
	   productVariation.setImagename("jpg1");
	   productVariation.setQuantityavailable(4);
	   productVariation.setProduct(product);
	   productVariation.setPrice(40000);
	   productVariationsList.add(productVariation);
	   product.setProductVariationSet(productVariationsList);



	   category.setProductsSet(productsList);

	   user.setProductUserSet(productsList);


	   Cart cart=new Cart();
	   cart.setQuantity(4);
	   cart.setUser(user);
	   cart.setProductVariationCart(productVariation);

	   user.setCart(cart);


		   userRepository.save(user);

	}
	 /* @Test
	  public void create_Category_Product_Varaint(){




		      Category category=new Category();




		    category.setProductType("electronics");


		  Product product=new Product();
		    product.setName("mobile");
		  product.setActive(true);
		  product.setCancellable("yes");
		  product.setReturnable("yes");
		  product.setBrand("mi");
		  product.setCategory(category);

		  HashSet<Product> productsList=new HashSet<>();
		  productsList.add(product);



		  HashSet<ProductVariation> productVariationsList=new HashSet<>();




		  ProductVariation productVariation=new ProductVariation();

		  productVariation.setDetails("m1 max proo");
		  productVariation.setImagename("jpg1");
		  productVariation.setQuantityavailable(4);
		  productVariation.setProduct(product);
		  productVariation.setPrice(40000);
		  productVariationsList.add(productVariation);
		  product.setProductVariationSet(productVariationsList);



		  category.setProductsSet(productsList);

		  userRepository.save(category);




	  }*/
}
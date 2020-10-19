package com.main;

//Java Stream Example: count() Method in Collection

import java.util.ArrayList;
import java.util.List;

import com.ProductCount;

public class ProductCountMain {

	 public static void main(String[] args) {  
	        List<ProductCount> productsList = new ArrayList<ProductCount>();  
	         
	        productsList.add(new ProductCount(1,"HP Laptop",25000f));  
	        productsList.add(new ProductCount(2,"Dell Laptop",30000f));  
	        productsList.add(new ProductCount(3,"Lenevo Laptop",28000f));  
	        productsList.add(new ProductCount(4,"Sony Laptop",28000f));  
	        productsList.add(new ProductCount(5,"Apple Laptop",90000f));  
	        // count number of products based on the filter  
	        long count = productsList.stream()  
	                    .filter(product->product.price<30000)  
	                    .count();  
	        System.out.println("The number of product greater 30000 is : " + count);  
	    } 
}

package com.main;

//Java Stream Example: Filtering and Iterating Collection

import java.util.ArrayList;
import java.util.List;

import com.ProductForEach;

public class ProductForEachMain {

	public static void main(String[] args) {  
        List<ProductForEach> productsList = new ArrayList<ProductForEach>();  
        
        productsList.add(new ProductForEach(1,"HP Laptop",25000f));  
        productsList.add(new ProductForEach(2,"Dell Laptop",30000f));  
        productsList.add(new ProductForEach(3,"Lenevo Laptop",28000f));  
        productsList.add(new ProductForEach(4,"Sony Laptop",28000f));  
        productsList.add(new ProductForEach(5,"Apple Laptop",90000f));  
        
        productsList.stream()  
                             
                             .filter(product1 -> product1.id > 3)
                             .forEach(product1 -> System.out.println(product1.name));
                             
                              
    }

}

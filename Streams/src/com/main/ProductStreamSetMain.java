package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.ProductStreamSet;

//Java Stream Example : Convert List into Set

public class ProductStreamSetMain {
	public static void main(String[] args) {  
        List<ProductStreamSet> productsList = new ArrayList<ProductStreamSet>();  
  
       
        productsList.add(new ProductStreamSet(1,"HP Laptop",25000f));  
        productsList.add(new ProductStreamSet(2,"Dell Laptop",30000f));  
        productsList.add(new ProductStreamSet(3,"Lenevo Laptop",28000f));  
        productsList.add(new ProductStreamSet(4,"Sony Laptop",28000f));  
        productsList.add(new ProductStreamSet(5,"Apple Laptop",90000f));  
          
        
        Set<Float> productPriceList =   
            productsList.stream()  
            .filter(product->product.price < 30000)  
            .map(product->product.price)  
            .collect(Collectors.toSet());   
        System.out.println(productPriceList);  
    }  

}

package com.main;

//Method Reference in stream

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.ProductMethodReference;

public class ProductMethodReferenceMain {
	
	public static void main(String[] args) {  
        
        List<ProductMethodReference> productsList = new ArrayList<ProductMethodReference>();  
          
       
        productsList.add(new ProductMethodReference(1,"HP Laptop",25000f));  
        productsList.add(new ProductMethodReference(2,"Dell Laptop",30000f));  
        productsList.add(new ProductMethodReference(3,"Lenevo Laptop",28000f));  
        productsList.add(new ProductMethodReference(4,"Sony Laptop",28000f));  
        productsList.add(new ProductMethodReference(5,"Apple Laptop",90000f));  
          
        List<Float> productPriceList =   
                productsList.stream()  
                            .filter(p -> p.price > 25000)  
                            .map(ProductMethodReference::getPrice)           
                            .collect(Collectors.toList());  
        System.out.println(productPriceList);  
    }  

}

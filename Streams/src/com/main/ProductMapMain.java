package com.main;

//Java Stream Example : Convert List into Map

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ProductMap;

public class ProductMapMain {
	public static void main(String[] args) {
		List<ProductMap> productsList = new ArrayList<ProductMap>();

		productsList.add(new ProductMap(1, "HP Laptop", 25000f));
		productsList.add(new ProductMap(2, "Dell Laptop", 30000f));
		productsList.add(new ProductMap(3, "Lenevo Laptop", 28000f));
		productsList.add(new ProductMap(4, "Sony Laptop", 28000f));
		productsList.add(new ProductMap(5, "Apple Laptop", 90000f));

		Map<Object, Object> productPriceMap = productsList.stream().collect(Collectors.toMap(p -> p.id, p -> p.name));

		System.out.println(productPriceMap);
	}

}

package com.example.demo.Filter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import com.example.demo.Entity.Product;
@Component
public class FilterByPrice implements IFilter{

	@Override
	public List<Product> filter(List<Product> plist) {
		// TODO Auto-generated method stub
		System.out.println("////");
		System.out.println(plist);
		Stream<Product> stream =plist.stream().filter(P ->P.getPrice()>=5000);
		List<Product> l2=stream.collect(Collectors.toList());
		System.out.println(l2);
		
		return l2;
	}

}

package com.example.demo.Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Product;
import com.example.demo.Filter.IFilter;
@Service
public class CsvReader implements IReader {

	private IFilter filter;
	

@Autowired
public CsvReader(IFilter filter) {
	this.filter = filter;
}


	@Override
	
	public List<Product> read() throws Exception {
		System.out.println("hi servixe");
		FileReader fr=new FileReader("E:\\Product.csv");
		BufferedReader br =new BufferedReader(fr);
		List<Product> productlist =new ArrayList<>();
		System.out.println(br.lines());
		String line=br.readLine();
		while (line!=null) {
			String [] s2=line.split(",");
			Product p= new Product();
			p.setId(Integer.parseInt(s2[0]));
			p.setName(s2[1]);
			p.setCategory(s2[2]);
			System.out.println(s2[3]);
			p.setPrice(Integer.parseInt(s2[3]));
			System.out.println(p);
			productlist.add(p);
			line=br.readLine();
		}
		br.close();
		return filter.filter(productlist);
		
		
	
	}
	

}

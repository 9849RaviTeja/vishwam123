package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Product;
import com.example.demo.Reader.CsvReader;
import com.example.demo.Reader.IReader;

@RestController
public class Scontroller {
private CsvReader reader;

@Autowired
	public Scontroller(CsvReader reader) {
	super();
	this.reader = reader;
}

@GetMapping("getPrice")
	public List<Product> getPricegreaterthan5000() throws Exception {
	System.out.println("hi");
		List<Product> plist = null;
			plist = reader.read();
			for (Product p : plist) {
				System.out.println(p);
			}
		
		return plist;

	}
}

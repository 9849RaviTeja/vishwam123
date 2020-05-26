package com.example.demo.Reader;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Entity.Product;
@Component
public interface IReader {
 List<Product> read() throws Exception ;
}

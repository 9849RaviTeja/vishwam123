package com.example.demo.Filter;

import java.util.List;

import com.example.demo.Entity.Product;

public interface IFilter {
List<Product> filter(List<Product> plist);
}

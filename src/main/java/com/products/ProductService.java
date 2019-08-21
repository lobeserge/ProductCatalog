package com.products;

import java.util.ArrayList;
import java.util.List;



public class ProductService {
private static	List<Products> productlist=new ArrayList<Products>();
	
	
	public List<Products> retrieveProducts(){
		return productlist;
	}
	
	public void addProducts(Products pro){
		productlist.add(pro);
	}
	
	public void deleteProducts(Products pro){
		productlist.remove(pro);
	}
	public void clearlist(){
		productlist.clear();
	}
}

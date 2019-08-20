package com.category;

public class Category {
String CategoryName;
String CategoryDetails;

public Category(String cn,String dt){
	this.CategoryName=cn;
	this.CategoryDetails=dt;
}
public String getCategoryName() {
	return CategoryName;
}
public void setCategoryName(String categoryName) {
	CategoryName = categoryName;
}
public String getCategoryDetails() {
	return CategoryDetails;
}
public void setCategoryDetails(String categoryDetails) {
	CategoryDetails = categoryDetails;
}
@Override
public String toString() {
	return "Category [CategoryName=" + CategoryName + ", CategoryDetails="
			+ CategoryDetails + "]";
}
	
	
}

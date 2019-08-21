package com.category;

public class Category {
private String CategoryName;
private String CategoryDetails;
public Category(String categoryName, String categoryDetails) {
	super();
	CategoryName = categoryName;
	CategoryDetails = categoryDetails;
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

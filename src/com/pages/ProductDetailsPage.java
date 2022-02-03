package com.pages;

import org.openqa.selenium.By;

import com.objectReference.GoToCartElement;
import com.objectReference.ProductDetailsElement;
import com.reusable.ConnectionDriver;

public class ProductDetailsPage {

	public void addToCart()
	{
		 ConnectionDriver.driver.findElement(By.xpath(ProductDetailsElement.ADD_TO_CART)).click();
	}
}

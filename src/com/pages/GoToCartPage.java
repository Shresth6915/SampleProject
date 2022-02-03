package com.pages;

import org.openqa.selenium.By;

import com.objectReference.CheckoutElement;
import com.objectReference.GoToCartElement;
import com.reusable.ConnectionDriver;

public class GoToCartPage {
	
	public void goToCart()
	{
		 ConnectionDriver.driver.findElement(By.xpath(GoToCartElement.GO_TO_CART)).click();
	}
}

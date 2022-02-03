package com.pages;

import org.openqa.selenium.By;

import com.objectReference.CheckoutElement;
import com.reusable.ConnectionDriver;

public class CheckoutPage {

	public void checkout()
	{
		 ConnectionDriver.driver.findElement(By.xpath(CheckoutElement.CHECKOUT_BUTTON)).click();
	}
	
}

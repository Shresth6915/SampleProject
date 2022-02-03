package com.pages;

import org.openqa.selenium.By;

import com.objectReference.SearchPageElement;
import com.reusable.ConnectionDriver;

public class SearchPage {

	public void search()
	{
		 ConnectionDriver.driver.findElement(By.id(SearchPageElement.SEARCH_ELEMENT)).sendKeys("KitchenAid® 2.2 Cu. Ft. Stainless Steel Countertop Microwave Oven-KMCS3022GSS-KMCS3022GSS"+"\n");
	}

	public void iUnderstand() {
		// TODO Auto-generated method stub
		ConnectionDriver.driver.findElement(By.xpath(SearchPageElement.I_UNDERSTAND)).click();
	}
}

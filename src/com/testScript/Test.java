package com.testScript;
import com.pages.CheckoutPage;
import com.pages.GoToCartPage;
import com.pages.ProductDetailsPage;
import com.pages.SearchPage;
import com.reusable.ConnectionDriver;

public class Test {
	static SearchPage searchPage =new SearchPage();
	static ProductDetailsPage prodDetailPage = new ProductDetailsPage();
	static GoToCartPage goToCartPage = new GoToCartPage();
	static CheckoutPage checkoutPage = new CheckoutPage();

    public static void main(String[] args) throws InterruptedException {
    	ConnectionDriver.initConnection();
    	try {
    	searchPage.search();
    	prodDetailPage.addToCart();
    	goToCartPage.goToCart();
    	checkoutPage.checkout();
    	}
    	finally {
    	ConnectionDriver.close();
    	}
    }

}


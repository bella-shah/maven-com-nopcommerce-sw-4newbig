package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class NokiaLumiaPage extends Utility {
    By verifyNokiaLumiaText = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By verifyPrice = By.xpath("//span[contains(text(),' $349.00 ')]");
    By changeQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By verifyProductHasBeenAddedMSg = By.xpath("//a[contains(text(),'shopping cart')]");
    By closeCrossButton = By.xpath("//span[@title='Close']");
    By hoverToShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");

    public String verifyNokiaLumiaPage() {
        return getTextFromElement(verifyNokiaLumiaText);
    }

    public String verifyPrice() {
        return getTextFromElement(verifyPrice);
    }

    public void changeQuantityPhone() {
        sendTextToElement(changeQuantity,  Keys.BACK_SPACE + "2");
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String verifyProductHasBeenAdded() {
        return getTextFromElement(verifyProductHasBeenAddedMSg);
    }

    public void clickOnCrossButton() {
        clickOnElement(closeCrossButton);
    }
    public void hoverToShoppingCart() throws InterruptedException {
        mouseHoverOnly(hoverToShoppingCart);
    }
    public void clickonGoToCartBtn(){
        clickOnElement(goToCart);
    }

}



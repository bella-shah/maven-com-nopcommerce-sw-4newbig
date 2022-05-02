package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By email = By.xpath("//input[@id='Email']");
    By enterPassword = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton=By.xpath("//button[@id='register-button']");
    By verifyRegisterMsg =By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueBtn =By.xpath("//a[contains(text(),'Continue')]");
    By registerBtn =By.xpath("//button[contains(text(),'Register')]");



    public void inputFirstName() {
        sendTextToElement(firstName, "Bella");
    }

    public void inputLastName() {
        sendTextToElement(lastName, "shah");
    }

    public void inputEmail() {
        sendTextToElement(email, "shahbella55@gmail.com");
    }
    public void inputPassword(){
        sendTextToElement(enterPassword,"Prime123");
    }
    public void enterConfirmPassword(){
        sendTextToElement(confirmPassword,"Prime123");
    }

    public void clickOnRegisterBtn(){
        clickOnElement(registerButton);
    }
    public String verifyRegisterationMsg(){
        return getTextFromElement(verifyRegisterMsg);
    }
    public void clickOnContinue(){
        clickOnElement(continueBtn);
    }
    public void clickOnRegister(){
        clickOnElement(registerBtn);
    }


}




package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
    By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By email = By.xpath("//input[@id='BillingNewAddress_Email']");
    By countryId = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By postCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueBtn = By.xpath("(//button[@class='button-1 new-address-next-step-button'])[1]");
    By shippingOption = By.xpath("//input[@id='shippingoption_1']");
    By shippingConBtn = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By paymentMethod = By.xpath("//input[@id='paymentmethod_1']");
    By continueBtn2 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    By creditCardType = By.xpath("//select[@id='CreditCardType']");
    By cardholderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By expiryMonth = By.xpath("//select[@id='ExpireMonth']");
    By expiryYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By continueBtn3 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By verifyPaymentMethod = By.xpath("//span[contains(text(),'Credit Card')]");
    By verifyShippingMethod = By.xpath("//span[contains(text(),'Next Day Air') and @class='value']");
    By verifyTotalPrice = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By confirmBtn = By.xpath("//button[contains(text(),'Confirm')]");
    //By selectCountry =By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By select2ndDayAir = By.xpath("//input[@id='shippingoption_2']");
    By selectVisa = By.xpath("//select[@id='CreditCardType']");
    By verifyShippingMethod2 = By.xpath("//span[contains(.,'2nd Day Air')]");
    By verifyTotal2 = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By checkoutAsGuestBtn = By.xpath("//button[contains(text(),'Checkout as Guest')]");

    public String verifyTotal2() {
        return getTextFromElement(verifyTotal2);
    }


    public void selectVisaOption() {
        selectByVisibleTextFromDropDown(selectVisa, "Visa");
    }

    public void inputFirstName() {
        sendTextToElement(firstName, "Bella");
    }

    public void inputLastName() {
        sendTextToElement(lastName, "Shah");
    }

    public void inputEmail() {
        sendTextToElement(email, "shahbella55@gmial.com");
    }

    public void selectCountry() {
        selectByVisibleTextFromDropDown(countryId, "United Kingdom");
    }

    public void inputCity() {
        sendTextToElement(city, "London");
    }

    public void inputAddress() {
        sendTextToElement(address, "159 Ealing Road");
    }

    public void inputPostCode() {
        sendTextToElement(postCode, "HP20 1DA");
    }

    public void inputPhoneNumber() {
        sendTextToElement(phoneNumber, "07593876523");
    }

    public void clickOnContinueBtn() {
        clickOnElement(continueBtn);
    }

    public void selectShippingOption() {
        clickOnElement(shippingOption);
    }

    public void clickOnShippingContinueBtn() {
        clickOnElement(shippingConBtn);
    }

    public void selectPaymentmethod() {
        clickOnElement(paymentMethod);
    }

    public void clickOnContinueBtn2() {
        clickOnElement(continueBtn2);
    }

    public void selectCreditCardType() {
        selectByVisibleTextFromDropDown(creditCardType, "Master card");

    }

    public String verifyShippingMethod2() {
        return getTextFromElement(verifyShippingMethod2);

    }


    public void inputCardHolderName() {
        sendTextToElement(cardholderName, "Bella");
    }

    public void inputCardNumber() {
        sendTextToElement(cardNumber, "5555 5555 5555 4444");
    }

    public void selectExpiryMonth() {
        selectByVisibleTextFromDropDown(expiryMonth, "03");
    }

    public void selectExpiryYear() {
        selectByVisibleTextFromDropDown(expiryYear, "2026");
    }

    public void inputCardCode() {
        sendTextToElement(cardCode, "132");
    }

    public void clickOnContinueBtn3() {
        clickOnElement(continueBtn3);
    }

    public String verifyPaymentMethod() {
        return getTextFromElement(verifyPaymentMethod);
    }

    public String verifyShippingMethod() {
        return getTextFromElement(verifyShippingMethod);
    }

    public String verifyTotal() {
        return getTextFromElement(verifyTotalPrice);
    }

    public void clickOnConfirmBtn() {
        clickOnElement(confirmBtn);
    }

    public void clickOn2ndDayAir() {
        clickOnElement(select2ndDayAir);
    }

    public void clickOnCheckoutAsGuestBtn() {
        clickOnElement(checkoutAsGuestBtn);
    }


}


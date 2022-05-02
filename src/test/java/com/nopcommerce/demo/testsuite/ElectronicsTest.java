package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    NokiaLumiaPage nokiaLumia =new NokiaLumiaPage();
    ShoppingPage shoppingCartPage =new ShoppingPage();
    ConformationPage conformationPage = new ConformationPage();
    RegisterPage registerPage = new RegisterPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    ConformationPage conformationpage = new ConformationPage();
    HomePage homePage=new HomePage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {
        cellPhonesPage.hoverOnElectronics();
        cellPhonesPage.clickOnCellPhones();
        cellPhonesPage.verifyCellPhonesPageIsDisplayed();
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        cellPhonesPage.hoverOnElectronics();
        cellPhonesPage.clickOnCellPhones();
        cellPhonesPage.verifyCellPhonesPageIsDisplayed();
        cellPhonesPage.clickOnListViewTab();
        cellPhonesPage.clickOnNokia();

        nokiaLumia.verifyNokiaLumiaPage();
        nokiaLumia.verifyPrice();
        nokiaLumia.changeQuantityPhone();
        nokiaLumia.clickOnAddToCart();
        nokiaLumia.verifyProductHasBeenAdded();
        nokiaLumia.clickOnCrossButton();
        nokiaLumia.hoverToShoppingCart();
        nokiaLumia.clickonGoToCartBtn();

        shoppingCartPage.verifyShoppingCartMSG();
        shoppingCartPage.verifyQuantity();
        shoppingCartPage.verifyTotalPhone();
        shoppingCartPage.clickOnTermsOfService();
        shoppingCartPage.clickOnCheckoutBtn();

        homePage.verifyWelcomMsg();
         registerPage.clickOnRegister();

        registerPage.inputFirstName();
        registerPage.inputLastName();
        registerPage.inputEmail();
        registerPage.inputPassword();
        registerPage.enterConfirmPassword();
        registerPage.clickOnRegisterBtn();
        registerPage.verifyRegisterationMsg();
        registerPage.clickOnContinue();

        shoppingCartPage.verifyShoppingCartMSG();
        shoppingCartPage.clickOnTermsOfService();
        shoppingCartPage.clickOnCheckoutBtn();

        checkoutPage.selectCountry();
        checkoutPage.inputCity();
        checkoutPage.inputAddress();
        checkoutPage.inputPostCode();
        checkoutPage.inputPhoneNumber();
        checkoutPage.clickOnContinueBtn();
        checkoutPage.clickOn2ndDayAir();
        checkoutPage.clickOnContinueBtn2();
        checkoutPage.selectPaymentmethod();
        checkoutPage.selectVisaOption();
        checkoutPage.inputCardHolderName();
        checkoutPage.inputCardNumber();
        checkoutPage.selectExpiryMonth();
        checkoutPage.selectExpiryYear();
        checkoutPage.inputCardCode();
        checkoutPage.clickOnContinueBtn3();
        checkoutPage.verifyPaymentMethod();
        checkoutPage.verifyShippingMethod2();
        checkoutPage.verifyTotal2();
        checkoutPage.clickOnConfirmBtn();

        conformationpage.verifyThankYouMsgIsDisplayed();

        conformationpage.verifyOrderProcessedMsg();
        conformationpage.clickOnContinue();

        homePage.verifyWelcomeToOurStoreMsg();
        homePage.clickOnLogOut();
        homePage.verifyCurrentUrl();




    }
}


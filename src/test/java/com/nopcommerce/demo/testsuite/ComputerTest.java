package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {
    DeskTopPage desktoppage = new DeskTopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingPage shoppingPage = new ShoppingPage();
    RegisterPage registerpage = new RegisterPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    ConformationPage conformationpage = new ConformationPage();
    HomePage homePage = new HomePage();


    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        desktoppage.navigateToDesktop();
        desktoppage.sortProductsAToZ();
        desktoppage.verifyProductAToZOrder();
        desktoppage.addToCart();
        buildYourOwnComputerPage.selectCore();
        buildYourOwnComputerPage.selectRam();
        buildYourOwnComputerPage.selectHddRadio();
        buildYourOwnComputerPage.selectOsRadio();
        buildYourOwnComputerPage.checkTwoBoxes();
        buildYourOwnComputerPage.verifyPrice();
        buildYourOwnComputerPage.clickOnAddToCartBtn();
        buildYourOwnComputerPage.verifyProductAddedToCart();
        buildYourOwnComputerPage.clickOnCross();
        buildYourOwnComputerPage.clickOnGoToCart();


        shoppingPage.verifyShoppingCartMSG();
        shoppingPage.changeQuantity();
        shoppingPage.clickOnUpdateCartBtn();
        shoppingPage.verifyTotalPrice();
        shoppingPage.clickOnTermsOfService();
        shoppingPage.clickOnCheckoutBtn();

        homePage.verifyWelcomMsg();

        checkoutPage.clickOnCheckoutAsGuestBtn();
        checkoutPage.inputFirstName();
        checkoutPage.inputLastName();
        checkoutPage.inputEmail();
        checkoutPage.selectCountry();
        checkoutPage.inputCity();
        checkoutPage.inputAddress();
        checkoutPage.inputPostCode();
        checkoutPage.inputPhoneNumber();
        checkoutPage.clickOnContinueBtn();
        checkoutPage.selectShippingOption();
        checkoutPage.clickOnShippingContinueBtn();
        checkoutPage.selectPaymentmethod();
        checkoutPage.clickOnContinueBtn2();
        checkoutPage.selectCreditCardType();
        checkoutPage.inputCardHolderName();
        checkoutPage.inputCardNumber();
        checkoutPage.selectExpiryMonth();
        checkoutPage.selectExpiryYear();
        checkoutPage.inputCardCode();
        checkoutPage.clickOnContinueBtn3();
        checkoutPage.verifyPaymentMethod();
        checkoutPage.verifyShippingMethod();
        checkoutPage.verifyTotal();
        checkoutPage.clickOnConfirmBtn();


        conformationpage.verifyThankYouMsgIsDisplayed();
        homePage.verifyWelcomeToOurStoreMsg();

    }


}


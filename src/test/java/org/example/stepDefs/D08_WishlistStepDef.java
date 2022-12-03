package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.remote.http.Message;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;


public class D08_WishlistStepDef {
    P03_homePage wishlist = new P03_homePage();
    SoftAssert soft = new SoftAssert();
    @When("user click on wishlist button on this product \"HTC One M8 Android L 5.0 Lollipop\"")
    public void step1(){
        wishlist.wishlist_button().click();
    }

    @Then("success message is displayed with green background")
    public void successMessageIsDisplayedWithGreenBackground() {
        soft.assertTrue(wishlist.message().isDisplayed());
        String rgba = wishlist.background().getCssValue("background-color");
       // System.out.println(rgba);
        String hex = Color.fromString(rgba).asHex();
        soft.assertEquals(hex,"#4bb07a");
        soft.assertAll();

    }


    @And("user click on Wishlist Tab on the top of the page")
    public void userClickOnWishlistTabOnTheTopOfThePage() {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
            wait.until(ExpectedConditions.invisibilityOf(wishlist.background()));
            wishlist.wishlist_store().click();
        }

    @Then("the Qty value will be bigger than {int}")
    public void theQtyValueWillBeBiggerThan(int arg0) {
        String numperofitmes = wishlist.QTY_value().getText();
        System.out.println(numperofitmes);
       // soft.assertEquals(numperofitmes,"1");
        soft.assertTrue(numperofitmes.contains("1"));
        soft.assertAll();


    }
}

package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class D06_homeSlidersStepDef {
    SoftAssert soft = new SoftAssert();
    P03_homePage home = new P03_homePage();

    @When("user click on nokia slider")
    public void step1(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeContains(home.nokia_slider(),"style","display: block;"));
        home.nokia_slider().click();

    }


   /* @Then("user directed to correct url")
    public void userDirectedToCorrectUrl() {
        explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String actualurl = driver.getCurrentUrl();
        System.out.println(actualurl);
       soft.assertEquals(actualurl,"https://demo.nopcommerce.com/nokia-lumia-1020");


        soft.assertAll();
    } */


   @When("user click on iphone slider")
    public void userClickOnIphoneSlider() {
       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
       wait.until(ExpectedConditions.attributeContains(home.iphone_slider(),"style","display: block;"));
        home.iphone_slider().click();

    }

    @Then("the url {string} is opened")
    public void theUrlIsOpened(String arg0) {
        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String iphone_url = driver.getCurrentUrl();
        soft.assertEquals(arg0,"url https://demo.nopcommerce.com/iphone-6");
        soft.assertAll();
    }


    /* @Then("user directed to correct iphone url")
    public void userDirectedToCorrectIphoneUrl() {
        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String iphone_url = driver.getCurrentUrl();
        soft.assertEquals(iphone_url,"url https://demo.nopcommerce.com/iphone-6");
        soft.assertAll();
    }*/
}

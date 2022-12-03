package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.awt.*;

import static org.example.stepDefs.Hooks.driver;

public class D02_loginStepDef {
    P02_login login = new P02_login();
    @Given("user go to login page")
    public void step1 (){
        login.login_button().click();

    }

    @When("user login with {string} {string} and {string}")
    public void userLoginWithAnd(String arg0, String arg1, String arg2) {
        login.valid_login_email().sendKeys(arg1);
        login.valid_login_password().sendKeys(arg2);





    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.press_on_login_button().click();

    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert soft = new SoftAssert();
        String actualurl = driver.getCurrentUrl();
        soft.assertEquals(actualurl,"https://demo.nopcommerce.com/");
        soft.assertTrue(login.my_account().isDisplayed());

        soft.assertAll();



    }
    @When("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String arg0, String arg1) {
        login.invalid_login_email().sendKeys(arg0);
        login.invalid_login_password().sendKeys(arg1);
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert soft = new SoftAssert();
        String message = login.message().getText();
        soft.assertTrue(message.contains("Login was unsuccessful"));
       String rgpa = login.message().getCssValue("color");
        System.out.println(rgpa);
        String hex =Color.fromString(rgpa).asHex();
        soft.assertEquals(hex,"#e4434b");



        soft.assertAll();



    }


}

package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.awt.*;

import static org.example.stepDefs.Hooks.driver;


public class D01__registerStepDef {
    P01_register reg = new P01_register();

    @Given("user go to register page")
    public void registration (){
//any change
        reg.rigisterButton().click();
      //  driver.findElement(By.cssSelector("a[class=\"ico-register\"]")).click();

    }

    @When("user select gender type")
    public void userSelectGenderType() {

    reg.gender_type().click();

    //    driver.findElement(By.cssSelector("input[id=\"gender-male\"]")).click();
        
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String arg0, String arg1) {
        reg.enter_first_name().sendKeys(arg0);
        reg.last_name().sendKeys(arg1);

    }
    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
            Select select = new Select(reg.enter_date_of_birth());
          //  int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);//to sellect rondum vallues
            int random_int = (int)Math.floor(Math.random()*(30-1+1)+1);
            select.selectByValue(String.valueOf(random_int));
        //   select.selectByValue("29");


            random_int = (int)Math.floor(Math.random()*(12-1+1)+1);
            select = new Select(reg.month());
            select.selectByValue(String.valueOf(random_int));


            random_int = (int)Math.floor(Math.random()*(2022-1912+1)+1912);
            select =new Select(reg.year());
            select.selectByValue(String.valueOf(random_int));




    }
    @And("user enter email {string} field")
    public void userEnterEmailField(String arg0) {

    reg.enter_email().sendKeys(arg0);
    }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String arg0, String arg1) {
        reg.Password().sendKeys(arg0);
        reg.cnferm_Password().sendKeys(arg1);


        
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        reg.clicks_on_register_button().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(reg.message().isDisplayed());
         String rgba = reg.message().getCssValue("color");
         String hex = Color.fromString(rgba).asHex();
         soft.assertEquals(hex,"#4cb17c");
         soft.assertAll();

    }


}

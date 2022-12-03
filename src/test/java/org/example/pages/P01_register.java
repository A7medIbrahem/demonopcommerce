package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class P01_register {
    //1_
    public  WebElement rigisterButton(){

        //Apply POM Pattern using findElement method and not using PageFactory, Constructor, @FindBy

        WebElement register = driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
        return register;


       // PageFactory.initElements(driver, this);
    }

//@FindBy(css = "a[class=\"ico-register\"]")
    //public WebElement registerBtn;
    //2_
    public WebElement gender_type(){

        return driver.findElement(By.cssSelector("input[id=\"gender-male\"]"));
    }

    public WebElement enter_first_name(){

        return driver.findElement(By.id("FirstName"));
    }

    public WebElement  last_name(){

        return driver.findElement(By.id("LastName"));
    }

    public WebElement enter_date_of_birth(){

        return driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement month(){

        return driver.findElement(By.name("DateOfBirthMonth"));

    }

    public WebElement year(){

        return driver.findElement(By.name("DateOfBirthYear"));
    }
    public WebElement enter_email(){
        return driver.findElement(By.id("Email"));
    }
    public WebElement Password() {
         return driver.findElement(By.id("Password"));
    }
    public WebElement cnferm_Password() {
        return driver.findElement(By.id("ConfirmPassword"));

    }

    public WebElement clicks_on_register_button() {
        return driver.findElement(By.id("register-button"));

    }
    public WebElement message() {

        return driver.findElement(By.className("result"));

    }



}

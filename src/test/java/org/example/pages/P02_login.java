package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P02_login {
 public WebElement login_button(){

     return driver.findElement(By.className("ico-login"));
 }
 public WebElement valid_login_email(){
     return driver.findElement(By.id("Email"));

 }
 public WebElement invalid_login_email(){
        return driver.findElement(By.id("Email"));

    }
 public WebElement valid_login_password(){
     return driver.findElement(By.id("Password"));

 }
 public WebElement invalid_login_password(){
        return driver.findElement(By.id("Password"));

    }

 public WebElement press_on_login_button(){
     return driver.findElement(By.cssSelector("button[ type=\"submit\" ][class=\"button-1 login-button\"]"));
 }
 public WebElement my_account(){
     return driver.findElement(By.className("ico-account"));
 }
 public WebElement message(){
     return driver.findElement(By.cssSelector("div [class=\"message-error validation-summary-errors\"]"));
 }




}
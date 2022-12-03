package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homePage home =new P03_homePage();
    @When("user select euro option")
    public void step1(){
        Select dropdown = new Select(home.customerCurrency());
        dropdown.selectByVisibleText("Euro");

    }

    @Then("euro symbol is displyed")
    public void euroSymbolIsDisplyed() {

      for (int i = 0 ; i < home.actualprice().size(); i++)
         {
          String actual = home.actualprice().get(i).getText();
             System.out.println(actual);
             Assert.assertTrue(actual.contains("€"));
          }
    }

    @When("user select us dollar option")
    public void userSelectUsDollarOption() {
        Select dropdown = new Select(home.customerCurrency());
        dropdown.selectByVisibleText("US Dollar");
    }

    @Then("us dollar is displayed")
    public void usDollarIsDisplayed(){
        for (int i = 0 ; i < home.actualprice().size(); i++)
        {
            String actual = home.actualprice().get(i).getText();
            System.out.println(actual);
            Assert.assertTrue(actual.contains("$"));
        }
    }
}
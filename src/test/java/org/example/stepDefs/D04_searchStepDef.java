package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D04_searchStepDef {

    P03_homePage home = new P03_homePage();

    @When("user enter name as {string}")
    public void userEnterProductNameAs(String arg0) {
        home.search().sendKeys(arg0);

    }

    @And("user click on search button")
    public void userClickOnSearchButton() {
        home.search_button().click();

    }

    @Then("user get search results")
    public void userGetSearchResults() {
        SoftAssert soft = new SoftAssert();
      String actual = driver.getCurrentUrl();
      soft.assertTrue(actual.contains("https://demo.nopcommerce.com/search?q="));
        // check model answer
      soft.assertAll();


    }
}

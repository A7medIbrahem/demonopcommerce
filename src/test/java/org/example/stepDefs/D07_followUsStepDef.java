package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;

import static org.example.stepDefs.Hooks.driver;

public class D07_followUsStepDef {
    P03_homePage followus = new P03_homePage();
    SoftAssert soft = new SoftAssert();

    @When("user opens facebook link")
    public void step1(){
        followus.facebook().click();
    }


    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String arg0) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

            wait.until(ExpectedConditions.numberOfWindowsToBe(2));

            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));
            String newUrl = driver.getCurrentUrl();
            Assert.assertEquals(newUrl, arg0);

            driver.close();

    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() {
        followus.twitter().click();
    }

    @When("user opens rss link")
    public void userOpensRssLink() {
        followus.rss().click();
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        followus.youtube().click();
    }
}

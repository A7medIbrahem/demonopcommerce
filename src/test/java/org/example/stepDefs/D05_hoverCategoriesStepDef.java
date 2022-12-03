package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.Random;

import static org.example.stepDefs.Hooks.driver;

public class D05_hoverCategoriesStepDef {
    P03_homePage home = new P03_homePage();
    Actions hover = new Actions(driver);
    Random random = new Random();
    int count;
    String sub_name;
    SoftAssert soft =new SoftAssert();


    @When("user select and hover random main category")
    public void user_select_random_main_category() throws InterruptedException {
        hover.moveToElement(home.computer()).perform();
    }


    @And("user select randomly one of sub categories")
    public void userSelectRandomlyOneOfSubCategories() {
        count = home.subcategories().size() -1;
        int select_random = random.nextInt(count);
        System.out.println(select_random);
       // System.out.println(count);
        sub_name = home.subcategories().get(select_random).getText();
        System.out.println(sub_name);
        home.subcategories().get(select_random).click();
    }


    @Then("sub category page will open")
    public void subCategoryPageWillOpen() {
        String page_title = home.category_page().getText();
        System.out.println(sub_name);
        soft.assertTrue(page_title.toLowerCase().trim().contains(sub_name));
    }
}

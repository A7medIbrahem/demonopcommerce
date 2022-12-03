package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P03_homePage {
    public WebElement customerCurrency(){
        return driver.findElement(By.id("customerCurrency"));
    }
    public List<WebElement> actualprice(){
      //  return driver.findElement(By.className("actual-price"));
        return driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));

    }

    public WebElement search(){

        return driver.findElement(By.id("small-searchterms"));
    }
    public WebElement search_button(){
        return driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }
    /////////////////////////////

    public WebElement computer(){
        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
    }
    public List<WebElement> subcategories(){
        String locator = "ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]+div[class=\"sublist-toggle\"]+ul[class=\"sublist first-level\"] a[href]";
        List<WebElement> sub = driver.findElements(By.cssSelector(locator));
        return sub;
    }
    public WebElement category_page(){
        return driver.findElement(By.cssSelector("div[class=\"page-title\"] h1"));
    }



    //////////////////////////////////
    public WebElement nokia_slider(){
        return driver.findElement(By.cssSelector("a[class=\"nivo-imageLink\"] img[src=\"https://demo.nopcommerce.com/images/thumbs/0000079_banner_1.jpg\"]"));
    }
    public WebElement iphone_slider(){
        return driver.findElement(By.cssSelector("a[class=\"nivo-imageLink\"] img[src=\"https://demo.nopcommerce.com/images/thumbs/0000080_banner_2.jpg\"]"));
    }


    public WebElement facebook(){
        return driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
    }
    public WebElement twitter(){
        return driver.findElement(By.cssSelector("a href=\"https://twitter.com/nopCommerce\""));
    }
    public WebElement rss() {
        return driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
    }
    public WebElement youtube() {
        return driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }


    public WebElement wishlist_button(){
        return driver.findElement(By.cssSelector("div[class=\"item-box\"] [data-productid=\"18\"] [title=\"Add to wishlist\"]"));
    }

    public WebElement message(){
        return driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public WebElement background(){
        return driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public WebElement wishlist_store(){
        return driver.findElement(By.className("wishlist-label"));
    }
    public WebElement QTY_value(){
        return driver.findElement(By.className("wishlist-qty"));
    }







}

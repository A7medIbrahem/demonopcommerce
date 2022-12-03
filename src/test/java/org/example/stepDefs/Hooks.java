package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Hooks {
   public static WebDriver driver;

    @Before
    public void  openBrowser(){
        //1- Define setProperty
        //System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        //2- Create new object from chromeDriver
        driver = new ChromeDriver();

        //3- Configurations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //4- navigate
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @After
    public void quitDriver() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();

    }
}

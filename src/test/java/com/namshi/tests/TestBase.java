package com.namshi.tests;
import com.namshi.pages.splashPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //Perform Basic Operations
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.get("http:www.namshi.com");
    }
    public  static void openurl(String URL)
    {
        driver.get(URL);
    }

    @AfterTest
    public void close(){
        driver.close();
    }
}

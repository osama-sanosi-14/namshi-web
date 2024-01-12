package com.namshi.utilites;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utilities {

    public utilities(WebDriver driver){
        this.driver=driver;
    }

    WebDriver driver;
    public void highLightElement(WebElement element) throws InterruptedException {
        // draw a border around the found element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        if (driver != null) {
            js.executeScript("arguments[0].setAttribute('style', 'border: 3px solid red;');", element);
            Thread.sleep(1000);
        }
    }
    public boolean IsElementDisplayed(WebElement element){
        try {
            highLightElement(element);
            System.out.println(element + " is displayed");
            return element.isDisplayed();
        } catch (Exception e) {System.out.println(e.getMessage());}
        return false;
    }
}

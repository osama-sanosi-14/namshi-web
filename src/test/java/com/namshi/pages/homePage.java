package com.namshi.pages;

import com.namshi.utilites.utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class homePage extends masterPage{
    @FindBy(className = "AppHeader_logo__Npnxs")
    private WebElement Logo;
    @FindBy(className = "AccountMenu_triggerContainer__jvR2_")
    private WebElement Login;
    @FindBy(className = "TextInput_input__8WkOT")
    private WebElement Email;
    @FindBy(className = "EmailForm_btn__hlqq0")
    private WebElement ContinueButton;
    @FindBy(className = "PasswordInput_input__GifsW")
    private WebElement Password;
    @FindBy(className = "PasswordForm_btn__QsoHd")
    private WebElement LoginButton;
    @FindBy(className = "AccountMenu_emphasized__TEWjz")
    private WebElement MyAccountDropdown;
    public homePage(WebDriver driver){
        super(driver);
    }

    public void login(String email,String password ) throws InterruptedException {
        utilities utils = new utilities(driver);
        Assert.assertTrue(utils.IsElementDisplayed(Login));
        Login.click();
        Email.sendKeys(email);
        ContinueButton.click();
        Password.sendKeys(password);
        Assert.assertTrue(utils.IsElementDisplayed(LoginButton));
        LoginButton.click();
        Thread.sleep(3000);
        Assert.assertTrue(utils.IsElementDisplayed(MyAccountDropdown));
    }

}

package com.namshi.pages;

import com.namshi.utilites.utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class splashPage extends masterPage {

    @FindBy(className = "AppHeader_logo__Npnxs")
    private WebElement Logo;
    @FindBy(className = "StoreList_content__ORZm7")
    private WebElement Storelist;
    @FindBy(css = ".StoreList_country__g60IE:nth-child(2) a")
    private WebElement UAE;
    @FindBy(className = "HomePageBanners_container__3w_5G")
    private WebElement GenderBanner;
    @FindBy(css = ".HomePageBanners_banner__NOgYP:nth-of-type(2) .HomePageBanners_bannerImage___2Q3y")
    private WebElement MenBanner;
    @FindBy(css = ".HomePageBanners_banner__NOgYP:nth-of-type(2) .HomePageBanners_bannerTitle___C_Qf")
    private WebElement MenBannerTitle;
    public splashPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToHomepage() throws InterruptedException {
        utilities utils = new utilities(driver);
        Assert.assertTrue(utils.IsElementDisplayed(Storelist));
        Assert.assertTrue(utils.IsElementDisplayed(UAE));
        selectCountry();
        Assert.assertTrue(utils.IsElementDisplayed(GenderBanner));
        Assert.assertTrue(utils.IsElementDisplayed(MenBanner));
        Assert.assertTrue(utils.IsElementDisplayed(MenBannerTitle));
        selectGender();
        Thread.sleep(2000);
        Assert.assertTrue(utils.IsElementDisplayed(Logo));
    }
    public void selectCountry() {
        UAE.click();
    }
    public void selectGender(){ MenBannerTitle.click(); }

}

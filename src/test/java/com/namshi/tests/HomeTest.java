package com.namshi.tests;

import com.namshi.pages.homePage;
import com.namshi.pages.splashPage;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.testng.annotations.Test;
import java.io.FileReader;
import java.io.IOException;

public class HomeTest extends TestBase{

//    @DataProvider(name = "Testdata")
//    public static Object[][] data(){
//
//        return new Object[][] {
//                {"osama.sanosi@namshi.com", "Osama_123"}
//        };
//    }

    CSVReader reader;
    @Test
    public void splashPage() throws InterruptedException, IOException, CsvValidationException {
        String email = null;
        String password = null;
        String CSV_FILE = System.getProperty("user.dir")+"/Data/MyData.csv";
        reader = new CSVReader(new FileReader(CSV_FILE));
        String[] csv_cell;
        while ((csv_cell= reader.readNext()) != null) {
            email = csv_cell[0];
            password = csv_cell[1];
        }
        splashPage splash = new splashPage(driver);
        splash.navigateToHomepage();
        homePage home = new homePage(driver);
        home.login(email, password);
    }
}

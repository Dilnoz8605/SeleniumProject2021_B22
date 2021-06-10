package com.cybertek.tests.day10_webtable_properties_practices;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Table_Tasks {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        String browser = ConfigurationReader.getProperty("browser");
        //This line returns String : chrome

        String url = ConfigurationReader.getProperty("dataTablesUrl");
        //This line returns String : http://practice.cybertekschool.com/tables#edit

        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(url);
        // below code is same as above
        //driver.get(ConfigurationReader.getProperty("dataTablesUrl"));

    }

    @Test
    public void task3_return_tims_due_amount(){

        ////table[@id='table1']//td[.='Tim'] --> this locator locates Tim's cell regardless
        // of which row he is in

        //2.	Locate first table and verify Tim has due amount of “$50”

        // 1st way: //table[@id='table1']//td[.='Tim']/../td[4]
        // 2nd way: //table[@id='table1']//td[.='Tim']/following-sibling::td[2]
        //BREAK UNTIL: 8.08PM CST


        //Note: Create locator for Tim that will be dynamic and doesn’t care in which row Tim is.
    }

}

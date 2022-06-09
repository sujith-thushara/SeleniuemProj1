package tests;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.RegistrationPage;


public class RegistrationTest {

    public static void main(String[] args) {
        WebDriver driver = new SafariDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();

        System.out.println(RegistrationPage.findPageName(driver));

        RegistrationPage.getFirstName(driver).sendKeys("SujithT");
        RegistrationPage.getLastName(driver).sendKeys("ThusharaG");
        RegistrationPage.getGender(driver).click();
        RegistrationPage.getDrpDownName(driver,"Africa");
        RegistrationPage.getSubmitBtn(driver).click();
        RegistrationPage.getLink(driver).click();



    }

}

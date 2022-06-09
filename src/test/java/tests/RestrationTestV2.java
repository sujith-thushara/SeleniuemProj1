package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import pages.RegistrationPageV2;

public class RestrationTestV2 {
    static WebDriver driver = null;

    public static void main(String[] args) {
        fillRegistration();
    }

    public static void init(){
        driver = new SafariDriver();
        driver.manage().window().maximize();
    }



    public static void fillRegistration(){

        init();
        RegistrationPageV2 registrationPageV2 = new RegistrationPageV2(driver);
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        registrationPageV2.set_fname("Sujith");
        registrationPageV2.set_lname("lname");

//        closeMe();

    }







}

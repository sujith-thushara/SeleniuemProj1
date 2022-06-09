package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import pages.RegistrationPageNewV1;


public class RegistrationTestV1 {

    static WebDriver driver = null;

    public static void main(String[] args) {
        fillRegistrationForm();

    }

    public static void init(){

        driver = new SafariDriver();
        driver.manage().window().maximize();

    }

    public static void fillRegistrationForm(){
        init();

        RegistrationPageNewV1 registrationPageNewV1 = new RegistrationPageNewV1(driver);
//        init();
//        driver = new SafariDriver();
//        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        registrationPageNewV1.enterFname("Sujith");
        registrationPageNewV1.enterLname("Thushara");


    }



}

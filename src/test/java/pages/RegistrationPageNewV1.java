package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPageNewV1 {

    WebDriver driver = null;

    By txt_first_name = By.name("firstname");
    By txt_last_name = By.name("lastname");
    By rdo_gender = By.id("sex-0");
    By rdo_exp = By.id("exp-4");
    By drp_continet = By.id("continents");
    By btn_submit = By.id("submit");



    public RegistrationPageNewV1  (WebDriver driver){
        this.driver = driver;
    }

    public void enterFname (String fname){
        driver.findElement(txt_first_name).sendKeys(fname);


    }

    public void enterLname(String lname){
        driver.findElement(txt_last_name).sendKeys(lname);
    }



}

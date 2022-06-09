package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPageV2 {
    static WebDriver driver = null;

    public RegistrationPageV2 (WebDriver driver){
        this.driver = driver;

    }

    By txt_first_name = By.name("firstname");
    By txt_last_name = By.name("lastname");
    By rdo_gender = By.id("sex-0");
    By rdo_exp = By.id("exp-4");
    By drp_continet = By.id("continents");
    By btn_submit = By.id("submit");

    public void set_fname(String fname){
        driver.findElement(txt_first_name).sendKeys(fname);

    }

    public void set_lname(String lName){
        driver.findElement(txt_last_name).sendKeys(lName);
    }
}

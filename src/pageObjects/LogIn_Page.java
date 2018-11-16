package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn_Page {

    private static WebElement element = null;
    public static WebElement txtbx_UserName(WebDriver driver){

        element = driver.findElement(By.id("elInput_auth"));

        return element;

    }

    public static WebElement txtbx_Password(WebDriver driver){

        element = driver.findElement(By.id("elInput_password"));

        return element;

    }

    public static WebElement btn_LogIn(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"ipsLayout_mainArea\"]/div/div/div[1]/div/form/ul/li[4]/div/button"));

        return element;

    }
}

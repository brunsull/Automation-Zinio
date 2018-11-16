package Test_Cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Import package pageObject.*

import pageObjects.Home_Page;

import pageObjects.LogIn_Page;

public class Login_TC {

    private static WebDriver driver = null;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","binaries/chromedriver.exe");
        driver = new ChromeDriver();

        // For firefox:
        // System.setProperty("webdriver.gecko.driver", "D:/SeleniumEnvironment/chromedriver_win32/chromedriver.exe");
        //                  WebDriver driver = new ChromeDriver()

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.trials-forum.co.uk/login/"); // Use the page Object library now

        Home_Page.lnk_MyAccount(driver).click();

        LogIn_Page.txtbx_UserName(driver).sendKeys("autotestbs@gmail.com");

        LogIn_Page.txtbx_Password(driver).sendKeys("Sarmata120.");

        LogIn_Page.btn_LogIn(driver).click();

        System.out.println(" Login Successfully, please Log Off.");

        Home_Page.lnk_LogOut(driver).click();

        driver.quit();

    }
}

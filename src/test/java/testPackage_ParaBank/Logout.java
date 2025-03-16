package testPackage_ParaBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.TransferFundPage;

public class Logout {

    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;

    @BeforeTest
    public void setup (){
        driver  = new ChromeDriver();
        loginPage = new LoginPage(driver);
        homePage= new HomePage(driver);
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test
    public void userLogout ()
    {
        loginPage.login();
        homePage.logout();
    }

    @AfterTest
    public void teardown()
    {
        driver.quit();
    }
}

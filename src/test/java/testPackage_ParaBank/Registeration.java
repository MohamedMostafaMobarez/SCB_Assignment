package testPackage_ParaBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegisterationPage;

public class Registeration {

    WebDriver driver;
    LoginPage loginPage;
    RegisterationPage registerationPage;

    @BeforeTest
    public void setup (){
        driver  = new ChromeDriver();
        loginPage = new LoginPage(driver);
        registerationPage= new RegisterationPage(driver);
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test
    public void register ()
    {
        loginPage.clickRegBtn();
        registerationPage.customerRegisteration();

    }


    @AfterTest
    public void teardown ()
    {
        driver.quit();
    }

}

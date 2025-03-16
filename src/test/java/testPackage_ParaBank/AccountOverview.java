package testPackage_ParaBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AccountOverviewPage;
import pages.HomePage;
import pages.LoginPage;

public class AccountOverview {

        WebDriver driver;
        LoginPage loginPage;
        HomePage homePage;
        AccountOverviewPage accountOverviewPage;

        @BeforeTest
        public void setup (){
            driver  = new ChromeDriver();
            loginPage = new LoginPage(driver);
            homePage= new HomePage(driver);
            accountOverviewPage = new AccountOverviewPage(driver);
            driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
            loginPage.login();
        }

    @Test
    public void customerBalance()
    {
        homePage.navigateToAccountOverview();
        accountOverviewPage.checkBalance();


    }

    @AfterTest
    public void teardown ()
    {
        driver.quit();
    }



}

package testPackage_ParaBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RequestLoanPage;

public class RequestLoan {

    WebDriver driver;
    HomePage homePage;
    RequestLoanPage requestLoanPage;
    LoginPage loginPage;

    @BeforeTest
    public void setup (){
        driver  = new ChromeDriver();
        loginPage = new LoginPage(driver);
        homePage= new HomePage(driver);
        requestLoanPage= new RequestLoanPage(driver);
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test
    public void requestLoan ()
    {
        loginPage.login();
        homePage.navigateToRequestLoan();
        requestLoanPage.setRequestLoan();
    }

    @AfterTest
    public void teardown ()
    {
        driver.quit();

    }

}

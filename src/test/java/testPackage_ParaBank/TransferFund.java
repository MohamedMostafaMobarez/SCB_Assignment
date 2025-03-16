package testPackage_ParaBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.TransferFundPage;

public class TransferFund {

    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    TransferFundPage transferFundPage;

    @BeforeTest
    public void setup (){
        driver  = new ChromeDriver();
        loginPage = new LoginPage(driver);
        homePage= new HomePage(driver);
        transferFundPage= new TransferFundPage(driver);
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test
    public void transferFund()
    {
        loginPage.login();
        homePage.navigateToTransferFund();
        transferFundPage.setTransferFund();

    }


}

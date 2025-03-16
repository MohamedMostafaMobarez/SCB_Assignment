package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage {

    WebDriver driver;
    Wait wait;

    //Locators
    By logoutBtn = By.xpath("//a[@href='logout.htm']");
    By requestLoanBtn = By.xpath("//a[@href='requestloan.htm']");
    By accountOverviewBtn = By.xpath("//a[@href='overview.htm']");
    By transferFundBtn= By.xpath("//a[@href='transfer.htm']");
    By logo = By.xpath("//img[@title='ParaBank']");
    By loginBtn= By.xpath("//input[@value = 'Log In']");

    public HomePage(WebDriver driver)
    {
        this.driver = driver;


    }

    public void logout ()
    {
        driver.findElement(logoutBtn).click();
        Wait<WebDriver > wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NotFoundException.class)
                .ignoring(NullPointerException.class)
                .ignoring(ElementNotInteractableException.class);
        boolean loginBtnVisible = wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn)).isDisplayed();
        Assert.assertTrue(loginBtnVisible);
    }


    public void checkLogo()
    {
        Wait<WebDriver > wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NotFoundException.class)
                .ignoring(NullPointerException.class)
                .ignoring(ElementNotInteractableException.class);
        Boolean logoutBtnVisible = wait.until(ExpectedConditions.visibilityOfElementLocated(logoutBtn)).isDisplayed();

        Assert.assertTrue(logoutBtnVisible);

//        driver.findElement(logoutBtn).isDisplayed();

    }

    public void navigateToRequestLoan ()
    {
        driver.findElement(requestLoanBtn).click();

    }

    public void navigateToAccountOverview ()
    {
        driver.findElement(accountOverviewBtn).click();

    }

    public void navigateToTransferFund ()
    {
        driver.findElement(transferFundBtn).click();

    }


}

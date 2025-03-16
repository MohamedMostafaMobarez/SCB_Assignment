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

import static com.sun.org.apache.xpath.internal.compiler.Token.contains;

public class RequestLoanPage {
    WebDriver driver;

    //locators
    By loanAmountField = By.id("amount");
    By downPaymentField = By.id("downPayment");
    By fromAccountList = By.id("fromAccountId");
    By requestLoanApplyBtn= By.xpath("//input[@value='Apply Now']");
    By requestLoanStatus= By.xpath("//td[@id='loanStatus']");


    public RequestLoanPage(WebDriver driver)
    {
       this.driver = driver;

    }

    public void setRequestLoan  ()
    {
        driver.findElement(loanAmountField).sendKeys("300");
        driver.findElement(downPaymentField).sendKeys("30");
        driver.findElement(requestLoanApplyBtn).click();

        Wait<WebDriver > wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NotFoundException.class)
                .ignoring(NullPointerException.class)
                .ignoring(ElementNotInteractableException.class);

        String loanStatus = wait.until(ExpectedConditions.visibilityOfElementLocated(requestLoanStatus)).getDomProperty("innerText");
//                driver.findElement(requestLoanStatus).getDomProperty("innerText");
//        System.out.println(loanStatus);
        Assert.assertEquals(loanStatus, "Approved");


    }
}

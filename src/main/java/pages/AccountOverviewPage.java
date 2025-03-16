package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class AccountOverviewPage {

    WebDriver driver;
    Wait wait;
//locators
//    By totalAccountBalance= By.xpath("//table[@id='accountTable']//tr[2]/td[2]");
By totalAccountBalance= By.xpath("//tr[contains(.,'Total')]/td[2]");



    public AccountOverviewPage(WebDriver driver)
    {
        this.driver = driver;

    }

    public void checkBalance ()
    {
        Wait<WebDriver > wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NotFoundException.class)
                .ignoring(NullPointerException.class)
                .ignoring(ElementNotInteractableException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(totalAccountBalance)).isDisplayed();
      String totalBalance =  driver.findElement(totalAccountBalance).getDomProperty("innerText");
      System.out.println(totalBalance);
    }

}

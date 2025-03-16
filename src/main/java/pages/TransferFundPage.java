package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferFundPage {

    WebDriver driver;

    //locators
    By transferAmountField = By.id("amount");
    By transferBtn= By.xpath("//input[@value='Transfer']");
    By fromAccount = By.id("fromAccountId");
    By toAccount = By.id("toAccountId");

    public TransferFundPage(WebDriver driver)
    {
        this.driver = driver;

    }

    public void setTransferFund()
    {
        driver.findElement(transferAmountField).sendKeys("300");
        driver.findElement(fromAccount).isSelected();
//        driver.findElement(toAccount).isSelected();
//        driver.findElement(transferBtn).click();

    }


}

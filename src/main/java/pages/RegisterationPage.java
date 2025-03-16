package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterationPage {

    WebDriver driver;
    By firstNameField = By.id("customer.firstName");
    By lastNameField = By.id("customer.lastName");
    By addressField = By.id("customer.address.street");
    By cityField= By.id("customer.address.city");
    By stateField= By.id("customer.address.state");
    By zipcodeField= By.id("customer.address.zipCode");
    By ssnField= By.id("customer.ssn");
    By regUsernameField = By.id("customer.username");
    By regPassField = By.id("customer.password");
    By confRegPassField = By.id("repeatedPassword");
    By submitRegBtn = By.xpath("//input[@value='Register']");
    By successRegMessage = By.xpath("//div[@id='rightPanel']//*[2]");


    public RegisterationPage(WebDriver driver)
    {
        this.driver = driver;

    }
    public void customerRegisteration ()
    {
        driver.findElement(firstNameField).sendKeys("Mohamed");
        driver.findElement(lastNameField).sendKeys("Mostafa");
        driver.findElement(addressField).sendKeys("New Cairo");
        driver.findElement(cityField).sendKeys("Cairo");
        driver.findElement(stateField).sendKeys("Cairo");
        driver.findElement(zipcodeField).sendKeys("11911");
        driver.findElement(ssnField).sendKeys("1234");
        driver.findElement(regUsernameField).sendKeys("Mohamed");
        driver.findElement(regPassField).sendKeys("Test123");
        driver.findElement(confRegPassField).sendKeys("Test123");
        driver.findElement(submitRegBtn).click();

    }
    public void checkRegMessage ()
    {
        String RegMessage = driver.findElement(successRegMessage).getDomProperty("innerText");
        System.out.println(RegMessage);
    }



}

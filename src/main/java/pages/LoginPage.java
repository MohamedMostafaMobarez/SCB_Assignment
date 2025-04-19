package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

//locators
    By registerBtn= By.xpath("//a[text() = 'Register']");
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginBtn= By.xpath("//input[@value = 'Log In']");
    JSONRead jsonRead = new JSONRead();
    String name = (String)data.get("name");



    public LoginPage(WebDriver driver)
    {
        this.driver = driver;

    }

    public void login()
    {
        driver.findElement(usernameField).sendKeys(jsonRead.getString("name"));
        driver.findElement(passwordField).sendKeys("Test123");
        driver.findElement(loginBtn).click();

    }

    public void clickRegBtn()
    {
        driver.findElement(registerBtn).click();
    }

}

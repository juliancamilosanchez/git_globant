package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helpers.Helpers;

public class PageLogin {
    private WebDriver driver;
    private By userField;
    private By passwordField;
    private By loginButton;
    public PageLogin(WebDriver driver) {
        this.driver = driver;
        userField = By.name("userName");
        passwordField = By.name("password");
        loginButton = By.name("login");
    }

    public void login(String user,String pass) {
        driver.findElement(By.name("userField")).sendkeys(user);
        driver.findElement(By.name("passwordField")).sendkeys(pass);
        driver.findElement(By.name("loginButton")).click();
        Helpers helper = new Helpers();
        helpers.sleepSeconds(4);
    }
}

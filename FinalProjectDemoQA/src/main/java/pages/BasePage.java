package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait driverWait;
    private Actions actions;
    private static final String PROFILE_URL="https://demoqa.com/";
    private By elementsButton=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    private By alertsFrameWindowsButton=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[1]");

    public BasePage(WebDriver driver, WebDriverWait driverWait,Actions actions) {
        this.driver = driver;
        this.driverWait = driverWait;
        this.actions = actions;
    }

    public void clickElementsButton(){
        getDriver().findElement(elementsButton).click();
    }
    public void clickAlertsFrameWindowsButton(){
        getDriver().findElement(alertsFrameWindowsButton).click();
    }

    public WebDriverWait getDriverWait() {
        return driverWait;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void setDriverWait(WebDriverWait driverWait) {
        this.driverWait = driverWait;
    }

    public Actions getActions() {
        return actions;
    }
    public void goToProfilPage(){
        driver.navigate().to(PROFILE_URL);
    }
}

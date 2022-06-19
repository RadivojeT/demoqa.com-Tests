package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage extends BasePage{
    private By alertsMenu= By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]");

    private By clickMeAlertsButton=By.id("alertButton");
    private By clickMeConfirmButton=By.id("confirmButton");
    private By clickMePromptButton=By.id("promtButton");
    private By clickMeTimerAlertButton=By.id("timerAlertButton");

    private By messageForConfirmResult=By.id("confirmResult");
    private By messageForPromtResult=By.id("promptResult");


    public AlertsPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }
    public void clickAlertsMenu(){
        getDriver().findElement(alertsMenu).click();
    }
    public void goToAlerts(){
        goToProfilPage();
        clickAlertsFrameWindowsButton();
        clickAlertsMenu();
    }
    public void clickClickMeAlertsButton(){
        getDriver().findElement(clickMeAlertsButton).click();
    }
    public void clickClickMeConfirmButton(){
        getDriver().findElement(clickMeConfirmButton).click();
    }
    public void clickClickMePromptButton(){
        getDriver().findElement(clickMePromptButton).click();
    }
    public void clickClickMeTimerAlertButton(){
        getDriver().findElement(clickMeTimerAlertButton).click();
    }
    public void sendText(String textToSend){
        getDriver().switchTo().alert().sendKeys(textToSend);
    }
    public String getAlertText(){
        return getDriver().switchTo().alert().getText();
    }
    public void waitUntilAlertIsPresent(){
        getDriverWait().until(ExpectedConditions.alertIsPresent());
    }
    public void closeAlert(){
        getDriver().switchTo().alert().accept();
    }
    public WebElement getMessageForConfirmResult(){
        return getDriver().findElement(messageForConfirmResult);
    }
    public WebElement getMessageForPromptResult(){
        return getDriver().findElement(messageForPromtResult);
    }


}

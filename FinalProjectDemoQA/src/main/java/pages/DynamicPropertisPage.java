package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPropertisPage extends BasePage{
    private By dynamicPropertiesMenu=By.id("item-8");
    private By visibleAfterButton=By.id("visibleAfter");
    private By colorChangeButton=By.id("colorChange");
    private By enableButton=By.id("enableAfter");


    public DynamicPropertisPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }
    public void clickDynamicPropertiesMenu(){
        getDriver().findElement(dynamicPropertiesMenu).click();
    }
    public void goToDynamicProperties(){
        clickElementsButton();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,500)");
        clickDynamicPropertiesMenu();
    }
    public void clickEnabledButton(){
        getDriverWait().until(ExpectedConditions.elementToBeClickable(enableButton));
        getDriver().findElement(enableButton).click();
    }
    public boolean isButtonEnabled(){
        return getDriver().findElement(enableButton).isEnabled();
    }
    public String colorChangeButton(){
        getDriverWait().until(ExpectedConditions.attributeContains(colorChangeButton,"class","mt-4 text-danger btn btn-primary"));
        return getDriver().findElement(colorChangeButton).getAttribute("class");
    }
    public void waitUntilVisible(){
        getDriverWait().until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("visibleAfter")));
    }
    public boolean isButtonVisible(){
        return getDriver().findElement(visibleAfterButton).isDisplayed();
    }
}

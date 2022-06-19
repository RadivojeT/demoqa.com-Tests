package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage extends BasePage{
    private By butttonsMenu = By.id("item-4");
    private By doubleClickMeButton = By.id("doubleClickBtn");
    private By rightClickMeButton=By.id("rightClickBtn");
    private By clickMeButton=By.id("5ShnU");
    private By messageForDoubleClick=By.id("doubleClickMessage");


    public ButtonsPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait,actions);
    }
    public WebElement getMessageForDoubleClick(){
        return getDriver().findElement(messageForDoubleClick);
    }
    public void clickButtonsMenu(){
        getDriver().findElement(butttonsMenu).click();
    }
    public void goToButtons() {
        clickElementsButton();
        clickButtonsMenu();
    }
    Actions actions = new Actions(getDriver());

    public void clickDoubleClickMeButton() {
        actions.doubleClick(getDriver().findElement(doubleClickMeButton)).perform();
    }
    public void clickRightClickMeButton(){
        actions.contextClick(getDriver().findElement(rightClickMeButton)).perform();
    }
    public void clickClickMe(){
        getDriver().findElement(clickMeButton).click();
    }
}

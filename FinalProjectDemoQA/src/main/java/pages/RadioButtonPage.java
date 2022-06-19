package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage extends BasePage{
    private By radioButtonMenu=By.id("item-2");

    private By yesButton=By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[2]/label");
    private By impressiveButton=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label");
    //for assert
    private By messageForYes=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p/span");
    private By messageForImpressive=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p/span");

    public RadioButtonPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    public WebElement getYesButton() {
        return getDriver().findElement(yesButton);
    }
    public WebElement getImpressiveButton() {
        return getDriver().findElement(impressiveButton);
    }
    public WebElement getMessageForYes(){
        return getDriver().findElement(messageForYes);
    }
    public WebElement getMessageForImpressive(){
        return getDriver().findElement(messageForImpressive);
    }

    public void clickRadioButtonMenu(){
        getDriver().findElement(radioButtonMenu).click();
    }
    public void getToRadioButton(){
        clickElementsButton();
        clickRadioButtonMenu();
    }
    public void clickYesButton(){
        getDriver().findElement(yesButton).click();
    }
    public void clickImpressiveButton(){
        getDriver().findElement(impressiveButton).click();
    }
    public boolean isYesButtonSelected(){
        return getYesButton().isSelected();
    }
    public boolean isImpressiveButtonSelected(){
        return getImpressiveButton().isSelected();
    }
}

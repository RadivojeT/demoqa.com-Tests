package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage extends BasePage{
    private By textBoxMenu=By.id("item-0");

    private By fullName=By.id("userName");
    private By email=By.id("userEmail");
    private By currentAddress=By.id("currentAddress");
    private By permanentAddress=By.id("permanentAddress");
    private By submitButton=By.id("submit");


    public TextBoxPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait,actions);
    }
    public void clickTextBoxMenu(){
        getDriver().findElement(textBoxMenu).click();
    }
    public void getToTextBox(){
        clickElementsButton();
        clickTextBoxMenu();
    }

    public void enterFullName(String fullName){
        getDriver().findElement(this.fullName).sendKeys(fullName);
    }
    public void enterEmail(String email) {
        getDriver().findElement(this.email).sendKeys(email);
    }
    public void enterCurrentAddress (String address){
        getDriver().findElement(this.currentAddress).sendKeys(address);
    }
    public void enterPermanentAddress (String permanentAddress){
        getDriver().findElement(this.permanentAddress).sendKeys(permanentAddress);
    }
    public void clickSubmit () {
        getDriver().findElement(submitButton).click();
    }
    public boolean nameSummary() {
        return getDriver().findElement(By.id("output")).getText().contains(getDriver().findElement(fullName).getText());
    }
    public boolean emailSummary(){
        return getDriver().findElement(By.id("output")).getText().contains(getDriver().findElement(email).getText());
    }
    public boolean currentAddressSummary(){
        return getDriver().findElement(By.id("output")).getText().contains(getDriver().findElement(currentAddress).getText());
    }
    public boolean permanentAddressSummary(){
        return getDriver().findElement(By.id("output")).getText().contains(getDriver().findElement(permanentAddress).getText());
    }
    public boolean allSummary(){
        if(nameSummary() && emailSummary() && currentAddressSummary() && permanentAddressSummary()) {
            return true;
        }
        return false;
    }

}

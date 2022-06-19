package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WebTablesPage extends BasePage{
    private By webTablesMenu=By.id("item-3");
    private By addButton=By.id("addNewRecordButton");

    private By firstName=By.id("firstName");
    private By lastName=By.id("lastName");
    private By userEmail=By.id("userEmail");
    private By userAge=By.id("age");
    private By userSalary=By.id("salary");
    private By userDepartment=By.id("department");
    private By submitButon=By.id("submit");
    private By deleteButton=By.id("delete-record-4");


    public WebTablesPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait,actions);
    }

    public void clickWebTablesMenu(){
        getDriver().findElement(webTablesMenu).click();
    }
    public void goToWebTables(){
        clickElementsButton();
        clickWebTablesMenu();
    }
    public void clickAddButton(){
        getDriver().findElement(addButton).click();
    }
    public void enterFirstName(String firstName){
        getDriver().findElement(this.firstName).sendKeys(firstName);
    }
    public void enterLastName(String lastName){
        getDriver().findElement(this.lastName).sendKeys(lastName);
    }
    public void enterEmail(String email){
        getDriver().findElement(this.userEmail).sendKeys(email);
    }
    public void enterAge(String age){
        getDriver().findElement(this.userAge).sendKeys(age);
    }
    public void enterSalary(String salary){
        getDriver().findElement(this.userSalary).sendKeys(salary);
    }
    public void enterDepartment(String department){
        getDriver().findElement(this.userDepartment).sendKeys(department);
    }
    public void clickSubmit(){
        getDriver().findElement(submitButon).click();
    }
    public void clickDeleteButton(){
        getDriver().findElement(deleteButton).click();
    }

    public boolean checkIsUserInTable(String addedName){
        List<WebElement> nameInTable = getDriver().findElements(By.className("rt-table"));
        for (WebElement i : nameInTable){
            if (i.getText().contains(addedName)){
                return true;
            }
        }
        return false;
    }

}

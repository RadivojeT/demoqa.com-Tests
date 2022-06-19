package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsTests extends BaseTest{
    /** Verify if the Text Box functionality in Element section creates proper tex box when the user enters valid data*/
    @Test(priority = 1)
    public void testTextBox(){
        getTextBoxPage().getToTextBox();
        getTextBoxPage().enterFullName("Roronoa Zoro");
        getTextBoxPage().enterEmail("zoro123@gmail.com");
        getTextBoxPage().enterCurrentAddress("Kuraigana Island");
        getTextBoxPage().enterPermanentAddress("Shimotsuki Village");
        getTextBoxPage().clickSubmit();
        Assert.assertTrue(getTextBoxPage().allSummary());

    }
    /**Verify if the Radio Button functionality in Element section, when the user click on "Inpressive" */
    @Test(priority = 2)
    public void testRadioButton(){
        getRadioButtonPage().getToRadioButton();
        getRadioButtonPage().clickYesButton();
        Assert.assertEquals(getRadioButtonPage().getMessageForYes().getText(),"Yes");
        Assert.assertFalse(getRadioButtonPage().isImpressiveButtonSelected());
        getRadioButtonPage().clickImpressiveButton();
        Assert.assertEquals(getRadioButtonPage().getMessageForImpressive().getText(),"Impressive");
        Assert.assertFalse(getRadioButtonPage().isYesButtonSelected());
    }
    /**Verify if the Buttons functionality in Element section, when the user double click on
     * "Double Click Me" button, and receives a return conformation */
    @Test(priority = 3)
    public void testButtonsDoubleClick()  {
        getButtonsPage().goToButtons();
        getButtonsPage().clickDoubleClickMeButton();
        Assert.assertEquals(getButtonsPage().getMessageForDoubleClick().getText(),"You have done a double click");
    }
    /**Verify if the Web Tables functionality in Element section, by adding a new member to the table*/
    @Test(priority = 4)
    public void testRegistrationForm(){
        getWebTablesPage().goToWebTables();
        getWebTablesPage().clickAddButton();
        getWebTablesPage().enterFirstName("Sanji");
        getWebTablesPage().enterLastName("Vinsmoke");
        getWebTablesPage().enterEmail("sanji123@gmail.com");
        getWebTablesPage().enterAge("21");
        getWebTablesPage().enterSalary("177000");
        getWebTablesPage().enterDepartment("Kitchen");
        getWebTablesPage().clickSubmit();
        Assert.assertTrue(getWebTablesPage().checkIsUserInTable("Sanji"));
    }
    /**Verify if the member has been deleted from table by pressing the delete button*/
    @Test(priority = 5)
    public void testDeleteFromTable(){
        getWebTablesPage().goToWebTables();
        getWebTablesPage().clickDeleteButton();
        Assert.assertFalse(getWebTablesPage().checkIsUserInTable("Sanji"));
    }
    /**Verify if the button appears after 5 seconds, In Element section-Dynamic Properties*/
    @Test(priority = 6)
    public void testDynamicPropertiesVisibleButton(){
        getDynamicPropertisPage().goToDynamicProperties();
        getDynamicPropertisPage().waitUntilVisible();
        Assert.assertTrue(getDynamicPropertisPage().isButtonVisible());
    }
    /**Verify if the button is enabled for first 5 seconds, In Element section-Dynamic Properties*/
    @Test(priority = 7)
    public void testDynamicPropertiesEnabledButton(){
        getDynamicPropertisPage().goToDynamicProperties();
        getDynamicPropertisPage().clickEnabledButton();
        Assert.assertTrue(getDynamicPropertisPage().isButtonEnabled());
    }
    /**Verify if the button changes color after 5 seconds, In Element section-Dynamic Properties*/
    @Test(priority = 8)
    public void testDynamicPropertiesColorButton(){
        getDynamicPropertisPage().goToDynamicProperties();
        getDynamicPropertisPage().colorChangeButton();
        Assert.assertEquals(getDynamicPropertisPage().colorChangeButton(),"mt-4 text-danger btn btn-primary");
    }

}

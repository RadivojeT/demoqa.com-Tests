package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTests extends BaseTest{
    /**Verify if an alert appears after clicking the button, with a description "Click Button to see alert"*/
    @Test(priority = 10)
    public void testAlertsAlertsButton(){
        getAlertsPage().goToAlerts();
        getAlertsPage().clickClickMeAlertsButton();
        Assert.assertEquals(getAlertsPage().getAlertText(),"You clicked a button");
        getAlertsPage().closeAlert();
    }
    /**Verify if an alert appears after clicking the button, with a description "On button click, confirm box will appear"*/
    @Test(priority = 11)
    public void testAlertsConfirmButton(){
        getAlertsPage().goToAlerts();
        getAlertsPage().clickClickMeConfirmButton();
        Assert.assertEquals(getAlertsPage().getAlertText(),"Do you confirm action?");
        getAlertsPage().closeAlert();
        Assert.assertEquals(getAlertsPage().getMessageForConfirmResult().getText(),"You selected Ok");
    }
    /**Verify if an alert appears after clicking the button, with a description "On button click, prompt box will appear"*/
    @Test (priority = 12)
    public void testAlertsPromptButton(){
        getAlertsPage().goToAlerts();
        getAlertsPage().clickClickMePromptButton();
        Assert.assertEquals(getAlertsPage().getAlertText(),"Please enter your name");
        getAlertsPage().sendText("Brook");
        getAlertsPage().closeAlert();
        Assert.assertEquals(getAlertsPage().getMessageForPromptResult().getText(),"You entered Brook");
    }
    /**Verify if an alert appears 5 seconds after clicking the button, with a description
     * "On button click, alert will appear after 5 seconds"*/
    @Test(priority = 13)
    public void testAlertsTimerAlertButton() {
        getAlertsPage().goToAlerts();
        getAlertsPage().clickClickMeTimerAlertButton();
        getAlertsPage().waitUntilAlertIsPresent();
        Assert.assertEquals(getAlertsPage().getAlertText(),"This alert appeared after 5 seconds");
        getAlertsPage().closeAlert();

    }

}

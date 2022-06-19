package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait driverWait;
    private Actions actions;
    private TextBoxPage textBoxPage;
    private RadioButtonPage radioButtonPage;
    private WebTablesPage webTablesPage;
    private ButtonsPage buttonsPage;
    private DynamicPropertisPage dynamicPropertisPage;
    private AlertsPage alertsPage;


    public TextBoxPage getTextBoxPage() {
        return textBoxPage;
    }
    public RadioButtonPage getRadioButtonPage(){
        return radioButtonPage;
    }
    public WebTablesPage getWebTablesPage(){
        return webTablesPage;
    }
    public ButtonsPage getButtonsPage(){
        return buttonsPage;
    }
    public DynamicPropertisPage getDynamicPropertisPage(){
        return dynamicPropertisPage;
    }
    public AlertsPage getAlertsPage(){
        return alertsPage;
    }


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mlade\\IdeaProjects\\chromedriver_win32\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(20));


        textBoxPage=new TextBoxPage(driver, driverWait,actions);
        radioButtonPage=new RadioButtonPage(driver, driverWait,actions);
        webTablesPage=new WebTablesPage(driver, driverWait,actions);
        buttonsPage=new ButtonsPage(driver,driverWait,actions);
        dynamicPropertisPage=new DynamicPropertisPage(driver,driverWait,actions);
        alertsPage=new AlertsPage(driver,driverWait,actions);


        driver.navigate().to("https://demoqa.com/");
    }
    @AfterClass
    public void afterClass() {
        driver.close();
    }
}

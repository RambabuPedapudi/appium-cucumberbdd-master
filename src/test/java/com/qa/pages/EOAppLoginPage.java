package com.qa.pages;


import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class EOAppLoginPage extends BasePage {
    TestUtils utils = new TestUtils();
    
    @AndroidFindBy(className = "android.widget.EditText")
    @iOSXCUITFindBy(id = "test-Username")
    private MobileElement userEmailTxtFld;

    @AndroidFindBy(className = "android.widget.EditText")
    @iOSXCUITFindBy(id = "test-Username")
    private MobileElement ChargerSerialNumber;
    @AndroidFindBy(accessibility = "Get started")
    @iOSXCUITFindBy(id = "Get started")
     private MobileElement GetStartBtn;
//       driver.findElementByXPath("//android.widget.Button[@content-desc=\"Get started\"]").click();
//     }

    @AndroidFindBy(className = "android.widget.EditText")
    @iOSXCUITFindBy(id = "test-Password")
    private MobileElement EmailPasswordTxtFld;

    @AndroidFindBy(accessibility = "CLOSE")
    @iOSXCUITFindBy(id = "test-Password")
    private MobileElement EoPopClose;

    @AndroidFindBy(xpath = "(//android.widget.Button[@index='2'])[2]")
    @iOSXCUITFindBy(id = "test-LOGIN")
    private MobileElement AppLogInBtn;

    @AndroidFindBy(xpath = "//android.view.View[@index='2']")
    @iOSXCUITFindBy(id = "test-LOGIN")
    private MobileElement TermsConditions;

    @AndroidFindBy(xpath = "//android.view.View[@index='4']")
    @iOSXCUITFindBy(id = "test-LOGIN")
    private MobileElement EoPolicybtn;

    @AndroidFindBy(className = "android.widget.Button")
    @iOSXCUITFindBy(id = "test-LOGIN")
    private MobileElement nextBtnForPas;

    @AndroidFindBy(className = "android.widget.Button")
    @iOSXCUITFindBy(id = "test-LOGIN")
    private MobileElement nextBtnForHome;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Home Connect your EO home charge point to the EO app\"]")
    @iOSXCUITFindBy(id = "test-LOGIN")
    private MobileElement WelcomeHomeBtn;

    @AndroidFindBy(accessibility = "Enter the serial number manually")
    @iOSXCUITFindBy(id = "test-LOGIN")
    private MobileElement MnSerialNumBtn;
    @AndroidFindBy(xpath = "(//android.widget.Button[@index='2'])[2]")
    @iOSXCUITFindBy(id = "test-LOGIN")
    private MobileElement nextBtnForlog;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Charging mode:\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"test-Error message\"]/child::XCUIElementTypeStaticText")
    private MobileElement EoAppTitleText;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Welcome to EO\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"test-Error message\"]/child::XCUIElementTypeStaticText")
    private MobileElement EoAppWelcomeTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\\\"EO App\\")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"test-Error message\"]/child::XCUIElementTypeStaticText")
    private MobileElement EoAppBtn;

    public EOAppLoginPage() {
    }

    public String getTitle() {
        return getText(userEmailTxtFld, "userEmailTxtFld is: ");
    }

    public void MnSerialNumBtn() throws InterruptedException {
       waitForVisibility(MnSerialNumBtn);
        Thread.sleep(3000);
       click(MnSerialNumBtn);
           }
    public void WelcomeHomeBtn() throws InterruptedException {
        waitForVisibility(WelcomeHomeBtn);
        Thread.sleep(3000);
        click(WelcomeHomeBtn);
    }
    public void NextBtnForHome() throws InterruptedException {
        waitForVisibility(nextBtnForHome);
        Thread.sleep(3000);
        click(nextBtnForHome);
    }
    public void TermsConditions() throws InterruptedException {
        waitForVisibility(TermsConditions);
        click(TermsConditions);
    }

    public void eoPopClose() throws InterruptedException {
        waitForVisibility(EoPopClose);
        Thread.sleep(3000);
        click(EoPopClose);
    }
    public void EoPolicybtn() throws InterruptedException {
        Thread.sleep(3000);
        click(nextBtnForlog);
        waitForVisibility(EoPolicybtn);
        click(EoPolicybtn);
    }
    public void GetstartBatton() throws InterruptedException {
        //waitForVisibility(GetStartBtn);
        click(GetStartBtn);
        //driver.findElementByXPath("//android.widget.Button[@content-desc=\"Get started\"]").click();

    }
//    public void NextBtnForPas() throws InterruptedException {
//
//        waitForVisibility(nextBtnForPas);
//        click(nextBtnForPas);
//        //driver.findElementByXPath("//android.widget.Button[@content-desc=\"Get started\"]").click();
//
//    }


    public EOAppLoginPage enterUserEmail(String username) throws InterruptedException {
        //new EOAppLoginPage().getTitle();
        //click(EoAppBtn);
        //waitForVisibility(userEmailTxtFld);
        Thread.sleep(3000);
        click(userEmailTxtFld);
        //waitForVisibility(userEmailTxtFld);
        Thread.sleep(3000);
        sendKeys(userEmailTxtFld, username, "login with " + username);
        //driver.findElementByClassName("android.widget.EditText").click();
        return this;
    }

    public EOAppLoginPage enterInUserEmail(String InvalidUserEmail) throws InterruptedException {
        //new EOAppLoginPage().getTitle();
        //click(EoAppBtn);
        //waitForVisibility(userEmailTxtFld);
        Thread.sleep(3000);
        click(userEmailTxtFld);
        //waitForVisibility(userEmailTxtFld);
        Thread.sleep(3000);
        sendKeys(userEmailTxtFld, InvalidUserEmail, "login with " + InvalidUserEmail);
        //driver.findElementByClassName("android.widget.EditText").click();
        return this;
    }


    public EOAppLoginPage EmailPasswordTxtFld(String password) throws InterruptedException {

        click(nextBtnForPas);
        Thread.sleep(3000);
        click(EmailPasswordTxtFld);
        Thread.sleep(3000);
        sendKeys(EmailPasswordTxtFld, password, "password is " + password);

        return this;
    }


    public EOAppHomepage pressLoginBtn() throws InterruptedException {
        Thread.sleep(3000);
        click(nextBtnForlog);
        Thread.sleep(3000);
        click(AppLogInBtn, "press app login button");
        return new EOAppHomepage();
    }

    public String getEoAppHomepageTitleText() throws InterruptedException {
        Thread.sleep(3000);
        click(AppLogInBtn, "press app login button");
        Thread.sleep(4000);
        System.out.println(EoAppTitleText);

        String EoAppTitle = getText(EoAppTitleText, "Charging mode:");
        return EoAppTitle;
    }

    public String getEoAppWelcomeTitleText() throws InterruptedException {
        Thread.sleep(3000);
        click(AppLogInBtn, "press app login button");
        Thread.sleep(4000);
        System.out.println(EoAppTitleText);

        String EoAppTitle = getText(EoAppWelcomeTitle, "Welcome to EO");
        return EoAppTitle;
    }



}

package com.qa.stepdef;

import com.qa.pages.EOAppLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EoAppLoginPageSteps {

    EOAppLoginPage loginpage = new EOAppLoginPage();

    @When("I have to click the start button on EO app")
    public void i_have_to_click_the_start_button_on_eo_app() throws InterruptedException {
        loginpage.GetstartBatton();
        //driver.findElementByXPath("//android.widget.Button[@content-desc=\"Get started\"]").click();
    }

    @And("I enter userValidEmail {string}")
    public void i_enter_user_valid_email(String userEmail) throws InterruptedException {

        loginpage.enterUserEmail(userEmail);

    }
    @And("I enter userValidNewEmail {string}")
    public void iEnterUserValidNewEmail(String NewUserEmail) throws InterruptedException {

        loginpage.userEnterNewEmail(NewUserEmail);


    }

    @And("I click the nextbtn for password")
    public void i_click_the_nextbtn_for_password() {
        System.out.println("button is click");


    }


    @And("I enter ValidEmailPassword as {string}")
    public void i_enter_valid_email_password_as(String EmailPassword) throws InterruptedException {
        loginpage.EmailPasswordTxtFld(EmailPassword);
    }
    @And("I enter ValidNewEmailPassword as {string} and enter conpass as {string}")
    public void iEnterValidNewEmailPasswordAsAndEnterConpassAs(String NewEmailPassword, String conformationEmailPassword) throws InterruptedException {

        loginpage.userNewPasswordTxtFld(NewEmailPassword);
       loginpage.CFEmailPasswordTxtFld(conformationEmailPassword);


    }
//    @And("I enter ValidNewEmailPassword as {string}")
//    public void iEnterValidNewEmailPasswordAs(String NewEmailPassword) throws InterruptedException {
//        loginpage.userNewPasswordTxtFld(NewEmailPassword);
//    }
//    @And("I enter ValidConformationEmailPassword as {string}")
//    public void iEnterValidConformationEmailPasswordAs(String conformationEmailPassword) throws InterruptedException {
//
//        loginpage.CFEmailPasswordTxtFld(conformationEmailPassword);
//    }




    @And("user agree tearms and conditions")
    public void user_agree_tearms_and_conditions() throws InterruptedException {
        new EOAppLoginPage().EoPolicybtn();
        new EOAppLoginPage().TermsConditions();
        new EOAppLoginPage().NextBtnForHome();
        new EOAppLoginPage().eoPopClose();
        new EOAppLoginPage().NextBtnForHome();
    }

    //    @When("I login successfully")
//    public void i_login_successfully() {
//        System.out.println("User able to see Eo log in page");
//    }
//    @Then("I should see EoAppWelcomeLogin Page Title {string}")
//    public void i_should_see_eo_app_welcome_login_page_title(String welcomeTitle) throws InterruptedException {
//        Assert.assertEquals(loginpage.getTitle(), welcomeTitle);
//
//    }
//    @When("I login successfully")
//    public void i_login_successfully(String title) throws InterruptedException {
//        Assert.assertEquals(loginpage.getEoAppHomepageTitleText(), title);
//    }
    @And("I click the home button")
    public void i_click_the_home_button() throws InterruptedException {
        loginpage.WelcomeHomeBtn();
    }

    @And("click the manual button")
    public void click_the_manual_button() throws InterruptedException {
        loginpage.MnSerialNumBtn();
    }

    @And("enter the serial number as {string}")
    public void enter_the_serial_number_as(String string) {

    }


    @And("enter the verification code as {string}")
    public void enter_the_verification_code_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("able to see Bluetooth manual button and click the skip button.")
    public void able_to_see_bluetooth_manual_button_and_click_the_skip_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("enter the {string} and {string}")
    public void enter_the_and(String Surname, String firstname) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("enter address as\"{int}, Thornton Road, Ilford,IG1 2ER\"")
    public void enter_address_as_thornton_road_ilford_ig1_2er(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("able see the change mode :")
    public void able_see_the_change_mode() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should see EoAppLogin Page {string}")
    public void i_should_see_eo_app_login_page(String Title) throws InterruptedException {


        Assert.assertEquals(loginpage.getEoAppLogoutText(), Title);

    }


    @And("I enter userInValidEmail {string}")
    public void iEnterUserInValidEmail(String InValidEmail) throws InterruptedException {
        loginpage.enterInUserEmail(InValidEmail);

    }

    @Then("I should Expect EoErrorMessage on AppPage {string}")
    public void iShouldExpectEoErrorMessageOnAppPage(String EoErrorMessage) {


    }

    @And("enter the surname as {string} and firstmane as {string}")
    public void enterTheSurnameAsAndFirstmaneAs(String arg0, String arg1) {

    }

    @And("user conform the OTP")
    public void userConformTheOTP() {
    }

    @And("I login successfully")
    public void iLoginSuccessfully() {
    }

    @Then("I should see EoAppWelcomeLogin Page Title {string}")
    public void iShouldSeeEoAppWelcomeLoginPageTitle(String arg0) {
    }

    @And("click the manual button after SerialNumber")
    public void clickTheManualButtonAfterSerialNumber() {
    }

    @Then("check  The Charger setup is completed message as{string}")
    public void checkTheChargerSetupIsCompletedMessageAs(String arg0) {
    }

    @And("click Continue button")
    public void clickContinueButton() {
    }

    @And("enter the firstname  as {string} and surname as {string}")
    public void enterTheFirstnameAsAndSurnameAs(String arg0, String arg1) {
    }

    @And("click the button for enter the  address")
    public void clickTheButtonForEnterTheAddress() {
    }
}

package com.qa.stepdef;

import com.qa.pages.EOAppLoginPage;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.ThreadContext;
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

    @And("I click the nextbtn for password")
    public void i_click_the_nextbtn_for_password() {
        System.out.println("button is click");


    }


    @And("I enter ValidEmailPassword as {string}")
    public void i_enter_valid_email_password_as(String EmailPassword) throws InterruptedException {
        loginpage.EmailPasswordTxtFld(EmailPassword);
    }

//    @And("I click the nextbtn for login get {string}")
//    public void i_click_the_nextbtn_for_login() {
//        System.out.println("button2 is click");
//
//    }
//
//    @And("I login successfully and get the title{string}")
//    public void i_login_successfully(String title) throws InterruptedException {
//        new EOAppLoginPage().NextBtnForHome();
//        Assert.assertEquals(new EOAppHomepage().getTitle(), title);
//    }

//    @And("user agree tearms and conditions")
//    public void user_agree_tearms_and_conditions() throws InterruptedException {
//
//        new EOAppLoginPage().EoPolicybtn();
//        new EOAppLoginPage().TermsConditions();
//        new EOAppLoginPage().NextBtnForHome();
//        new EOAppLoginPage().eoPopClose();
//        new EOAppLoginPage().NextBtnForHome();

    //}

    @Then("I should see EoAppLogin Page {string}")
    public void i_should_see_eo_app_login_page(String title) throws InterruptedException {


        Assert.assertEquals(new EOAppLoginPage().getEoAppHomepageTitleText(), title);

    }


}

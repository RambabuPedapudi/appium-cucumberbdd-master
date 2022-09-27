package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class EOAppHomepage extends BasePage{
    TestUtils utils = new TestUtils();

    @AndroidFindBy(accessibility = "Ram Real Charge")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"test-Error message\"]/child::XCUIElementTypeStaticText")
    private MobileElement EoAppTitleText;

    //public String getTitle() {return getText(EoAppTitleText, "Ram Real Charge"); }
//    public ProductDetailsPage pressProductTitle(String title) throws Exception {
//        switch (new GlobalParams().getPlatformName()) {
//            case "Android":
//                click(andScrollToElementUsingUiScrollable("text", title), "press " + title + " link");
//                return new Product//DetailsPage();
////            case "iOS":
////                click(iOSScrollToElementUsingMobileScrollParent(iOSSCrollView, "label == '" + title + "'"), "press " + title + " link");
////                return new ProductDetailsPage();
//            default:
//                throw new Exception("Invalid platform name");
//        }
//    }

}


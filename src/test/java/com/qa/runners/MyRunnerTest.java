package com.qa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"
                , "html:target/cucumber/cucumber.html"
                , "summary"
                , "me.jvt.cucumber.report.PrettyReports:target/TestResutls/cucumber-html-reports"}
        , features = {"src/test/resources"}
        , glue = {"com/qa/stepdef"}
        , snippets = CAMELCASE
        , dryRun = false
        , monochrome = false
        , tags = "@test"

)

public class MyRunnerTest {

//    @BeforeClass
//    public static void initialize() throws Exception {
//        GlobalParams params = new GlobalParams();
//        params.initializeGlobalParams();
//
//        ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_"
//                + params.getDeviceName());
//
//        new ServerManager().startServer();
//        new DriverManager().initializeDriver();
//    }
//
//    @AfterClass
//    public static void quit() {
//        DriverManager driverManager = new DriverManager();
//        if (driverManager.getDriver() != null) {
//            driverManager.getDriver().quit();
//            driverManager.setDriver(null);
//        }
//        ServerManager serverManager = new ServerManager();
//        if (serverManager.getServer() != null) {
//            serverManager.getServer().stop();
//        }
    //}
}

package com.qa.utils;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;
import java.util.HashMap;

public class ServerManager {
    private static final ThreadLocal<AppiumDriverLocalService> server = new ThreadLocal<>();
    TestUtils utils = new TestUtils();

    public AppiumDriverLocalService getServer() {
        return server.get();
    }

    public void startServer() {
        utils.log().info("starting appium server");
        AppiumDriverLocalService server = WindowsGetAppiumService();
        server.start();
        if (server == null || !server.isRunning()) {
            utils.log().fatal("Appium server not started. ABORT!!!");
            throw new AppiumServerHasNotBeenStartedLocallyException("Appium server not started. ABORT!!!");
        }
        //server.clearOutPutStreams();
        ServerManager.server.set(server);
        utils.log().info("Appium server started");
    }

//   public AppiumDriverLocalService getAppiumServerDefault() {
//        return AppiumDriverLocalService.buildDefaultService();
//    }

    public AppiumDriverLocalService WindowsGetAppiumService() {
        GlobalParams params = new GlobalParams();
        return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
                .withAppiumJS(new File("C:\\Users\\ram.pudi\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .usingAnyFreePort()
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE));
                 //.withLogFile(new File(params.getPlatformName() + "_"
                       // + params.getDeviceName() + File.separator + "Server.log")));
    }

//    public AppiumDriverLocalService MacGetAppiumService() {
//        GlobalParams params = new GlobalParams();
//        HashMap<String, String> environment = new HashMap<String, String>();
//        environment.put("PATH", "C:/Program Files/Java/jdk-18.0.1.1/bin;C:/Windows;C:/Program Files/nodejs/;C:/Users/ram.pudi/AppData/Local/Android/sdkplatform-tools;C:/Users/ram.pudi/AppData/Local/Android/sdkbuild-tools;C:/Users/ram.pudi/AppData/Local/Android/sdktools;C:/Users/ram.pudi/AppData/Local/Android/sdkplatforms;C:/Program Files/Java/jre1.8.0_202/bin;C:/Users/ram.pudi/AppData/Local/Android/sdk/platform-tools;C:/Users/ram.pudi/AppData/Local/Android/sdk;C:/Program Files/Git/cmd;C:/Users/ram.pudi/apache-maven-3.8.6/bin;C:/Program Files/Java/jdk-18.0.1.1/bin;C:/Users/ram.pudi/AppData/Local/Microsoft/WindowsApps;C:/Users/ram.pudi/.dotnet/tools;C:/Program Files/Azure Data Studio/bin;C:/Users/ram.pudi/AppData/Roaming/npm" + System.getenv("PATH"));
//        environment.put("ANDROID_HOME", "C:\\Users\\ram.pudi\\AppData\\Local\\Android\\sdk");
//        environment.put("JAVA_HOME", "C:\\Program Files\\Java\\jdk-15.0.2");
//        return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
//                .usingDriverExecutable(new File("C:/Program Files/nodejs/node.EXE"))
//                .withAppiumJS(new File("C:/Users/ram.pudi/AppData/Roaming/npm/node_modules/appium/build/lib/main.js"))
//                .usingAnyFreePort()
//                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
//                .withEnvironment(environment)
//                .withLogFile(new File(params.getPlatformName() + "_"
//                        + params.getDeviceName() + File.separator + "Server.log")));
    //}
}

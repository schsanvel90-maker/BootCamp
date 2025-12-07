package mobileDriverManager;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class mobileDriverManager {
    private  static AndroidDriver  appiumDriver;

    public static  void crarAppiumDriver() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setPlatformVersion("12.0")
                .setDeviceName("Redmi Note 9 pro")
                .setAutomationName("UiAutomator2")
                .setUdid("f485a7e7")
                .setAppActivity("com.yape.activity.MainActivity")
                .setAppPackage("com.bcp.innovacxion.yapeapp");
        URL appiumServerUrl = new URL("http://127.0.0.1:4723/wd/hub");

        appiumDriver = new AndroidDriver(appiumServerUrl, options);

        appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));



    }

    public static AndroidDriver getAppiumDriver(){

        return appiumDriver;
    }

    public static  void stopAppiumDriver(){

        appiumDriver.quit();
    }
}

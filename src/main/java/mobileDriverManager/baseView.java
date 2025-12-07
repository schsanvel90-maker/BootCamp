package mobileDriverManager;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class baseView {

    public baseView(){
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriverManager.getAppiumDriver()) ,  this);

    }
}

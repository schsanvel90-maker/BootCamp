package com.bdd.view;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import mobileDriverManager.baseView;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class View  extends baseView {

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Crear una cuenta\"]")
    public WebElement  btnCrearCuenta;

    @AndroidFindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]")
    public WebElement lblRegsitro;

    public boolean verificoQueElAppEsteDisponible(){
        return btnCrearCuenta.isDisplayed();

    }

    public void selecccionoElBoton() {

        btnCrearCuenta.click();

    }

    public boolean verifoElFormularioParaCrarUnaCuetna() {
        return  lblRegsitro.isDisplayed();
    }
}

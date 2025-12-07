package com.bdd.step;

import com.bdd.view.View;
import org.junit.Assert;

import java.net.MalformedURLException;

public class Step {

    private View view(){
        return  new View();
    }

    public void lavantarAppYape() throws MalformedURLException {
        mobileDriverManager.mobileDriverManager.crarAppiumDriver();

    }

    public void verificoQueElAppEsteDisponible() {
        Assert.assertTrue(view().verificoQueElAppEsteDisponible());


    }

    public void selecccionoElBoton() {
        view().selecccionoElBoton();
    }

    public void verifoElFormularioParaCrarUnaCuetna() {
        Assert.assertTrue(view().verifoElFormularioParaCrarUnaCuetna());

    }
}

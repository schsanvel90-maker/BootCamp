package com.bdd.stepDefinition;

import com.bdd.step.Step;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class StepDefinition {

    public Step step;

    @Before
    public void beforeScenario(){
        step = new Step();

    }


    @Given("levantar el app de yape")
    public void lavantarAppYape() throws MalformedURLException {
        step.lavantarAppYape();


    }

    @Given("verifico que el app este disponible")
    public void verificoQueElAppEsteDisponible() {
        step.verificoQueElAppEsteDisponible();

    }

    @When("seleccciono el boton crar  una cuetna")
    public void selecccionoElBoton() {
        step.selecccionoElBoton();

    }

    @Then("verifo el formulario para crar una cuetna.")
    public void verifoElFormularioParaCrarUnaCuetna() {
        step.verifoElFormularioParaCrarUnaCuetna();
    }
}

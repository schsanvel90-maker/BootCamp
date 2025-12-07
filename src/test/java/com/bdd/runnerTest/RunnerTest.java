package com.bdd.runnerTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/bootCamp",
        glue = "com.bdd.stepDefinition",
        stepNotifications = true,
        tags = "@prueba1"
)

public class RunnerTest {
}

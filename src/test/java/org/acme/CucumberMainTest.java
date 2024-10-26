package org.acme;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.runner.RunWith;

@QuarkusTest
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.acme.stepdefinitions"
)
public class CucumberMainTest {
}

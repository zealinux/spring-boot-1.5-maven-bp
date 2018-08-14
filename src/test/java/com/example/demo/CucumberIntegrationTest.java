package com.example.demo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", tags = {"@fast"}, format = {"pretty"})
public class CucumberIntegrationTest extends SpringIntegrationTest {

}

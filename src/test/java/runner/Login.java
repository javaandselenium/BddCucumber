package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\QSP\\eclipse-workspace\\SeleniumProject\\BddCucumber\\src\\test\\resources\\manaultc.feature"
,glue= {"Stepdefinition"})
public class Login {

}

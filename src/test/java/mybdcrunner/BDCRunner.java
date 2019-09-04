package mybdcrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features99", glue = "bdcstepdefinitions", 
plugin= {"pretty","html:target/cucumber-html-report","json:target/tftgfctf"},
		tags= {"@Sanity"})
public class BDCRunner {

}

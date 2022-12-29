package smart.usa.runnertest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	plugin = {"pretty","json:target/cucumber.json"},
    features = ".//Features/",
    glue = {"smart.usa.stepdefination","smart.usa.hookstest"},
    monochrome = false,
    // If I added new step of feaure file,without execution we can bring out the steps
    // using druRun true.
    // If druRun = true, What is the result ?
    // It will stop the execution and give us the corresponding steps.
    // If dryRun = false , What is the result?
    // If dryRun = false we can execute the test and it will give us the corresponding
    
    tags = "@Sanity"
		
		)

public class Runner extends AbstractTestNGCucumberTests{
	{
}

}

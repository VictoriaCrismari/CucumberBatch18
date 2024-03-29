package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//we need runwith options to run cucumber with junit
@RunWith(Cucumber.class)
//cucumber options decide what to execute, where to execute
@CucumberOptions(
        //features we use to provide the path of the feature files
        features = "src/test/resources/features/",
        //glue is the keyword we use to find the gherkin step def
        //we provide  the path of steps package where we have all step defs
        glue = "Steps",
        //dry run stops the actual execution when set to true
        //it will scan all the steps definitions and provide if there is any step def missing
        dryRun = false,
        tags = "@regression",
        plugin = {"pretty"}
)
public class RunnerClass {

}

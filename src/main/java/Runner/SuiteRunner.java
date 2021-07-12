package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/*
@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/main/resources/Features", glue = { "stepDefinitions" }, tags = { "not @smoke" })
public class SuiteRunner {
}*/


/*@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/main/resources/Features", glue = { "stepDefinitions" }, tags = { "@smoke or @sanity" })
public class SuiteRunner {
}*/

/*@RunWith(Cucumber.class)
@CucumberOptions(strict=true,features = "./src/main/resources/Features", glue = { "stepDefinitions" }, tags = { "@smoke and not @sanity" })
public class SuiteRunner {
}*/

/*@RunWith(Cucumber.class)
@CucumberOptions(strict=true,features = "./src/main/resources/Features", glue = { "stepDefinitions" }, tags = { "@smoke and @sanity" })
public class SuiteRunner {
}*/

@RunWith(Cucumber.class)
@CucumberOptions(strict=true,features = "D:\\Eclipse Workspace\\FirstBDD\\src\\main\\resources\\Features\\ExcelsheetRead.feature", glue = { "stepDefinitions" })
public class SuiteRunner {
} 
package fall2020project;
import static org.junit.Assert.assertTrue;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="use-cases",
plugin= {"html: target/cucumber.html"},
glue={"fall2020project"}
)
public class TestC {

}



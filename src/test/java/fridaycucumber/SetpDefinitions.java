package fridaycucumber;

import fridaycucumber.IsItFriday;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SetpDefinitions {

    private String today;

    private String actualAnswer;

    @Given("^today is \"([^\"]*)\"$")
    public void today_Is_Sunday(String today){
        this.today = today;
    }

    @When("^I ask whether it's Friday yet$")
    public void ask_whether_its_friday(){
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("^answer should be told \"([^\"]*)\"$")
    public void i_should_be_Told(String expectedAnswer){
        Assert.assertEquals(expectedAnswer,actualAnswer);
    }
}

package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class EvenOddSteps {
    int x,y,result;
    @Given("User has {int} and {int}")
	public void acceptNumbrs(int x, int y) {
       this.x=x;
       this.y=y;
	}
    @When("user adds both numbers")
    public void addNumber() {
    	result=x+y;
	}
   /* @Then("addition result must be even")
    public void checkAdditionIsEven() {
    	if(result%2==0)
    	{
    		System.out.println("Addition is Even");
    	}
    	else
    	{
    		System.out.println("Addition is not Even");
    	}*/

    @Then("addition result must be even")
    public void checkAdditionIsEven() {
    	int rem=result%2;
    	Assert.assertEquals("Addition is not Even",0, rem);
    }
}

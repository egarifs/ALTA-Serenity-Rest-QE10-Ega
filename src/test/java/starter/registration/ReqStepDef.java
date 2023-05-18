package starter.registration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class ReqStepDef {
    
    @Steps
    RegAPI regAPI;
    
    @Given("Post register with valid json")
    public void postRegistationWithValidJson() {
        File json = new File(RegAPI.REQ_BODY_DIR+"RegisterReqBody.json");
        regAPI.postRegUser(json);    
    }

    @When("Send post register user")
    public void sendPostRegistationUser() {
        SerenityRest.when().post(RegAPI.POST_REGISTER_USER);
    }

    @Then("Status code should be {int} OK")
    public void statusCodeShouldBeOK(int ok) {
        SerenityRest.then().statusCode(ok);
    }
}

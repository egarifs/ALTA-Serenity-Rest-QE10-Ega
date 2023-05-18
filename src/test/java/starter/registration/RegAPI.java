package starter.registration;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class RegAPI {
    public static String BASE_URL= "https://reqres.in";
    public static final String DIR = System.getProperty("user.dir");
    public static String REQ_BODY_DIR = DIR+"/src/test/resources/JSON/ReqBody/";
    public static String JSON_SCHEMA_DIR = DIR+"/src/test/resources/JSON/JSONSchema/";
    public static String GET_LIST_USERS = BASE_URL+"/api/users?page={page}";
    public static String POST_CREATE_USER = BASE_URL+"/api/users";
    public static String PUT_UPDATE_USER = BASE_URL+"/api/users/{id}";
    public static String DELETE_USER = BASE_URL+"/api/users/{id}";

    //register
    public static String POST_REGISTER_USER = BASE_URL+"/api/register";

    @Step("Post create new user")
    public void postRegUser(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

}

package testApi1;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class CopilotTest {

    @Test
    public void getFeatureToggleOnUser() {
        given().baseUri("https://reqres.in/").when().get().then().assertThat().statusCode(200);
        given().baseUri("https://reqres.in/").when().get().then().assertThat().statusCode(403);
    }

    @Test
    public void getSpaceXLaunches() {
        given().baseUri("https://api.spacexdata.com/v4/launches").when().get().then().assertThat().statusCode(200);
    }

}

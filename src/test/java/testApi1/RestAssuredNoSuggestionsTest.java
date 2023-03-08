package testApi1;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RestAssuredNoSuggestionsTest {

    @Test
    public void getFeatureToggleOnUser() {
        given()
                .baseUri("https://reqres.in/")
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200);
        given().baseUri("https://reqres.in/").when().get().then().assertThat().statusCode(403);
    }
}

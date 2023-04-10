package APITest;

import org.junit.Test;
import static io.restassured.RestAssured.when;

public class ApiTest {
        @Test
        public void testGetRequest() {
            String URL = "https://av.by/";
            when().get(URL).then().statusCode(200);
        }
}

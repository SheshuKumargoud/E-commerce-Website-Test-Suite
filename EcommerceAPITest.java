package tests;

import api.ApiHelper;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EcommerceAPITest {

    @Test
    public void testProductListAPI() {
        Response res = ApiHelper.getProductList();
        Assert.assertEquals(res.getStatusCode(), 200);
        Assert.assertTrue(res.jsonPath().getList("$").size() > 0);
    }

    @Test
    public void testUserDetailsAPI() {
        Response res = ApiHelper.getUserDetails(1);
        Assert.assertEquals(res.getStatusCode(), 200);
        Assert.assertNotNull(res.jsonPath().get("username"));
    }
}

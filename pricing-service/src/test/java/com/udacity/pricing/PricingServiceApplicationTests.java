package com.udacity.pricing;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PricingServiceApplicationTests {
	
	@Autowired
    private MockMvc mvc;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void getPriceTest() throws Exception {
		RequestBuilder request = get("/services/price")
				.param("vehicleId","2")
				.contentType(MediaType.APPLICATION_JSON_UTF8);

		mvc.perform(request).andExpect(status().is2xxSuccessful());
	}

}

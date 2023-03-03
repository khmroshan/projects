package com.filterclass.springfilterclass;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class SpringfilterclassApplicationTests {

	@Test
	void contextLoads() {

	}
	@Autowired
	private MockMvc mvc;

	@Test
	public void testfilter() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/api/test").accept(MediaType.APPLICATION_JSON)).andDo(print())
				.andExpect(status().isOk());

	}

}

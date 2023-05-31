package com.example.MockitoApp;

import com.example.MockitoApp.service.OrderService;
import com.example.MockitoApp.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;


@ActiveProfiles("test")
@SpringBootTest(classes = MockitoAppApplicationTests.class)
class MockitoAppApplicationTests {

	@MockBean                      //The @MockBean annotation automatically initializes the mock bean and injects it into the Spring application context.
	private ProductService productService;

	@MockBean
	private OrderService orderService;

	@Test
	public void sampleMock() {

		Mockito.when(productService.getProductName()).thenReturn("Mock is working");

		String testName = orderService.getProductName();

		Assertions.assertEquals("Mock is working", testName);
	}

	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
		orderService = new OrderService(productService);
	}
}


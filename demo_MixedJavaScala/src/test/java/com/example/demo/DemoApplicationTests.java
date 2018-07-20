package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

// do not start spring unless necessary
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		BigClass x = new BigClass();
        Assert.assertEquals(x.getNiceField(), "Hellor");
	}

}

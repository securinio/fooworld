package com.example.ecom;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.ecom.model.ScmCredentials;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class EcomServiceApplicationTests2 {

    @Test
    void contextLoadsNewTest() {
    	ScmCredentials scm = new ScmCredentials();
    	scm.setPassword("passwords");
    	
    	scm.setPassword("passwords");
    	Assert.assertNotNull(scm);
    }

}
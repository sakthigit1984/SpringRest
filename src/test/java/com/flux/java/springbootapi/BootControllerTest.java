package com.flux.java.springbootapi;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class BootControllerTest {


    @InjectMocks
    BootController bootController;
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void dataPush() throws Exception {


        String val=bootController.dataPush();
        Assert.assertEquals(val,"spring boot app");
    }

}
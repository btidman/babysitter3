package com.pillartechnolgy.babysitter3;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class Babysitter3ControllerTest {

    private Babysitter3Controller controller;

    @Before
    public void setup(){
        controller = new Babysitter3Controller("Mitch");

    }

    @Test
    public void shouldReturnBabysitterName(){
        assertThat(controller.whoIsBabysitter(),  is("Mitch"));
    }
}
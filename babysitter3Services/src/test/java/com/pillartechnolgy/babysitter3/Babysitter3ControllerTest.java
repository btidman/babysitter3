package com.pillartechnolgy.babysitter3;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;



public class Babysitter3ControllerTest {

    @InjectMocks
    private Babysitter3Controller controller;

    @Mock
    private GigRepository repository;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldCreateNewGig(){
        Gig newGig = new Gig();
        newGig.setEnd(17);
        newGig.setStart(15);

        ResponseEntity response = controller.createGig(newGig);

        Mockito.verify(repository).save(newGig);
        assertThat(response.getBody(), is(newGig));
    }

    @Test
    public void shouldReturnAResponseIncludingAListOfGigs(){

        List<Gig> expectedGigList = new ArrayList<Gig>();
        expectedGigList.add(new Gig());
        Mockito.when(repository.findAll()).thenReturn(expectedGigList);

        ResponseEntity<List<Gig>> result = controller.gigs();

        assertThat(result.getBody(),  is(expectedGigList));
    }

//    @Test
//    public void shouldReturnGigWithTotalPayCalculated(){
//        ResponseEntity<Gig> result = controller.createGig(17, 18);
//        assertThat(result.getBody().getPay(),  is(12));
//    }
//
//    @Test
//    public void shouldCalculateTotalPayAt12PerHourBetweenStartAndEnd(){
//        ResponseEntity<Gig> result = controller.createGig(17, 19);
//        assertThat(result.getBody().getPay(),  is(24));
//    }
}
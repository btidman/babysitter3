package com.pillartechnolgy.babysitter3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Babysitter3Controller {

    @Autowired
    private GigRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<Gig>> gigs(){
        return new ResponseEntity<List<Gig>>(repository.findAll(), HttpStatus.OK);
    }


    @RequestMapping(path="gigs", method = { RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT }, consumes = "application/json")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Gig> createGig(@RequestBody Gig postedGig){

        repository.save(postedGig);

        return new ResponseEntity<Gig>(postedGig, HttpStatus.OK);
    }
}

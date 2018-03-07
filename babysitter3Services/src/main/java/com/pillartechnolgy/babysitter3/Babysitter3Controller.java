package com.pillartechnolgy.babysitter3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RestController
public class Babysitter3Controller {

    @Getter @Setter
    private String babysitterName;

    @RequestMapping()
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Babysitter> babysitter(){
        List<Babysitter> sitters = new ArrayList<Babysitter>();
        //sitters.add();
        return new ResponseEntity(new Babysitter(1, "Mitch"), HttpStatus.OK);
    }
}

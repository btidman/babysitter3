package com.pillartechnolgy.babysitter3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@NoArgsConstructor
@RestController
public class Babysitter3Controller {

    @Getter @Setter
    private String babysitterName;

    @RequestMapping()
    public String whoIsBabysitter(){
        return "Mitch";
    }
}

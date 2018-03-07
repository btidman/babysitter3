package com.pillartechnolgy.babysitter3;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Babysitter {

    @Getter @Setter
    private int id;

    @Getter @Setter
    private String name;
}

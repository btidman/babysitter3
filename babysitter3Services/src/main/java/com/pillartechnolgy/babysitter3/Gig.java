package com.pillartechnolgy.babysitter3;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gig {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long id;

    @Getter @Setter
    private int start;

    @Getter @Setter
    private int end;

    public int getPay(){
        return (end - start) * 12;
    }
}

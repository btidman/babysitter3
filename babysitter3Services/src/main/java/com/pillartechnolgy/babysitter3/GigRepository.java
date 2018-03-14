package com.pillartechnolgy.babysitter3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface GigRepository extends JpaRepository<Gig, Long> {

}

package com.akash.springbootjpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.akash.springbootjpa.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{

}

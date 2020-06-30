package com.akash.springbootjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.springbootjpa.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{

}

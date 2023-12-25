package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Vechicle;

@Repository
public interface VechicleRepo extends JpaRepository<Vechicle,Long>{

}

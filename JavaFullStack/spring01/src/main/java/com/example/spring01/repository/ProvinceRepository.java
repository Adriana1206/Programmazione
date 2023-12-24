package com.example.spring01.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.javadb.entities.Provincia;


@Repository
public interface ProvinceRepository extends JpaRepository<Provincia, Integer> {

}
package com.example.demo.model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepositorio 
	
	extends JpaRepository<Alumno, Long>{ 
}

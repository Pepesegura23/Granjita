package com.example.demo;

import java.util.List;

import javax.annotation.PostConstruct;

import com.example.demo.model.Alumno;
import com.example.demo.model.AlumnoRepositorio;
import com.example.demo.model.Curso;
import com.example.demo.model.Cursorepositorio;

public class MainDeMentira {
private final AlumnoRepositorio alumnorepositorio;
private final Cursorepositorio cursorepositorio;
	
	@PostConstruct
	public void ejecutar() {
		
		
		Alumno a1 = new Alumno();
		a1.setNombre("Pepe");
		a1.setApellido("Pérez Pérez");
		
		
		Alumno a2 = new Alumno();
		a2.setNombre("María");
		a2.setApellido("Ruiz Hidalgo");
		//a2.setEmail("lamari14@msn.com");
		
		alumnorepositorio.save(a1);
		alumnorepositorio.save(a2);
		
		Curso c = new Curso();
		c.setNombre("1º DAM");
		c.setTutor("Miguel");
		
		cursorepositorio.save(c);
		
		a1.setCurso(c);
		a2.setCurso(c);

		alumnorepositorio.save(a1);
		alumnorepositorio.save(a2);

		
		List<Curso> cursos = 
				cursorepositorio.findAll();
		
		for(Curso curso : cursos) {
			System.out.println(curso);
			for(Alumno a : c.getAlumnos()){
				System.out.println(a);
				
			}
	}
	}}

package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Categoria {
	
	private String nombre;
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy="categoria", fetch = FetchType.EAGER)
	@Builder.Default
	private List<Producto> productos = new ArrayList<>();
 }

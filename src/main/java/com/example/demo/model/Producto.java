package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Producto {
		@Id
		@GeneratedValue
		private Long num_producto;
		
		private String nombre, descripcion;
		private double precio;
		private int cantidad_disponible;
		/*Faltaría categoria*/
		@ManyToOne
		@JoinColumn(foreignKey = @ForeignKey(name="fk_producto_categoria"))
		private categoria categoria;
}

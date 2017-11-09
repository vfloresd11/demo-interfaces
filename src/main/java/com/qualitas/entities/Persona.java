package com.qualitas.entities;

public class Persona{
  private String nombre;
  private String direccion;

	public Persona(String nombre,
	               String direccion
  ){
		this.nombre=nombre;
		this.direccion=direccion;
	}
	public void setNombre(String nombre){
       this.nombre=nombre;
  }
  public String getNombre(){
       return nombre;
  }
  public void setDireccion(String direccion){
       this.direccion=direccion;
  }
  public String getDireccion(){
       return direccion;
  }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;


public class Platos {
    private String nombre;
    private int precio; // Opcional: si deseas agregar más atributos como precio
    private int produccion;

    // Constructor
    public Platos(String nombre, int precio, int produccion) {
        this.nombre = nombre;
        this.precio = precio;
        this.produccion = produccion;
    }

    // Métodos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
        
    }
    
    public void setPrecio (int precio){
        this.precio = precio;
    }
    
    public void setProduccion(int produccion){
        this.produccion = produccion;
    }
   
    public int getProduccion() {
        return produccion;
    }
}
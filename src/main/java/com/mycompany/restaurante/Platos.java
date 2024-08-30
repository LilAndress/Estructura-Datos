/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;


public class Platos {
    private String nombre;
    private double precio; // Opcional: si deseas agregar más atributos como precio

    // Constructor
    public Platos(String nombre) {
        this.nombre = nombre;
    }

    // Métodos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método toString() para mostrar la información del plato
    @Override
    public String toString() {
        return "Plato: " + nombre;
    }
}

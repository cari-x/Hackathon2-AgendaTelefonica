package org.example;

import java.util.Objects;

public class Contacto {

    //Atributo nombre del contacto
    private String nombre;

    //Atributo numero del contacto
    private String numero;


    // Metood contructor para crear objetos de Contacto
    public Contacto(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }


    //Metodos GETs de la clase

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }

}

package org.example;

import java.util.ArrayList;
import java.util.List;

public class Agenda {


    // Atributo para almacenar la lista de contactos
    private List<Contacto> contactos;
    private int capacidad; // Mueve la definición de 'capacidad' aquí

    // Constructor de Agenda
    public Agenda(int capacidad) {
        this.capacidad = capacidad;
        contactos = new ArrayList<>();
    }

    public Agenda() {
        this(10); // Tamaño por defecto
    }

    public boolean agendaLlena() {
        return contactos.size() >= capacidad;
    }



    /**

     * @param contacto El objeto Contacto que se va a agregar.
     */
    public void addContacto(Contacto contacto) {
        // Comprueba si el contacto ya existe en la agenda por su nombre.
        if (isExistContacto(contacto.getNombre())) {
            System.out.println("El contacto ya existe en la agenda.");
        } else {
            // Agrega el nuevo contacto a la lista de contactos.
            contactos.add(contacto);
            System.out.println("Contacto agregado exitosamente.");
        }
    }


    /**
     * Comprueba si un contacto con el nombre especificado ya existe en la agenda telefónica.
     *
     * @param nombreContacto El nombre del contacto que se va a comprobar.
     * @return `true` si el contacto con el nombre especificado ya existe en la agenda, `false` en caso contrario.
     */
    public boolean isExistContacto(String nombreContacto) {
        for (Contacto contacto : contactos) {
            // Compara el nombre del contacto (ignorando mayúsculas y minúsculas) con el nombre especificado.
            if (contacto.getNombre().equalsIgnoreCase(nombreContacto)) {
                return true; // El contacto ya existe en la agenda.
            }
        }
        return false; // El contacto no existe en la agenda.
    }


    /**
     * Imprime en la consola la lista de contactos en la agenda telefónica.
     * Cada contacto se muestra en formato de cadena utilizando su método toString().
     */
    public void listarContactos() {
        for (Contacto contacto : contactos) {
            System.out.println(contacto.toString());
        }
    }

    /**

     *
     * @param newNombre
     * @return
     */


    public Contacto buscarContacto(String newNombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(newNombre)) {
                System.out.println("Contacto encontrado:");
                System.out.println(contacto.toString());
                return contacto; // Contacto encontrado, se devuelve.
            }
        }

        System.out.println("Contacto no encontrado");
        return null; // Contacto no encontrado, se devuelve null.
    }


    /**
     * Elimina un contacto de la agenda telefónica.
     *
     * @param contacto El contacto que se va a eliminar.
     */
    public void eliminarContacto(Contacto contacto) {
        if (contactos.remove(contacto)) {
            System.out.println("Contacto eliminado con éxito.");
        } else {
            System.out.println("No se pudo eliminar el contacto. El contacto no existe en la agenda.");
        }
    }


    public int espacioLibres() {
        return capacidad - contactos.size();
    }

}

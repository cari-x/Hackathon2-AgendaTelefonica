package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        app();
    }

    public static void app() {
        Agenda miAgenda = new Agenda();
        Scanner input = new Scanner(System.in);

        boolean runningApp = true;

        while (runningApp){

            menu();

            int opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    // datos para crear un contacto
                    System.out.println("Ingrese el nombre de contacto: ");
                    String newNombre = input.nextLine();
                    System.out.println("=========================");
                    System.out.println("Ingrese el número del contacto: ");
                    String numero = input.nextLine();

                    //Se crea un nuevo contacto
                    Contacto nuevoContacto = new Contacto(newNombre, numero);
                    //método de añadir el contacto de Agenda
                    miAgenda.addContacto(nuevoContacto);
                    break;
                case 2:
                    miAgenda.listarContactos();
                    break;
                case 3:
                    //buscar el contacto
                    System.out.println("Ingrese nombre del contacto a buscar: ");
                    String nombreBuscar = input.nextLine();
                    miAgenda.buscarContacto(nombreBuscar);
                    break;
                case 4:
                    // eliminar el contacto
                    System.out.println("Ingrese nombre del contacto a eliminar: ");
                    String nombreEliminar = input.nextLine();

                    //Se alamcaena en una variable el contacto encontrado
                    Contacto contactoEncontrado = miAgenda.buscarContacto(nombreEliminar);

                    // Se evalua si el contacto existe
                    if(contactoEncontrado != null){
                        miAgenda.eliminarContacto(contactoEncontrado);
                    }

                    break;
                case 5:
                    // Se muestra la cantidad de contactos que hay en la agenda
                    System.out.println("Espacios libres en la agenda: " + miAgenda.espacioLibres());
                    break;
                case 6:
                    //Se finaliza el programa
                    System.out.println("Agenda de contactos cerrada");
                    runningApp = false;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

            System.out.println();
        }
    }

    public static void menu(){
        System.out.println("======= AGENDA DE CONTACTOS ===========");
        System.out.println("  Puedes agregar hasta 10 contactos ");
        System.out.println("1- Agregar nuevo contacto");
        System.out.println("2- Lista de contactos");
        System.out.println("3- Buscar un contacto");
        System.out.println("4- Eliminar un contacto");
        System.out.println("5- Espacio en la agenda");
        System.out.println("6- Salir");
        System.out.println("==============================");
        System.out.println("Elija una opción: ");

    }
}
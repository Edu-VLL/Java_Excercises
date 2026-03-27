package Java.ejercicios.Ejercicio3;

import java.util.Scanner;

public class Sistema_Biblioteca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Biblioteca b1 = new Biblioteca();
        Libro l1 = new Libro("programacionATS", "Yo", 2025, true);
        Libro l2 = new Libro("matematica", "Tu", 1996, true);
        Libro l3 = new Libro("comunicacion", "US", 1800, true);
        
        b1.listarLibros();

        System.out.println("Ingresa el nombre del libro: ");
        String nombreLibro = sc.nextLine();

        try {
            b1.prestarLibro(nombreLibro);
        }catch (LibroNoDisponibleException e)
        {
            System.out.println("Error: "+ e.getMessage());
        }

        b1.listarLibros();

        System.out.println("Ingresa el nombre del libro a devolver: ");
        String devolverLibro = sc.nextLine();
        try {
            b1.devolverLibro(devolverLibro);
        }catch (LibroNoEncontradoException e)
        {
            System.out.println("Error: "+ e.getMessage());
        }
        b1.listarLibros();
    }

}

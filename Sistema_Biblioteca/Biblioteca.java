package Java.ejercicios.Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    ArrayList<Libro> listaLibros;

    public Biblioteca()
    {
        listaLibros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro)
    {
        listaLibros.add(libro);
        System.out.println("Libro agregado correctamente!!!");
    }
    public void listarLibros()
    {
        int i = 0;
         for (Libro l : listaLibros)
         {
             System.out.println("\nLibro " + i + 1 + ": \n");
             l.mostrarInfo();
         }
    }
    public void prestarLibro(String titulo) throws LibroNoDisponibleException
    {
        boolean validador = false;
        for (Libro l : listaLibros)
        {
            if (l.getTitulo().equals(titulo))
            {
                l.setDisponible(false);
                System.out.println("Libro prestado.\n");
                validador = true;
            }
        }
        if (!validador)
        {
            throw new LibroNoDisponibleException("El libro no está disponible.");
        }
    }

    public void devolverLibro(String titulo) throws LibroNoEncontradoException
    {
        boolean validador = false;

        for (Libro l : listaLibros)
        {
            if (l.getTitulo().equals(titulo))
            {
                l.setDisponible(true);
                System.out.println("Libro devuelto.");
                validador = true;
            }
        }

        if (!validador)
        {
            throw new LibroNoEncontradoException("El libro no existe.");
        }
    }

    public void LibroMasAntiguo()
    {
        int auxAnio = Integer.MAX_VALUE;
        for (Libro l : listaLibros)
        {
            if (l.getAnio() < auxAnio)
            {
                auxAnio = l.getAnio();
            }
        }
        System.out.println("El libro más antiguo es: " + auxAnio);
    }
}

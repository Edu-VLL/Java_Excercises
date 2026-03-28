package Java.ejercicios.Ejercicio3.Sistema_Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    private ArrayList<Libro> listaLibros;

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
        int i = 1;
         for (Libro l : listaLibros)
         {
             System.out.println("\nLibro " + i + ": \n");
             l.mostrarInfo();
             i++;
         }
    }
    public void prestarLibro(String titulo) throws LibroNoDisponibleException
    {
        boolean validador = false;
        for (Libro l : listaLibros)
        {
            if (l.getTitulo().equals(titulo) && l.getDisponible())
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
            if (l.getTitulo().equals(titulo) && !l.getDisponible())
            {
                l.setDisponible(true);
                System.out.println("Libro devuelto.");
                validador = true;
            }
        }
        if (!validador)
        {
            throw new LibroNoEncontradoException("El libro no existe ó está disponible.");
        }
    }
    public void LibroMasAntiguo()
    {
        int auxAnio = Integer.MAX_VALUE;
        Libro libroMenor = null;

        for (Libro l : listaLibros)
        {
            if (l.getAnio() < auxAnio)
            {
                auxAnio = l.getAnio();
                libroMenor = l;
            }

        }
        if(libroMenor != null)
        {
            libroMenor.mostrarInfo();
        }

    }
}

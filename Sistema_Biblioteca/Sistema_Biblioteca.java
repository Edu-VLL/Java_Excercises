package Java.ejercicios.Ejercicio3.Sistema_Biblioteca;

import java.util.Scanner;

public class Sistema_Biblioteca {

    Biblioteca b1 = new Biblioteca();
    Scanner sc = new Scanner(System.in);
    public  void agregarLibro()
    {
        String titulo;
        String autor;
        int anio;

        sc.nextLine();

        System.out.println("Titulo:");
        titulo = sc.nextLine();
        System.out.println("Autor:");
        autor = sc.nextLine();
        System.out.println("Año:");
        anio = sc.nextInt();

        b1.agregarLibro(new Libro(titulo, autor, anio, true));
        System.out.println("\nPresiona Enter para continuar...");
        sc.nextLine();
    }
    public void listarLibro()
    {
        sc.nextLine();

        b1.listarLibros();
        System.out.println("\nPresiona Enter para continuar...");
        sc.nextLine();
    }
    public void prestarLibro() throws LibroNoDisponibleException {


        String titulo;
        sc.nextLine();
        System.out.println("Titulo: ");
        titulo = sc.nextLine();
        b1.prestarLibro(titulo);
        System.out.println("\nPresiona Enter para continuar...");
        sc.nextLine();
    }
    public void devolverLibro() throws LibroNoEncontradoException
    {

        String titulo;
        sc.nextLine();
        System.out.println("Titulo: ");
        titulo = sc.nextLine();

        b1.devolverLibro(titulo);
        System.out.println("\nPresiona Enter para continuar...");
        sc.nextLine();
    }
    public void libroMasAntiguo()
    {
        sc.nextLine();
        b1.LibroMasAntiguo();
        System.out.println("\nPresiona Enter para continuar...");
        sc.nextLine();
    }
    public  void menu() throws LibroNoDisponibleException, LibroNoEncontradoException {
        int opcion;
        do {

            System.out.println("\t\tMENU");
            System.out.println("[1] Agregar libro");
            System.out.println("[2] Mostrar libros");
            System.out.println("[3] Prestar libro");
            System.out.println("[4] Devolver libro");
            System.out.println("[5] Libro más antiguo");
            System.out.println("\nIngresa una opción: ");
            opcion = sc.nextInt();

            switch (opcion)
            {
                case 1:
                     agregarLibro();
                    break;
                case 2:
                    listarLibro();
                    break;
                case 3:
                    try {
                        prestarLibro();
                    }catch (LibroNoDisponibleException e)
                    {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        devolverLibro();
                    }catch (LibroNoEncontradoException e)
                    {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    libroMasAntiguo();
                    break;
                default:
                    System.out.println("Opción no valida, intenta de nuevo.");
            }
        }while (opcion!=5);
    }

    public static void main(String[] args) throws LibroNoDisponibleException, LibroNoEncontradoException {

        Sistema_Biblioteca sistema = new Sistema_Biblioteca();
        sistema.menu();

    }

}

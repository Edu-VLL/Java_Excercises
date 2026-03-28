package Java.ejercicios.Ejercicio3.Sistema_Biblioteca;

public class LibroNoDisponibleException extends Exception
{
    public LibroNoDisponibleException(String mensaje)
    {
      super(mensaje);
    }
}
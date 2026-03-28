package Java.ejercicios.Ejercicio3.Sistema_Biblioteca;

public class LibroNoEncontradoException extends Exception
{
    public LibroNoEncontradoException(String mensaje)
    {
      super(mensaje);
    }
}
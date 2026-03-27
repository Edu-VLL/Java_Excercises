package Java.ejercicios.Ejercicio3;

public class Libro {

    private final String titulo;
    private final String autor;
    private final int anio;
    private boolean disponible;


    public Libro(String titulo, String autor, int anio, boolean disponible)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.disponible = disponible;
    }

    public void mostrarInfo()
    {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anio);
        System.out.println("Disponible: " + disponible);
    }
    public String getTitulo()
    {
        return titulo;
    }
    public void setDisponible(boolean disponible)
    {
        this.disponible = disponible;
    }
    public int getAnio()
    {
        return anio;
    }
}

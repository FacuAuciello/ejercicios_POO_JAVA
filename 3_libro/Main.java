//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Libro l1 = new Libro();
        l1.setTitulo("Harry Potter y la piedra filosofal");
        l1.setAutor("JK Rowling");
        l1.setAnioPublicacion(1997);

        l1.mostrarInformacion();

        Libro l2 = new Libro();
        l2.setTitulo("Harry Potter y la camara secreta");
        l2.setAutor("JK Rowling");
        l2.setAnioPublicacion(1998);

        l2.mostrarInformacion();

    }
}

class Libro{
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void mostrarInformacion(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Anio Publicacion: " + anioPublicacion);
    }
}
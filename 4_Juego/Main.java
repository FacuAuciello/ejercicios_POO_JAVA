public class Main {
    public static void main(String[] args) {

        Videojuego game1 = new Videojuego("Need for Speed", "Carreras", 2008);

        Videojuego game2 = new Videojuego();
        game2.setTitulo("NBA 2K25");
        game2.setGenero("Deportes");
        game2.setAnioLanzamiento(2025);

        Videojuego game3 = new Videojuego();

        System.out.println(game1); //puedo imprimir asi por el toString
        System.out.println(game2);
        System.out.println(game3);

        System.out.println("Total de juegos: " + Videojuego.getContadorJuegos());
        }
    }

class Videojuego {
    private String titulo;
    private String genero;
    private int anioLanzamiento;

    private static int contadorJuegos; //TODAS LAS CLASES LO COMPARTEN pq es ESTATICO

    public Videojuego(){
        this("Titulo", "Genero", 0);
    }

    public String getTitulo() { //no uso los gets porque no tengo valores, solo use los sets
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public Videojuego(String titulo, String genero, int anioLanzamiento) {
        this.titulo = titulo;
        this.genero = genero;
        this.anioLanzamiento = anioLanzamiento;
        contadorJuegos++;
    }

    public static int getContadorJuegos() {
        return contadorJuegos;
    }

    @Override
    public String toString() {
        return "Videojuego{Titulo=" + titulo + ", Genero=" + genero + ", anioLanzamiento=" + anioLanzamiento + '}';
    }
}
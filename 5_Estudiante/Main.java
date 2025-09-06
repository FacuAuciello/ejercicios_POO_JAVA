import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("A", "Ramon Garcia", 7.5);
        Estudiante e2 = new Estudiante("B", "Jorge Lopez");

        System.out.println(e1);
        System.out.println(e2);

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

        if(e1.equals(e2)){
            System.out.println("Los estudiantes son iguales");
        }
    }
}

class Estudiante{
    private String legajo;
    private String nombre;
    private double promedio;

    Estudiante(String legajo, String nombre, double promedio) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.promedio = promedio;
    }
    Estudiante(String legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.promedio = 0.0;
    }

    @Override
    public String toString() {
        return "Legajo= " + legajo + ", Nombre= " + nombre + ", Promedio= " + promedio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return Double.compare(promedio, that.promedio) == 0 && Objects.equals(legajo, that.legajo) && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(legajo, nombre, promedio);
    }
}
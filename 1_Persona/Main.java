//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona();
        p1.setNombre("Fernando");
        p1.setEdad(26);
        System.out.println("Hola mi nombre es " + p1.getNombre() + " y tengo " + p1.getEdad() + " años");
    }
}

class Persona{
    private String nombre;
    private int edad;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
}


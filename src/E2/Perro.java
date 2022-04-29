package E2;



public class Perro {
    public enum RAZAS {PastorAleman, BichonFrise, HuskySiberiano, BullTerrier}

    private RAZAS raza;
    private int id;
    private String nombre;
    private boolean conChapa;
    private String color;
    private int edad;

    public Perro(RAZAS raza, int id, String nombre, boolean conChapa, String color, int edad) {
        this.raza = raza;
        this.id = id;
        this.nombre = nombre;
        this.conChapa = conChapa;
        this.color = color;
        this.edad = edad;
    }

    public RAZAS getRaza() {
        return raza;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isConChapa() {
        return conChapa;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return String.format("Id: %S\nNombre: %S\nRaza: %S\nColor: %S\nEdad: %S\nChapa: ", id, nombre, raza, color, edad, conChapa);
    }
}

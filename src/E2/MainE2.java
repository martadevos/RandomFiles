package E2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MainE2 {
    public static void main(String[] args) {

    }

    private static final String FILE1 = "ejercicio2.dat";

    public static void Ejemplo2(){

        try {
            RandomAccessFile ejercicio2 = new RandomAccessFile(FILE1, "rw");

        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo");
        } catch (IOException e) {
            System.out.println("Error al introducir razas");
        }
    }

}

package E1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class MainE1 {


    public static void Ejemplo1(){
        int numeroInt;
        long numeroLong;
        try {
            RandomAccessFile ejercicio1 = new RandomAccessFile(FILE1, "rw");
            for(int i = 0; i<4; i++){
                numeroInt = (int) (Math.random() * 10);
                ejercicio1.write(numeroInt);    private static final String FILE1 = "ejercicio1.dat";
                public static void main(String[] args) {
                    Ejemplo1();
                }
            }
            for(int i = 0; i<4; i++){
                numeroLong = (long) (Math.random() * 10000000);
                ejercicio1.writeLong(numeroLong);
            }
            for(int i = 0; i<4; i++){
                numeroInt = (int) (Math.random() * 10);
                ejercicio1.writeInt(numeroInt);
            }
            ejercicio1.seek(0);
            for(int i = 0; i<4; i++){
                System.out.println(ejercicio1.read());
            }
            for(int i = 0; i<4; i++){
                System.out.println(ejercicio1.readLong());
            }
            for(int i = 0; i<4; i++){
                System.out.println(ejercicio1.readInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo");
        } catch (IOException e) {
            System.out.println("Error al introducir números");
        }
    }
}

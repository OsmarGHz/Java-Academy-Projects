import java.io.*;
import java.util.*;

public class LecturaImpresion {
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limAlumnos=40;
        int calificaciones[][];
        calificaciones = new int[limAlumnos][3];
        for(int i=0;i<=limAlumnos;i++){
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese la calificación número "+j+" del alumno "+i+": ");
                calificaciones[i][j]=entrada.nextInt();
            }
            System.out.println("\n");
        }
        entrada.close();

        try{ //primero en buffer y luego en fichero
            BufferedWriter bw=new BufferedWriter(new FileWriter("null.txt"));
            BufferedReader br=new BufferedReader(new FileReader("null.txt"));
            //Escribimos en el fichero
            bw.write("Calificaciones alumnos:"); 
            bw.newLine();
            bw.write("Seguimos usando Buffered");
            //Limpiar el buffer 
            bw.flush();
            //Leemos el fichero y lo mostramos por pantalla
            String linea=br.readLine();
            while(linea!=null){ 
                System.out.println(linea); 
                linea=br.readLine();
            }
            bw.close();
            br.close();
        }catch(IOException e){ System.out.println("Error E/S: "+e); }
    }
}
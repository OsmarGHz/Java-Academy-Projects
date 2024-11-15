import java.io.*;

public class LecturaImpresion {

    public static void main(String[] args) throws IOException {
        // Crear el lector de datos desde el teclado
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int limAlumnos = Integer.parseInt(br.readLine());

        double calificaciones[][] = new double[limAlumnos][3];
        double promedios[] = new double[limAlumnos];

        // Leer calificaciones y calcular promedios
        for (int i = 0; i < limAlumnos; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            double sumaCalificaciones = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese la calificación " + (j + 1) + " del alumno " + (i + 1) + ": ");
                calificaciones[i][j] = Double.parseDouble(br.readLine());
                sumaCalificaciones += calificaciones[i][j];
            }
            promedios[i] = sumaCalificaciones / 3;
            System.out.println("Promedio del alumno " + (i + 1) + ": " + String.format("%.2f", promedios[i]));
            System.out.println();
        }
        // Cerrar el BufferedReader de entrada
        br.close();
        // Escribir y leer del archivo
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("calificaciones_alumnos.txt"));
            BufferedReader fileReader = new BufferedReader(new FileReader("calificaciones_alumnos.txt"));

            // Escribimos las calificaciones y promedios en el archivo
            bw.write("Calificaciones de los alumnos:");
            bw.newLine();
            for (int i = 0; i < limAlumnos; i++) {
                bw.write("Alumno " + (i + 1) + ": ");
                for (int j = 0; j < 3; j++) {
                    bw.write("Calificación " + (j + 1) + ": " + calificaciones[i][j] + " ");
                }
                bw.write(" | Promedio: " + String.format("%.2f", promedios[i]));
                bw.newLine();
            }
            bw.flush(); // Limpiar el buffer
            bw.close();

            // Leer y mostrar el contenido del archivo por pantalla
            System.out.println("\nContenido del archivo:");
            String linea = fileReader.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = fileReader.readLine();
            }
            // Cerrar el BufferedReader del archivo
            fileReader.close();

        } catch (IOException e) {
            System.out.println("Error de E/S: " + e);
        }
    }
}
import java.util.*;
public class PromedioAlturas {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n,suma=0,numActual,promedio;
        System.out.print("Ingrese la cantidad de alturas a promediar: ");
        n = entrada.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Ingrese la altura numero "+(i+1)+" (en centimetros, numero entero): ");
            numActual = entrada.nextInt();
            suma += numActual;
        }
        promedio = suma/n;
        System.out.println("El promedio de las alturas es de: "+promedio);
        entrada.close();
    }
}
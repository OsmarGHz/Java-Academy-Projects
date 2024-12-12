import java.util.*;
public class LadosDeTriangulo {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lado1, lado2, lado3;
        System.out.print("Ingrese el lado numero 1: ");
        lado1 = entrada.nextInt();
        System.out.print("Ingrese el lado numero 2: ");
        lado2 = entrada.nextInt();
        System.out.print("Ingrese el lado numero 3: ");
        lado3 = entrada.nextInt();
        
        System.out.print("Las medidas de los lados indican: ");
        if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
            System.out.println("un triángulo escaleno");
        }else if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("un triángulo equilátero");
        }else{
            System.out.println("es un triangulo isósceles");
        }
        
        entrada.close();
    }
}
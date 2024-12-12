import java.util.*;

public class MesSecreto{

    public static int adivinador(String respuesta, String mesSecreto){
        if (!mesSecreto.equals(respuesta)) {
            System.out.print("\nRespuesta incorrecta. Intente de nuevo con otro mes: ");
            return 0;
        }else{
            System.out.print("\n¡Lo has logrado! ");
            return 1;
        }
    }
    public static void main(String[] args) {
        String meses [] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[2], respuesta;
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nTrate de adivinar el mes secreto, ingresando el nombre del mes en minúsculas: ");
        do { respuesta = entrada.next(); } while (adivinador(respuesta,mesSecreto)==0);
        entrada.close();
    }
}
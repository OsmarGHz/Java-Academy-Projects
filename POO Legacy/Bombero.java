import java.util.*;
public class Bombero {
    String nombre, apellidos;
    int edad;
    boolean casado, especialista;

    public Bombero(String valorNombre, String valorApellidos, int valorEdad, boolean valorCasado, boolean valorEspecialista){
        nombre = valorNombre;
        apellidos = valorApellidos;
        edad = valorEdad;
        casado = valorCasado;
        especialista = valorEspecialista;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valorNombre){
        this.nombre = valorNombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String valorApellidos){
        this.apellidos = valorApellidos;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int valorEdad){
        this.edad = valorEdad;
    }
    public boolean getCasado(){
        return casado;
    }
    public void setCasado(boolean valorCasado){
        this.casado = valorCasado;
    }
    public boolean getEspecialista(){
        return especialista;
    }
    public void setEspecialista(boolean valorEspecialista){
        this.especialista = valorEspecialista;
    }
    public static void main(String[] args) {
        String nombre, apellidos;
        int edad, decision;
        Scanner entrada = new Scanner(System.in);
        Bombero bombero1 = new Bombero("Antonio", "Ramos", 34, false, true);

        System.out.print("Nombre del bombero 1: ");
        nombre = entrada.nextLine();
        bombero1.setNombre(nombre);
        System.out.print("Apellidos del bombero 1: ");
        apellidos = entrada.nextLine();
        bombero1.setApellidos(apellidos);
        System.out.print("Edad del bombero 1: ");
        edad = entrada.nextInt();
        bombero1.setEdad(edad);
        do {
            System.out.print("El bombero 1 esta casado? (1 es si, 0 es no): ");
            decision = entrada.nextInt();
            if (decision==1) bombero1.setCasado(true);
            else bombero1.setCasado(false);
        } while (decision != 0 && decision != 1);
        do {
            System.out.print("El bombero 1 es especialista? (1 es si, 0 es no): ");
            decision = entrada.nextInt();
            if (decision==1) bombero1.setEspecialista(true);
            else bombero1.setEspecialista(false);
        } while (decision != 0 && decision != 1);

        System.out.println("\nDatos ingresados del bombero: ");
        System.out.println("Nombre Completo: "+bombero1.getNombre()+" "+bombero1.getApellidos());
        System.out.println("Edad: "+bombero1.getEdad());
        System.out.println("Casado: "+bombero1.getCasado());
        System.out.println("Es especialista: "+bombero1.getEspecialista());
        
        entrada.close();
    }
}

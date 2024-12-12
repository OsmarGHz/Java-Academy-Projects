import java.util.*;
    //Atributos Privados
public class Docente {
    private String Nombre;
    private String Apellido;
    private String Tipo;
    private int Horas;
    //Constructor que inicialice a los metodos
    public Docente(String valorNombre, String valorApellido, String valorTipo, int  valorHrs)
    {
        Nombre = valorNombre;
        Apellido = valorApellido;
        Tipo = valorTipo;
        Horas = valorHrs;
    } 
    //Accesos set/get
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String valorNombre) {
        this.Nombre = valorNombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String valorApellido) {
        this.Apellido = valorApellido;
    }
    public String getTipo(){
        return Tipo;
    }

    public void setTipo(String valorTipo){
        this.Tipo = valorTipo;
    }
    public int getHoras(){
        return Horas;
    }
    public void setHoras(int valorHrs){
        this.Horas =valorHrs;
    }
    //Metodo para Nombre Completo
    public String getNombreCompleto(){
        return (Nombre)+" "+(Apellido);
    }
    //Metodo para Sueldo Bruto
    public int CalcularSueldoBruto(){
        int SueldoBruto = 0;
        if (Tipo.equals("Ciencias")) {
            SueldoBruto = Horas * 3;
        } else if(Tipo.equals("Letras")){
       
  SueldoBruto = Horas * 5;   
        }
        return SueldoBruto;
    }
        //Metodo para Calcular Decuento
    public double CalcularDescuento(){
        int SueldoBruto = CalcularSueldoBruto();
        double Descuento = SueldoBruto * 0.10;
        return Descuento;
    }
        //Metodo Sueldo Neta
    public double CalcularSueldoNeto(){
        int SueldoBruto = CalcularSueldoBruto();
        double Descuento = CalcularDescuento();
        double SueldoNeto = SueldoBruto - Descuento;
        return SueldoNeto;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Datos del Docente 1
        Docente D1 = new Docente("Ingrid","Cortés","Ciencias",9);
     
        System.out.println("Nombre del docente 1:");
        String Nombre = entrada.nextLine();
        D1.setNombre(Nombre);

        System.out.println("Apellido del docente 1:");
        String Apellido = entrada.nextLine();
        D1.setApellido(Apellido);
        System.out.println("\nNombre completo 1:\n" + D1.getNombreCompleto() + "\n");
        
        System.out.println("Horas trabajdas:");
        int Horas = entrada.nextInt();
        entrada.nextLine();
        D1.setHoras(Horas);

        System.out.println("\nSueldo Bruto: " + D1.CalcularSueldoBruto());
        System.out.println("Descuento: " + D1.CalcularDescuento());
        System.out.println("Sueldo Neto: " + D1.CalcularSueldoNeto());

        //Datos del Docente 2
        Docente D2 = new Docente("Angel","Aguila","Letras",8);
        
        System.out.println("\nNombre del docente 2:");
        Nombre = entrada.nextLine();
        D2.setNombre(Nombre);
        
        System.out.println("Apellido del docente 2:");
        Apellido = entrada.nextLine();
        D2.setApellido(Apellido);
        System.out.println("\nNombre completo:\n" + D2.getNombreCompleto() + "\n");
        
        System.out.println("Horas trabajdas:");
        Horas = entrada.nextInt();
        D2.setHoras(Horas);
        
        System.out.println("Sueldo Bruto: " + D2.CalcularSueldoBruto());
        System.out.println("Descuento: " + D2.CalcularDescuento());
        System.out.println("Sueldo Neto: " + D2.CalcularSueldoNeto());
        
        entrada.close();
    }
}

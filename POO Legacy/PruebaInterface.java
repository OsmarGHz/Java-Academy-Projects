
    //Interfaz
interface ITransporte {
    static final int valor = 5;

    // Método desplazar, será implementado por las clases concretas que hereden de
    // la interface Transporte
    public void desplazar();
}

    //Interfaz, clases abstractas
abstract class Transporte implements ITransporte {
    private String marca;
    private static int contInstancias=0;

    // Constructor de la clase Transporte
    public Transporte(String marca) {
        this.marca = marca;
        contInstancias++;
        System.out.println("Numero de instancias: " + contInstancias + "\n");
        System.out.println("Constructor Transporte, " + "marca del Transporte: " + this.marca);
    }

    // Retorna el valor de marca
    public String getMarca() {
        return marca;
    }

    // Metodo Abstracto tipoTransporte, la implementación
    // depende de las clases concretas que extiendan
    // la clase Transporte
    public abstract void tipoTransporte();
}
    //Herencia
class Bicicleta extends Transporte {
    // Constructor
    public Bicicleta(String marca) {
        super(marca);
        // envía el parámetro a el constructor de la clase padre
        System.out.println("Constructor Bicicleta, marca : " + marca);
    }

    //Polimorfismo
    @Override
    public void tipoTransporte() {
        System.out.println("Tipo Transporte : Es una Bicicleta,");
    }

    //Polimorfismo
    @Override
    public void desplazar() {
        System.out.println("Método desplazar : La Bicicleta se mueve pedaleando");
    }
}

    //Herencia
class Motocicleta extends Transporte {
    public Motocicleta(String marca) {
        super(marca);
        System.out.println("Constructor Motocicleta, marca : " + marca);
    }

    //Polimorfismo
    @Override
    public void tipoTransporte() {
        System.out.println("Tipo Transporte : Es una Motocicleta,");
    }

    //Polimorfismo
    @Override
    public void desplazar() {
        System.out.println("Método desplazar : La Motocicleta se mueve acelerando");
    }
}

    
public class PruebaInterface {
    public static void main(String[] arg) {
        // Creamos mot, objeto Motocicleta tipo Transporte
        //Polimorfismo
        Transporte mot = new Motocicleta("ducaty");
        mot.tipoTransporte();
        mot.desplazar();
        System.out.println();
        // Creamos Motocicleta, objeto Motocicleta de tipo Motocicleta
        Motocicleta Motocicleta = new Motocicleta("victory");
        Motocicleta.tipoTransporte();
        System.out.println();
        // Creamos TransportePol, un objeto Motocicleta de tipo Transporte, asignamos una referencia ya existente
        //Polimorfismo
        Transporte TransportePol = Motocicleta;
        TransportePol.tipoTransporte();
        System.out.println();
        // reasignamos la referencia del objeto mot al objeto Motocicleta, esto es valido ya que ambos son de tipo Motocicleta
        //Polimorfismo
        Motocicleta = (Motocicleta) mot;
        Motocicleta.tipoTransporte();
        System.out.println();
        // Creamos bici, un objeto Bicicleta de tipo Transporte
        //Polimorfismo
        Transporte bici = new Bicicleta("felt");
        bici.tipoTransporte();
        bici.desplazar();
        System.out.println();
        // Creamos bici1, un objeto Bicicleta de tipo ITransporte
        //Polimorfismo
        ITransporte bici1 = new Bicicleta("Giant");
        bici1.desplazar();
        // bici1.tipoTransporte();

        ITransporte bici2 = new Bicicleta("Benoto");
        bici2.desplazar();
        System.out.println("\nConstante en la interfaz Transporte : " + ITransporte.valor);
    }
}

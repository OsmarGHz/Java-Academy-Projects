import java.util.ArrayList;

class Gimnasio{
    private String nombre;
    private ArrayList<Socio>socios;


    Gimnasio(String nombre){
        this.nombre = nombre;
        this.socios = new ArrayList<Socio>();
    }

    public String getGimnasioNombre(){
        return this.nombre;
    }

    public void agregarSocio(Socio socio) {
        this.socios.add(socio);
        socio.darAlta();
    }

    public ArrayList<Socio> getSocios() {
        return this.socios;
    }

    public void estaRemodelado(){
        System.out.println("El gimnasio esta remodelado"); 
    }

    public int contarSocialAlta(){
        return (Socio.getDadosAlta());
    }

    public void porcentajeDadosBaja(){
        System.out.println("El porcentaje de dados de baja es:");
        System.out.println((((Socio.getDadosBaja() / socios.size()))*100)+" %"); 
    }

    public void noPagado(Gimnasio gym){
        for (Socio socio : gym.getSocios()){
            if (socio.estadoDePago() == false){
                System.out.println(socio.getSocioNombre()+" no ha pagado");
            }
        }
    }
}

class Socio{
    private String nombre;
    private boolean dadoDe;
    private boolean pagado;
    private static int dadosDeAlta=0;
    private static int dadosDeBaja=0;

    Socio(String nombre){
        this.nombre = nombre;
        pagado = false;
    }

    public String getSocioNombre(){
        return this.nombre;
    }

    public void darAlta(){
        dadoDe = true;
        dadosDeAlta++;
    }

    public static int getDadosAlta(){
        return dadosDeAlta;
    }

    public void darBaja(){
        dadoDe = false;
        dadosDeBaja++;
        //dadosDeAlta--;
    }

    public static int getDadosBaja(){
        return dadosDeBaja;
    }

    public void pagoAnual(){
        if (dadoDe){
            pagado = true;
        }
    } 

    public boolean estadoDePago(){
        return pagado;
    }

}

public class Actividad12{
    public static void main(String[] args) {
        Gimnasio gym = new Gimnasio("El Sueño");

        Socio socio1 = new Socio("Carlos Alberto");
        Socio socio2 = new Socio("María López");

        gym.agregarSocio(socio1);
        gym.agregarSocio(socio2);

        socio1.pagoAnual();

        gym.noPagado(gym);

        gym.estaRemodelado();
        
        //socio2.darBaja();
        socio1.darBaja();

        gym.porcentajeDadosBaja();



        for (Socio socio : gym.getSocios()){
            System.out.println(socio.getSocioNombre()+" es socio del gimnasio "+gym.getGimnasioNombre());
        }

    }
}
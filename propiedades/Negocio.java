package propiedades;

public class Negocio extends Propiedades{
    public Negocio(int valorMonetario, int medidaLargo, int medidaAncho){
        super(valorMonetario, medidaLargo, medidaAncho, "Negocio");
    }

    @Override
    public int getCuantoPuedeAsegurarse(){
        return this.getvalorMonetario();
    }
}

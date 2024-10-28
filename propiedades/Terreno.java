package propiedades;

public class Terreno extends Propiedades {
    private int valorMaxSeguroAreaBaja = 300000, areaPSeguroAsegurado = 400;
    public Terreno(int valorMonetario, int medidaLargo, int medidaAncho){
        super(valorMonetario, medidaLargo, medidaAncho, "Terreno");
    }

    public int getAreaParaSeguro(){
        return areaPSeguroAsegurado;
    }

    public int getvalorMaxSeguroAreaBaja(){
        return valorMaxSeguroAreaBaja;
    }

    @Override
    public int getCuantoPuedeAsegurarse(){
        if (this.getArea()<this.getAreaParaSeguro()) {
            if (this.getvalorMonetario()>this.getvalorMaxSeguroAreaBaja()) return getvalorMaxSeguroAreaBaja();
            else return this.getvalorMonetario();
        } else return this.getvalorMonetario();
    }
}
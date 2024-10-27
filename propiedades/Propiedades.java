package propiedades;

public abstract class Propiedades {
    private int valorMonetario, medidaLargo, medidaAncho, area;
    private int valorParaSeguro = 300000, areaParaSeguro = 400;
    private String tipoPropiedad;

    public int calcularArea(int medidaLargo, int medidaAncho){
        return medidaLargo*medidaAncho;
    }

    public Propiedades(int valorMonetario, int medidaLargo, int medidaAncho, String tipoPropiedad){
        this.valorMonetario = valorMonetario;
        this.medidaLargo = medidaLargo;
        this.medidaAncho = medidaAncho;
        this.area = calcularArea(medidaLargo, medidaAncho);
        this.tipoPropiedad = tipoPropiedad;
    }

    //Setters
    public void setValorMonetario(int valorMonetario){
        this.valorMonetario = valorMonetario;
    }

    public void setMedidaLargo(int medidaLargo){
        this.medidaLargo = medidaLargo;
        this.area = calcularArea(this.medidaLargo, this.medidaAncho);
    }
    
    public void setMedidaAncho(int medidaAncho){
        this.medidaAncho = medidaAncho;
        this.area = calcularArea(this.medidaLargo, this.medidaAncho);
    }

    //Getters
    public int getvalorMonetario(){
        return valorMonetario;
    }

    public int getMedidaLargo(){
        return medidaLargo;
    }

    public int getMedidaAncho(){
        return medidaAncho;
    }

    public int getArea(){
        return area;
    }

    public int getAreaParaSeguro(){
        return areaParaSeguro;
    }

    public int getvalorParaSeguro(){
        return valorParaSeguro;
    }

    public String getTipoPropiedad(){
        return tipoPropiedad;
    }
}

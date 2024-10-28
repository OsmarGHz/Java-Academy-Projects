package propiedades;

public abstract class Propiedades {
    private int valorMonetario, medidaLargo, medidaAncho, area;
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

    public abstract int getCuantoPuedeAsegurarse();

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

    public String getTipoPropiedad(){
        return tipoPropiedad;
    }

    public void imprimirDatosGenerales(){
        System.out.println("\nCaracteristicas de la propiedad 1:\n\tArea: "+this.getArea()
                + "\n\tLargo: "+this.getMedidaLargo() + "\n\tAncho: "+this.getMedidaAncho()
                + "\n\tTipo de propiedad: "+this.getTipoPropiedad() + "\n\tValor Monetario: "+this.getvalorMonetario()
                + "\n\tPuede asegurarse ahora mismo por: "+this.getCuantoPuedeAsegurarse());
    }

    public static void main(String[] args) {
        Propiedades propiedad[] = new Propiedades[3];
        propiedad[0] = new ViviendaResidencial(200000, 70, 100);
        propiedad[1] = new Negocio(10, 2, 50);
        propiedad[2] = new Terreno(400000, 9, 10);
        for(int i=0;i<propiedad.length;i++) propiedad[i].imprimirDatosGenerales();
    }
}

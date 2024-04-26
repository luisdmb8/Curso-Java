package co.com.ejercicioUno;

public abstract class SuperClase {

    protected String marca;
    protected int modelo;
    protected static String serie = "AMG45";

    public SuperClase(String marca, int modelo, String serie) {
    }

    public SuperClase(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public SuperClase() {

    }


    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public static String getSerie() {
        return serie;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public static void setSerie(String serie) {
        SuperClase.serie = serie;
    }

    public void imprimir(String titulo){
        System.out.println(titulo);
        System.out.println("Marca: " + marca);
        System.out.println("Serie: " + serie);
        System.out.println("Modelo: " + modelo);
    }

    public static void imprimir2(String titulo){
        System.out.println(titulo);
        System.out.println("Serie: " + serie);
    }

    @Override
    public String toString() {
        return new StringBuilder("SuperClase{")
                .append("marca='").append(marca).append('\'')
                .append(", modelo=").append(modelo).append('\'')
                .append(", serie=").append(serie).append('\'')
                .append('}')
                .toString();
    }


}


package co.com.ejercicioUno;

public final class SubClaseFinal extends SuperClase{
    public String marca;
    public int modelo;
    public static String serie;


    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public static String getSerie() {
        return serie;
    }

    public static void setSerie(String serie) {
        SubClaseFinal.serie = serie;
    }

    public void imprimir(String titulo) {
        System.out.println(titulo);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Serie: " + serie);
        System.out.println("Atributo de la superclase: " + super.toString());
    }



}

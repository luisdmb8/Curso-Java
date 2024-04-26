package co.com.ejercicioUno;

public class HeredaSubClase extends SubclaseAbstract{
    public String marca;
    public int modelo;
    public static String serie = "sl180";


    public HeredaSubClase(String marca, int modelo) {
        super();
        this.marca = marca;
        this.modelo = modelo;
    }

    public HeredaSubClase() {

    }

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
        HeredaSubClase.serie = serie;
    }

     public void imprimir(String titulo) {
        System.out.println(titulo);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Atributo de la superclase: " + super.toString());
    }
    public static void imprimir1(String titulo) {
        System.out.println(titulo);
        System.out.println("Serie: " + serie);
        System.out.println("Serie super clase: " + SubclaseAbstract.serie);
        System.out.println("Serie clase abuela: " + SuperClase.serie);
    }


    @Override
    public String toString() {
        return new StringBuilder("HeredaSubClase{")
        .append("marca='").append(marca).append('\'')
        .append(", modelo=").append(modelo)
        .append(", serie=").append(serie)
        .append(", marca='").append(super.marca).append('\'')
        .append(", modelo=").append(super.modelo)
        .append('}').toString();
    }
}

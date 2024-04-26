package co.com.ejercicioUno;

public class SubclaseAbstract extends SuperClase{

    protected String marca;
    protected int modelo;
    protected static String serie = "CLA180";

    public SubclaseAbstract(String marca, int modelo, String serie ,String marca1, int modelo1, String serie1) {
        super(marca, modelo, serie);
        this.marca = marca1;
        this.modelo = modelo1;
        this.serie = serie1;
    }

    public SubclaseAbstract(String marca, int modelo) {
        super();
        this.marca = marca;
        this.modelo = modelo;
    }

    public SubclaseAbstract() {

    }


    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public int getModelo() {
        return modelo;
    }

    public static String getSerie() {
        return serie;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public static void setSerie(String serie) {
        SubclaseAbstract.serie = serie;
    }

      public void imprimir(String titulo) {
        System.out.println(titulo);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Serie: " + serie);
        System.out.println("Atributo de la superclase: " + super.toString());
    }

    public static void imprimir1(String titulo) {
        System.out.println(titulo);
        System.out.println("Serie: " + serie);
        System.out.println("Serie Super Clase: " + SuperClase.serie);
    }

    @Override
    public String toString() {
        return new StringBuilder("SubclaseAbstract{")
        .append("marca= '").append(marca).append('\'')
        .append(", modelo= ").append(modelo).append('\'')
        .append(", serie = ").append(serie).append('\'')
        .append(", Clase Abuelo = '").append(super.toString()).append('\'')
        .append('}').toString();
    }
}

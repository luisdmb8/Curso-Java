package co.com.ejercicioUno;

public class HeredaSubClase extends SubclaseAbstract{
    public String marca;
    public int modelo;
    public static String serie;

    public HeredaSubClase(){

    }


    public HeredaSubClase(String marca, int modelo, String serie, String marca1, int modelo1, String serie1) {
        super(marca, modelo, serie);
        this.marca = marca1;
        this.modelo = modelo1;
        this.serie= serie1;

    }

    public HeredaSubClase(String marca, int modelo, String serie, String marca1, int modelo1, String serie1, String marca2, int modelo2, String serie2) {
        super(marca, modelo, serie, marca1, modelo1, serie1);
        this.marca = marca2;
        this.modelo = modelo2;
        this.serie= serie2;
    }

    public HeredaSubClase(String marca, int modelo, String serie) {
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
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
        System.out.println("Serie: " + serie);
        System.out.println("Atributo de la superclase: " + super.toString());
    }

}

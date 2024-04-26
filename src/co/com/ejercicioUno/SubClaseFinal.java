package co.com.ejercicioUno;

public final class SubClaseFinal extends SuperClase{
    public String marca;
    public int modelo;
    public static String serie;


    public SubClaseFinal(String marca, int modelo, String serie, String marca1, int modelo1) {
        super(marca, modelo, serie);
        this.marca = marca1;
        this.modelo = modelo1;
    }

    public SubClaseFinal(String marca, int modelo, String marca1, int modelo1) {
        super(marca, modelo);
        this.marca = marca1;
        this.modelo = modelo1;
    }

    public SubClaseFinal(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public SubClaseFinal() {

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
        SubClaseFinal.serie = serie;
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
        System.out.println("Serie super clase: " + SuperClase.serie);
    }

    @Override
    public String toString() {
        return new StringBuilder("SubClaseFinal{")
        .append("marca='").append(marca).append('\'')
        .append(", modelo=").append(modelo)
        .append(", marca='").append(marca).append('\'')
        .append(", modelo=").append(modelo)
        .append('}').toString();
    }



}

package co.com.ejercicioUno;

public class Main {
    public static void main(String[] args) {

        //TODO
        //SUBCLASE MAS BAJA

        //Declarar una referencia a un objeto de la subclase mas baja

        HeredaSubClase subClaseMasBaja;

        //Constuya el objeto de la subclase más baja (único objeto creado en el main).

        subClaseMasBaja = new HeredaSubClase("Mercedes",1970);

        //Imprima todas las variables (de instancia y de clase) que pueda utilizando la referencia (creadas en este ejercicio).

        System.out.println("Variables de instancia: \n" );
        System.out.println(subClaseMasBaja.marca + " \n");
        System.out.println(subClaseMasBaja.modelo+ " \n");
        System.out.println("Informacion del Objeto \n");
        subClaseMasBaja.imprimir( "Auto");
        System.out.println("\n Variables de clase: ");
        HeredaSubClase.imprimir1("\n Super clase: ");

        //Llame a todos los métodos (de instancia y de clase) que pueda utilizando la referencia (creados en este ejercicio).

        subClaseMasBaja.setMarca("BMW");
        int modelo = subClaseMasBaja.getModelo();
        System.out.println("\nNueva Marca: " + subClaseMasBaja.getMarca());
        System.out.println("Modelo: " + modelo);

        HeredaSubClase.setSerie("M4");
        System.out.println("\n Nueva Serie (desde método de clase): " + HeredaSubClase.getSerie());




    }
}
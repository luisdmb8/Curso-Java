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
        System.out.println(subClaseMasBaja.marca);
        System.out.println(subClaseMasBaja.modelo+ "\n");
        System.out.println("Informacion del Objeto");
        subClaseMasBaja.imprimir( "Auto");
        System.out.println("\nVariables de clase: ");
        HeredaSubClase.imprimir1("\nImprimira la Serie de las 3 clases ");
        HeredaSubClase.imprimir2("\nClase abuelo: ");

        //Llame a todos los métodos (de instancia y de clase) que pueda utilizando la referencia (creados en este ejercicio).

        subClaseMasBaja.setMarca("BMW");
        int modelo = subClaseMasBaja.getModelo();
        System.out.println("\nNueva Marca: " + subClaseMasBaja.getMarca());
        System.out.println("Modelo: " + modelo);

        HeredaSubClase.setSerie("M4");
        System.out.println("Nueva Serie : " + HeredaSubClase.getSerie());

        //Declare una referencia de la superclase de la refencia que está utilizando.

        SubclaseAbstract superClaseAbstract;

        // Haga un Casting del objeto creado a esta nueva referencia.

        superClaseAbstract = (SubclaseAbstract) subClaseMasBaja;

        superClaseAbstract.imprimir("\nSubClaseAbstrtact");


    }
}
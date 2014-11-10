
package boletin7ej5;

public class Boletin7ej5 {

    public static void main(String[] args) {
    //declaramos las variables
        int numero1;
        int numero2;
        int numero3;
        Numeros obj=new Numeros();
        numero1=obj.pedirDato();
        numero2=obj.pedirDato();
        numero3=obj.pedirDato();
        obj.compararNumeros(numero1, numero2, numero3);
    }
    
}

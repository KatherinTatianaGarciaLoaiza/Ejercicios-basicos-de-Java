package Ejercicio5;

public class MostrarNumeros {

    //Metodo para imprimir los numeros impares.
    public static void NumerosImpares(){
        System.out.println("Los números impares son: ");
        int Contador = 1;
        while (Contador < 100){
            System.out.println(Contador);
            Contador += 2;
        }
    }

    //Metodo para imprimir los numeros pares.
    public static void NumerosPares(){
        System.out.println("Los números pares son: ");
        int Contador = 2;
        while (Contador <= 100){
            System.out.println(Contador);
            Contador += 2;
        }
    }

}

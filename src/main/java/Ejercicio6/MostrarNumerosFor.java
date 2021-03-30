package Ejercicio6;

public class MostrarNumerosFor {

    //Metodo para imprimir los numeros impares.
    public static void NumerosImpares(){
        System.out.println("Los números impares son: ");
        for (int Contador = 1; Contador < 100; Contador +=2){
            System.out.println(Contador);
        }
    }

    //Metodo para imprimir los numeros pares.
    public static void NumerosPares(){
        System.out.println("Los números pares son: ");
        for (int Contador = 2; Contador <= 100; Contador +=2){
            System.out.println(Contador);
        }
    }

}


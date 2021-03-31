package Ejercicio12;

import java.util.Scanner;

public class CapturaYComparacion {

    private static String Palabra1 = "Primera";
    private static String Palabra2 = "Segunda";

    public static void CapturaComparacion(){
        Palabra1 = Captura(Palabra1);
        Palabra2 = Captura(Palabra2);
    }

    public static String Captura(String Palabra){
        Scanner Ingresada = new Scanner (System.in);
        System.out.println("Por favor ingrese la " + Palabra + " palabra:");
        return Ingresada.nextLine();
    }

    public static void Comparacion(String palabra1, String palabra2){

    }

}

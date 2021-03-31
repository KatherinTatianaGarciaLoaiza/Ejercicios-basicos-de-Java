package Ejercicio12;

import java.util.Locale;
import java.util.Scanner;

public class CapturaYComparacion {

    private static String Palabra1 = "primera";
    private static String Palabra2 = "segunda";
    private static boolean Iguales = false;

    public static void CapturaComparacion(){
        Palabra1 = Captura(Palabra1);
        Palabra2 = Captura(Palabra2);
        Comparacion(Palabra1.toLowerCase(), Palabra2.toLowerCase());
    }

    public static String Captura(String Palabra){
        Scanner Ingresada = new Scanner (System.in);
        System.out.println("Por favor ingrese la " + Palabra + " palabra:");
        return Ingresada.nextLine();
    }

    public static void Comparacion(String palabra1, String palabra2){
        System.out.println(palabra1.equals(palabra2) ? "Las palabras son iguales." : "Las palabras no son iguales");
        MostrarDiferencias(palabra1, palabra2);
    }

    public static void MostrarDiferencias(String palabra1, String palabra2){
        int Menor = 0;
        Menor = (palabra1.length() < palabra2.length()) ? palabra1.length() : palabra2.length();
            for(int i = 0; i < Menor; i++ ) {
                System.out.println((palabra1.charAt(i) == palabra2.charAt(i)) ? Iguales(palabra1.charAt(i), palabra2.charAt(i), i) : Diferentes(palabra1.charAt(i), palabra2.charAt(i), i));
            }
    }

    public static String Iguales(char LetraPalabra1, char LetraPalabra2, int i){
        return "Los caracteres en la posicion " + (i + 1) + " son iguales:" + LetraPalabra1 + " y " + LetraPalabra2;
    }

    public static String Diferentes(char LetraPalabra1, char LetraPalabra2, int i){
        return "Los caracteres en la posicion " + (i + 1) + " son diferentes:" + LetraPalabra1 + " y " + LetraPalabra2;
    }

}

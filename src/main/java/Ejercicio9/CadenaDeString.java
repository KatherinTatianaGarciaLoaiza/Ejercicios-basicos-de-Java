package Ejercicio9;

import java.util.Scanner;

public class CadenaDeString {

    private static String Frase = "La sonrisa sera la mejor arma contra la tristeza.";
    private static String FraseConsola = "";

    public static void ManipulacionDeLaFrase(){
        FraseConsola = CadenaDeConsola();
        System.out.println("La Frase original es: " + Frase + "\n" + "La frase manipulada es: ");
        System.out.println(CambioDeLetras());
    }

    public static String CadenaDeConsola(){
        Scanner Ingresada = new Scanner (System.in);
        System.out.println("Por favor ingrese el texto que desea adicionar a la frase: ");
        return Ingresada.nextLine();
    }

    public static String CambioDeLetras(){
        return Frase.replace('a', 'e') + " - " + FraseConsola;
    }

}

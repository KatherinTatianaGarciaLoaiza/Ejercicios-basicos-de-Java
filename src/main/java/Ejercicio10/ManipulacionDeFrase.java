package Ejercicio10;

import java.util.Scanner;

public class ManipulacionDeFrase {
    private static String FraseConsola = "";
    private static String FraseManipulada = "";

    public static void CapturaManipulacion(){
        FraseConsola = CapturaPorConsola();
        FraseManipulada = ManipulacionDeEspacios();
        System.out.println("La frase ingresada fue : " + FraseConsola + "\n" + "La frase sin espacios es: " + FraseManipulada);
    }

    public static String CapturaPorConsola(){
        Scanner Ingresada = new Scanner (System.in);
        System.out.println("Por favor ingrese el texto que desea manipular: ");
        return Ingresada.nextLine();
    }

    public static String ManipulacionDeEspacios(){
        return FraseConsola.replaceAll("\\s+", "") ;
    }

}

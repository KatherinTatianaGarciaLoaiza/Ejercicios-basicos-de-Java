package Ejercicio11;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class CapturaDeFrase {

    private static String Frase = "";
    private static int Longitud = 0;
    private static int ContadorVocales = 0;
    static List<String> Vocales = Arrays.asList(new String[] {"a", "e", "i", "o", "u"});

    public static void ProcesoDeLaFrase(){
        Frase = CapturaFrase();
        Longitud = LongitudFrase();
        System.out.println("La frase es: " + Frase);
        RecorrerVocales(Frase.toLowerCase(Locale.ROOT));
    }

    public static String CapturaFrase(){
        Scanner Ingresada = new Scanner (System.in);
        System.out.println("Por favor ingrese la frase: ");
        return Ingresada.nextLine();
    }

    public static int LongitudFrase(){
        return Frase.length();
    }

    public static void RecorrerVocales(String frase){
        for(int i = 0; i < Vocales.toArray().length; i++){
            ContadorVocales = ContarVocales(Vocales.get(i), frase);
            System.out.println("Tiene " + ContadorVocales + " " + Vocales.get(i));
        }
    }

    public static int ContarVocales(String Vocal, String frase){
        ContadorVocales = 0;
        for (int x = 0; x < Longitud; x++){
            ContadorVocales = (frase.charAt(x) == Vocal.charAt(0)) ? ContadorVocales += 1 : ContadorVocales ;
        }
        return ContadorVocales;
    }

}

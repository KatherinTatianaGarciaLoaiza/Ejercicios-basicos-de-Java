package Ejercicio8;

import java.util.List;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class DiasDeLaSemana {

    private static String DiaIngresado = "";

    public static String DiasDeLaSemana(){
        List<String> Puntajes = Arrays.asList(new String[] {"Lunes", "Martes", "Miercoles",
                "Jueves", "Viernes", "Sabado", "Domingo"});
        Scanner DiaSeleccionado = new Scanner (System.in);
        System.out.println("Por favor ingrese un día de la semana: ");
        DiaIngresado = DiaSeleccionado.nextLine();
        return LaboralONo();
    }

    public static String LaboralONo(){
        switch (DiaIngresado.toLowerCase(Locale.ROOT)){
            case "lunes","martes", "miercoles", "jueves", "viernes":
                return "Si es un día laboral.";
            case  "sabado", "domingo":
                return "No es un día laboral.";
            default:
                return "No corresponde a un día de la semana.";
        }
    }

}

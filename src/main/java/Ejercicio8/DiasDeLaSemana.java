package Ejercicio8;

import java.util.Scanner;

public class DiasDeLaSemana {

    private static String DiaIngresado = "";

    public static String DiasDeLaSemana(){
        Scanner DiaSeleccionado = new Scanner (System.in);
        System.out.println("Por favor ingrese un día de la semana: ");
        DiaIngresado = DiaSeleccionado.nextLine();
        return LaboralONo();
    }

    public static String LaboralONo(){
        switch (DiaIngresado.toLowerCase()){
            case "lunes","martes", "miercoles", "jueves", "viernes":
                return "Si es un día laboral.";
            case  "sabado", "domingo":
                return "No es un día laboral.";
            default:
                return "No corresponde a un día de la semana.";
        }
    }

}

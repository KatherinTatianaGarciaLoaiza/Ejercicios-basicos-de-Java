package Ejercicio7;

import java.util.Scanner;

public class MayorIgualCero {

    static double Numero = 0;

    //Metodo de verificacion si es mayor o igual que cero.
    public static boolean Comparacion(){
        Scanner NumeroIngresado = new Scanner (System.in);
        System.out.println("Por favor ingrese el número a comparar: ");
        Numero = NumeroIngresado.nextDouble();
        System.out.println(Respuesta());
        return (Numero >= 0) ;
    }

    //Metodo que dice si cumple o no.
    public static String Respuesta(){
        return (Numero >= 0) ? "El número ingresado si es mayor o igual a cero, y es el número : " + Numero :
                "El número ingresado no es mayor o igual a cero, y es el número : " + Numero;
    }


}

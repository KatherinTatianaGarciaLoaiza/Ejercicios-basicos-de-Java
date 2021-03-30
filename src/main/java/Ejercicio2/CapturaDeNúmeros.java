package Ejercicio2;

import java.util.Scanner;

public class CapturaDeNúmeros {

    static int Numero1 = 0;
    static int Numero2 = 0;

    //Metodo de Captura de los numeros
    public static void CapturarNumeros(){
        Scanner NumeroCapturado = new Scanner (System.in);
        System.out.println("Por favor ingrese el primer número: ");
        Numero1 = NumeroCapturado.nextInt();
        System.out.println("Por favor ingrese el segundo número: ");
        Numero2 = NumeroCapturado.nextInt();
    }

}

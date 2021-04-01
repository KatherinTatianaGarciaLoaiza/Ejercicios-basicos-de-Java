package Ejercicio14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CapturaYSaltos {

    public static Double Captura() throws IOException {

        BufferedReader CapturaDeNumero = new BufferedReader( new InputStreamReader( System.in ) );
        System.out.println( "Por favor ingrese el número desde donde quiere coenzar los saltos: " );
        String NumeroInicial = CapturaDeNumero.readLine();
        return Double.valueOf(NumeroInicial);

    }

    public static void Saltos(double NumeroDePartida){

        for (double i = NumeroDePartida; i <= 1001 ; i += 2){
            System.out.println((i == 1001) ? "1000.0" : i);
        }

    }

}

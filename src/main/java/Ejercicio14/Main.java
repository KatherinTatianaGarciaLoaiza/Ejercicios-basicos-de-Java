package Ejercicio14;

import Ejercicio12.CapturaYComparacion;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        double NumeroInicial = 0;
        NumeroInicial = CapturaYSaltos.Captura();
        CapturaYSaltos.Saltos(NumeroInicial);

    }

}

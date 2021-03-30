package Ejercicio3;

import java.util.Scanner;

public class AreaCirculo {

    private String Radio = "";

    //Metodo de Captura del radio
    public void CapturaDeRadio(){
        Scanner RadioCapturado = new Scanner (System.in);
        System.out.println("Por favor ingrese el radio del circulo: ");
        this.Radio = RadioCapturado.nextLine();
        System.out.println("El area del circulo con radio " + Radio + " es " + CalculoDelArea(Radio));
    }

    //Metodo que calula el area del circulo.
    public double CalculoDelArea(String RADIO){
        return Math.pow(Double.parseDouble(RADIO),2) * Math.PI;
    }

}

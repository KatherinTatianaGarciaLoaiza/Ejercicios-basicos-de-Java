package Ejercicio4;

import java.util.Scanner;

public class CalcularPrecioConIva {
    static double PrecioSinIva = 0;

    //Metodo que captura el precio del producto.
    public static double PrecioProducto(){
        Scanner Valor = new Scanner (System.in);
        System.out.println("Por favor ingrese el valor del producto: ");
        PrecioSinIva = Valor.nextDouble();
        return  PrecioSinIva + CalculoDeIva();
    }

    //Metodo que calcula el precio total con el iva.
    public static double CalculoDeIva(){
        return  PrecioSinIva * 0.21;
    }


}

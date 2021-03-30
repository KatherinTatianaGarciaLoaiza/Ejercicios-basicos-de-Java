package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        String Respuesta = "";
        CapturaDeNúmeros.CapturarNumeros();
        Respuesta =ComparadorDeNumeros.CompararNumeros(CapturaDeNúmeros.Numero1, CapturaDeNúmeros.Numero2);
        System.out.println(Respuesta);
    }
}

package Ejercicio2;

public class ComparadorDeNumeros {

    //Metodo que selecciona si son iguales o hay uno mayor al otro.
    public static String  CompararNumeros ( int Numero1, int Numero2){
        return  (Numero1 == Numero2) ? Iguales() : Mayor(Numero1, Numero2);
    }

    //Metodo que indica si son iguales
    public static String Iguales(){
        return "Ambos numeros son iguales";
    }

    //Metodo que indica cual es mayor.
    public static String Mayor(int Numero1, int Numero2){
        return ("El número mayor es: " + ((Numero1 > Numero2) ? (Numero1) : (Numero2)));
    }

}

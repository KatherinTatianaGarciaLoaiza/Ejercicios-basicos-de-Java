package Ejercicio7;

public class Main {
    static boolean MenorACero = true;
    public static void main(String[] args) {

        do {
            MenorACero = MayorIgualCero.Comparacion();
        } while (!MenorACero);
    }
}

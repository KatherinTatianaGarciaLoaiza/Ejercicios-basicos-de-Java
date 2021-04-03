package Ejercicio17;

import Ejercicio16.Persona;

public class Main {

    static float PrecioTotalDeLasLavadoras = 0;
    static float PrecioTotalDeLosTelevisores = 0;
    static float PrecioTotalDeLosElectrodomesticos = 0;

    public static void main(String[] args) {
        Electrodomestico[] ListaDeElectrodomesticos = new Electrodomestico[10];

        ListaDeElectrodomesticos[0] = new Television();
        ListaDeElectrodomesticos[1] = new Television(200, 83);
        ListaDeElectrodomesticos[2] = new Television(700, "negro", 'A', 66, 70, true);
        ListaDeElectrodomesticos[3] = new Lavadora();
        ListaDeElectrodomesticos[4] = new Lavadora(500, 200);
        ListaDeElectrodomesticos[5] = new Lavadora(900, "rojo", 'B', 600, 40);
        ListaDeElectrodomesticos[6] = new Electrodomestico();
        ListaDeElectrodomesticos[7] = new Electrodomestico(300, "Morado", 'Z', 400);
        ListaDeElectrodomesticos[8] = new Electrodomestico(800, "gris", 'C', 80);
        ListaDeElectrodomesticos[9] = new Electrodomestico(850, 130);

        for(Electrodomestico Electrodomesticos : ListaDeElectrodomesticos){
            PrecioTotalDeLasLavadoras += EsLavadora(Electrodomesticos);
            PrecioTotalDeLosTelevisores += EsTelevisor(Electrodomesticos);
            PrecioTotalDeLosElectrodomesticos += EsElectrodomestico(Electrodomesticos);
        }

        System.out.println("Precio total de las lavadoras: " + PrecioTotalDeLasLavadoras);
        System.out.println("Precio total de los televisores: " + PrecioTotalDeLosTelevisores);
        System.out.println("Precio total de los electrodomesticos: " + PrecioTotalDeLosElectrodomesticos);
        System.out.println("La cuenta total es de: " + (PrecioTotalDeLasLavadoras + PrecioTotalDeLosTelevisores + PrecioTotalDeLosElectrodomesticos));
    }

    public static float EsLavadora(Electrodomestico ElectrodomesticoAEvaluar) {
        float aumento = 0;
        if (ElectrodomesticoAEvaluar instanceof Lavadora) {
            aumento = ElectrodomesticoAEvaluar.PrecioFinal();
        }
        return aumento;
    }

    public static float EsTelevisor(Electrodomestico ElectrodomesticoAEvaluar) {
        float aumento = 0;
        if (ElectrodomesticoAEvaluar instanceof Television) {
            aumento = ElectrodomesticoAEvaluar.PrecioFinal();
        }
        return aumento;
    }

    public static float EsElectrodomestico(Electrodomestico ElectrodomesticoAEvaluar) {
        float aumento = 0;
        if (!(ElectrodomesticoAEvaluar instanceof Television) && !(ElectrodomesticoAEvaluar instanceof Lavadora)) {
            aumento = ElectrodomesticoAEvaluar.PrecioFinal();
        }
        return aumento;
    }


}

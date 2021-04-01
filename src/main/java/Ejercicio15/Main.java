package Ejercicio15;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        int SeleccionMenu = 0;
        while (SeleccionMenu != 8){

            SeleccionMenu = Menu.Menu();
            Menu.OpcionManu(SeleccionMenu);

        }

    }

}

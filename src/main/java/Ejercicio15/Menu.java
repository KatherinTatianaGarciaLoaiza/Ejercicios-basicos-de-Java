package Ejercicio15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    public static int Menu() throws IOException {

        BufferedReader OpcionMenu = new BufferedReader( new InputStreamReader( System.in ) );
        System.out.println("******GESTIÓN CINEMATOGRÁFICA******" + "\n" + "Por favor ingrese la opcion que desea: " + "\n" + "1)Nuevo actor." + "\n"
                + "2)Buscar actor." + "\n" + "3)Eliminar actor." + "\n" + "4)Modificar actor." + "\n" + "5)Ver todos los actores." + "\n"
                + "6)Ver peliculas de los actores" + "\n" + "7)Ver categorias de las peliculas de los actores." + "\n" + "8)Salir.");
        String SeleccionMenu = OpcionMenu.readLine();
        return Integer.valueOf(SeleccionMenu);

    }

    public static void OpcionManu(int Seleccion) throws IOException {

        switch (Seleccion) {
            case 0, 1, 2, 3, 4, 5, 6, 7:
                break;
            case 8:
                System.out.println("HASTA LUEGO.");
                break;
            default:
                System.out.println("OPCIÓN INCORRECTA.");
                break;
        }

    }

}

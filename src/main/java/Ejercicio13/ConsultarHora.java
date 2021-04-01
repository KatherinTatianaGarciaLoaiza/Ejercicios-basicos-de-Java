package Ejercicio13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsultarHora {

    public static void Hora(){
        Date HoraActual = new Date( );
        SimpleDateFormat Formato = new SimpleDateFormat("YYYY/MM/DD '-' HH:mm:ss");

        System.out.println("Fecha actual y hora actual: " + Formato.format(HoraActual));
    }

}

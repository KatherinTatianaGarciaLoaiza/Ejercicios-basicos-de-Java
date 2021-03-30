package Ejercicio1;

//En este pequeño programa se indicara cual numero es mayor o en su defecto si ambos son iguales.
public class Main {

        private static int Numero1 = 3;
        private static int Numero2 = 5;

        //Llamado a los metodos que resuelven las operaciones.
        public static void main(String[] args) {
            String Respuesta = (Numero1 == Numero2) ? Iguales() : Mayor();
            System.out.println(Respuesta);
        }

        //Metodo que indica si son iguales
        public static String Iguales(){
            return "Ambos numeros son iguales";
        }

        //Metodo que indica cual es mayor.
        public static String Mayor(){
            return ("El número mayor es: " + ((Numero1 > Numero2) ? (Numero1) : (Numero2)));
        }
}

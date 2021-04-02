package Ejercicio16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static final int SOBREPESO = 1;
    static final int PESOIDEAL = 0;
    static final int BAJODEPESO = -1;

    static InputStreamReader Entrada = new InputStreamReader(System.in);
    static BufferedReader Buffer = new BufferedReader(Entrada);

    public static void main(String[] args) throws IOException {

        String Nombre = "";
        char Sexo = 0;
        int Edad = 0;
        float Peso = 0;
        float Altura = 0;

        Nombre = Nombre();
        Edad = Edad();
        Sexo = Sexo();
        Peso = Peso();
        Altura = Altura();

        Persona Persona1 = new Persona(Nombre, Edad, Sexo, Peso, Altura);
        Persona Persona2 = new Persona(Nombre, Edad, Sexo);
        Persona Persona3 = new Persona();

        Persona3.EntregarNombre(Nombre);
        Persona3.EntregarEdad(Edad);
        Persona3.EntregarSexo(Sexo);
        Persona3.EntregarPeso(Peso);
        Persona3.EntregarAltura(Altura);

        Persona[] Personas = {Persona1, Persona2, Persona3};
        for(Persona Persona : Personas){
            EstadoPersona(Persona);
            ComprobaciónDeMayoriaDeEdad(Persona);
        }

    }

    public static String Nombre() throws IOException {
        System.out.println("Ingrese el nombre:");
        return Buffer.readLine();
    }

    public static int Edad() throws IOException {
        System.out.println("Ingrese la edad:");
        return Integer.parseInt(Buffer.readLine());
    }

    public static char Sexo() throws IOException {
        System.out.println("Ingrese el sexo:");
        return Buffer.readLine().charAt(0);
    }

    public static float Peso() throws IOException {
        System.out.println("Ingrese el peso:");
        return Float.parseFloat(Buffer.readLine());
    }

    public static float Altura() throws IOException {
        System.out.println("Ingrese la altura:");
        return Float.parseFloat(Buffer.readLine());
    }

    public static void EstadoPersona(Persona Persona){
        System.out.println(Persona.toString());
        switch (Persona.IMC()) {
            case SOBREPESO:
                System.out.println("La persona tiene sobrepeso.");
                break;
            case PESOIDEAL:
                System.out.println("La persona tiene un peso ideal.");
                break;
            case BAJODEPESO:
                System.out.println("La persona esta baja de peso.");
                break;
        }
    }

    public static void ComprobaciónDeMayoriaDeEdad(Persona Persona){
        System.out.println((Persona.MayorDeEdad()) ? "La persona es mayor de edad." : "La persona no es mayor de edad.");
    }

}

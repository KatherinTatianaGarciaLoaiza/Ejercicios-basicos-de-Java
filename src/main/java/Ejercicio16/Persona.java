package Ejercicio16;

import java.util.Random;

import static java.lang.Math.pow;

public class Persona {

    private String Nombre;
    private int Edad;
    private final String DNI;
    private char Sexo;
    private float Peso;
    private float Altura;
    private final String NombrePorDefecto = "Shiro";
    private final int EdadPorDefecto = 26;
    private final char SexoPorDefecto = 'h';
    private final float PesoPorDefecto = 82.5F;
    private final float AlturaPorDefecto = 1.66F;
    private final double LimiteInferiorIMC = 20;
    private final double LimiteSuperiorIMC = 25;
    private final int Sobrepeso = 1;
    private final int PesoIdeal = 0;
    private final int BajoDePeso = 0;


    public Persona(){
        this.Nombre = this.NombrePorDefecto;
        this.Edad = this.EdadPorDefecto;
        this.DNI = GeneradorDNI();
        this.Sexo = this.SexoPorDefecto;
        this.Peso = this.PesoPorDefecto;
        this.Altura = this.AlturaPorDefecto;
    }

    public Persona(String Nombre, int Edad, char Sexo){
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.DNI = GeneradorDNI();
        this.Sexo = Sexo;
        this.Peso = this.PesoPorDefecto;
        this.Altura = this.AlturaPorDefecto;
    }

    public Persona(String Nombre, int Edad, char Sexo, float Peso, float Altura){
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.DNI = GeneradorDNI();
        this.Sexo = ComprobarSexo(Sexo);
        this.Peso = Peso;
        this.Altura = Altura;
    }

    public String ObtenerNombre() {
        return Nombre;
    }

    public String ObtenerDNI() {
        return DNI;
    }

    public int ObtenerEdad() {
        return Edad;
    }

    public char ObtenerSexo() {
        return Sexo;
    }

    public float ObtenerPeso() {
        return Peso;
    }

    public float ObtenerAltura() {
        return Altura;
    }

    public int ObtenerSobrepeso() {
        return Sobrepeso;
    }

    public int ObtenerPesoIdeal() {
        return PesoIdeal;
    }

    public int ObtenerBajoDePeso() {
        return BajoDePeso;
    }

    public double ObtenerLimiteInferiorIMC() {
        return LimiteInferiorIMC;
    }

    public double ObtenerLimiteSuperiorIMC() {
        return LimiteSuperiorIMC;
    }

    public double ObtenerPesoPorDefecto() {
        return PesoPorDefecto;
    }

    public double ObtenerAlturaPorDefecto() {
        return AlturaPorDefecto;
    }

    public String ObtenerNombrePorDefecto() {
        return NombrePorDefecto;
    }

    public int ObtenerEdadPorDefecto() {
        return EdadPorDefecto;
    }

    public char ObtenerSexoPorDefecto() {
        return SexoPorDefecto;
    }

    public void EntregarNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void EntregarEdad(int Edad) {
        this.Edad = Edad;
    }
    //
    public void EntregarSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public void EntregarPeso(float Peso) {
        this.Peso = Peso;
    }

    public void EntregarAltura(float Altura) {
        this.Altura = Altura;
    }

    public int IMC() {
        double IMC = CalcularIMC();
        int EstadoDePeso = 0;
        if (BajoDePeso(IMC)) {
            EstadoDePeso = this.BajoDePeso;
        } else if (PesoIdeal(IMC)) {
            EstadoDePeso = this.PesoIdeal;
        } else {
            EstadoDePeso = this.Sobrepeso;
        }
        return EstadoDePeso;
    }

    public double CalcularIMC(){
        return this.ObtenerPeso() / pow(this.ObtenerAltura(), 2);
    }

    public boolean PesoIdeal(double IMC){
        return (IMC >= this.LimiteInferiorIMC) && (IMC <= this.LimiteSuperiorIMC);
    }

    public boolean BajoDePeso(double IMC){
        return (IMC < this.LimiteInferiorIMC);
    }

    public boolean MayorDeEdad(){
        return (this.ObtenerEdad() >= 18);
    }

    private char ComprobarSexo(char Sexo){
        return ( (Sexo=='h') || (Sexo=='m') ) ? Sexo : this.ObtenerSexoPorDefecto();
    }

    public String toString(){
        return "Persona {" +
                "Nombre = " + this.ObtenerNombre() + '\n' +
                "DNI = " + this.ObtenerDNI() + '\n' +
                "Edad = " + this.ObtenerEdad() + '\n' +
                "Sexo = " + this.ObtenerSexo() + '\n' +
                "Peso = " + this.ObtenerPeso() + '\n' +
                "Altura = " + this.ObtenerAltura() + '\n' +
                '}';
    }

    private String GeneradorDNI(){
        return (int) (Math.random() * 99999999) + 10000000 + "K";
    }

}

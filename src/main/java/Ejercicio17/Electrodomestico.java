package Ejercicio17;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;

public class Electrodomestico {

    private float PrecioBase;
    private String Color;
    private Character ConsumoEnergetico;
    private float Peso;

    final String ColorPorDefecto = "blanco";
    final Character ConsumoEnergeticoPorDefecto = 'F';
    final float PrecioBasePorDefecto = 100;
    final float PesoPorDefecto = 5;

    final int Precio_0_19KG = 10;
    final int Precio_20_49KG = 50;
    final int Precio_50_79KG = 80;
    final int Precio_80KG = 100;

    private List<Character> ConsumosEnergeticos =  Arrays.asList(new Character[] {'A', 'B', 'C', 'D', 'E', 'F'});
    private final List<String> Colores = Arrays.asList(new String[] {"blanco", "negro", "rojo", "azul", "gris"});

    public Electrodomestico(){
        this.PrecioBase = PrecioBasePorDefecto;
        this.Color = ComprobarColor(ColorPorDefecto);
        this.ConsumoEnergetico = ComprobarConsumoEnergetico(ConsumoEnergeticoPorDefecto);
        this.Peso = PesoPorDefecto;
    }

    public Electrodomestico(float Precio, float Peso){
        this.PrecioBase = Precio;
        this.Color = ComprobarColor(ColorPorDefecto);
        this.ConsumoEnergetico = ComprobarConsumoEnergetico(ConsumoEnergeticoPorDefecto);
        this.Peso = Peso;
    }

    public Electrodomestico(float Precio, String Color, Character Consumo, float Peso){
        this.PrecioBase = Precio;
        this.Color = ComprobarColor(Color);
        this.ConsumoEnergetico = ComprobarConsumoEnergetico(Consumo);
        this.Peso = Peso;
    }

    public float ObtenerPrecioBase() {
        return PrecioBase;
    }

    public float ObtenerPeso() {
        return Peso;
    }

    public String ObtenerColor() {
        return ComprobarColor(Color);
    }

    public char ObtenerConsumoEnergetico() {
        return ConsumoEnergetico;
    }

    private char ComprobarConsumoEnergetico(char Consumo) {
        return ConsumosEnergeticos.contains(Consumo) ? Consumo: ConsumoEnergeticoPorDefecto;
    }

    private String ComprobarColor(String Color) {
        Color = Color.toLowerCase();
        return Colores.contains(Color) ? Color: ColorPorDefecto;
    }


    public Float PrecioConsumo(Character Letra) {
        Map<Character, Float> PrecioConsumo = new HashMap<Character, Float>();
            PrecioConsumo.put('A', 100F);
            PrecioConsumo.put('B', 80F);
            PrecioConsumo.put('C', 60F);
            PrecioConsumo.put('D', 50F);
            PrecioConsumo.put('E', 30F);
            PrecioConsumo.put('F', 10F);
        return PrecioConsumo.get(Letra);
    }

    public boolean AumentoDe10(){
        return (ObtenerPeso() >= 0) && (ObtenerPeso() <= 19);
    }

    public boolean AumentoDe50(){
        return (ObtenerPeso() >= 20) && (ObtenerPeso() <= 49);
    }

    public boolean AumentoDe80(){
        return (ObtenerPeso() >= 50) && (ObtenerPeso() <= 79);
    }

    public Float PrecioPeso(Float Peso){
        Float SumaATotal = 0F;
        if (AumentoDe10()){
            SumaATotal += Precio_0_19KG;
        } else if (AumentoDe50()) {
            SumaATotal += Precio_20_49KG;
        } else if (AumentoDe80()) {
            SumaATotal += Precio_50_79KG;
        } else{
            SumaATotal += Precio_80KG;
        }
        return SumaATotal;
    }

    public float PrecioFinal(){
        float PrecioTotal = ObtenerPrecioBase();
        PrecioTotal += PrecioConsumo(ObtenerConsumoEnergetico());
        PrecioTotal += PrecioPeso(ObtenerPeso());
        return PrecioTotal;
    }


}

package Ejercicio17;

public class Lavadora extends Electrodomestico{

    private float Carga;
    final float CargaPorDefecto = 5;

    public Lavadora(){
        this.Carga = CargaPorDefecto;
    }

    public Lavadora(float Precio, float Peso){
        super(Precio, Peso);
        this.Carga = CargaPorDefecto;
    }

    public Lavadora (float Precio, String Color, char ConsumoEnergetico, float Peso, float Carga){
        super(Precio, Color, ConsumoEnergetico, Peso);
        this.Carga = Carga;
    }

    public float ObtenerCarga() {
        return Carga;
    }

    public float PercioFinal(){
        float PrecioTotal = super.PrecioFinal();
        return (ObtenerCarga() > 30) ? (PrecioTotal += 50) : PrecioTotal;
    }

}

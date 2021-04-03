package Ejercicio17;

public class Television extends Electrodomestico{

    private float Resolucion;
    private boolean TDT;
    final float ResolucionPorDefecto = 20;
    final boolean TDTPorDefecto = false;

    public Television(){
        this.Resolucion = ResolucionPorDefecto;
        this.TDT = TDTPorDefecto;
    }

    public Television(float Precio, float Peso){
        super(Precio, Peso);
        this.Resolucion = ResolucionPorDefecto;
        this.TDT = TDTPorDefecto;
    }

    public Television(float Precio, String Color, char ConsumoEnergetico, float Peso, float Resolucion, boolean TDT){
        super(Precio, Color, ConsumoEnergetico, Peso);
        this.Resolucion = Resolucion;
        this.TDT = TDT;
    }

    public float ObtenerResolucion() {
        return Resolucion;
    }

    public boolean ObtenerTDT() {
        return TDT;
    }

    public float PercioFinal(){
        float PrecioTotal = super.PrecioFinal();
        PrecioTotal = AumentoPorPulgadas(PrecioTotal);
        PrecioTotal = AumentoPorTDT(PrecioTotal);
        return PrecioTotal;
    }

    public float AumentoPorPulgadas(float Precio){
        return (ObtenerResolucion() > 40) ? (Precio += Precio * 0.3) : Precio;
    }

    public float AumentoPorTDT(float Precio){
        return (ObtenerTDT() == true) ? (Precio += 50) : Precio;
    }

}

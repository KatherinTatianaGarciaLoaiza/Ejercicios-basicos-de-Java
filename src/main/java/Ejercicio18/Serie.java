package Ejercicio18;

public class Serie implements Entregable{

    private String Titulo;
    private int NumeroDeTemporadas;
    private boolean Entregado;
    private String Genero;
    private String Creador;

    private final int NumeroTemporadasDefecto = 3;
    private final boolean EntregadoPorDefecto = false;
    private final String TituloPorDefecto = "La venganza de Shiro";
    private final String CreadorPorDefecto = "Shiro-Sama";
    private final  String GeneroPorDefecto = "Terror";

    public Serie() {
        this.Titulo = TituloPorDefecto;
        this.Creador = CreadorPorDefecto;
        this.Genero = GeneroPorDefecto;
        this.NumeroDeTemporadas = NumeroTemporadasDefecto;
        this.Entregado = EntregadoPorDefecto;
    }

    public Serie(String Titulo, String Creador) {
        this.Titulo = Titulo;
        this.Creador = Creador;
        this.Genero = GeneroPorDefecto;
        this.NumeroDeTemporadas = NumeroTemporadasDefecto;
        this.Entregado = EntregadoPorDefecto;
    }

    public Serie(String Titulo, int NumeroDeTemporadas, String Genero, String Creador) {
        this.Titulo = Titulo;
        this.Creador = Creador;
        this.Genero = Genero;
        this.NumeroDeTemporadas = NumeroDeTemporadas;
        this.Entregado = EntregadoPorDefecto;
    }

    public String ObtenerTitulo() {
        return Titulo;
    }

    public void EntregarTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String ObtenerCreador() {
        return Creador;
    }

    public void EntregarCreador(String Creador) {
        this.Creador = Creador;
    }

    public String ObtenerGenero() {
        return Genero;
    }

    public void EntregarGenero(String Genero) {
        this.Genero = Genero;
    }

    public int ObtenerNumeroDeTemporadas() {
        return NumeroDeTemporadas;
    }

    public void EntregarNumeroDeTemporadas(int NumeroDeTemporadas) {
        this.NumeroDeTemporadas = NumeroDeTemporadas;
    }

    @Override
    public String toString() {
        return "Serie{" + '\n' +
                "Titulo = " + Titulo + '\n' +
                "NumeroDeTemporadas = " + NumeroDeTemporadas + '\n' +
                "Genero = " + Genero + '\n' +
                "Creador = " + Creador + '\n' +
                '}';
    }

    @Override
    public void Entregar() {
        this.Entregado = true;
    }

    @Override
    public void Devolver() {
        this.Entregado = false;
    }

    @Override
    public boolean IsEntregado() {
        return Entregado;
    }

    @Override
    public boolean CompareTo(Object a) {
        Serie serie = (Serie) a;
        return this.ObtenerNumeroDeTemporadas() >= serie.ObtenerNumeroDeTemporadas();
    }

}

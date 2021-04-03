package Ejercicio18;

public class VideoJuego implements Entregable{

    private String Titulo;
    private float HorasEstimadas;
    private boolean Entregado;
    private String Genero;
    private String Compania;

    private final String TituloPorDefecto = "Lolsito";
    private final float HorasEstimadasPorDefecto = 10;
    private final boolean EntregadoPorDefecto = false;
    private final String GeneroPorDefecto = "MOBA";
    private final String CompaniaPorDefecto = "Riot Games";

    public VideoJuego() {
        this.Titulo = TituloPorDefecto;
        this.HorasEstimadas = HorasEstimadasPorDefecto;
        this.Entregado = EntregadoPorDefecto;
        this.Genero = GeneroPorDefecto;
        this.Compania = CompaniaPorDefecto;
    }

    public VideoJuego(String titulo, float horasEstimadas) {
        this.Titulo = titulo;
        this.HorasEstimadas = horasEstimadas;
        this.Entregado = EntregadoPorDefecto;
        this.Genero = GeneroPorDefecto;
        this.Compania = CompaniaPorDefecto;
    }

    public VideoJuego(String titulo, float horasEstimadas, String genero, String compania) {
        this.Titulo = titulo;
        this.HorasEstimadas = horasEstimadas;
        this.Entregado = EntregadoPorDefecto;
        this.Genero = genero;
        this.Compania = compania;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public float getHorasEstimadas() {
        return HorasEstimadas;
    }

    public void setHorasEstimadas(float horasEstimadas) {
        HorasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getCompania() {
        return Compania;
    }

    public void setCompania(String compania) {
        Compania = compania;
    }

    @Override
    public String toString() {
        return "VideoJuego{" + '\n' +
                "Titulo = " + Titulo + '\n' +
                "HorasEstimadas = " + HorasEstimadas + '\n' +
                "Genero = " + Genero +  '\n' +
                "Compañia = " + Compania + '\n' +
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
        VideoJuego videoJuego = (VideoJuego) a;
        return this.getHorasEstimadas() >= videoJuego.getHorasEstimadas();
    }
}

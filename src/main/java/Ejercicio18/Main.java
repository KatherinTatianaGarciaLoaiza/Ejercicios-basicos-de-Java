package Ejercicio18;

public class Main {

    static int VideoJuegosEntregados = 0;
    static int SeriesEntregadas = 0;
    static Serie ComparadorDeSeries = new Serie();
    static VideoJuego ComparadorDeVideoJuegos = new VideoJuego();
    static String VideoJuegoConMasHoras = "";
    static String SerieConMasTemporadas = "";

    public static void main(String[] args) {

        Serie[] series = new Serie[5];
        VideoJuego[] videojuegos = new VideoJuego[5];
        series[0] = new Serie("Game of thrones", "George R. R. Martin");
        series[1] = new Serie("Dr. House","David Shore");
        series[2] = new Serie("ABC: The Good Doctor", 4, "Drama médico", "David Shore");
        series[3] = new Serie("The Walking Dead", 10, "Apocalipsis zombi, Horror.", "Robert Kirkman, Tony Moore y Charlie Adlard.");
        series[4] = new Serie();

        videojuegos[0] = new VideoJuego("Champions legion", 200);
        videojuegos[1] = new VideoJuego("Dota", 150);
        videojuegos[2] = new VideoJuego("League of legends.",500,"MOBA (Multiplayer Online Battle Arena)","Riot Games.");
        videojuegos[3] = new VideoJuego("PUBG", 100, "Battle royale", "Brendan Greene");
        videojuegos[4] = new VideoJuego();

        series[0].Entregar();
        series[2].Entregar();
        series[4].Entregar();
        videojuegos[0].Entregar();
        videojuegos[2].Entregar();
        videojuegos[2].Entregar();

        for (VideoJuego videojuego : videojuegos) {
            ContarYComparadorVideoJuegos(videojuego);
        }

        for (Serie serie : series) {
            ContarYComparadorSeries(serie);
        }

        System.out.println("El video juego con más horas estimadas es: " + '\n' + VideoJuegoConMasHoras);
        System.out.println("La serie con más temporadas es: " + '\n' + SerieConMasTemporadas);
    }

    public static void ContarYComparadorVideoJuegos(VideoJuego videojuego){
        if (videojuego.IsEntregado()) {
            VideoJuegosEntregados++;
            videojuego.Devolver();
        }
        if (videojuego.CompareTo(ComparadorDeVideoJuegos)) {
            VideoJuegoConMasHoras = videojuego.toString();
            ComparadorDeVideoJuegos = videojuego;
        }
    }

    public static void ContarYComparadorSeries(Serie serie){
        if (serie.IsEntregado()) {
            SeriesEntregadas++;
            serie.Devolver();
        }
        if (serie.CompareTo(ComparadorDeSeries)) {
            SerieConMasTemporadas = serie.toString();
            ComparadorDeSeries = serie;
        }
    }

}

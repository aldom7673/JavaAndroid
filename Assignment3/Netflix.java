package Assignment3;

import java.util.ArrayList;

public class Netflix {
    private ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
    //private Pelicula [] peliculas = new Pelicula[5];
    private ArrayList<Serie> series = new ArrayList<Serie>();

    public Netflix(){
        peliculas.add( new Pelicula("El Señor de los Anillos: el retorno del Rey", "Fantasía épica", "Peter Jackson", "201 minutos", 2003) );
        peliculas.add( new Pelicula("El Padrino Parte II", "Crimen", "Francis Ford Coppola","200 minutos", 1974) );
        peliculas.add( new Pelicula("Ready Player One", "Ciencia ficción" , "Steven Spielberg", "140 minutos", 2018) );
        peliculas.add( new Pelicula("Han Solo: una historia de Star Wars", "Accion", "Ron Howard", "135 minutos", 2018) );
        peliculas.add( new Pelicula("The Hateful Eight", "Western", "Quentin Tarantino", "187 minutos", 2015) );

        series.add( new Serie("Game of Thrones", "Fantasía", "David Benioff & D. B. Weiss", "50 - 82 minutos", 8) );
        series.add( new Serie("Vikings", "Drama", "Michael Hirst", "45 minutos", 6) );
        series.add( new Serie("The 100", "Ciencia ficción", "CW", "43 minutos", 7) );
        series.add( new Serie("Anne with an E", "Drama", "Moira Walley-Beckett", "44 minutos", 3) );
        series.add( new Serie("Breaking Bad", "Drama", "Vince Gilligan", "43 - 58 minutos", 5) );
    }

    public void AbrirNetfilx(){
        try {
            peliculas.get(1).marcarVisto();
            peliculas.get(2).marcarVisto();
            peliculas.get(4).marcarVisto();

            series.get(1).marcarVisto();
            series.get(2).marcarVisto();
            series.get(4).marcarVisto();

            System.out.println("Peliculas vistas: ");
            for(Pelicula p : peliculas) {
                if( p.esVisto() ){
                    System.out.println( "-" + p.getTitulo() + " - " + p.tiempoVisto() + " minutos");
                }
            }

            System.out.println("\nSeries vistas: ");
            for(Serie s : series) {
                if( s.esVisto() ){
                    System.out.println( "-" + s.getTitulo() + " - " + s.tiempoVisto() + " minutos");
                }
            }

            System.out.println("\nSerie con mas temporadas");
            Serie serieMasTemporadas = series.get(0);
            for(Serie s : series) {
                if( serieMasTemporadas.getNoTemporadas() < s.getNoTemporadas()){
                    serieMasTemporadas = s;
                }
            }
            System.out.println( serieMasTemporadas );
            
            System.out.println("\nPelicula del año mas reciente: ");
            Pelicula peliculaMasReciente = peliculas.get(0);
            for(Pelicula p : peliculas) {
                if( peliculaMasReciente.getAnio() < p.getAnio() ){
                    peliculaMasReciente = p;
                }
            }
            System.out.println( peliculaMasReciente );
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
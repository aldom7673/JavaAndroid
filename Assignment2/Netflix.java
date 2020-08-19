package Assignment2;

public class Netflix {
    private Pelicula [] peliculas = new Pelicula[5];
    private Serie [] series = new Serie[5];

    public Netflix(){
        peliculas[0] = new Pelicula("El Señor de los Anillos: el retorno del Rey", "Fantasía épica", "Peter Jackson", "201 minutos", 2003);
        peliculas[1] = new Pelicula("El Padrino Parte II", "Crimen", "Francis Ford Coppola","200 minutos", 1974);
        peliculas[2] = new Pelicula("Ready Player One", "Ciencia ficción" , "Steven Spielberg", "140 minutos", 2018);
        peliculas[3] = new Pelicula("Han Solo: una historia de Star Wars", "Accion", "Ron Howard", "135 minutos", 2018);
        peliculas[4] = new Pelicula("The Hateful Eight", "Western", "Quentin Tarantino", "187 minutos", 2015);        

        series[0] = new Serie("Game of Thrones", "Fantasía", "David Benioff & D. B. Weiss", "50 - 82 minutos", 8);
        series[1] = new Serie("Vikings", "Drama", "Michael Hirst", "45 minutos", 6);
        series[2] = new Serie("The 100", "Ciencia ficción", "CW", "43 minutos", 7);
        series[3] = new Serie("Anne with an E", "Drama", "Moira Walley-Beckett", "44 minutos", 3);
        series[4] = new Serie("Breaking Bad", "Drama", "Vince Gilligan", "43 - 58 minutos", 5);
    }

    public void AbrirNetfilx(){
        peliculas[1].marcarVisto();
        peliculas[2].marcarVisto();
        peliculas[4].marcarVisto();

        series[1].marcarVisto();
        series[3].marcarVisto();
        series[4].marcarVisto();

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
        Serie serieMasTemporadas = series[0];
        for(Serie s : series) {
            if( serieMasTemporadas.getNoTemporadas() < s.getNoTemporadas()){
                serieMasTemporadas = s;
            }
        }
        System.out.println( serieMasTemporadas );
        
        System.out.println("\nPelicula del año mas reciente: ");
        Pelicula peliculaMasReciente = peliculas[0];
        for(Pelicula p : peliculas) {
            if( peliculaMasReciente.getAnio() < p.getAnio() ){
                peliculaMasReciente = p;
            }
        }
        System.out.println( peliculaMasReciente );

    }


}
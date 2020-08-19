package Assignment3;

public class Serie extends RecursoVisual{
    private int noTemporadas = 1;

    public Serie(){
        super();
    }

    public Serie(String titulo, String creador) {
        super(titulo, creador);
    }

    public Serie(String titulo, String genero, String creador, String duracion, int noTemporadas) {
        super(titulo, genero, creador, duracion);
        this.noTemporadas = noTemporadas;
    }

    public int getNoTemporadas() {
        return noTemporadas;
    }

    public void setNoTemporadas(int noTemporadas) {
        this.noTemporadas = noTemporadas;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nNo. Temporadas: " + noTemporadas;
    }    
}
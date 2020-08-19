package Assignment2;
public class Pelicula extends RecursoVisual{
    private int anio;
    
    public Pelicula(){
        super();
    }

    public Pelicula(String titulo, String creador){
        super(titulo, creador);
    }

    public Pelicula(String titulo, String genero, String creador, String duracion, int anio) {
        super(titulo, genero, creador, duracion);
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString(){
        return super.toString() + "\nAño: " + anio;
    }       
}
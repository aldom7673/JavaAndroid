package Assignment2;

import java.time.LocalDateTime;

public class RecursoVisual implements IVisualizacion {
    private String titulo;
    private String genero;
    private String creador;
    private String duracion;
    private boolean visto = false;

    public RecursoVisual() {

    }

    public RecursoVisual(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public RecursoVisual(String titulo, String genero, String creador, String duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\nGenero: " + genero + "\nCreador: " + creador + "\nDuración: " + duracion;
    }

    @Override
    public void marcarVisto() {
        visto = true;
    }

    @Override
    public boolean esVisto() {
        return visto;
    }

    @Override
    public int tiempoVisto() {
        return LocalDateTime.now().getMinute();
    }
}
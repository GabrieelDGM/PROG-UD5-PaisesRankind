package com.salesianos.gabrielproyecto.paises;

public class Pais {

    private String nombre;
    private String capital;
    private String idioma;
    private String cultura;
    private String paisaje;
    private String gastronomia;
    private int puntuacion;

    public Pais(String nombre, String capital, String idioma, String cultura, String paisaje, String gastronomia, int puntuacion) {
        this.nombre = nombre;
        this.capital = capital;
        this.idioma = idioma;
        this.cultura = cultura;
        this.paisaje = paisaje;
        this.gastronomia = gastronomia;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getCultura() {
        return cultura;
    }

    public void setCultura(String cultura) {
        this.cultura = cultura;
    }

    public String getPaisaje() {
        return paisaje;
    }

    public void setPaisaje(String paisaje) {
        this.paisaje = paisaje;
    }

    public String getGastronomia() {
        return gastronomia;
    }

    public void setGastronomia(String gastronomia) {
        this.gastronomia = gastronomia;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Pais nombre: " + nombre
                + ", capital: " + capital
                + ", idioma: " + idioma
                + ", cultura: " + cultura
                + ", paisaje: " + paisaje
                + ", gastronomia: " + gastronomia
                + ", puntuacion: " + puntuacion;
    }
}

package com.salesianos.gabrielproyecto.paises;

public class Pais {

    private String nombre;
    private String capital;
    private String idimoma;
    private String cultura;
    private String paisaje;
    private String gastronomina;
    private int puntuacion;

    public Pais(String nombre, String capital, String idimoma, String cultura, String paisaje, String gastronomina,
            int puntuacion) {
        this.nombre = nombre;
        this.capital = capital;
        this.idimoma = idimoma;
        this.cultura = cultura;
        this.paisaje = paisaje;
        this.gastronomina = gastronomina;
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

    public String getIdimoma() {
        return idimoma;
    }

    public void setIdimoma(String idimoma) {
        this.idimoma = idimoma;
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

    public String getGastronomina() {
        return gastronomina;
    }

    public void setGastronomina(String gastronomina) {
        this.gastronomina = gastronomina;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Pais [nombre=" + nombre + ", capital=" + capital + ", idimoma=" + idimoma + ", cultura=" + cultura
                + ", paisaje=" + paisaje + ", gastronomina=" + gastronomina + ", puntuacion=" + puntuacion + "]";
    }
}

package com.salesianos.gabrielproyecto.rankingpaises;

import com.salesianos.gabrielproyecto.paises.Pais;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.*;

public class RankingService {

    private static final ArrayList<Pais> lista = new ArrayList<>();

    public static void añadirPais(Pais pais) {
        lista.add(pais);
    }

    public static void eliminarPais(Pais pais) {
        if (lista.contains(pais)) {
            lista.remove(pais);
        } else {
            JOptionPane.showMessageDialog(null, "El país no se encuentra en la lista.");
        }
    }

    //
    public static void editarPais(Pais pais, String nuevoNombre, String nuevaCapital, String nuevoIdioma,
            String nuevaCultura, String nuevoPaisaje, String nuevaGastronomia, int nuevaPuntuacion) {
        if (lista.contains(pais)) {
            pais.setNombre(nuevoNombre);
            pais.setCapital(nuevaCapital);
            pais.setIdioma(nuevoIdioma);
            pais.setCultura(nuevaCultura);
            pais.setPaisaje(nuevoPaisaje);
            pais.setGastronomia(nuevaGastronomia);
            pais.setPuntuacion(nuevaPuntuacion);
        } else {
            JOptionPane.showMessageDialog(null, "El país no se encuentra en la lista.");
        }
    }

    public static ArrayList<Pais> getTodosOrdenados() {
        ArrayList<Pais> copia = new ArrayList<>(lista);
        copia.sort(Comparator.comparing(Pais::getPuntuacion).reversed());
        return copia;
    }

    public static int tamaño() {
        return lista.size();
    }

    public static Pais getPorIndice(int index) {
        return (index >= 0 && index < lista.size()) ? lista.get(index) : null;
    }
}

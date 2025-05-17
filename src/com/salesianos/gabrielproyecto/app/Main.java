package com.salesianos.gabrielproyecto.app;

import com.salesianos.gabrielproyecto.helpers.InputHelper;
import com.salesianos.gabrielproyecto.paises.Pais;
import com.salesianos.gabrielproyecto.rankingpaises.RankingService;
import java.util.ArrayList;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String opcion;
        do {
            opcion = JOptionPane.showInputDialog(
                    null,
                    """
                    Ranking de los países que deseas 
                    1.- Añadir país 
                    2.- Editar país elegido 
                    3.- Mostrar países 
                    4.- Eliminar país seleccionado 
                    5.- Mostrar los países del ranking según los elegidos 
                    F.- Finalizar programa o salir del programa
                    """,
                    "Ranking de países",
                    JOptionPane.INFORMATION_MESSAGE
            );

            if (opcion == null) {
                continue;
            }

            switch (opcion.toLowerCase()) {
                case "1" ->
                    añadirPais();
                case "2" ->
                    editarPais();
                case "3" ->
                    mostrarPaises();
                case "4" ->
                    eliminarPais();
                case "5" ->
                    mostrarRanking();
                case "f" ->
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                default ->
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, elige una opción válida.");
            }

        } while (!opcion.equalsIgnoreCase("F"));
    }

    private static void añadirPais() {
        String nombre = InputHelper.solicitarTexto("Nombre del país:");
        String capital = InputHelper.solicitarTexto("Capital del país:");
        String idioma = InputHelper.solicitarTexto("Idioma del país:");
        String cultura = InputHelper.solicitarTexto("Cultura del país:");
        String paisaje = InputHelper.solicitarTexto("Paisaje del país:");
        String gastronomia = InputHelper.solicitarTexto("Gastronomía del país:");
        int puntuacion = InputHelper.solicitarEntero("Puntuación del país (1-10):", 1, 10);

        Pais pais = new Pais(nombre, capital, idioma, cultura, paisaje, gastronomia, puntuacion);
        RankingService.añadirPais(pais);
    }

    private static void editarPais() {
        if (RankingService.getPaises().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay países para editar.");
            return;
        }

        mostrarPaises();
        int index = InputHelper.solicitarEntero("Selecciona el índice del país a editar:", 0,
                RankingService.getPaises().size() - 1);
        Pais pais = RankingService.getPaises().get(index);

        if (pais != null) {
            String nombre = InputHelper.solicitarTexto("Nuevo nombre del país:");
            String capital = InputHelper.solicitarTexto("Nueva capital del país:");
            String idioma = InputHelper.solicitarTexto("Nuevo idioma del país:");
            String cultura = InputHelper.solicitarTexto("Nueva cultura del país:");
            String paisaje = InputHelper.solicitarTexto("Nuevo paisaje del país:");
            String gastronomia = InputHelper.solicitarTexto("Nueva gastronomía del país:");
            int puntuacion = InputHelper.solicitarEntero("Nueva puntuación (1-10):", 1, 10);

            RankingService.editarPais(pais, nombre, capital, idioma, cultura, paisaje, gastronomia, puntuacion);
        }
    }

    private static void mostrarPaises() {
        ArrayList<Pais> paises = RankingService.getTodosOrdenados();
        if (paises.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay países en la lista actualmente.");
            return;
        }

        StringBuilder sb = new StringBuilder("Listado de países:\n");
        for (int i = 0; i < paises.size(); i++) {
            sb.append(i).append("- ").append(paises.get(i)).append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }

    private static void mostrarRanking() {
        mostrarPaises();
    }

    private static void eliminarPais() {
        if (RankingService.tamaño() == 0) {
            JOptionPane.showMessageDialog(null, "No hay países registrados actualmente.");
            return;
        }

        mostrarPaises();
        int index = InputHelper.solicitarEntero("¿Qué país deseas eliminar?", 0, RankingService.tamaño() - 1);
        Pais pais = RankingService.getPorIndice(index);

        if (pais == null) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el país seleccionado.");
            return;
        }

        RankingService.eliminarPais(pais);
        JOptionPane.showMessageDialog(null, "País eliminado correctamente.");
    }
}

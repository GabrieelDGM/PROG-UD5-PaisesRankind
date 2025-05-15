package com.salesianos.gabrielproyecto.helpers;

import javax.swing.JOptionPane;

public class InputHelper {

    public static String solicitarTexto(String mensaje) {
        String input;
        do {
            input = JOptionPane.showInputDialog(mensaje);
            if (input == null) {
                return null;
            }
            input = input.trim();

        } while (input.isEmpty());
        return input;
    }

    public static int pedirNumeroEntre(String mensaje, int min, int max) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(null, mensaje);
                if (input == null) {
                    return -1;
                }
                int valor = Integer.parseInt(input);
                if (valor >= min && valor <= max) {
                    return valor;
                }
                JOptionPane.showMessageDialog(null, "Debe ser un número entre " + min + " y " + max);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Introduce un número válido.");
            }
        }
    }
}

import javax.swing.*;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class PruebaGemini {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        JPanel panel = new JPanel();
        JButton boton1, boton2, boton3, boton4;
        GridBagConstraints c = new GridBagConstraints();
        panel.setLayout(new GridBagLayout());

        // Crear botones
        boton1 = new JButton("A");
        boton2 = new JButton("B");
        boton3 = new JButton("C");
        boton4 = new JButton("D");

        // Configurar GridBagConstraints para distribuir los botones y ajustar su tamaño
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1.0; // Distribuir el espacio horizontalmente
        c.weighty = 1.0; // Distribuir el espacio verticalmente
        c.fill = GridBagConstraints.BOTH; // Llenar todo el espacio disponible en la celda
        panel.add(boton1, c);

        c.gridx = 1;
        c.gridy = 0;
        panel.add(boton2, c);

        c.gridx = 0;
        c.gridy = 1;
        panel.add(boton3, c);

        c.gridx = 1;
        c.gridy = 1;
        panel.add(boton4, c);

        // Ajustar el tamaño del panel para que los botones ocupen todo el espacio
        panel.setPreferredSize(new Dimension(800, 600));

        frame.add(panel);
        frame.setVisible(true);
    }
}
import javax.swing.*;
import java.awt.*;

public class SpringLayoutCentrado {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de GridBagLayout centrado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton boton1 = new JButton("Botón 1");
        JButton boton2 = new JButton("Botón 2");
        JButton boton3 = new JButton("Botón 3");

        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);

        frame.add(panel);
        frame.setVisible(true);

    }
}

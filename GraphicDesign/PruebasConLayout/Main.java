import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Dimension;

public class Main {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("CuidandoElPlaneta.png");
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200,600);
        JPanel panel = new JPanel();
        JButton boton2, boton3;
        JLabel label = new JLabel(), labelExtra = new JLabel();
        GridBagConstraints c = new GridBagConstraints();
        panel.setLayout(new GridBagLayout());
        //panel.setPreferredSize(new Dimension(1200,600));
        boton2 = new JButton();

        label.setIcon(icon);
        boton2 = new JButton("C");
        boton3 = new JButton("D");
        c.gridx = 0; c.gridy = 0; c.weightx = 1; c.weighty = 1;
        panel.add(labelExtra,c);
        c.gridx = 1; c.gridy = 1; c.weightx = 1; c.weighty = 1;
        panel.add(label,c);
        c.gridx = 2; c.gridy = 2;
        panel.add(boton2,c);
        c.gridx = 2; c.gridy = 3;
        panel.add(boton3,c);
        frame.add(panel);
        frame.setVisible(true);
    }
}

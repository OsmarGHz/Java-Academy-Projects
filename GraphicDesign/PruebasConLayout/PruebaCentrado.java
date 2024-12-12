import javax.swing.*;
import java.awt.*;

public class PruebaCentrado {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de GridBagLayout centrado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Configurar el GridBagConstraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 10, 10); // Márgenes opcionales
        gbc.fill = GridBagConstraints.NONE; // No expandir componentes para ocupar espacio disponible

        panel.add(new JButton("Botón 1"), gbc);
        panel.add(new JButton("Botón 2"), gbc);
        panel.add(new JButton("Botón 3"), gbc);

        frame.add(panel);
        frame.setVisible(true);
    }
}

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
public class MyFrame extends JFrame implements ActionListener{
    JRadioButton pizzaButton, hamburgerButton, hotdogButton;
    ImageIcon pizzaIcon, hamburgerIcon, hotdogIcon;
    ButtonGroup group;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaIcon = new ImageIcon("minRecycle.png");
        hamburgerIcon = new ImageIcon("MinRed.png");
        hotdogIcon = new ImageIcon("MinCheck.png");

        pizzaButton = new JRadioButton("Piza");
        hamburgerButton = new JRadioButton("Hamburger");
        hotdogButton = new JRadioButton("Hotdo");
        group = new ButtonGroup();
        group.add(hotdogButton);
        group.add(pizzaButton);
        group.add(hamburgerButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        pizzaButton.setIcon(pizzaIcon);
        //pizzaButton.setSelectedIcon(pizzaIcon);
        //pizzaButton.setDisabledSelectedIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        this.add(hotdogButton);
        this.add(hamburgerButton);
        this.add(pizzaButton);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==pizzaButton) {
            System.out.println("You ordered Pizza");
        }else if (e.getSource()==hamburgerButton) {
            System.out.println("You ordered a hamburger");
        }else if (e.getSource()==hotdogButton) {
            System.out.println("You ordered a hotdog");
        }
        if (e.getSource()==pizzaButton || e.getSource()==hamburgerButton || e.getSource()==hotdogButton) {
            pizzaButton.setEnabled(false);
            hamburgerButton.setEnabled(false);
            hotdogButton.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Vamos al siguiente paso", "A", JOptionPane.INFORMATION_MESSAGE);
            this.remove(pizzaButton);
            this.remove(hamburgerButton);
            this.remove(hotdogButton);
            //Refrescar el frame
            this.repaint();
        }
    }
}
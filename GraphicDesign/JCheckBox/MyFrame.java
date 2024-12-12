import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JCheckBox checkBox;
    ImageIcon XIcon, CheckIcon;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        XIcon = new ImageIcon("MinRed.png");
        CheckIcon = new ImageIcon("MinCheck.png");

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
        checkBox.setIcon(XIcon); //If you let this icon alone here, the user won't know if it's selected or unselected
        checkBox.setSelectedIcon(CheckIcon);
        this.add(button);
        this.add(checkBox);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==button) {
            System.out.println(checkBox.isSelected());
        }
    }
}

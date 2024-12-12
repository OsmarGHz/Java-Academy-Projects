import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame() {
        ImageIcon icon = new ImageIcon("minRecycle.png");

        label = new JLabel();
        label.setText("I don't know the answer, sorry :O");
        label.setBounds(180,250,150,150);
        label.setVisible(false);

        button = new JButton("Click Me");
        button.setBounds(200,100,100,100);
        button.addActionListener(this);
        //button.addActionListener(e -> System.out.println("Poo"));
        button.setText("A");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-5);
        button.setForeground(Color.cyan);
        button.setBackground(Color.BLACK);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }


    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==button){
            //System.out.println("Poo");
            //button.setEnabled(false);
            label.setVisible(true);
        }
    }
}

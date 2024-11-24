import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    MyFrame() {
        button = new JButton("Click Me");
        button.setBounds(200,100,100,50);
        button.addActionListener(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }


    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==button){
            System.out.println("Poo");
        }
    }
}

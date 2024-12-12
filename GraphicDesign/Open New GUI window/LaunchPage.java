import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener{
    JFrame frame = new JFrame();
    JButton myButton = new JButton("New window");
    JButton myButton2= new JButton("Close");

    LaunchPage(){
        myButton.setBounds(100, 160, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        myButton2.setBounds(100, 240, 200, 40);
        myButton2.setFocusable(false);
        myButton2.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.add(myButton);
        frame.add(myButton2);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==myButton) {
            frame.dispose();
            NewWindow myWindow = new NewWindow();
        }
        if (e.getSource()==myButton2) {
            frame.dispose();
        }
    }
}

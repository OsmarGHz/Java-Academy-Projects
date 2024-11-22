import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class MyFrame extends JFrame{
    MyFrame(){
        this.setSize(420, 420);
        this.setTitle("Hola mundoooooo!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit the application
        //this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //Hide the application
        //this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Hide the application
        this.setResizable(false);
        this.setVisible(true);

        ImageIcon icon = new ImageIcon("minRecycle.png"); //ImageIcon creation
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(0, 0, 0));
    }
}
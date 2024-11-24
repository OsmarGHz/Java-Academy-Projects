import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Labels {

    public static void main(String[] args) {
        //JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon icon = new ImageIcon("minRecycle.png"); //ImageIcon creation
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.white,3);
        //JLabel label = new JLabel("Wow, how far we've come");
        label.setText("Wow, how far we've come");
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER); //Set text LEFT,CENTER or RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.BOTTOM);   //Set text TOP,CENTER or BOTTOM of imageicon
        label.setForeground(new Color(125,125,125)); //Set font color of text
        label.setFont(new Font("sansserif", Font.PLAIN, 20)); //Set font of text
        label.setIconTextGap(-30); //Set gap of text to image
        label.setBackground(Color.black); //Set background color
        label.setOpaque(true); //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //Set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);//Set horizontal position of icon+text within label
        //label.setBounds(100, 0, 400, 400);


        JFrame frame = new JFrame();
        //frame.setSize(420, 420);
        //frame.setLayout(null);
        frame.setTitle("SurfMaster");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();

    }
}

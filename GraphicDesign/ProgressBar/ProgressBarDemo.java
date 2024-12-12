import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {
    JFrame frame = new JFrame();
    //JProgressBar bar = new JProgressBar();
    //JProgressBar bar = new JProgressBar(minValue, maxValue);
    JProgressBar bar = new JProgressBar(0,5);

    ProgressBarDemo(){
        //bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("Calibri",Font.BOLD,25));
        bar.setBackground(Color.BLACK);
        bar.setForeground(Color.RED);
        //bar.setUI(null);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill(){
        //int counter = 0;
        int counter = 5;
        while (counter>0){
        //while (counter<=100) {
            bar.setValue(counter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //counter+=1;
            counter-=1;
        }
        bar.setString("Done!");
    }
}

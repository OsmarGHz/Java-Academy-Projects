import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;;
public class SliderDemo implements ChangeListener{
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo(){
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100);

        slider.setPreferredSize(new Dimension(400,400));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli",Font.PLAIN,15));
        label.setFont(new Font("MV Boli",Font.PLAIN,25));

        slider.setOrientation(SwingConstants.VERTICAL);
        //slider.setOrientation(SwingConstants.HORIZONTAL);

        label.setText("°C = " + slider.getValue());

        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    public void stateChanged(ChangeEvent e){
        label.setText("°C = " + slider.getValue());
    }
}

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        //GridLayout = Places the components in a grid of cells
        //             Each component tales all the avalaible space within its cell,
        //             and each cell is the same size

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3, 3, 5, 5));
        //frame.setLayout(new GridLayout(nRows,nColumns,horizontalMargin,verticalMargin));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10")); //If we create an additional button in a 3*3 grid, ir creates an extra column

        frame.setVisible(true);
    }
}

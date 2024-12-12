import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;


public class MyFrame extends JFrame implements ActionListener{
    JComboBox<String> comboBox;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"Dog","Cat","Bird"};

        //Integer[] a = {1,2,3}; //If you are trying to pass int's to ma JComboBox, you have to use the Wrapper class

        comboBox = new JComboBox<>(animals);
        comboBox.addActionListener(this);

        //comboBox.setEditable(true);
        System.out.println(comboBox.getItemCount());
        comboBox.addItem("Horse");
        comboBox.insertItemAt("Pig", 0);
        comboBox.setSelectedIndex(0);
        comboBox.removeItem("Bird");
        comboBox.removeItemAt(1);
        comboBox.removeAllItems();

        this.add(comboBox);

        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==comboBox) {
            System.out.print(comboBox.getSelectedItem()+" ");
            System.out.println(comboBox.getSelectedIndex());
        }
    }
}

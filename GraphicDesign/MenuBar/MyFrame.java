import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
    JMenuBar menuBar;
    JMenu fileMenu, editMenu, helpMenu;
    JMenuItem loadItem, saveItem, exitItem;
    ImageIcon loadIcon, saveIcon, exitIcon;
    MyFrame(){		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(100,100);
		this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("MinCheck.png");
        saveIcon = new ImageIcon("minRecycle.png");
        exitIcon = new ImageIcon("MinRed.png");

        menuBar = new JMenuBar();
        
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        fileMenu.setMnemonic(KeyEvent.VK_F); //Alt + F for File
        editMenu.setMnemonic(KeyEvent.VK_E); //Alt + E for Edit
        helpMenu.setMnemonic(KeyEvent.VK_H); //Alt + H for Help
        loadItem.setMnemonic(KeyEvent.VK_L); //L for Load
        saveItem.setMnemonic(KeyEvent.VK_S); //S for Save
        exitItem.setMnemonic(KeyEvent.VK_E); //E for Exit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
	public void actionPerformed(ActionEvent e) {
        if (e.getSource()==loadItem) {
            System.out.println("Loaded Files!");
        }else if (e.getSource()==saveItem) {
            System.out.println("Saved Files!");
        }else if (e.getSource()==exitItem) {
            //System.exit(0);
            this.dispose();
        }
    }
}

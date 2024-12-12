import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //JOptionPane = popup a standard dialog box that prompts users for a value or informs them of something
        /*/
        JOptionPane.showMessageDialog(null, "This is some useless info", "A", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some useless info", "A", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some useless info", "A", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some useless info", "A", JOptionPane.WARNING_MESSAGE);
        while (true) {
            JOptionPane.showMessageDialog(null, "This is some useless info", "A", JOptionPane.ERROR_MESSAGE);
        }   
        */
        String[] responses = {"No, you're awesome", "Thanks", "*Blush?*"};
        ImageIcon icon = new ImageIcon("minRecycle.png");
        int answer = JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
        //0 if YES, 1 if NO, 2 if CANCEL, -1 if Close button.
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello " + name, "Salute", JOptionPane.INFORMATION_MESSAGE);

        //JOptionPane.showOptionDialog(null, "You are awesome", "Secret Message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, null, 0);
        JOptionPane.showOptionDialog(null, "You are awesome", "Secret Message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
    }
}

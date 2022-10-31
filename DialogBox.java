package UserInterfaceLayer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author arsalan
 */
public class DialogBox {

    public void show(String text) {
        JOptionPane.showMessageDialog(null, text);
    }
}
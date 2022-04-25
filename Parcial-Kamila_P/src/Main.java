import javax.swing.*;
import java.awt.Menu;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("Archivos");
        frame.setSize(800,800);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(new Menu().jpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}

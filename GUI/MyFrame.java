package GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    MyFrame() {
        this.setSize(420, 420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.BLUE);

        this.setVisible(true);
    }
}

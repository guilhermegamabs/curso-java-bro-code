package GUIPanel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JLabel label = new JLabel();
        label.setText("Hello World!");

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250, 0, 250, 250);

        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(750, 750);
        bluepanel.add(label);
        jFrame.setVisible(true);
        jFrame.add(bluepanel);
        jFrame.add(label);
    }
}

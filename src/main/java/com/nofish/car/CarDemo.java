package com.nofish.car;

import javax.swing.*;
import java.awt.event.*;

public class CarDemo extends JDialog {
    private JPanel mainPanel;
    private JPanel center;
    private JButton button1;
    private JTextField textField1;
    private JPanel northPanel;
    String name;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new CarDemo().mainPanel);
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}

package BehavioralPattern.ObserverPattern.Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIDemo1 extends JPanel {
    JButton button1;
    TextArea textArea;
    public GUIDemo1() {
        button1 = new JButton("Button1");
        add(button1);
        textArea = new TextArea("TextArea", 5, 15);
        add(textArea);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("\nNotification from Button1: \n " +
                        "User clicked the Button1");
            }
        });
    }

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("GUIDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent contentPane = new GUIDemo1();
        frame.setContentPane(contentPane);
        frame.pack();
        frame.setVisible(true);
    }
}

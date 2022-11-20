import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Units.*;

public class GUI implements ActionListener {

    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI () {

        frame = new JFrame();
        
        JButton button1 = new JButton("Unidad 1");
        JButton button2 = new JButton("Unidad 2");
        JButton button3 = new JButton("Unidad 3");
        JButton button4 = new JButton("Unidad 4");
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

        label = new JLabel("Seleccione una unidad.");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Proyecto Final");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main (String[] args) {
        new GUI();
    }

    public void actionPerformed(ActionEvent e) {
        Units.Unit1.main(new String[0]);
    }
}

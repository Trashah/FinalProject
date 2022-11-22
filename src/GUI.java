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
        button1.addActionListener(e -> button1Pressed());
        button2.addActionListener(e -> button2Pressed());
        button3.addActionListener(e -> button3Pressed());
        button4.addActionListener(e -> button4Pressed());

        label = new JLabel("Seleccione una unidad.");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 20, 50));
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

    public void button1Pressed() { Units.Unit1.main(new String[0]); }
    public void button2Pressed() { Units.Unit2.main(new String[0]); }
    public void button3Pressed() { Units.Unit3.main(new String[0]); }
    public void button4Pressed() { }

    public static void main (String args[]) {
        new GUI();
    }

    public void actionPerformed(ActionEvent e) {
        
    }

    
}

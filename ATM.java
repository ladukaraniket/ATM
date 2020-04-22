import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ATM 
{
    public ATM()
    {
        final JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600, 600);
        window.setResizable(false);
        final JButton button = new JButton("Press");
        button.setBounds(100, 200, 60, 70);

        window.add(BorderLayout.CENTER,button);

        window.setVisible(true);

    }

    public static void main(final String args[]) {
        final ATM x = new ATM();
    }
}
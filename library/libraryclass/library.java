package libraryclass;

import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.Container;

public class library extends JFrame {
    JPanel cont;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    library lib = new library();
                    lib.setVisible(true);
                } catch (Exception e) {
                }
            }
        });
    }

    public library() {
        try {
            setTitle("Library Management");
            Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
            setSize(screen.width, screen.height);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            cont = new JPanel();
            cont.setLayout(null);

            showView(new login(this));

            setContentPane(cont);

        } catch (Exception e) {
            System.out.println("Library1 Constructor Error");
        }
    }

    public void showView(JPanel panel) {
        cont.removeAll();
        cont.add(panel);
        cont.revalidate();
        cont.repaint();
    }
}

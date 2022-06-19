import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;

class hello{
    public static void main(String[] args) {
        Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
        int width=screen.width;
        
        JFrame j=new JFrame("krishna");
        j.setBounds(100, 100,width/2, screen.height/2);
        // j.setResizable(false);
        j.setVisible(true);
        JPanel p=new JPanel();
       
        // p.setBounds(0, 0,width, screen.height);
        // p.setLayout(null);
        // j.setContentPane(p);
        JLabel l=new JLabel("hello world");
        // l.setSize(width, screen.height);
        l.setFont(new Font("Times New Roman", Font.PLAIN, width/2));
        j.add(l);

    }
}
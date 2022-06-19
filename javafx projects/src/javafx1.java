import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class javafx1 {
    
    public static void main(String[] args) {
        
        Border b=BorderFactory.createLineBorder(Color.green,1);
        
        JLabel l=new JLabel();
        l.setText("name:");
        // l.setHorizontalTextPosition(JLabel.CENTER);
        // l.setVerticalTextPosition(JLabel.TOP);
        l.setForeground(Color.green);
        // l.setFont(new Font("Italic",Font.PLAIN,20));
        // l.setBackground(Color.black);
        // l.setOpaque(true);
        // l.setBorder(b);
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setVerticalAlignment(JLabel.TOP);

        JLabel l1=new JLabel();
        l1.setText("last name:");
        // l1.setHorizontalTextPosition(JLabel.CENTER);
        // l1.setVerticalTextPosition(JLabel.TOP);
        l1.setForeground(Color.green);
        // l1.setFont(new Font("Italic",Font.PLAIN,20));
        l1.setBackground(new Color(255,255,255,0));
        // l1.setOpaque(true);
        // l1.setBorder(b);
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setVerticalAlignment(JLabel.CENTER);

        JFrame f=new JFrame();
        
        f.setTitle("first Javafx");
        f.setSize(500,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.add(l);
        f.add(l1);
    }
}

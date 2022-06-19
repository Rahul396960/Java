package datepicker;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;


public class datasource2 extends JPanel {

    JLabel jd[];
    int i,j;

    public datasource2() {

        try {

            setLayout(new GridLayout(4,8));
            setBorder(BorderFactory.createLineBorder(Color.BLACK));
            setBounds(5, 36, 130, 60);

            jd= new JLabel[32];

            for ( i = 1; i <= 31; i++) {
                String a = String.valueOf(i);

                if (i < 10) {
                    a = " " + a;
                }
                jd[i] = new JLabel(a);
                jd[i].setFont(new Font("Times New Roman", Font.PLAIN, 10));
                jd[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                jd[i].setName("hover");
                add(jd[i]);
            }

            for ( j = 1; j <= 31; j++) {
            jd[j].addMouseListener(new MouseAdapter()
            {
                public void mouseEntered(MouseEvent a)
                {
                    if(jd[j].getName()=="hover")
                    jd[j].setForeground(Color.RED);
                }
            });
        }

        } catch (Exception e) {
            System.out.println("some problem occured");
        }
    }
    
}
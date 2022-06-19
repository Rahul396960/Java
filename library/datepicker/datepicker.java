package datepicker;

import java.awt.Color;
import java.awt.EventQueue;
import javax.sql.DataSource;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import datepicker.datesource;

public class datepicker extends JFrame{
    datesource ds;
    JPanel p;
    JPanel p1;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                try{
                datepicker j=new datepicker();
                
                j.setVisible(true);
                }
                catch(Exception ae)
                {}
            }
        });

        // JPanel jp=new JPanel();
        // jp.setSize(495,395);
        // j.add(jp);
    }
    public datepicker()
    {
        setBounds(200,150,500,400);
    // setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    p=new JPanel();
    p.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    setContentPane(p);

    
     ds=new datesource();
     p.setLayout(null);
    //  ds.setBackground(Color.GREEN);
     ds.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    ds.setLocation(100,100);
    p.add(ds);
    }
}

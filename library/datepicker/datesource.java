package datepicker;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.MouseInputListener;
import java.awt.Cursor;
import javafx.scene.layout.Background;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import datepicker.datasource2;

public class datesource extends JPanel{
    // JPanel jp;
    JPanel jp1;
    JTextField jt;
    JButton jb;
    JLabel jl1;
    JLabel jl2;
    JLabel jl3;
    datasource2 ds2;
    JPanel jp3;
    JPanel jp4;
  
    // JButton jb1;
    // JTextField jt1;
    // JButton jb2;
    // JButton jb3;
    // JTextField jt2;
    // JButton jb4;
    // JButton jb5;
    // JTextField jt3;
    // JButton jb6;
    

    public datesource(){

        try{
        setLayout(null);
        setSize(255,170);
        jt=new JTextField();
        jt.setBounds(5,5,100,24);
        add(jt);
        jb=new JButton("..");
        jb.setBounds(107,5,30, 24);
        add(jb);
       
        // jp1=new JPanel(new GridLayout(1,3,0,1));
        // // jp1.setLayout(null);
        // jp1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        // jp1.setBounds(5, 36, 132, 25);
        // add(jp1);

        // jl1=new JLabel("   dd");
        // jl1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        // jp1.add(jl1);
         
        // jl2=new JLabel(" mm");
        // jl2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        // jp1.add(jl2);

        // jl3=new JLabel(" yyyy");
        // jl3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        // jp1.add(jl3);

        
       
        ds2=new datasource2();
        add(ds2);
       
        
        // jb1=new JButton("+");
        // jp1.add(jb1);
        
        // jb2=new JButton("+");
        // jp1.add(jb2);
        
        // jb3=new JButton("+");
        // jp1.add(jb3);
        
        // jt1=new JTextField();
        // jp1.add(jt1);
        
        // jt2=new JTextField();
        // jp1.add(jt2);
        
        // jt3=new JTextField();
        // jp1.add(jt3);
        
        // jb4=new JButton("-");
        // jp1.add(jb4);
        
        // jb5=new JButton("-");
        // jp1.add(jb5);
        
        // jb6=new JButton("-");
        // jp1.add(jb6);


        // jb1.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        // jb2.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        // jb3.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        // jb4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        // jb5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        // jb6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        
        

        
        jl1.addMouseListener(new MouseAdapter() {
        
            
            public void mouseEntered(MouseEvent e)
            {
                jl1.setForeground(Color.RED);
            }
            public void mouseExited(MouseEvent e)
            {
                jl1.setForeground(Color.BLACK);
            }
        });
        jl2.addMouseListener(new MouseAdapter() {
        
            public void mouseEntered(MouseEvent e1)
            {
                jl2.setForeground(Color.RED);
            }
            public void mouseExited(MouseEvent e1)
            {
                jl2.setForeground(Color.BLACK);
            }
        });
        jl3.addMouseListener(new MouseAdapter() {
        
            public void mouseEntered(MouseEvent e2)
            {
                jl3.setForeground(Color.RED);
            }
            public void mouseExited(MouseEvent e2)
            {
                jl3.setForeground(Color.BLACK);
            }
        });
        // for(j=1;j<=31;j++)
        // {
        //     Object a='e'+(j+2);
        // jd[j].addMouseListener(new MouseAdapter() {
        
        //     public void mouseEntered(MouseEvent a)
        //     {
        //         jd[j].setForeground(Color.RED);
        //     }
        //     public void mouseExited(MouseEvent a)
        //     {
        //         jd[j].setForeground(Color.BLACK);
        //     }
        // });
        // }
        
    }
    catch(Exception e){}
    }
}

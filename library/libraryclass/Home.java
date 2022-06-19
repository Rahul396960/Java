package libraryclass;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home extends JPanel{

    final private  library mpage;
    
    public Home(library mpage) {
        // EventQueue.invokeLater(new Runnable() {
        //     public void run() {

                super();

                this.mpage=mpage;

                setBounds(390, 90, 600, 500);
               setLayout(null);
               setBackground(Color.WHITE);
                setBorder(BorderFactory.createLineBorder(Color.BLACK));

                JButton btn1 = new JButton("Add Book");
                JButton btn2 = new JButton("Issue Book");
                JButton btn3 = new JButton("Return Book");
                JButton btn4 = new JButton("Check Book Record");

                JLabel lgt=new JLabel("<html><u>Logout</u></html>");
                lgt.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                lgt.setBounds(490, 10, 100, 50);
                add(lgt);

                btn1.setBackground(Color.GRAY);
                btn2.setBackground(Color.GRAY);
                btn3.setBackground(Color.GRAY);
                btn4.setBackground(Color.GRAY);

                btn1.setForeground(Color.white);
                btn2.setForeground(Color.white);
                btn3.setForeground(Color.white);
                btn4.setForeground(Color.white);

                btn1.setBounds(90, 80, 180, 180);
                btn2.setBounds(90, 290, 180, 180);
                btn3.setBounds(330, 80, 180, 180);
                btn4.setBounds(330, 290, 180, 180);

                add(btn1);
                add(btn2);
                add(btn3);
                add(btn4);

                lgt.addMouseListener(new MouseAdapter() {
                    public void mouseEntered(MouseEvent e) {
                        lgt.setForeground(Color.RED);
                    }
        
                    public void mouseExited(MouseEvent e) {
                        lgt.setForeground(Color.BLACK);
                    }
        
                    public void mouseClicked(MouseEvent e) {
                       int res= JOptionPane.showConfirmDialog(mpage, "Are you sure you want to exit?", "Logout", JOptionPane.YES_NO_OPTION);
                        
                       if(res==JOptionPane.YES_OPTION){
                           mpage.showView(new login(mpage));
                       }
                    }
                });
                btn1.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        mpage.showView(new Addbook(mpage));

                    }
                });
        
    }

   
}

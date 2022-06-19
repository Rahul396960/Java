import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import libraryclass.RPackage.SelectedChar;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.Container;


public class try1 extends JFrame {

    JPanel jp;
    JButton jb;
    JButton jb1;
    JPasswordField jpt;
    JLabel jl;
    JCheckBox jcb;
    JLabel [] errl;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    try1 t = new try1();

                    t.setVisible(true);
                } catch (Exception ae) {
                }
            }
        });
    }

    public try1() {
        
        try{
            setBounds(200, 150, 500, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            jp = new JPanel();
            jp.setLayout(null);
            setContentPane(jp);

            // jb1 = new JButton("empty");
            // jb1.setBounds(220, 200, 100, 50);

            // String s[]={"hey","bye","good","what"};
            // JComboBox jc=new JComboBox(s);
            // jc.setBounds(100, 100, 100 ,50);

            jpt=new JPasswordField();
            jpt.setBounds(100, 20, 100, 50);

            ImageIcon ic=new ImageIcon(new ImageIcon("libraryclass/4708007.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));

            jcb = new JCheckBox(ic);
            jcb.setBounds(210, 30, 40, 40);
            
      jcb.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
         jpt.setEchoChar(jcb.isSelected() ? '\u0000' : (Character)     
              UIManager.get("PasswordField.echoChar"));
              ImageIcon ic1=new ImageIcon(new ImageIcon("libraryclass/4708007.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
              ImageIcon ic=new ImageIcon(new ImageIcon("libraryclass/4708009.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
         jcb.setIcon(jcb.isSelected()?ic:ic1);    
      }});
            // JTextField jt=new JTextField();
            // jt.setBounds(100, 20, 100, 50);

            
            // jl=new JLabel("what's up");
            // jl.setVerticalTextPosition(SwingConstants.TOP);
            // jl.setHorizontalTextPosition(SwingConstants.CENTER);;
            // jl.setHorizontalTextPosition(JLabel.RIGHT);
            // jl.setForeground(Color.green);
            // jl.setBounds(100, 70, 100, 100);

            SelectedChar sc=new SelectedChar();

            // new Timer().scheduleAtFixedRate(new TimerTask() {
            //     public void run(){
            //         if(sc.checkcharinrange(jt.getText(), "^ "))
            //         {
            //             jl.setText("");
            //         }
            //         else
            //         {
            //             jl.setText("not allowed");
            //         }
                       
            //     }
            // }, 0, 100);  
            // jb = new JButton("fill");
            // jb.setBounds(100, 200, 100, 50);

            JPanel jp1 = new JPanel();
            jp1.setLayout(null);
            jp1.setBounds(0,0,500,395);
            jp1.setBackground(Color.RED);

            // errl=new JLabel[6];

            // for(int i=0;i<errl.length;i++)
            // {
            //     errl[i]=new JLabel(String.valueOf(i));
            //     errl[i].setForeground(Color.GREEN);
            //     errl[i].setFont(new Font("Times New Roman", Font.PLAIN, 12));

            // }

            // errl[3].setBounds(100,100,50,22);
            // jp1.add(errl[3]);
            // jp1.add(jb);
            // jp1.add(jb1);
            // // jp1.add(jc);
            jp1.add(jpt);
            jp1.add(jcb);
            // jp1.add(jt);
            // jp1.add(jl);

            

            jp.add(jp1);

            // CardLayout cl1=(CardLayout)jp.getLayout();
            // System.out.println(cl1);
            // jb.addMouseListener(new MouseAdapter(){
            // public void mouseClicked(MouseEvent e) 
            // {
            //     // cl1.show(jp, "2");
            //     // System.out.println(jc.getSelectedItem());
            //     // System.out.println(jpt.getPassword());
            //     if(String.valueOf(jpt.getPassword()).equals(""))
            //     {
            //         jl.setText("Enter something!");
            //     }
            //     else 
            //     {
            //         jl.setText("");
            //     }
            // }
            // }
            // );
        }catch(Exception e){}
    }
}

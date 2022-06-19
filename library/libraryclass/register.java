package libraryclass;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

import libraryclass.RPackage.RSecurity;
import libraryclass.RPackage.SelectedChar;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;

public class register extends JPanel {

    final private library mpage;

    JLabel title;
    JLabel fn;
    JTextField fnt;
    JLabel ln;
    JTextField lnt;
    JLabel logid;
    JTextField logt;
    JLabel sq;
    JComboBox sqb;
    JLabel ans;
    JPasswordField anst;
    JLabel pass;
    JPasswordField passt;
    JLabel conpass;
    JPasswordField conpasst;
    JLabel[] jl;
    JTextField[] jt;
    JPasswordField[] jp;
    JButton reg;
    JLabel log;
    JLabel[] errl;
    JCheckBox jcb;
    JCheckBox jcb1;
    JCheckBox jcb2;

    public register(library mpage) {

        this.mpage = mpage;
        setBounds(390,80,650, 600);
        setLayout(null);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        title = new JLabel("Create Account");
        title.setBounds(210, 10, 200, 50);
        title.setFont(new Font("Tahoma", Font.PLAIN, 25));
        add(title);

        String[] l = { "First Name:", "Last Name:", "Username:",
                "Security Question:", "Answer:", "Password:", "Confirm Password:" };
        jl = new JLabel[7];
        for (int i = 0; i < jl.length; i++) {
            jl[i] = new JLabel(l[i]);
            jl[i].setFont(new Font("Tahoma", Font.PLAIN, 15));
        }

        jt = new JTextField[3];
        for (int i = 0; i < jt.length; i++) {
            jt[i] = new JTextField();
            jt[i].setFont(new Font("Tahoma", Font.PLAIN, 15));

        }

        jp = new JPasswordField[3];
        for (int i = 0; i < jp.length; i++) {
            jp[i] = new JPasswordField();
            jp[i].setFont(new Font("Tahoma", Font.PLAIN, 15));
        }

        errl = new JLabel[6];
        for (int i = 0; i < errl.length; i++) {
            errl[i] = new JLabel();
            errl[i].setForeground(Color.RED);
            errl[i].setFont(new Font("Tahoma", Font.PLAIN, 12));
        }

        ImageIcon ic=new ImageIcon(new ImageIcon("libraryclass/4708007.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));

        jcb = new JCheckBox(ic);
        jcb.setBounds(470, 330, 35, 35);
        jcb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(jcb);
        
        jcb1 = new JCheckBox(ic);
        jcb1.setBounds(470, 375, 35, 35);
        jcb1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(jcb1);

        jcb2 = new JCheckBox(ic);
        jcb2.setBounds(470, 420, 35, 35);
        jcb2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(jcb2);

        jl[0].setBounds(160, 83, 100, 40);
        jl[1].setBounds(160, 153, 100, 40);
        jl[2].setBounds(160, 223, 100, 40);
        jl[3].setBounds(160, 293, 150, 40);
        jl[4].setBounds(160, 328, 200, 40);
        jl[5].setBounds(160, 373, 100, 40);
        jl[6].setBounds(160, 418, 150, 40);

        jt[0].setBounds(320, 90, 150, 25);
        jt[1].setBounds(320, 160, 150, 25);
        jt[2].setBounds(320, 230, 150, 25);

        String jb[] = { "What is your nickname?", "What is your pet name?", "Who is your favourite actor?",
                "Which is your favourite movie?", "What is your favourite Colour?" };
        sqb = new JComboBox(jb);
        sqb.setBounds(320, 300, 240, 25);
        sqb.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(sqb);

        jp[0].setBounds(320, 335, 150, 25);
        jp[1].setBounds(320, 380, 150, 25);
        jp[2].setBounds(320, 425, 150, 25);

        errl[0].setBounds(320, 110, 200, 22);
        errl[1].setBounds(320, 180, 200, 22);
        errl[2].setBounds(320, 250, 200, 22);
        errl[3].setBounds(320, 355, 150, 22);
        errl[4].setBounds(320, 400, 150, 22);
        errl[5].setBounds(320, 445, 150, 22);

        for (int i = 0; i < jl.length; i++) {
            add(jl[i]);
        }
        for (int i = 0; i < jt.length; i++) {
            add(jt[i]);
        }

        SelectedChar sc = new SelectedChar();

        final  TimerTask tt = new TimerTask() {
            boolean a=true;
            public void run() {
                if (sc.checkcharinrange(jt[0].getText(), "a-zA-Z")) {
                    if (!(jt[0].getText().equals(""))) {
                        errl[0].setText("");
                    }
                    else{
                        errl[0].setText("");
                    }
                } else {
                    errl[0].setSize(200,40);
                    errl[0].setText("<html>Spaces, Numbers and Special<br/>Characters are not allowed!</html>");
                }

                if (sc.checkcharinrange(jt[1].getText(), "a-zA-Z")) {
                    if (!(jt[1].getText().equals(""))) {
                        errl[1].setText("");
                    }
                    else{
                        errl[1].setText("");
                    }
                } else {
                    errl[1].setSize(200,40);
                    errl[1].setText("<html>Spaces, Numbers and Special<br/>Characters are not allowed!</html>");
                }

                if (sc.checkcharinrange(jt[2].getText(), "^ ")) {
                    if(!(errl[2].getText().equals("<html>Can't use this Username<br/>it's already been used!</html>"))){
                    if (!(jt[2].getText().equals(""))) {
                        errl[2].setText("");
                    }
                }
                } else {
                    errl[1].setSize(200,40);
                    errl[2].setText("Spaces are not allowed");
                }
            }
        };
        
        new Timer().schedule(tt, 0, 100);

        for (int i = 0; i < jp.length; i++) {
            add(jp[i]);
        }

        for (int i = 0; i < errl.length; i++) {
            add(errl[i]);
        }


        jcb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             jp[0].setEchoChar(jcb.isSelected() ? '\u0000' : (Character)     
                  UIManager.get("PasswordField.echoChar"));
                  ImageIcon ic1=new ImageIcon(new ImageIcon("libraryclass/4708007.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
                  ImageIcon ic=new ImageIcon(new ImageIcon("libraryclass/4708009.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
             jcb.setIcon(jcb.isSelected()?ic:ic1);    
          }});
          jcb1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             jp[1].setEchoChar(jcb1.isSelected() ? '\u0000' : (Character)     
                  UIManager.get("PasswordField.echoChar"));
                  ImageIcon ic1=new ImageIcon(new ImageIcon("libraryclass/4708007.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
                  ImageIcon ic=new ImageIcon(new ImageIcon("libraryclass/4708009.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
             jcb1.setIcon(jcb.isSelected()?ic:ic1);    
          }});
          jcb2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             jp[2].setEchoChar(jcb2.isSelected() ? '\u0000' : (Character)     
                  UIManager.get("PasswordField.echoChar"));
                  ImageIcon ic1=new ImageIcon(new ImageIcon("libraryclass/4708007.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
                  ImageIcon ic=new ImageIcon(new ImageIcon("libraryclass/4708009.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
             jcb2.setIcon(jcb.isSelected()?ic:ic1);    
          }});

        reg = new JButton("Create Account");
        reg.setBounds(320, 490, 140, 30);
        reg.setFont(new Font("Tahoma", Font.PLAIN, 13));
        add(reg);

        log = new JLabel("<html><u>Login Account</u></html>");
        log.setBounds(160, 490, 120, 30);
        log.setFont(new Font("Tahoma", Font.PLAIN, 15));
        log.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(log);

        log.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                log.setForeground(Color.red);
            }

            public void mouseExited(MouseEvent e) {
                log.setForeground(Color.BLACK);
            }

            public void mouseClicked(MouseEvent e) {
                title.setForeground(Color.RED);
                mpage.showView(new login(mpage));
            }
        });

        reg.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                try {
                    String[] s = { "Enter your First Name!", "Enter your Last Name!",
                            "Create Your Username!", "Enter your answer!",
                            "Create your Password!", "Confirm Your Password!" };

                    boolean b = true;

                    for (int i = 0; i < jt.length; i++) {
                        if (i <= 2) {
                            if (jt[i].getText().equals("")) {
                                errl[i].setSize(200,22);
                                errl[i].setText(s[i]);
                                b = false;
                            } else {
                                errl[i].setText("");
                            }

                            if (String.valueOf(jp[i].getPassword()).equals("")) {
                                errl[i + 3].setText(s[i + 3]);
                                b = false;
                            } else {
                                errl[i + 3].setText("");
                            }
                        }
                    }

                    if (b) {
                        if (sc.checkcharinrange(jt[0].getText(), "a-zA-Z")) {
                            // if (!(jt[0].getText().equals(""))) {
                            //     errl[0].setText("");
                            // }
                        } else {
                            // errl[0].setText("Spaces, Numbers and Special Characters are not allowed");
                            b = false;
                        }

                        if (sc.checkcharinrange(jt[1].getText(), "a-zA-Z")) {
                            // if (!(jt[1].getText().equals(""))) {
                            //     errl[1].setText("");
                            // }
                        } else {
                            // errl[1].setText("Spaces, Numbers and Special Characters are not allowed");
                            b = false;
                        }

                        if (sc.checkcharinrange(jt[2].getText(), "^ ")) {
                            // if (!(jt[2].getText().equals(""))) {
                            //     errl[2].setText("");
                            // }
                        } else if (!(jt[2].getText().equals(""))) {
                            // errl[2].setText("Spaces are not allowed");
                            b = false;
                        }
                    }

                    if (b) {
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Library", "root", "");
                        System.out.println("xampp mysql connected");
                        Statement stat = con.createStatement();

                        ResultSet rs=stat.executeQuery("select Username from Register");
                            
                        while(rs.next())
                        {
                            if((jt[2].getText().toLowerCase()).equals(rs.getString(1)))
                            {
                                errl[2].setSize(200,40);
                                errl[2].setText("<html>Can't use this Username<br/>it's already been used!</html>");
                                b=false;
                                break;
                            }
                        }

                        if(b){
                            System.out.println(String.valueOf(jp[1].getPassword())+"  "+String.valueOf(jp[2].getPassword()));
                            
                            if(String.valueOf(jp[1].getPassword()).equals(String.valueOf(jp[2].getPassword()))){

                        RSecurity rsc = new RSecurity();
                        String c = rsc.randomvalue(10), st = rsc.encrypt(c),psw="";

                        char[] psc=String.valueOf(jp[2].getPassword()).toCharArray();

                        for(char psc1:psc){

                            if(!(psc1==' ')){
                                psw+=psc1;
                            }
                        }
                            

                        stat.executeUpdate("insert into Register(First_Name,Last_Name,Username," +
                                "Security_Q,Sec_Ans,Password,Pass_key) values('" + jt[0].getText().toUpperCase() + "','" +
                                jt[1].getText().toUpperCase() + "','" + jt[2].getText().toLowerCase() + "','" + sqb.getSelectedItem().toString()
                                + "','" + String.valueOf(jp[0].getPassword()).toLowerCase()
                                + "',aes_encrypt(concat('" + psw + "','" + st
                                + "'),'" + c + "'),'" + st +
                                "')");

                                mpage.showView(new login(mpage));
                                System.out.println("Registered succesfully");
                        }
                        else{
                            errl[5].setSize(200,40);
                            errl[5].setText("<html>Confirm password is not<br/>same as above password!</html>");
                            System.out.println("can't Register succesfully");
                        }
                    }
                    }
                } catch (Exception ae) {
                    System.out.println("Error occured");
                    ae.printStackTrace();
                }
            }
        });
    }
}

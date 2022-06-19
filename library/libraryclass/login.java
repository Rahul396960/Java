package libraryclass;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import libraryclass.RPackage.RSecurity;
import java.awt.Cursor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;

public class login extends JPanel {

    final private library mpage;

    JLabel title;
    JLabel logid;
    JTextField logt;
    JLabel pass;
    JPasswordField passt;
    JLabel fg;
    JButton login;
    JLabel reg;
    JLabel usrError;
    JLabel passError;
    JCheckBox jcb;
    public login(library mpage) {

        this.mpage = mpage;

        setBounds(400, 100, 600, 500);
        setLayout(null);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // setAlignmentX(Component.CENTER_ALIGNMENT);
        // setAlignmentY(Component.CENTER_ALIGNMENT);

        title = new JLabel("Login Account");
        title.setBounds(210, 70, 180, 50);
        title.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        add(title);

        logid = new JLabel("Username:");
        logid.setBounds(200, 160, 120, 40);
        logid.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        add(logid);

        logt = new JTextField();
        logt.setBounds(300, 170, 100, 25);
        logt.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        add(logt);

        usrError = new JLabel();
        usrError.setBounds(300, 190, 150, 22);
        usrError.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        add(usrError);

        pass = new JLabel("Password:");
        pass.setBounds(200, 210, 80, 40);
        pass.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        add(pass);

        passt = new JPasswordField("");
        passt.setBounds(300, 220, 100, 25);
        passt.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        add(passt);

        ImageIcon ic=new ImageIcon(new ImageIcon("libraryclass/4708007.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));

        jcb = new JCheckBox(ic);
        jcb.setBounds(400, 215, 35, 35);
        jcb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(jcb);

        passError = new JLabel();
        passError.setBounds(300, 240, 150, 22);
        passError.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        add(passError);

        fg = new JLabel("<html><u>Forgot password</u></html>");
        fg.setBounds(170, 270, 140, 20);
        fg.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        fg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(fg);

        login = new JButton("Login");
        login.setBounds(310, 265, 80, 30);
        login.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        add(login);

        reg = new JLabel("<html><u>Create Account</u></html>");
        reg.setBounds(290, 310, 120, 30);
        reg.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        reg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(reg);

        jcb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             passt.setEchoChar(jcb.isSelected() ? '\u0000' : (Character)     
                  UIManager.get("PasswordField.echoChar"));
                  ImageIcon ic1=new ImageIcon(new ImageIcon("libraryclass/4708007.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
                  ImageIcon ic=new ImageIcon(new ImageIcon("libraryclass/4708009.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
             jcb.setIcon(jcb.isSelected()?ic:ic1);    
          }});

        fg.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                fg.setForeground(Color.BLUE);
            }

            public void mouseExited(MouseEvent e) {
                fg.setForeground(Color.BLACK);
            }

            public void mouseClicked(MouseEvent e) {
                mpage.showView(new forgotpassword(mpage));
            }
        });

        reg.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                reg.setForeground(Color.red);
            }

            public void mouseExited(MouseEvent e) {
                reg.setForeground(Color.BLACK);
            }

            public void mouseClicked(MouseEvent e) {
                mpage.showView(new register(mpage));
            }
        });

        login.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                boolean b;

            b=activity();
                if(b){
                mpage.showView(new Home(mpage));
                }
            }
        });
    }

    public boolean activity()
    {
        boolean b = false;
        boolean a=false;
        try {
            if (logt.getText().equals("")) {
                usrError.setText("<html><font style='color:red'>Enter Username!<font><html>");
            } else {
                usrError.setText("");
            }

            if (String.valueOf(passt.getPassword()).equals("")) {
                passError.setText("<html><font style='color:red'>Enter Password!<font><html>");
            } else {
                b = true;
                passError.setText("");
            }

            if (b) {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Library", "root", "");
                System.out.println("xampp mysql connected");
                Statement stat = con.createStatement();
                ResultSet rs = stat.executeQuery("select Username from Register");

                // String us = "ravi123", pass = "pass_123";
                while (rs.next()) {
                    if (rs.getString(1).equals(logt.getText())) {
                        b = true;
                        break;
                    } else {
                        b = false;
                    }
                }

                if (b) {

                    ResultSet rs1 = stat.executeQuery(
                            "Select Pass_Key from Register where Username='" + logt.getText() + "'");
                    rs1.next();
                    RSecurity rsc = new RSecurity();
                    String salt = rs1.getString(1);
                    // System.out.println(rsc.decrypt(rs1.getString(1)));

                    ResultSet rs2 = stat.executeQuery("select aes_decrypt(Password,'" + rsc.decrypt(salt)
                            + "') from Register where Username='" + logt.getText() + "'");
                    rs2.next();
                    

                    if ((rs2.getString(1)).equals(((String.valueOf(passt.getPassword())) + salt))) {
                        // Thread.sleep(5000);
                        System.out.println("you loged in succesfully");
                        a=true;
                    } else {
                        // System.out.println("Wrong Password");
                        passError.setText("<html><font style='color:red'>Wrong Password!<font><html>");
                        
                    }
                } else {
                    // System.out.println("Wrong Username");
                    usrError.setText("<html><font style='color:red'>Wrong Username!<font><html>");
                }
            }
        } catch (Exception ae) {
            System.out.println(ae.getMessage());
        }
        return a;
    }

}

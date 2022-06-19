package libraryclass;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Cursor;
import libraryclass.RPackage.RSecurity;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import java.awt.Image;

public class forgotpassword extends JPanel{
    
    final private library mpage;

    JLabel ttl;
    JButton back;
    JLabel usr;
    JTextField usrt;
    JLabel usrerr;
    JButton next;
    JLabel sq;
    JPasswordField sqt;
    JLabel sqerr;
    JButton next1;
    JLabel ttl1;
    JLabel ps;
    JPasswordField pst;
    JLabel pserr;
    JLabel cnps;
    JPasswordField cnpst;
    JLabel cnpserr;
    JLabel succ;
    JButton change;
    JCheckBox jcb;
    JCheckBox jcb1;
    
    public forgotpassword(library mpage)
    {
        this.mpage=mpage;

        setBounds(390, 80, 600, 550);
        setLayout(null);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        ttl = new JLabel("Forgot Password");
        ttl.setBounds(200, 20, 220, 50);
        ttl.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        add(ttl);

        back = new JButton("BacK");
        back.setBounds(10, 500, 80, 30);
        back.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        add(back);

        usr=new JLabel("Username:");
        usr.setBounds(200, 80, 120, 40);
        usr.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        add(usr);

        usrt = new JTextField();
        usrt.setBounds(300, 90, 100, 25);
        usrt.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        add(usrt);

        usrerr = new JLabel();
        usrerr.setForeground(Color.RED);
        usrerr.setBounds(300, 110, 150, 22);
        usrerr.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        add(usrerr);

        next=new JButton("Next");
        next.setBounds(310, 140, 80, 30);
        next.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        add(next);

        sq=new JLabel();
        sq.setBounds(215, 185, 200, 30);
        sq.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        sq.setVisible(false);
        add(sq);

        sqt=new JPasswordField();
        sqt.setBounds(215, 220, 180, 25);
        sqt.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        sqt.setVisible(false);
        add(sqt);

        sqerr = new JLabel();
        sqerr.setForeground(Color.RED);
        sqerr.setBounds(215, 240, 150, 22);
        sqerr.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        add(sqerr);

        next1=new JButton("Next");
        next1.setBounds(310, 270, 80, 30);
        next1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        next1.setVisible(false);
        add(next1);

        ttl1 = new JLabel("Change Password");
        ttl1.setBounds(220, 320, 220, 30);
        ttl1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        ttl1.setVisible(false);
        add(ttl1);

        ps=new JLabel("Password:");
        ps.setBounds(200, 360, 120, 40);
        ps.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ps.setVisible(false);
        add(ps);

        pst = new JPasswordField();
        pst.setBounds(300, 370, 100, 25);
        pst.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        pst.setVisible(false);
        add(pst);

        ImageIcon ic=new ImageIcon(new ImageIcon("libraryclass/4708007.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));

        jcb = new JCheckBox(ic);
        jcb.setBounds(400, 365, 35, 35);
        jcb.setVisible(false);
        jcb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(jcb);

        pserr = new JLabel();
        pserr.setBounds(300, 390, 150, 22);
        pserr.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        pserr.setForeground(Color.RED);
        pserr.setVisible(false);
        add(pserr);

        cnps = new JLabel("Confirm Password:");
        cnps.setBounds(140, 410, 180, 40);
        cnps.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        cnps.setVisible(false);
        add(cnps);

        cnpst = new JPasswordField("");
        cnpst.setBounds(300, 420, 100, 25);
        cnpst.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        cnpst.setVisible(false);
        add(cnpst);

        jcb1 = new JCheckBox(ic);
        jcb1.setBounds(400, 415, 35, 35);
        jcb1.setVisible(false);
        jcb1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(jcb1);

        cnpserr = new JLabel();
        cnpserr.setBounds(300, 440, 150, 22);
        cnpserr.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        cnpserr.setForeground(Color.RED);
        cnpserr.setVisible(false);
        add(cnpserr);

        succ = new JLabel();
        succ.setBounds(80, 475, 480, 22);
        succ.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        succ.setForeground(Color.BLUE);
        add(succ);

        change = new JButton("Change Password");
        change.setBounds(410,500, 180, 30);
        change.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        change.setVisible(false);
        add(change);

        jcb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             pst.setEchoChar(jcb.isSelected() ? '\u0000' : (Character)     
                  UIManager.get("PasswordField.echoChar"));
                  ImageIcon ic1=new ImageIcon(new ImageIcon("libraryclass/4708007.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
                  ImageIcon ic=new ImageIcon(new ImageIcon("libraryclass/4708009.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
             jcb.setIcon(jcb.isSelected()?ic:ic1);    
          }});
          jcb1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             cnpst.setEchoChar(jcb1.isSelected() ? '\u0000' : (Character)     
                  UIManager.get("PasswordField.echoChar"));
                  ImageIcon ic1=new ImageIcon(new ImageIcon("libraryclass/4708007.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
                  ImageIcon ic=new ImageIcon(new ImageIcon("libraryclass/4708009.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
             jcb1.setIcon(jcb.isSelected()?ic:ic1);    
          }});
          
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                mpage.showView(new login(mpage));
            }
        });

        next.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try{
                    if(usrt.getText().equals(""))
                    {
                        usrerr.setText("Enter Username!");
                    }
                    else
                    {
                        usrerr.setText("");

                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Library", "root", "");
                        System.out.println("xampp mysql connected");
                        Statement stat = con.createStatement();
                        ResultSet rs = stat.executeQuery("select Username from Register");
        
                        // String us = "ravi123", pass = "pass_123";
                        boolean b=false;
                        while (rs.next()) {
                            if (rs.getString(1).equals(usrt.getText().toLowerCase())) {
                                System.out.println("user found");
                                b=true;
                                break;
                            }
                        }

                        if(b)
                        {
                            usrerr.setText("");
                            System.out.println("correct Username");

                            ResultSet rs1=stat.executeQuery("select Security_Q from Register where Username='"+
                                              usrt.getText()+"'");
                            rs1.next();                  
                            sq.setText(rs1.getString(1));                  
                            sq.setVisible(true);
                            sqt.setVisible(true);
                            next1.setVisible(true);
                            
                        }
                        else {
                            usrerr.setText("Wrong username");
                        }
                    }
                }catch(Exception ae){}
            }
        });

        next1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                try{
                    if(String.valueOf(sqt.getPassword()).equals(""))
                    {
                        sqerr.setText("Enter Answer!");
                    }
                    else
                    {
                        sqerr.setText(""); 

                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Library", "root", "");
                        System.out.println("xampp mysql connected");
                        Statement stat = con.createStatement();
                        ResultSet rs = stat.executeQuery("select Sec_Ans from Register");
        
                        // String us = "ravi123", pass = "pass_123";
                        boolean b=false;
                        while (rs.next()) {
                            if (rs.getString(1).equals(String.valueOf(sqt.getPassword()).toLowerCase())) {
                                System.out.println("ans found");
                                b=true;
                                break;
                            }
                        }

                        if(b)
                        {
                            ttl1.setVisible(true);
                            ps.setVisible(true);
                            pst.setVisible(true);
                            pserr.setVisible(true);
                            cnps.setVisible(true);
                            cnpst.setVisible(true);
                            cnpserr.setVisible(true);
                            change.setVisible(true);
                            jcb.setVisible(true);
                            jcb1.setVisible(true);
                        }
                        else{
                            sqerr.setText("Wrong Answer!");
                        }

                    }                   
                }catch(Exception e){}
            }
        });

        change.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                try{
                    boolean b = true;

                   
                            if (String.valueOf(pst.getPassword()).equals("")) {
                                pserr.setSize(200,22);
                                pserr.setText("Enter Password!");
                                b = false;
                            } else {
                                pserr.setText("");
                            }

                            if (String.valueOf(cnpst.getPassword()).equals("")) {
                                cnpserr.setSize(200,22);
                                cnpserr.setText("Enter confirm Password!");
                                b = false;
                            } else {
                                cnpserr.setText("");
                            }

                            if(b){
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Library", "root", "");
                        System.out.println("xampp mysql connected");
                        Statement stat = con.createStatement();

                                if(String.valueOf(pst.getPassword()).equals(String.valueOf(cnpst.getPassword()))){
                            RSecurity rsc = new RSecurity();
                            String c = rsc.randomvalue(10), st = rsc.encrypt(c),psw="";

                            char[] psc=String.valueOf(cnpst.getPassword()).toCharArray();

                            for(char psc1:psc){
    
                                if(!(psc1==' ')){
                                    psw+=psc1;
                                }
                            }
    
                            stat.executeUpdate("update Register set Password=aes_encrypt(concat('" + 
                            psw + "','" + st
                            + "'),'" + c + "'),Pass_key='" + st +"' where Username='"+usrt.getText()+"'");

                            succ.setText(usrt.getText()+" you have changed your password succesfully");

                                    System.out.println("Password succesfully changed");
                            }
                            else{
                                cnpserr.setSize(200,40);
                                cnpserr.setText("<html>Confirm password is not<br/>same as above password!</html>");
                                System.out.println("can't Register succesfully");
                                succ.setText("");

                            }
                        }
                }
                catch(Exception ae){}
            }
        });
    }

    
}
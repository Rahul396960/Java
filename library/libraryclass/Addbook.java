package libraryclass;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Image;
import libraryclass.RPackage.DatePicker;
import libraryclass.RPackage.SelectedChar;
import libraryclass.RPackage.TimePicker;

public class Addbook extends JPanel{

    library mpage;
    JLabel[] book;
    JLabel[] err;
    JTextField[] jt;
    DatePicker dp;
    TimePicker tp;
    JButton dt;
    JButton goback;
    JButton add;
    JCheckBox jcb;
    JCheckBox jcb1;
    int i;
    public Addbook(library mpage) {
       
        this.mpage=mpage;

        setBounds(260, 90, 900, 510);
        setLayout(null);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Library", "root", "");
            System.out.println("xampp mysql connected");
            Statement st = con.createStatement();
            try{
            
            ResultSet rs = st.executeQuery("select last_id from Books order by last_id desc");
            rs.next();
            System.out.println(rs.getString(1));
            i=Integer.parseInt(rs.getString(1));
            i++;
            }catch(Exception ae){
                i=1;
            }
        } catch (Exception ae) {
            System.out.println("Exception occured");
        }

        JLabel title=new JLabel("Add books");
        title.setBounds(375, 30, 180, 50);
        title.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        add(title);

        String[] header={"Book ID:","Book Name:","Author Name:",
        "Edition:","No. of books:","Adding Date:","Adding Time:"};
        String[] errh={"Enter Book ID!","Enter book name!","Enter Author Name!",
        "Enter Edition!","Enter No. of books!","Enter Date!","Enter Time!"};
        
        book=new JLabel[7];
        jt=new JTextField[7];
        err=new JLabel[7];

        for(int x=0;x<7;x++){
         book[x] = new JLabel(header[x]);
        book[x].setFont(new Font("Tahoma", Font.PLAIN, 18));

         jt[x] = new JTextField();
         jt[x].setFont(new Font("Tahoma", Font.PLAIN, 15));

         err[x] = new JLabel("");
         err[x].setForeground(Color.RED);
         err[x].setFont(new Font("Tahoma", Font.PLAIN, 12)); 

        add(book[x]);
        add(jt[x]);
        add(err[x]);
        }
        jt[0].setText(String.valueOf(i));
  
            book[0].setBounds(250, 100, 150, 40);
            jt[0].setBounds(355, 110, 200, 25);
            err[0].setBounds(355, 130, 200, 22);

        for(int x=1,y=180,z=190,e=210;x<book.length;x+=2,y+=50,z+=50,e+=50)
        {
            book[x].setBounds(70, y, 150, 40);
            jt[x].setBounds(205, z, 200, 25);
            err[x].setBounds(205, e, 150, 22);
            book[x+1].setBounds(475, y, 150, 40);
            jt[x+1].setBounds(610, z, 200, 25);
            err[x+1].setBounds(610, e, 150, 22);
        }

        ImageIcon ic=new ImageIcon(new ImageIcon("libraryclass/4708007.png")
		.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));

        jcb = new JCheckBox(ic);
        jcb.setBounds(405, 285, 35, 35);
        add(jcb);
        jcb1 = new JCheckBox(ic);
        jcb1.setBounds(810, 285, 35, 35);
        add(jcb1);

        dp =new DatePicker(jt[5]);
        dp.setLocation(205, 340);
        add(dp);

        tp =new TimePicker(jt[6]);
        tp.setLocation(680, 338);
        add(tp);

        goback = new JButton("Go Back");
        goback.setBounds(330,380,100, 30);
        
        add = new JButton("Add Book");
        add.setBounds(460,380,100, 30);

        add(goback);
        add(add);

        jcb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             dp.setVisible(jcb.isSelected() ? true: false);
                  ImageIcon ic1=new ImageIcon(new ImageIcon("libraryclass/4708007.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
                  ImageIcon ic=new ImageIcon(new ImageIcon("libraryclass/4708009.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
             jcb.setIcon(jcb.isSelected()?ic:ic1); 

          }});
          jcb1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             tp.setVisible(jcb1.isSelected() ? true: false);
                  ImageIcon ic1=new ImageIcon(new ImageIcon("libraryclass/4708007.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
                  ImageIcon ic=new ImageIcon(new ImageIcon("libraryclass/4708009.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
             jcb1.setIcon(jcb1.isSelected()?ic:ic1); 

          }});
        goback.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                mpage.showView(new Home(mpage));
            }
        });
        add.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {          
                boolean t=false;  
                try {
                    // Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Library", "root", "");
                    System.out.println("xampp mysql connected");
                    Statement stat = con.createStatement();

                    try{
                    ResultSet rs= stat.executeQuery("select book_id from Books where book_id="+jt[0].getText()); 
                    rs.next();
                    if(jt[0].getText().equals(rs.getString(1))){
                        t=true;
                        System.out.println("found it");    
                    }
                }
                catch(Exception a){
                        System.out.println("exception 3 occured!");
                    }

                    boolean b=true;
                    for(int i=0;i<jt.length;i++){
                        if(jt[i].getText().equals("")){
                            err[i].setText(errh[i]);
                            b=false;
                        }
                        else{
                            err[i].setText("");
                        }
                    }
                    SelectedChar sc=new SelectedChar();
                    
                    if(b){
                    if(!sc.checkcharinrange(jt[0].getText(),"0-9"))
                    {
                        err[0].setText("Enter only numbers!");
                        b=false;
                    }
                    else if(!jt[0].getText().equals("")){
                        err[0].setText("");
                    }
                    if(t){
                        err[0].setText("This book id is already been assign!");
                        System.out.println("book id is assigned");
                        b=false;
                    }
                    if(!sc.checkcharinrange(jt[4].getText(),"0-9"))
                    {
                        err[4].setText("Enter only numbers!");
                        b=false;
                    }
                    else if(!jt[4].getText().equals("")){
                        err[4].setText("");
                    }
    
                    if(!sc.checkcharinrange(jt[5].getText(),"-0-9"))
                    {
                        err[5].setText("No alpahabets and symbols are accepted!");
                        b=false;
                    }
                    else if(!jt[5].getText().equals("")){
                        err[5].setText("");
                    }
    
                    if(!sc.checkcharinrange(jt[6].getText(),":0-9"))
                    {
                        err[6].setText("No alpahabets and symbols are accepted!");
                        b=false;
                    }
                    else if(!jt[6].getText().equals("")){
                        err[6].setText("");
                    }
                }
                    if(b){
                   stat.executeUpdate("insert into Books(book_id,book_name,Author_name,edition,"+
                   "Quantity,date,time,last_id) values('"+jt[0].getText()+"','"+jt[1].getText()+"','"+jt[2].getText()+
                   "','"+jt[3].getText()+"','"+jt[4].getText()+"',str_to_date('"+jt[5].getText()+"','%d-%m-%y%y'),'"+
                   jt[6].getText()+"','"+String.valueOf(i)+"')");

                   System.out.println("succesfully added!");
                    }
                } catch (Exception ae) {
                    System.out.println(ae.getMessage());
                }
            
            }
        });
    }

}

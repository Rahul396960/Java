import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class try2 extends JFrame{
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    try2 t = new try2();

                    t.setVisible(true);
                } catch (Exception ae) {
                }
            }
        });
    }

    public try2(){

        Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screen.width, screen.height);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jp=new JPanel();
        jp.setLayout(null);
        setContentPane(jp);

        JPanel jp1=new JPanel();
        jp1.setLayout(null);
        jp1.setBounds(0, 0, screen.width, screen.height);
        // jp1.setBackground(Color.RED);
        jp.add(jp1);
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Library", "root", "");
            Statement st=con.createStatement();

            // String[] col={"Sr No.","Book Id","Book Name","Author Name","Edition","No. of Books","Date","Time"};
            // ArrayList <ArrayList<String>> data=new ArrayList();
            // int i=0;
            // ResultSet rs=st.executeQuery("select book_id,book_name,Author_name, edition,Quantity, date, time from Books");
            // ResultSetMetaData rsm=rs.getMetaData();
            // int count=rsm.getColumnCount();
            // while(rs.next()){
            //     data.add(new ArrayList<String>());
            //     // JButton[] but=new JButton[i+1];
            //     // but[i]=new JButton("hry");
            //     // data.get(i).add(but[i]);
            //     data.get(i).add(String.valueOf(i+1));
            //     for(int j=1;j<=count;j++){
            //     data.get(i).add(rs.getString(j));
            //     }
            //     i++;
            // }
            
            //      JButton[] but=new JButton[data.size()];
            

            // // jt.setBackground(Color.GRAY);
            // JScrollPane sp=new JScrollPane();
            // sp.setBounds(100, 1, screen.width, screen.height);
            // jp1.add(sp);
            
            ResultSet rs= st.executeQuery("select count(*) from Books"); 
              rs.next();
              System.out.println(rs.getString(1));
            //   if(rs.getString(1).equals("1")){
            //     System.out.println("found it");
            //   }
            //   else{
            //       System.out.println("not found");
            //   }
        }
        catch(Exception e){
            System.out.println("error occured");
            System.out.println(e.getMessage());
        }
    }
}

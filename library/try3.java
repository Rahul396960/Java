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
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class try3 extends JFrame {
    
        int n=counts("select count(*) from Books");
        JPanel [] njp=new JPanel[n];
        JLabel [] njl=new JLabel[n];
        JLabel [] njl2=new JLabel[n];

        final static String str="select id,book_id,book_name,"+
        "Author_name,edition,Quantity,date,time from Books";


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    try3 t = new try3("select id,book_id,book_name,"+
                    "Author_name,edition,Quantity,date,time from Books");
                    t.setVisible(true);
                    t.componentaction();
                } catch (Exception ae) {
                }
            }
        });
    }

    public int counts(String q){
        int count=0;
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Library", "root", "");
            System.out.println("xampp mysql connected");
            Statement st = con.createStatement();
          
            ResultSet rs = st.executeQuery(q);
            count=Integer.parseInt(rs.getString(1));
            
        } catch (Exception ae) {
            System.out.println("Exception occured");
        }
        return this.n=count;

    }
    public try3(String q){

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

        JPanel jp2=new JPanel(new GridLayout(0,1));
        // jp2.setBackground(Color.RED);
        jp2.setSize(screen.width,100);
        
        // JPanel jp3=new JPanel();
        // jp3.setBackground(Color.BLUE);
        // jp3.setSize(screen.width,30);
        
        // JPanel jp4=new JPanel();
        // jp4.setBackground(Color.ORANGE);
        // jp4.setSize(screen.width,30);
        
       try{
           Connection conc=DriverManager.getConnection("jdbc:mysql://localhost/Library","root","");
           Statement st=conc.createStatement();

           ResultSet rs=st.executeQuery(q);
            ResultSetMetaData rsm=rs.getMetaData();
            int cnt=rsm.getColumnCount();

            
           
       }
       catch(Exception e){

       }
        for(int i=0;i<=(n-1);i++){
            njl[i]=new JLabel(String.valueOf(i));
            // njl2[i]=new JLabel("label "+String.valueOf(i));
            
			njl[i].setFont(new Font("Times New Roman", Font.PLAIN, 14));
			// njl2[i].setFont(new Font("Times New Roman", Font.PLAIN, 14));

            njp[i]=new JPanel();
            njp[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            njp[i].setSize(screen.width,500);
           
            njp[i].add(njl[i]);
            // njp[i].add(njl2[i]);
            
            jp2.add(njp[i]);  
            
        }

        JScrollPane sp=new JScrollPane(jp2);
        sp.setBounds(0,0,screen.width, screen.height-70);
        // sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        // sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        // // sp.add(jp2);
        // // sp.add(jp3);
        // // sp.add(jp4);

        jp1.add(sp);
        
}
    public void componentaction(){

        for(int i=1;i<=(n-1);i++){
            int sel=i;
            njp[i].addMouseListener(new MouseAdapter() {
                boolean b=true;
            public void mouseEntered(MouseEvent e) {
                if(b==true){
                njp[sel].setBackground(Color.GRAY);
                }
            }

            public void mouseExited(MouseEvent e) {
                if(b==true){
                njp[sel].setBackground(Color.WHITE);
                }
            }

            public void mouseClicked(MouseEvent e) {
                njp[sel].setBackground(Color.BLUE);
                b=false;
            }
        });
    }
    }

}

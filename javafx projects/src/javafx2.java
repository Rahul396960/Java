import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class javafx2 {
    
    public static void main(String[] args) {
        
        // JPanel p=new JPanel();

        // JFrame j=new JFrame();
        // j.setTitle("Javafx2");
        // j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // j.setLayout(null);
        // j.setSize(500, 400);
        // j.setVisible(true);

        JFrame f= new JFrame("Label Example");  
        // JLabel l1,l2;  
        JLabel l1=new JLabel("First Label.");  
        // l1.setBounds(50,50, 100,30);  
         JLabel l2=new JLabel("Second Label.");  
        // l2.setBounds(50,100, 100,30);  
        f.add(l1); 
        f.add(l2);  
        f.setSize(300, 300);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);  
        f.setVisible(true);  
    }
}

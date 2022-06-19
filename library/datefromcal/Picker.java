package datefromcal;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import java.awt.EventQueue;
import java.awt.Image;

class Picker {
	JCheckBox jcb;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Picker lib = new Picker();
                } catch (Exception e) {
                }
            }
        });
	}
	public Picker()
	{
		JLabel label = new JLabel("Selected Date:");
		label.setBounds(100,100,120,40);
		final JTextField text = new JTextField(10);
		text.setBounds(100,160,120,40);
		JButton b = new JButton("popup");
		b.setBounds(100,210,120,40);
		JPanel p = new JPanel();
		p.setLayout(null);
		
		ImageIcon ic=new ImageIcon(new ImageIcon("libraryclass/4708007.png")
		.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));

        jcb = new JCheckBox(ic);
        jcb.setBounds(225,160, 35, 35);
        p.add(jcb);

		p.add(label);
		p.add(text);
		p.add(b);
		final JFrame f = new JFrame();
		f.setBounds(200, 100, 400, 400);
		f.getContentPane().add(p);
		// f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		TimePicker d=new TimePicker(text);
		d.setLocation(100,260);
		p.add(d);
		// b.addActionListener(new ActionListener() {
		// 	public void actionPerformed(ActionEvent ae) {
		// 		d.setVisible(true);
		// 	}
		// });
		jcb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
             d.setVisible(jcb.isSelected() ? true: false);
                  ImageIcon ic1=new ImageIcon(new ImageIcon("libraryclass/4708007.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
                  ImageIcon ic=new ImageIcon(new ImageIcon("libraryclass/4708009.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
             jcb.setIcon(jcb.isSelected()?ic:ic1); 

          }});
	}
}

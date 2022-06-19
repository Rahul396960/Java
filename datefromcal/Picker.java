package datefromcal;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import datefromcal.DatePicker;

class Picker {
	public static void main(String[] args) {
		JLabel label = new JLabel("Selected Date:");
		final JTextField text = new JTextField(20);
		JButton b = new JButton("popup");
		JPanel p = new JPanel();
		p.add(label);
		p.add(text);
		p.add(b);
		final JFrame f = new JFrame();
		f.getContentPane().add(p);
		f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

		DatePicker dp=new DatePicker();
		dp.d.setVisible(false);
		p.add(dp.d);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				dp.d.setVisible(true);
				text.setText(dp.setPickedDate());
			}
		});
	}
}

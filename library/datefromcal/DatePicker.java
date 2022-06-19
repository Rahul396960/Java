package datefromcal;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import javax.swing.BorderFactory;

public class DatePicker extends JPanel {

	public boolean b = false;
	JPanel p;
	JPanel p1;
	JPanel p2;
	JPanel p3;
	JPanel p4;
	JPanel p5;
	JPanel p6;

	java.text.SimpleDateFormat sdf2 = new java.text.SimpleDateFormat(
		"dd-MM-yyyy");

	java.text.SimpleDateFormat sdf1 = new java.text.SimpleDateFormat(
			"yyyy");
	java.util.Calendar cal1 = java.util.Calendar.getInstance();

	java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
			"MMMM yyyy");
	java.util.Calendar cal = java.util.Calendar.getInstance();

	int month = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH);
	int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);

	JPanel[] jp = new JPanel[7];
	JLabel l = new JLabel("", JLabel.CENTER);
	JLabel l2 = new JLabel("", JLabel.CENTER);
	JLabel l3 = new JLabel("Years", JLabel.CENTER);

	String day = "";
	// JDialog d;
	JLabel[] label = new JLabel[49];
	JLabel[] label2 = new JLabel[12];
	JLabel[] label3 = new JLabel[12];

	public DatePicker(JTextField text) {

		text.setText(sdf2.format(cal1.getTime()));
		// d = new JDialog();
		// d.setModal(true);
		setSize(212, 161);
		setBackground(Color.WHITE);
		setLayout(null);
		// setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setVisible(false);

		for (int x = 0; x < jp.length; x++) {
			jp[x] = new JPanel();
			jp[x].setBackground(Color.WHITE);
			jp[x].addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					setBorder(BorderFactory.createLineBorder(Color.BLACK));
				}

			});
		}

		jp[1].setPreferredSize(new Dimension(208, 30));
		jp[1].setLocation(1, 1);
		// p1.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel previous = new JLabel("<<  ");
		previous.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		previous.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				previous.setForeground(Color.green);
			}

			public void mouseExited(MouseEvent e) {
				previous.setForeground(Color.BLACK);
			}

			public void mouseClicked(MouseEvent e) {
				month--;
				displayDate();
			}
		});
		jp[1].add(previous);
		jp[1].add(l);
		JLabel next = new JLabel("  >>");
		next.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		next.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				next.setForeground(Color.green);
			}

			public void mouseExited(MouseEvent e) {
				next.setForeground(Color.BLACK);
			}

			public void mouseClicked(MouseEvent e) {
				month++;
				displayDate();
			}
		});
		jp[1].add(next);
		// jp[1].setBorder(BorderFactory.createLineBorder(Color.BLACK));

		String[] header = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

		jp[2].setLayout(new GridLayout(7, 7));
		jp[2].setPreferredSize(new Dimension(208, 117));
		// jp[2].setBorder(BorderFactory.createLineBorder(Color.BLACK));

		for (int x = 0; x < label.length; x++) {
			final int selection = x;
			label[x] = new JLabel("", JLabel.CENTER);
			// label[x].setFocusPainted(false);
			label[x].setForeground(Color.BLACK);
			label[x].setFont(new Font("Times New Roman", Font.PLAIN, 12));
			if (x > 6)
				label[x].addMouseListener(new MouseAdapter() {
					public void mouseEntered(MouseEvent e) {
						label[selection].setForeground(Color.green);
					}

					public void mouseExited(MouseEvent e) {
						if (sdf.format(cal.getTime()).equals(sdf.format(cal1.getTime()))) {
							if (String.valueOf(cal1.get(Calendar.DATE)).equals(label[selection].getText())) {
								label[selection].setForeground(Color.RED);
							} else {
								label[selection].setForeground(Color.BLACK);
							}
						} else {
							label[selection].setForeground(Color.BLACK);
						}
					}

					public void mouseClicked(MouseEvent e) {
						b = false;
						day = label[selection].getText();
						String date = setPickedDate();
						text.setText(date);
						setVisible(false);
					}
				});
			if (x < 7) {
				label[x].setText(header[x]);
				label[x].setForeground(Color.red);
			}
			jp[2].add(label[x]);
		}

		jp[0].setBounds(0, 0, 212, 161);
		// jp[0].setBorder(new EmptyBorder(2,2,2,2));
		jp[0].setBorder(BorderFactory.createLineBorder(Color.BLACK));

		add(jp[0]);
		jp[0].add(jp[1], BorderLayout.NORTH);
		jp[0].add(jp[2], BorderLayout.CENTER);

		jp[3].setPreferredSize(new Dimension(208, 30));
		jp[3].setLocation(1, 1);
		// jp[3].setBorder(BorderFactory.createLineBorder(Color.BLACK));
		jp[3].add(l2);

		jp[4].setLayout(new GridLayout(3, 4));
		jp[4].setPreferredSize(new Dimension(208, 117));
		// jp[4].setBorder(BorderFactory.createLineBorder(Color.BLACK));

		String[] header1 = { "Jan", "Feb", "Mar", "April", "May", "Jun",
				"July", "Aug", "Sep", "Oct", "Nov", "Dec" };
		for (int x = 0; x < header1.length; x++) {
			final int selection2 = x;
			label2[x] = new JLabel(header1[x], JLabel.CENTER);
			// label[x].setFocusPainted(false);
			if (sdf1.format(cal.getTime()).equals(sdf1.format(cal1.getTime()))) {
				if(cal1.get(Calendar.MONTH)==selection2){
					label2[x].setForeground(Color.RED);
				}else {
					label2[x].setForeground(Color.BLACK);
					}
			} else {
			label2[x].setForeground(Color.BLACK);
			}

			label2[x].setFont(new Font("Times New Roman", Font.PLAIN, 12));
			label2[x].addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					label2[selection2].setForeground(Color.green);
				}

				public void mouseExited(MouseEvent e) {
					if (sdf1.format(cal.getTime()).equals(sdf1.format(cal1.getTime()))) {
						if(cal1.get(Calendar.MONTH)==selection2){
							label2[selection2].setForeground(Color.RED);
						}else {
							label2[selection2].setForeground(Color.BLACK);
							}
					} else {
					label2[selection2].setForeground(Color.BLACK);
					}
				}

				public void mouseClicked(MouseEvent e) {
					month = selection2;
					displayDate();
					showView(jp[1], jp[2]);
					label2[selection2].setForeground(Color.BLACK);

				}
			});
			jp[4].add(label2[x]);
		}

		jp[5].setPreferredSize(new Dimension(208, 30));
		jp[5].setLocation(1, 1);
		// p5.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel previous1 = new JLabel("<<  ");
		previous1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		previous1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				previous1.setForeground(Color.green);
			}

			public void mouseExited(MouseEvent e) {
				previous1.setForeground(Color.BLACK);
			}

			public void mouseClicked(MouseEvent ae) {
				year -= 12;
				displayyear();
			}
		});
		jp[5].add(previous1);
		jp[5].add(l3);
		JLabel next1 = new JLabel("  >>");
		next1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		next1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				next1.setForeground(Color.green);
			}

			public void mouseExited(MouseEvent e) {
				next1.setForeground(Color.BLACK);
			}

			public void mouseClicked(MouseEvent ae) {
				year += 12;
				displayyear();
			}
		});
		jp[5].add(next1);

		jp[6].setLayout(new GridLayout(3, 4));
		jp[6].setPreferredSize(new Dimension(208, 117));
		// p6.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		for (int x = 0; x < label3.length; x++) {
			final int selection2 = x;
			label3[x] = new JLabel("", JLabel.CENTER);
			label3[x].setFont(new Font("Times New Roman", Font.PLAIN, 12));
			label3[x].addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					label3[selection2].setForeground(Color.green);
				}

				public void mouseExited(MouseEvent e) {
					if (String.valueOf(cal1.get(Calendar.YEAR)).equals(label3[selection2].getText())) {
							label3[selection2].setForeground(Color.RED);
						
					} else {
						label3[selection2].setForeground(Color.BLACK);
					}
				}

				public void mouseClicked(MouseEvent e) {
					year = Integer.parseInt(label3[selection2].getText());
					displayDate();
					showView(jp[3], jp[4]);
					if (String.valueOf(cal1.get(Calendar.YEAR)).equals(label3[selection2].getText())) {
						label3[selection2].setForeground(Color.RED);
					
				} else {
					label3[selection2].setForeground(Color.BLACK);
				}
				for(int x=0;x<header1.length;x++){
				if (sdf1.format(cal.getTime()).equals(sdf1.format(cal1.getTime()))) {
					if(cal1.get(Calendar.MONTH)==x){
						label2[x].setForeground(Color.RED);
					}else {
						label2[x].setForeground(Color.BLACK);
						}
				} else {
				label2[x].setForeground(Color.BLACK);
				}
			}
				}
			});
			jp[6].add(label3[x]);
		}

		jp[0].addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent ae) {
		}
			public void mouseExited(MouseEvent ae) {
			}
		});
		l.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent ae) {
				l.setForeground(Color.green);
			}

			public void mouseExited(MouseEvent ae) {
				l.setForeground(Color.BLACK);
			}

			public void mouseClicked(MouseEvent ae) {
				displayDate();
				showView(jp[3], jp[4]);
				l.setForeground(Color.BLACK);
			}
		});
		l2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent ae) {
				l2.setForeground(Color.green);
			}

			public void mouseExited(MouseEvent ae) {
				l2.setForeground(Color.BLACK);
			}

			public void mouseClicked(MouseEvent ae) {
				displayDate();
				showView(jp[5], jp[6]);
				l2.setForeground(Color.BLACK);
			}
		});

		// d.pack();
		// d.setLocationRelativeTo(parent);
		displayDate();
		displayyear();
		// d.setVisible(true);
	}

	public void displayDate() {
		for (int x = 7; x < label.length; x++)
			label[x].setText("");

		cal.set(year, month, 1);
		int dayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);
		int daysInMonth = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
		for (int x1 = 6 + dayOfWeek, day1 = 1; day1 <= daysInMonth; x1++, day1++) {
			label[x1].setText("" + day1);
			if (sdf.format(cal.getTime()).equals(sdf.format(cal1.getTime()))) {
				if (cal1.get(Calendar.DATE) == day1) {
					label[x1].setForeground(Color.RED);
				}
			} else {
				label[x1].setForeground(Color.BLACK);
			}
		}
		l.setText(sdf.format(cal.getTime()));
		l2.setText(sdf1.format(cal.getTime()));
		// d.setTitle("Date Picker");
	}

	public void displayyear() {
		for (int x = year, y = 0; x < year + 12; x++, y++) {
			label3[y].setText(String.valueOf(x));
			java.util.Calendar cal1 = java.util.Calendar.getInstance();
			if (cal1.get(Calendar.YEAR) == x) {
				label3[y].setForeground(Color.RED);
			} else {
				label3[y].setForeground(Color.BLACK);
			}
		}
	}

	public String setPickedDate() {
		// if (day.equals(""))
		// return day;
		java.util.Calendar cal1 = java.util.Calendar.getInstance();

		cal1.set(year, month, Integer.parseInt(day));
		return sdf2.format(cal1.getTime());
	}

	public void showView(JPanel panel, JPanel panel1) {
		jp[0].removeAll();
		jp[0].add(panel, BorderLayout.NORTH);
		jp[0].add(panel1, BorderLayout.CENTER);
		jp[0].revalidate();
		jp[0].repaint();
	}

}

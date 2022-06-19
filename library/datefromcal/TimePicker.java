package datefromcal;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class TimePicker extends JPanel {

    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
        "HH:mm:ss");
                            
    java.util.Calendar tim = java.util.Calendar.getInstance();

    int hrs=java.util.Calendar.getInstance().get(java.util.Calendar.HOUR_OF_DAY);;
    int min=java.util.Calendar.getInstance().get(java.util.Calendar.MINUTE); 
    int sec=java.util.Calendar.getInstance().get(java.util.Calendar.SECOND); 
    JLabel[] jl=new JLabel[9];

    JTextField time;
    JPanel jp;

    public TimePicker(JTextField time){

        this.time=time;
        setSize(90, 60);
		setBackground(Color.WHITE);
		setLayout(null);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setVisible(false);

        jp=new JPanel();
        jp.setBounds(0, 0, 90, 60);
        jp.setBackground(Color.WHITE);
		jp.setLayout(new GridLayout(3,3));
		jp.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(jp);

        for(int i=0;i<jl.length;i++){
            int sel=i;
            jl[i]=new JLabel("",JLabel.CENTER);
            jl[i].setFont(new Font("Times New Roman", Font.PLAIN, 16));
            if(i<3){
                jl[i].setText("+");
                jl[i].addMouseListener(new MouseAdapter() {
					public void mouseEntered(MouseEvent e) {
						jl[sel].setForeground(Color.RED);
					}

					public void mouseExited(MouseEvent e) {
                        jl[sel].setForeground(Color.BLACK);
					}

					public void mouseClicked(MouseEvent e) {
					if(sel==0){
                        hrs++;
                        if(hrs==24){
                            hrs=00;
                        }
                    }
                    else if(sel==1){
                        min++;
                        if(min==60){
                            min=00;
                        }
                    }
                    else if(sel==2){
                        sec++;
                        if(sec==60){
                            sec=00;
                        }
                    }
                    displaytime();
					}
				});
            }
            if(i<6 && i>2){
                jl[i].setForeground(Color.BLUE);
            }
            if(i>5){
                jl[i].setText("-");
                jl[i].setFont(new Font("Times New Roman", Font.PLAIN, 22));
               jl[i].addMouseListener(new MouseAdapter() {
					public void mouseEntered(MouseEvent e) {
						jl[sel].setForeground(Color.RED);
					}

					public void mouseExited(MouseEvent e) {
                        jl[sel].setForeground(Color.BLACK);
					}

					public void mouseClicked(MouseEvent e) {
                        if(sel==6){
                            hrs--;
                            if(hrs==-1){
                                hrs=23;
                            }
                        }
                        else if(sel==7){
                            min--;
                            if(min==-1){
                                min=59;
                            }
                        }
                        else if(sel==8){
                            sec--;
                            if(sec==-1){
                                sec=59;
                            }
                        }
                        displaytime();
					}
				});

            }
            jp.add(jl[i]);
        }
        jp.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

        });

        displaytime();
    }
    public void displaytime(){
        if(hrs<10){
            jl[3].setText("0"+String.valueOf(hrs));  
        }
        else{
            jl[3].setText(String.valueOf(hrs));
        }
        if(min<10){
            jl[4].setText("0"+String.valueOf(min));  
        }
        else{
            jl[4].setText(String.valueOf(min));
        }       
        if(sec<10){
            jl[5].setText("0"+String.valueOf(sec));  
        }
        else{
            jl[5].setText(String.valueOf(sec));
        }
                tim.set(0, 0, 0, hrs, min, sec);
        time.setText(sdf.format(tim.getTime()));
    }
}

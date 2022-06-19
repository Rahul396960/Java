import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public final class ShowJPasswordTest extends JPanel {
   private JPasswordField pf1;
   private JCheckBox jcb;
   private JPanel panel;
   public ShowJPasswordTest() {
      pf1 = makePasswordField();
      jcb = new JCheckBox("Show Passwords");
      jcb.addActionListener(ae -> {
         JCheckBox c = (JCheckBox) ae.getSource();
         pf1.setEchoChar(c.isSelected() ? '\u0000' : (Character)          UIManager.get("PasswordField.echoChar"));
      });
      panel = new JPanel(new BorderLayout());
      panel.add(pf1);
      panel.add(jcb, BorderLayout.SOUTH);
      add(makeTitledPanel("Show/Hide Password", panel));
      setBorder(BorderFactory.createEmptyBorder(2, 5, 2, 5));
   }
   private static JPasswordField makePasswordField() {
      JPasswordField pf = new JPasswordField(20);
      pf.setText("tutorialspoint");
      pf.setAlignmentX(Component.RIGHT_ALIGNMENT);
      return pf;
   }
   private static Component makeTitledPanel(String title, Component cmp) {
      JPanel p = new JPanel(new GridBagLayout());
      p.setBorder(BorderFactory.createTitledBorder(title));
      GridBagConstraints c = new GridBagConstraints();
      c.weightx = 1d;
      c.fill = GridBagConstraints.HORIZONTAL;
      c.insets = new Insets(5, 5, 5, 5);
      p.add(cmp, c);
      return p;
   }
   public static void main(String[] args) {
      JFrame frame = new JFrame("Show/HidePasswordField Test");
      frame.getContentPane().add(new ShowJPasswordTest());
      frame.setSize(375, 250);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}
enum PasswordField {
   SHOW, HIDE;
}

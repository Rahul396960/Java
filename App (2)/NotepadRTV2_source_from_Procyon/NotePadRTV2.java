import javax.crypto.CipherInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.crypto.CipherOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import javax.swing.JFileChooser;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.TransferHandler;
import java.util.Timer;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class NotePadRTV2 extends JFrame implements ActionListener
{
    private static final long serialVersionUID = 2L;
    private static JTextArea textArea;
    private JScrollPane areaScrollPane;
    private JMenuBar menuBar;
    private JMenu file;
    private JMenu edit;
    private JMenu format;
    private JMenu view;
    private JMenu help;
    private JMenuItem openFile;
    private JMenuItem saveFile;
    private JMenuItem close;
    private JMenuItem newFile;
    private JMenuItem undo;
    final String key = "Bar12345Bar12345";
    public static Timer t;
    public static int wordcount;
    
    static {
        NotePadRTV2.textArea = new JTextArea();
        NotePadRTV2.wordcount = 0;
    }
    
    public NotePadRTV2() {
        this.menuBar = new JMenuBar();
        this.file = new JMenu();
        this.edit = new JMenu();
        this.format = new JMenu();
        this.view = new JMenu();
        this.help = new JMenu();
        this.openFile = new JMenuItem();
        this.saveFile = new JMenuItem();
        this.close = new JMenuItem();
        this.newFile = new JMenuItem();
        this.undo = new JMenuItem();
        this.setSize(1366, 720);
        this.setTitle("Notepad RT V2");
        this.setDefaultCloseOperation(3);
        // NotePadRTV2.textArea.setTransferHandler(null);
        NotePadRTV2.textArea.setFont(new Font(NotePadRTV2.textArea.getFont().getFontName(), 0, 14));
        NotePadRTV2.textArea.setDragEnabled(true);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(NotePadRTV2.textArea);
        (this.areaScrollPane = new JScrollPane(NotePadRTV2.textArea)).setVerticalScrollBarPolicy(22);
        this.areaScrollPane.setHorizontalScrollBarPolicy(30);
        this.areaScrollPane.setPreferredSize(new Dimension(250, 250));
        this.getContentPane().add(this.areaScrollPane);
        this.setJMenuBar(this.menuBar);
        this.menuBar.add(this.file);
        this.menuBar.add(this.edit);
        this.menuBar.add(this.help);
        this.file.setText("File");
        this.edit.setText("Edit");
        this.format.setText("Format");
        this.view.setText("View");
        this.newFile.setText("New");
        this.newFile.setAccelerator(KeyStroke.getKeyStroke(78, 2));
        this.newFile.addActionListener(this);
        this.newFile.setMnemonic(78);
        this.file.add(this.newFile);
        this.openFile.setText("Open");
        this.openFile.setAccelerator(KeyStroke.getKeyStroke(79, 2));
        this.openFile.addActionListener(this);
        this.openFile.setMnemonic(79);
        this.file.add(this.openFile);
        this.saveFile.setText("Save");
        this.saveFile.setAccelerator(KeyStroke.getKeyStroke(83, 2));
        this.saveFile.addActionListener(this);
        this.saveFile.setMnemonic(83);
        this.file.add(this.saveFile);
        this.close.setText("Close");
        this.close.setAccelerator(KeyStroke.getKeyStroke(115, 2));
        this.close.setMnemonic(115);
        this.close.addActionListener(this);
        this.file.add(this.close);
        this.undo.setText("Undo");
        this.undo.setAccelerator(KeyStroke.getKeyStroke(90, 2));
        this.undo.setMnemonic(90);
        this.undo.addActionListener(this);
        this.edit.add(this.undo);
    }
    
    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == this.close) {
            this.dispose();
        }
        else if (e.getSource() == this.openFile) {
            final JFileChooser open = new JFileChooser();
            final int option = open.showOpenDialog(this);
            // Label_0237: {
            //     if (option == 0) {
            //         NotePadRTV2.textArea.setText("");
            //         try {
            //             new FileEncryptor("DES/ECB/PKCS5Padding", open.getSelectedFile().getPath()).decrypt();
            //         }
            //         catch (Exception e2) {
            //             e2.printStackTrace();
            //         }
            //         Scanner scan = null;
            //         try {
            //             try {
            //                 scan = new Scanner(new FileReader(open.getSelectedFile().getPath().substring(0, open.getSelectedFile().getPath().length() - 4)));
            //                 while (scan.hasNext()) {
            //                     NotePadRTV2.textArea.append(String.valueOf(String.valueOf(scan.nextLine())) + "\n");
            //                     NotePadRTV2.wordcount = NotePadRTV2.textArea.getText().length();
            //                 }
            //             }
            //             catch (Exception ex) {
            //                 System.out.println(ex.getMessage());
            //                 if (scan != null) {
            //                     scan.close();
            //                 }
            //                 break Label_0237;
            //             }
            //         }
            //         catch (Throwable throwable) {
            //             if (scan != null) {
            //                 scan.close();
            //             }
            //             throw throwable;
            //         }
            //         if (scan != null) {
            //             scan.close();
            //         }
            //     }
            // }
            final File file = new File(open.getSelectedFile().getPath().substring(0, open.getSelectedFile().getPath().length() - 4));
            file.delete();
        }
        else if (e.getSource() == this.saveFile) {
            final JFileChooser save = new JFileChooser();
            final int option = save.showSaveDialog(this);
            if (option == 0) {
                try {
                    final BufferedWriter out = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
                    out.write(NotePadRTV2.textArea.getText());
                    out.close();
                }
                catch (Exception ex2) {
                    System.out.println(ex2.getMessage());
                }
            }
            try {
                new FileEncryptor("DES/ECB/PKCS5Padding", save.getSelectedFile().getPath()).encrypt();
                final File file2 = new File(save.getSelectedFile().getPath());
                file2.delete();
            }
            catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        else if (e.getSource() == this.newFile) {
            final Object[] options = { "Save", "Don't Save", "Cancel" };
            final int button = JOptionPane.showOptionDialog(null, "Do you want to save changes to" + this.getTitle(), "Notepad",2, 2, null, options, options[0]);
            if (button == 0) {
                final JFileChooser newFile = new JFileChooser();
                final int option2 = newFile.showSaveDialog(this);
                if (option2 == 0) {
                    try {
                        final BufferedWriter out2 = new BufferedWriter(new FileWriter(newFile.getSelectedFile().getPath()));
                        out2.write(NotePadRTV2.textArea.getText());
                        out2.close();
                    }
                    catch (Exception ex3) {
                        System.out.println(ex3.getMessage());
                    }
                }
            }
            else if (button == 1) {
                NotePadRTV2.textArea.setText(null);
            }
        }
    }
    
    public static void main(final String[] args) {
        final NotePadRTV2 app = new NotePadRTV2();
        app.setVisible(true);
        final TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (NotePadRTV2.textArea.getText().length() - NotePadRTV2.wordcount > 15) {
                    // NotePadRTV2.textArea.setText(null);
                }
                else {
                    NotePadRTV2.wordcount = NotePadRTV2.textArea.getText().length();
                }
            }
        };
        (NotePadRTV2.t = new Timer()).scheduleAtFixedRate(task, 0L, 1000L);
    }
    
    public class FileEncryptor
    {
        private String algo;
        private String path;
        
        public FileEncryptor(final String algo, final String path) {
            this.algo = algo;
            this.path = path;
        }
        
        public void encrypt() throws Exception {
            final byte[] k = "HignDlPs".getBytes();
            final SecretKeySpec key = new SecretKeySpec(k, this.algo.split("/")[0]);
            
            final Cipher encrypt = Cipher.getInstance(this.algo);
            encrypt.init(1, key);
            final FileOutputStream fos = new FileOutputStream(String.valueOf(String.valueOf(String.valueOf(this.path))) + ".txt");
            Throwable throwable = null;
            try {
                final FileInputStream fis = new FileInputStream(this.path);
                try {
                    Throwable throwable2 = null;
                    try {
                        final CipherOutputStream cout = new CipherOutputStream(fos, encrypt);
                        try {
                            this.copy(fis, cout);
                        }
                        finally {
                            if (cout != null) {
                                cout.close();
                            }
                        }
                        if (cout != null) {
                            cout.close();
                        }
                    }
                    catch (Throwable throwable3) {
                        throwable2 = throwable3;
                        throw throwable2;
                    }
                }
                finally {
                    if (fis != null) {
                        fis.close();
                    }
                }
                if (fis != null) {
                    fis.close();
                }
            }
            catch (Throwable throwable4) {
                throwable = throwable4;
                try {
                    throw throwable;
                }
                catch (Throwable e) {
                    e.printStackTrace();
                }
            }
        }
        
        public void decrypt() throws Exception {
            final byte[] k = "HignDlPs".getBytes();
            final SecretKeySpec key = new SecretKeySpec(k, this.algo.split("/")[0]);
            final Cipher decrypt = Cipher.getInstance(this.algo);
            decrypt.init(2, key);
            final FileInputStream fis = new FileInputStream(this.path);
            Throwable throwable = null;
            try {
                final CipherInputStream cin = new CipherInputStream(fis, decrypt);
                try {
                    Throwable throwable2 = null;
                    try {
                        final FileOutputStream fos = new FileOutputStream(this.path.substring(0, this.path.lastIndexOf(".")));
                        try {
                            this.copy(cin, fos);
                        }
                        finally {
                            if (fos != null) {
                                fos.close();
                            }
                        }
                        if (fos != null) {
                            fos.close();
                        }
                    }
                    catch (Throwable throwable3) {
                        throwable2 = throwable3;
                        throw throwable2;
                    }
                }
                finally {
                    if (cin != null) {
                        cin.close();
                    }
                }
                if (cin != null) {
                    cin.close();
                }
            }
            catch (Throwable throwable4) {
                throwable = throwable4;
                try {
                    throw throwable;
                }
                catch (Throwable e) {
                    e.printStackTrace();
                }
            }
        }
        
        private void copy(final InputStream is, final OutputStream os) throws Exception {
            final byte[] buf = new byte[4096];
            int read = 0;
            while ((read = is.read(buf)) != -1) {
                os.write(buf, 0, read);
            }
        }
    }
}

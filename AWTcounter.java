import java.awt.*;
import java.awt.event.*;
class AWTcounter extends Frame implements ActionListener{
    TextField tf;
    Button b1;
    Label l;
    AWTcounter(){
        tf=new TextField("0");
        tf.setBounds(70,30,100,30);
        b1=new Button("Count");
        b1.setBounds(180, 30, 50, 30);
        l=new Label("Counter");
        l.setBounds(20, 30, 40, 30);
        b1.addActionListener(this);
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
        add(b1);
        add(l);
        add(tf);
        setSize(300, 150);
        setTitle("AWT Counter");
        setLayout(null);
        setVisible(true);
    }
        public void actionPerformed(ActionEvent e){
            String s=tf.getText();
            int count=Integer.parseInt(s);
            String res=String.valueOf(count+1);
            tf.setText(res);
            }

        public static void main(String[] args) {
            new AWTcounter();
        }
    }

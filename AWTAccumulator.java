import java.awt.*;
import java.awt.event.*;
class AWTAccumulator extends Frame implements TextListener{
    TextField tf1,tf2;
    Label l1,l2;
    AWTAccumulator(){
        tf1=new TextField("0");
        tf1.setBounds(70,30,100,30);
        tf2=new TextField();
        tf2.setBounds(70,70,100,30);
        tf2.setEditable(false);
        l1=new Label("Enter an integer");
        l1.setBounds(20, 30, 40, 30);
        l2=new Label("Accumulated sum is");
        l2.setBounds(20, 70, 40, 30);
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
        add(l1);
        add(l2);
        add(tf1);
        add(tf2);
        setSize(300, 150);
        setTitle("AWT Accumulator");
        setLayout(null);
        setVisible(true);
    }
        public void actionPerformed(TextEvent e){
            String s=tf.getText();
            int count=Integer.parseInt(s);
            String res=String.valueOf(count+1);
            tf.setText(res);
            }

        public static void main(String[] args) {
            new AWTAccumulator();
        }
    }

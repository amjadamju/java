// import java.awt.*;
// import java.awt.event.*;

// public class LabelEg extends WindowAdapter {
//     Label lab1, lab2, lab3;

//     public LabelEg() {
//         Frame f = new Frame();
//         f.setLayout(new GridLayout(3, 1));
//         // try his program with and without this statement and with different layouts;
//         lab1 = new Label("Center aligned text", Label.CENTER);
//         lab2 = new Label("Left aligned text", Label.LEFT);
//         lab3 = new Label();
//         lab3.setText("Right aligned text");
//         lab3.setAlignment(Label.RIGHT);
//         f.add(lab1);
//         f.add(lab2);
//         f.add(lab3);
//         f.addWindowListener(new WindowAdapter() {
//             public void windowClosing(WindowEvent e) {
//                 System.out.println("Window Closing");
//                 f.dispose();
//             }
//         });
//         lab1.setBackground(Color.yellow);
//         lab1.setForeground(Color.blue);
//         System.out.println("lab1 text: " + lab1.getText());
//         System.out.println("lab1 alignment: " + lab1.getAlignment());
//         f.setTitle("Labels Do not Have Any Action");
//         f.setSize(450, 700);
//         f.setVisible(true);
//     }

//     public static void main(String args[]) {
//         new LabelEg();
//     }
// }

/*----------------------Java AWT Label Example with ActionListener-------------------*/

import java.awt.*;
import java.awt.event.*;

public class LabelEg extends Frame implements ActionListener {
    TextField tf;
    Label l;
    Button b;

    LabelEg() {
        tf = new TextField();
        tf.setBounds(50, 50, 150, 20);
        CloseMe cm = new CloseMe();
        addWindowListener(cm);
        l = new Label();
        l.setText(" After Clicking");
        l.setBounds(50, 100, 250, 20);
        b = new Button("Find IP");
        b.setBounds(50, 150, 60, 30);
        b.addActionListener(this);
        add(b);
        add(tf);
        add(l);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of " + host + " is: " + ip);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new LabelEg();
    }
}

class CloseMe extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
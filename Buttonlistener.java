// import java.awt.*;
// import java.awt.event.*;

// class Buttonlistener extends Frame implements ActionListener {
//     TextField tf;

//     Buttonlistener() {
//         // create components
//         tf = new TextField();
//         tf.setBounds(60, 50, 170, 20);
//         Button b = new Button("click me");
//         b.setBounds(100, 120, 80, 30);// register listener
//         b.addActionListener(this);// passing current instance
//         addWindowListener(new WindowAdapter() {
//             public void windowClosing(WindowEvent e) {
//                 System.out.println("Window Closing");
//                 dispose();
//             }
//         });
//         // add components and set size, layout and visibility
//         add(b);
//         add(tf);
//         setSize(300, 300);
//         setLayout(null);
//         setVisible(true);
//     }

//     public void actionPerformed(ActionEvent e) {
//         tf.setText("Welcome");
//     }

//     public static void main(String args[]) {
//         // create container
//         new Buttonlistener();
//     }
// }


      /*Java event handling by anonymous class */

import java.awt.*;
import java.awt.event.*;

class Buttonlistener extends Frame {
    TextField tf;

    Buttonlistener() {
        tf = new TextField();
        tf.setBounds(180, 50, 200, 30);
        Button b = new Button("click me");
        b.setBounds(50, 50, 80, 30);
        // register listener
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("hello");
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing");
                dispose();
            }
        });
        add(b);
        add(tf);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[]) {
        new Buttonlistener();
    }
}
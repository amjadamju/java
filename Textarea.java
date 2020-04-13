// import java.awt.*;
// import java.awt.event.*;

// public class Textarea extends KeyAdapter {
//     Label l;
//     TextArea area;
//     Frame f;

//     Textarea() {
//         f = new Frame("Key Adapter");
//         l = new Label();
//         l.setBounds(20, 50, 200, 20);
//         area = new TextArea();
//         area.setBounds(20, 80, 300, 300);
//         area.addKeyListener(this);
//         f.add(l);
//         f.add(area);
//         f.setSize(400, 400);
//         f.setLayout(null);
//         f.setVisible(true);
//         f.addWindowListener(new WindowAdapter() {
//             public void windowClosing(WindowEvent e) {
//                 System.out.println("Window Closing");
//                 f.dispose();
//             }
//         });
//     }

//     private void addWindowListener(WindowAdapter windowAdapter) {
//     }

//     public void keyReleased(KeyEvent e) {
//         String text = area.getText();
//         String words[] = text.split("\\s");
//         l.setText("Words: " + words.length + " Characters:" + text.length());
//     }

//     public static void main(String[] args) {
//         new Textarea();
//     }
// }

import java.awt.*;
import java.awt.event.*;

public class Textarea extends Frame implements ActionListener {
    Label l1, l2;
    TextArea area;
    Button b;

    Textarea() {
        l1 = new Label();
        l1.setBounds(50, 50, 100, 30);
        l2 = new Label();
        l2.setBounds(160, 50, 100, 30);
        area = new TextArea();
        area.setBounds(20, 100, 300, 300);
        b = new Button("Count Words");
        b.setBounds(100, 400, 100, 30);
        b.addActionListener(this);
        add(l1);
        add(l2);
        add(area);
        add(b);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing");
                dispose();
            }
        });
        setSize(400, 450);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String text = area.getText();
        String words[] = text.split("\\s");
        l1.setText("Words: " + words.length);
        l2.setText("Characters: " + text.length());
    }

    public static void main(String[] args) {
        new Textarea();
    }
}



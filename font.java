import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class font extends Frame {
    public font() {
        super("Java AWT Examples");
        prepareGUI();
    }

    public static void main(String[] args) {
        font awtGraphicsDemo = new font();
        awtGraphicsDemo.setVisible(true);
    }

    private void prepareGUI() {
        setSize(400, 400);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Font plainFont = new Font("Serif", Font.PLAIN, 24);
        g2.setFont(plainFont);
        g2.drawString(" How are you ?", 50, 70);
        Font italicFont = new Font("Serif", Font.ITALIC, 24);
        g2.setFont(italicFont);
        g2.drawString(" How are you ?", 50, 120);
        Font boldFont = new Font("Serif", Font.BOLD, 24);
        g2.setFont(boldFont);
        g2.drawString(" How are you ?", 50, 170);
        Font boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 24);
        g2.setFont(boldItalicFont);
        g2.drawString(" How are you ?", 50, 220);
        plainFont = new Font("TimesRoman", Font.PLAIN, 24);
        g2.setFont(plainFont);
        g2.drawString(" How are you ?", 50, 270);
        italicFont = new Font("Helvetica", Font.ITALIC, 24);
        g2.setFont(italicFont);
        g2.drawString(" How are you ?", 50, 320);
        boldFont = new Font("Courier", Font.BOLD, 24);
        g2.setFont(boldFont);
        g2.drawString(" How are you ?", 50, 370);
        boldItalicFont = new Font("Courier", Font.BOLD + Font.ITALIC, 24);
        g2.setFont(boldItalicFont);
        g2.drawString(" How are you ?", 50, 420);
    }
}
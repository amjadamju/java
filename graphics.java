import java.awt.*;
import java.awt.event.*;

public class graphics extends Frame {
    graphics() {
        setSize(600, 400);
        setTitle("My Application");
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.drawLine(20, 60, 80, 100);
        g.drawRect(100, 60, 80, 40);
        g.fillRect(200, 60, 80, 40);
        g.drawRoundRect(300, 60, 80, 40, 20, 20);
        g.fillRoundRect(400, 60, 80, 40, 20, 20);
        g.drawOval(20, 120, 80, 40);
        g.fillOval(120, 120, 80, 40);
        g.drawArc(220, 120, 80, 40, 90, -90);
        g.fillArc(320, 120, 80, 40, 90, -90);
        int[] x = { 20, 100, 80, 20 };
        int[] y = { 200, 180, 240, 260 };
        g.drawPolygon(x, y, 4);
        int[] fillx = { 120, 200, 180, 120 };
        int[] filly = { 200, 180, 240, 260 };
        g.fillPolygon(fillx, filly, 4);
    }

    public static void main(String[] args) {
        graphics mf = new graphics();
    }
}
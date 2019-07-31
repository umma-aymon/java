
import java.applet.Applet;
import java.awt.Graphics;

public class Monument extends Applet {

    public void paint(Graphics g) {
        g.drawLine(70, 10, 60, 100);
        g.drawLine(70, 10, 80, 100);
        g.drawLine(70, 20, 50, 100);
        g.drawLine(70, 20, 90, 100);
        g.drawLine(70, 30, 40, 100);
        g.drawLine(70, 30, 100, 100);
        g.drawLine(70, 40, 30, 100);
        g.drawLine(70, 40, 110, 100);
        g.drawLine(70, 50, 20, 100);
        g.drawLine(70, 50, 120, 100);
        g.drawLine(70, 60, 10, 100);
        g.drawLine(70, 60, 130, 100);
        g.drawLine(70, 70, 0, 100);
        g.drawLine(70, 70, 140, 100);
        g.drawLine(0, 100, 140, 100);
    }
}

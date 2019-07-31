
import java.awt.Color;
import java.applet.Applet;
import java.awt.Graphics;

public class ShohidMinar extends Applet {

    public void paint(Graphics g) {
        g.drawLine(90, 0, 90, 150);
        g.drawRect(10, 70, 20, 110);
        g.drawRect(40, 50, 20, 130);
        g.drawRect(70, 30, 20, 150);
        g.drawRect(90, 30, 20, 150);
        g.drawRect(120, 50, 20, 130);
        g.drawRect(150, 70, 20, 110);
        g.drawLine(60, 0, 120, 0);
        g.drawLine(60, 0, 70, 30);
        g.drawLine(120, 0, 110, 30);
        g.drawLine(0, 180, 180, 180);
        g.drawLine(0, 190, 180, 190);
        g.drawOval(65, 45, 50, 55);
        g.setColor(Color.red);
        g.fillOval(65, 45, 50, 55);

    }
}

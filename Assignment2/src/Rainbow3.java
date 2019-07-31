
import java.awt.*;
import java.applet.Applet;

public class Rainbow3 extends Applet {

    private Color skyColor = Color.CYAN;

    public Rainbow() {
        setBackground(skyColor); //Setting the background color to the skycolor
    }
   public void paint(Graphics g) {
        super.paint(g);
        int width = getWidth();    //Width is the width of the window
        int height = getHeight(); //Height is the height of the window

        // Declare and initialize local int variables xCenter, yCenter
        // that represent the center of the rainbow rings:
        //Setting the center to be half of the width, and 3/4ths of the height
        int xCenter = (int) (0.5 * width);
        int yCenter = (int) (0.75 * height);

        // Declare and initialize the radius of the large semicircle:
        //Radius is 1/4th of the width, so that the diameter(width) of the semicircle would be half of the width
        int radius = (int) ((double) width / 4);

        // Draw the large semicircle:
        g.setColor(Color.RED); //Setting the color to red
        int redRad = (int) (width / 4.0);
        g.fillArc(xCenter - redRad, yCenter - redRad, (int) redRad * 2, (int) (redRad * 2.0), 0, 180);
        //Using casting to make it more accurate when drawing the red circle

        // Declare and initialize the radii of the small and medium
        // semicircles and draw them:
        //Drawing the green semicircle (medium)
        g.setColor(Color.GREEN); //Setting the color to green
        int mean = (int) Math.round(Math.sqrt(radius * (height / 4)));
        /**
         * NOTE: I create the integer mean to shorten the next line of code, and
         * to make it easier to edit a part of the radius if it needs adjusting
         */

        //Drawing the semicircle
        g.fillArc(xCenter - mean, yCenter - mean, mean * 2, mean * 2, 0, 180);

        //Drawing the magenta semicircle (small)
        g.setColor(Color.MAGENTA); //Setting color to magenta
        g.fillArc((int) (xCenter - (height / 4.0)), (int) (yCenter - (height / 4.0)), height / 2, height / 2, 0, 180);
 g.setColor(skyColor); //Setting color to the skycolor
       // g.setColor(skyColor); //Setting color to the skycolor
        // Calculate the radius of the innermost (sky-color) semicircle
        // so that the width of the middle (green) ring is the
        // arithmetic mean of the widths of the red and magenta rings:
        int skyRad = (int) ((height / 4) - (Math.pow(mean - (height / 4), 2)) / ((width / 4) - mean));
        /**
         * Math.pow is bringing it to the power of 2 I am also setting the
         * radius to a variable for ease of use within the code
         */

        // Draw the sky-color semicircle:
        g.fillArc(xCenter - skyRad, yCenter - skyRad, skyRad * 2, skyRad * 2, 0, 180);

    }
}

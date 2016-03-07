import java.applet.Applet;
import java.awt.*;

/**
 * Created by raghav on 4/3/16.
 */
public class applets extends Applet {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Hello world!",40,30);
    }
}

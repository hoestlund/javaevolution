import java.awt.*;
import javax.swing.JFrame;

public class Mickey {

    public static void main(String[] args){
        GraphicsExperiment.firstJFrame();
        //mickey(); //I just want to make Mickey Mouse but I can't
    }

    public void boxOval(Graphics g, Rectangle bb) {
        g.fillOval(bb.x, bb.y, bb.width, bb.height);
    }

    public void mickey(Graphics g, Rectangle bb) {
        boxOval(g, bb);
        int dx = bb.width/2;
        int dy = bb.height/2;
        Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);
        half.translate(-dx/2, -dy/2);
        boxOval(g, half);
        half.translate(dx*2, 0);
        boxOval(g, half);
    }
}

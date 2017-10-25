import javax.swing.*;
import java.awt.*;

public class Flags extends Canvas {

    public static void makeFrame(){

        JFrame flagShaped = new JFrame();
        flagShaped.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the canvas
        Canvas canvas = new GraphicsExperiment();
        canvas.setSize(900, 500);
        flagShaped.getContentPane().add(canvas);

        //show the frame
        flagShaped.pack();
        flagShaped.setVisible(true);
    }

    public static void japan(Graphics g){
        makeFrame();

        g.setColor(Color.red);
        g.fillOval(350,150,200,200);

    }

}

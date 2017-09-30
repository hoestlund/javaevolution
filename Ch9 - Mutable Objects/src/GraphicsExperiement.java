import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class GraphicsExperiement extends Canvas{

    public static void firstjFrame(){
        // make the frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the canvas
        Canvas canvas = new GraphicsExperiement();
        canvas.setSize(900, 900);
        frame.getContentPane().add(canvas);

        //show the frame
        frame.pack();
        frame.setVisible(true);



    }
    public void paint(Graphics g){
        // draw a circle
        g.fillOval(100, 100, 200, 200);
    }
}

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class EnvelopeStar {

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/envelope-star/r2.png]

    graphics.drawLine(WIDTH/2, 0, WIDTH/2 , HEIGHT);
    graphics.drawLine(0, HEIGHT/2, WIDTH, HEIGHT/2);

    for (int i = 0; i < WIDTH/2 ; i += 10) {
      graphics.setColor(Color.RED);

      graphics.drawLine(i, HEIGHT/2, WIDTH/2, HEIGHT/2 + i);
      graphics.drawLine(WIDTH/2, i, WIDTH/2 + i, HEIGHT/2);
      graphics.drawLine(WIDTH/2, i,WIDTH/2 - i, HEIGHT/2);
      graphics.drawLine(WIDTH-i, HEIGHT/2,WIDTH/2, HEIGHT/2 + i);
    }
  }

  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}

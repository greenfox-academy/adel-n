import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  int testBoxX;
  int testBoxY;

  public Board() {
    testBoxX = 0;
    testBoxY = 0;
    Character character = new Character();
    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.
    Map map = new Map();
    map.getMap("map.txt", graphics);

    Character character = new Character("hero-down.png", testBoxX, testBoxY);
    character.draw(graphics);

    //graphics.fillRect(testBoxX, testBoxY, 72, 72);


  }

  public static void main(String[] args) {
    // Here is how you set up a new window and adding our board to it
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    // Here is how you can add a key event listener
    // The board object will be notified when hitting any key
    // with the system calling one of the below 3 methods
    frame.addKeyListener(board);
    // Notice (at the top) that we can only do this
    // because this Board class (the type of the board object) is also a KeyListener

  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {


  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      //character.moveCharacter(Character.Directions.UP);
      testBoxY = testBoxY - 72;
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      //character.moveCharacter(Character.Directions.DOWN);
      testBoxY = testBoxY + 72;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      //character.moveCharacter(Character.Directions.LEFT);
      testBoxX -= 72;
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      //character.moveCharacter(Character.Directions.RIGHT);
      testBoxX += 72;
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}

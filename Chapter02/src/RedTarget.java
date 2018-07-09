
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RedTarget extends JPanel
{  
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                            //   to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    g.setColor(Color.RED);
    g.fillOval(xCenter - 50, yCenter - 50, 100, 100);
    g.setColor(Color.WHITE);
    g.fillOval(xCenter - 30, yCenter - 30, 60, 60);
    g.setColor(Color.RED);
    g.fillOval(xCenter - 10, yCenter - 10, 20, 20);
  }

 
  public static void main(String[] args)
  {
    JFrame window = new JFrame("Red Target");
    window.setBounds(300, 300, 200, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    RedTarget panel = new RedTarget();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true); 
  }
}

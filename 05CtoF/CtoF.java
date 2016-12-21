import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Window2 extends JFrame {
 private Container pane;

 private JButton b1;
 private JLabel l;
 private JTextField t;
 private JButton b2;
 
  //CONSTRUCTOR SETS EVERYTHING UP
  public Window2() {
     this.setTitle("Celcius/Fahrenheit");
     this.setSize(600,400);
     this.setLocation(100,100);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
     pane = this.getContentPane();
     pane.setLayout(new FlowLayout());  //NOTE!! THIS CAN BE CHANGED (see below)
    
     b1 = new JButton("FtoC");
     b2 = new JButton("CtoF");
     l = new JLabel("Result");
     t = new JTextField(24);
     pane.add(t);
     pane.add(b1);
     pane.add(b2)
     pane.add(l);
 }

  //MAIN JUST INSTANTIATES + MAKE VISIBLE
  public static void main(String[] args) {
     Window2 g = new Window2();
     g.setVisible(true);
  }
}

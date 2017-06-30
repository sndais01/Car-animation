package assignment.pkg04;
import javax.swing.JFrame;

/*@author sndais01*/
public class Car {
     public static void main(String[] args){
        JFrame frame = new JFrame("Vroom Vroom 2.0");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new CarPannel());
        frame.pack();
        frame.setVisible(true);
    }
}

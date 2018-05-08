import javafx.beans.binding.When;
import sun.applet.Main;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Boss extends JLabel {
    static JLabel Boss = new JLabel();
    public static ImageIcon Rest = new ImageIcon("Resources/Devitto(Wrath).gif");
    public static ImageIcon Test = new ImageIcon("Resources/Main_Resting.gif");
    public static ImageIcon Bullet = new ImageIcon("Resources/Bullet.gif");
    public static ImageIcon Shield = new ImageIcon("Resources/Main_Shield.gif");


    public Boss(){

        Boss.setHorizontalAlignment(JLabel.CENTER);
        Boss.setVerticalAlignment(JLabel.BOTTOM);
        Boss.setSize(700,700);
        Boss.setIcon(Rest);
        Boss.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width-600, Toolkit.getDefaultToolkit().getScreenSize().height-700);
        Border border = BorderFactory.createLineBorder(Color.RED, 5);
        //MainCharRest.setBorder(border);




    }
    public static void Jump(){
        /*System.out.println("DICKS");
        if(Game.window.ke)
        for(int i = 3; i >= 0; i--){
            Game.VELY = -(i*i);
        }*/
        Timer t = new Timer(3,new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int i = 3; i >= 0; i--){
                    Game.VELY = -(i^2);
                }
            }
        });

    }
}

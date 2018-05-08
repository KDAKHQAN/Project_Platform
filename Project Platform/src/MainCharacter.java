import javafx.beans.binding.When;
import sun.applet.Main;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainCharacter extends JLabel {
    static JLabel MainCharRest = new JLabel();
    public static ImageIcon Run = new ImageIcon("Resources/Main_Running.gif");
    public static ImageIcon Test = new ImageIcon("Resources/Main_Resting.gif");
    public static ImageIcon Bullet = new ImageIcon("Resources/Bullet.gif");
    public static ImageIcon Shield = new ImageIcon("Resources/Main_Shield.gif");


    int VELWHY = -3;
    public MainCharacter(){

        MainCharRest.setHorizontalAlignment(JLabel.CENTER);
        MainCharRest.setVerticalAlignment(JLabel.BOTTOM);
        MainCharRest.setSize(200,200);
       // ImageIcon Test = new ImageIcon("Resources/Main_Resting.gif");
        MainCharRest.setIcon(Test);
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

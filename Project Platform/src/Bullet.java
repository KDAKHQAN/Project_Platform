import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Bullet extends JLabel {
    static ImageIcon BulletGIF = new ImageIcon("Resources/Bullet.gif");
    static JLabel Bullet = new JLabel();
    static int VELX = 2;
    public Bullet(){

        Bullet.setSize(100,50);
        Bullet.setIcon(BulletGIF);
        Bullet.setLocation((int)MainCharacter.MainCharRest.getLocation().getX()+50,(int)MainCharacter.MainCharRest.getLocation().getY()+ 125);
        Bullet.setHorizontalAlignment(CENTER);
        Bullet.setVerticalAlignment(CENTER);
        Game.window.add(Bullet);
        Border border = BorderFactory.createLineBorder(Color.RED, 5);
        //Bullet.setBorder(border);
    }
    public static void Shoot(){
        Bullet.setLocation(Bullet.getLocation().x+VELX, Bullet.getY());
    }

}

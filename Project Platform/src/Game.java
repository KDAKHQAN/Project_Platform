import sun.applet.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game {
    static MainCharacter Player = new MainCharacter();
    static Boss Shaq = new Boss();
    static JFrame window = new JFrame("Project Platform");
    int VEL = 0;
    static int VELY = 1;
    boolean IDRK;

    Game() {
        Timer g = new Timer(3,new ActionListener() {
            int dick;
            public void actionPerformed(ActionEvent e) {
                for(int i = 0; i >0; i++){
                    dick = -(i^2);
                }
                VELY=dick;
            }
        });
        Timer t = new Timer(3, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Player.MainCharRest.setLocation(Player.MainCharRest.getLocation().x + VEL, Player.MainCharRest.getLocation().y + VELY);
                Loop();
                Gravity();
                Bullet.Shoot();
                //MainCharacter.Jump();
            }
        });
        t.start();
        //JLabel MainCharacter = new JLabel("");
        //MainCharacter.setSize(200,200);

        //window.setContentPane(new GamePanel());
        //window.getContentPane().setBackground(Color.BLACK);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        window.setResizable(false);
        window.setLayout(null);
        window.setUndecorated(true);
        window.setVisible(true);
        window.add(Shaq.Boss);
        window.add(this.Player.MainCharRest);
        KeyListener PlayerAction = new KeyListener() {
            public void keyPressed(KeyEvent e) {

                int code = e.getKeyCode();
                if (code == KeyEvent.VK_RIGHT) {
                    VEL = 1;
                    Player.MainCharRest.setIcon(MainCharacter.Run);
                    System.out.println(MainCharacter.MainCharRest.getLocation().x);
                    Loop();
                }

                if (code == KeyEvent.VK_LEFT) {
                    VEL = -1;
                    Player.MainCharRest.setIcon(MainCharacter.Run);
                    System.out.println("gg");
                    Loop();
                }
                //if (code == KeyEvent.VK_SPACE) {
                  //  MainCharacter.MainCharRest.setOpaque(false);
                   // t.stop();
                   // GameOver.setHorizontalAlignment(SwingConstants.CENTER);
                   // GameOver.setOpaque(true);

                //}

                if (code == KeyEvent.VK_DOWN) {
                    VEL=0;
                    Player.MainCharRest.setIcon(MainCharacter.Shield);
                    code = KeyEvent.VK_DOWN;

                }
                if (code == KeyEvent.VK_X) {
                    new Bullet();
                    System.out.println(MainCharacter.MainCharRest.getLocation().x);
                }
            }

            public void keyReleased(KeyEvent e) {
                VEL = 0;
                //g.stop();
                Gravity();
                if (e.getKeyCode() == 27) {
                    return;
                }
                Player.MainCharRest.setHorizontalAlignment(JLabel.CENTER);
                Player.MainCharRest.setIcon(MainCharacter.Test);

            }

            public void keyTyped(KeyEvent e) {
            }
        };
        window.addKeyListener(PlayerAction);

    }

    public static void Loop() {
        if (MainCharacter.MainCharRest.getLocation().x > window.getSize().width) {
            MainCharacter.MainCharRest.setLocation(-150, MainCharacter.MainCharRest.getY());
            System.out.println("KK");
        }
    }

    public void Gravity() {
        VELY=1;
        if (MainCharacter.MainCharRest.getY() == window.getSize().height - MainCharacter.MainCharRest.getSize().height) {
            VELY = 0;
        }

    }


    public static void main(String[] args) {
        new Game();
        System.out.println(Player.MainCharRest.getSize());
        System.out.println(MainCharacter.Test.getIconWidth());

    }
}


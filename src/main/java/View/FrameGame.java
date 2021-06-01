package View;

import javax.swing.*;
import java.awt.*;

public class FrameGame extends JFrame {



    public FrameGame(PanelGame panel) {

        //definit le titre de la fenetre
        this.setTitle("GAME BREAKER");

        //definit la taille de la fenetre
        this.setSize(700, 600);

        ///Termine le processus lorsqu'on clique sur la croix rouge
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //positionne notre fenetre au milieu
        this.setLocationRelativeTo(null);

        //la fenetre n est pas redimentionnable
        this.setResizable(false);


        //    //On prévient notre JFrame que notre JPanel sera son content pane
        this.setContentPane(panel);

        //rend notre fenetre visible
        this.setVisible(true);


        //la fenetre est toujours visible
        this.setAlwaysOnTop(true);


        //le controleur intercepte les evenement de la souris sur la fenetre
        //this.addMouseListener(cont);

        //le controleur intercepte les evenement du claviers sur la fenetre
        //this.addKeyListener(cont);


    }
}

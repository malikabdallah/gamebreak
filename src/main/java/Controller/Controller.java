package Controller;

import Model.GameManager;
import View.FrameGame;
import View.PanelGame;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener {


    FrameGame frame;
    PanelGame panel;
    GameManager gameManager;

    public Controller() {

        frame=new FrameGame(new PanelGame());

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

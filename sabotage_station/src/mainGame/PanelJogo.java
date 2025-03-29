package mainGame;

import javax.swing.JPanel;

import LevelLoader.LevelLoader;

import java.awt.Graphics;

public class PanelJogo extends JPanel {

    public PanelJogo() {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        LevelLoader.desenharObjetos(g);
    }
}
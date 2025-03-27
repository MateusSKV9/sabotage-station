package objsTemp;

import java.awt.Color;
import java.awt.Graphics;

import java.awt.image.BufferedImage;

public abstract class Objeto {
    int x, y;
    Color corTemp;
    BufferedImage img;
    /*
     * add outros parametros:
     * Imagempath
     * Colisão
     * Efeito (instakill ou não)
     * Ativo/desativo (booleano)
     */

    public Objeto(int x, int y, BufferedImage img, Color corTemp) {
        this.x = x;
        this.y = y;
        this.img = img;
        this.corTemp = corTemp;
    }

    public void desenhar(Graphics g) {
        if (img != null) {
            g.drawImage(img, x, y, 50, 50, null);
        } else {
            g.setColor(corTemp);
            g.fillRect(x, y, 50, 50); // Desenha um quadrado de 50x50
        }
    }
}
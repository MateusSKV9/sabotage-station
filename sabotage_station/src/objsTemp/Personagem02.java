package objsTemp;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Personagem02 {

    private int x, y;
    private int largura = 50, altura = 50;
    private BufferedImage sprite;

    public Personagem02(int x, int y) {
        this.x = x;
        this.y = y;
        carregarImagem();
    }

    private void carregarImagem() {
        try {
            sprite = ImageIO.read(getClass().getResource("/assets/player.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void desenhar(Graphics g) {
        if (sprite != null) {
            g.drawImage(sprite, x, y, largura, altura, null);
        } else {
            g.setColor(Color.RED);
            g.fillRect(x, y, largura, altura); // fallback se a imagem não carregar
        }
    }

    // Getters e setters se precisar
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void mover(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}
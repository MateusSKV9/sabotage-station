package levelLoader;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

import objsTemp.Objeto;

import java.util.ArrayList;

public class LevelLoader {

    static ArrayList<Objeto> objs = new ArrayList<>();

    public static void criarObj(String tipo, int x, int y) {
        switch (tipo) {
            case "Barreira":
                objs.add(new Barreira(x, y));
                break;
            case "Laser":
                objs.add(new Laser(x, y));
                break;
            case "Pistao":
                objs.add(new Pistao(x, y));
                break;
            case "Porta":
                objs.add(new Porta(x, y));
                break;

        }
    }

    public static void main(String[] args) {

        // carrega img da fase
        BufferedImage img = ImageIO.read(new File("fase.png"));

        int T_SIZE = 50;
        int lin = img.getHeight() / T_SIZE;
        int col = img.getWidth() / T_SIZE;

        for (int y = 0; y < lin; y++) {
            for (int x = 0; x < col; x++) {

                // Pegar a cor do CENTRO do tile
                int px = (x * T_SIZE) + (T_SIZE / 2);
                int py = (y * T_SIZE) + (T_SIZE / 2);

                // Pega a cor do pixel
                Color color = new Color(img.getRGB(px, py));

                String obj = corToObj(color);
            }
        }

    }

    // Relacionar a cor com um objeto
    public static String corToObj(Color color) {
        // PRETO = VAZIO
        if (color.equals(new Color(0, 0, 0))) {
            return "Vazio";
            // AZUL = BARREIRA/PCHÃO/PAREDE
        } else if (color.equals(new Color(0, 0, 225))) {
            return "Barreira";
            // VERMELHO = LASER
        } else if (color.equals(new Color(225, 0, 0))) {
            return "Laser";
            // VERDE = PISTÃO
        } else if (color.equals(new Color(0, 225, 0))) {
            return "Pistão";
            // AMARELO = PORTA
        } else if (color.equals(new Color(225, 225, 0))) {
            return "Porta";
        }
        // Fora desse espectro não existe
        return "NE";
    }

}
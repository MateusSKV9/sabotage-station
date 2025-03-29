package LevelLoader;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import objsTemp.*;

import java.util.ArrayList;

public class LevelLoader {

    static ArrayList<Objeto> objCriado = new ArrayList<>();

    public static void criarObj(String tipo, int x, int y) {
        switch (tipo) {
            case "Barreira":
                objCriado.add(new Barreira(x, y));
                break;
            case "Laser":
                objCriado.add(new Laser(x, y));
                break;
            case "Pistao":
                objCriado.add(new Pistao(x, y));
                break;
            case "Porta":
                objCriado.add(new Porta(x, y));
                break;
        }
    }

    public static void desenharObjetos(Graphics g) {
        for (Objeto obj : objCriado) {
            obj.desenhar(g);
        }
    }

    public static void main(String[] args) {

        // carrega img da fase
        BufferedImage img = null;
        try {
            // usando ClassLoader pq dava erro sem
            img = ImageIO.read(LevelLoader.class.getResource("/assets/fases/fase.png"));
        } catch (IOException e) {
            System.out.println("Erro ao carregar imagem: " + e.getMessage());
            e.printStackTrace();
        }

        int T_SIZE = 50;
        int lin = img.getHeight() / T_SIZE;
        int col = img.getWidth() / T_SIZE;

        for (int y = 0; y < lin; y++) {
            for (int x = 0; x < col; x++) {

                // Pegar a cor do C E NTRO do t i le
                int px = (x * T_SIZE) + (T_SIZE / 2);
                int py = (y * T_SIZE) + (T_SIZE / 2);

                // Pega a cor do pixel
                Color color = new Color(img.getRGB(px, py));

                String obj = corToObj(color);
                if (!obj.equals("Vazio")) {
                    criarObj(obj, x * T_SIZE, y * T_SIZE);
                }
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
            return "Pistao";
            // AMARELO = PORTA
        } else if (color.equals(new Color(225, 225, 0))) {
            return "Porta";
        }
        // Fora desse espectro não existe
        return "NE";
    }

}
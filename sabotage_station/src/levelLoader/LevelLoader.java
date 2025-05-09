package levelLoader;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import objsTemp.*;

import java.util.ArrayList;

public class LevelLoader {

    // public static FASE_UM = "/assets/fases/fase1.png";

    static ArrayList<Objeto> objCriado = new ArrayList<>();

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

                // envia a cor e coordenada
                criarObjPorCor(color, x * T_SIZE, y * T_SIZE);
            }
        }

    }

    // Relacionar a cor com um objeto
    public static void criarObjPorCor(Color color, int x, int y) {
        // PRETO = VAZIO
        if (color.equals(new Color(0, 0, 0))) {
            return;
            // AZUL = BARREIRA(CHAO, PAREDE, PLATAFORMA)
        } else if (color.equals(new Color(0, 0, 225))) {
            objCriado.add(new Barreira(x, y));
            // VERMELHO = LASER
        } else if (color.equals(new Color(225, 0, 0))) {
            objCriado.add(new Laser(x, y));
        } else if (color.equals(new Color(0, 225, 0))) {
            // VERDE = PISTAO
            objCriado.add(new Pistao(x, y));
            // AMARELO = PORTA
        } else if (color.equals(new Color(225, 225, 0))) {
            objCriado.add(new Porta(x, y));
        }
    }

}
/*
 * public static int[][] getLevelData{
 * //array dos objetos
 * int[][] lvlData = new int[PanelJogo.T_AlturaTela][PanelJogo.T_LarguraTela];
 * //imagem q vai receber
 * BufferedImage img = FASE_UM
 * 
 * for(int j=0. j<img.getHeight(); j++){
 * for(int i=0; i<img.getWidth(); i++){
 * Color color = new Color(img.getRGB(i, j));
 * 
 * int value = color.getRed();
 * if(value>=48){ //se o valor for maior que o tamanho da iamgem, ele nao existe
 * value = 0;
 * }
 * lvlData[j][i] = value;
 * }
 * return lvlData;
 * }
 * 
 * }
 * 
 */
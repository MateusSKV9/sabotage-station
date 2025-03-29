package controllers;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import mainGame.PanelJogo;
import visual.levels.Level;

public class ControllerLevel {

    private PanelJogo panelJogo;
    private BufferedImage levelSprite;
    private Level level_01;

    public ControllerLevel(PanelJogo panelJogo) {
        this.panelJogo = panelJogo;
        // levelSprite = fazer lógica para passar o numero da fase como um parametro
        // importarSprites();

        // level_01 = new Level(LoadSave.GetLevelData());
    }

    /*
     * ----> esse é um metodo feito no tutorial, onde ele puxava os sprites de uma
     * img com todos de uma vez e guarda em um array. Vamos fazer uma pasta com os
     * sprites separadamente e colocar cada um em um valor de array tambem. Ou
     * TALVEZ buscar juntar os sprites coletados em uma imagem manualmente e usar o
     * mesmo código do jeito que está para isso.
     * 
     * private void importarSprites() {
     * BufferedImage img = pathImagemComVariosSpritesDeUmaVez;
     * levelSprite = new BufferedImage[48];
     * for (int j = 0; i < 4; j++) {
     * for (int i = 0; i < 12; i++) {
     * int index = j * 12 + i;
     * levelSprite[index = img.getSubImage(i*32, i*32, 32, 32)]
     * }
     * }
     * }
     */

    /* 
    public void draw(Graphics g) {
 // isso vai puxar e mostrar um sprite especifico do codigo acima
 
 for (int j = 0; j < PanelJogo.T_AlturaTela; j++) {
    for (int i = 0; i < PanelJogo.T_LarguraTela; i++) {
                int index = level_01.getSpriteIndex(i, j);
                g.drawImage(levelSprite[index], JogoPanel.T_SIZE * i, JogoPanel.T_SIZE * j, JogoPanel.T_SIZE, JogoPanel.T_SIZE, null);
            }
        }
        
    }
*/

    public void update() {

    }
}

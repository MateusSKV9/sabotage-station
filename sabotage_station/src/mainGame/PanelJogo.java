package mainGame;

import javax.swing.JPanel;
import java.awt.Graphics;

import controllers.ControllerLevel;
import objsTemp.Personagem;

public class PanelJogo extends JPanel {

    // private GameThread
    // private Player player;
    private Personagem player;

    private ControllerLevel controllerLevel;

    public PanelJogo() {

        // foco automático para o player quando exibir o painel (TECLADO)
        addHierarchyListener(e -> {
            if (isShowing()) {
                player.requestFocusInWindow();
            }
        });

        player = new Personagem();
        add(player);

        // player.requestFocusInWindow();
        // setFocusable(true);
        // requestFocusInWindow();
    }

    /*
     * public void paintComponent(Graphics g) {
     * super.paintComponent(g);
     * LevelLoader.desenharObjetos(g);
     * }
     */

    /*
     * metodo initClasses(){
     * player = new Player(200, 200, (int)(64*T_SIZE), (int)(40/T_SIZE));
     * controllerLevel = new ControllerLevel(this);
     * }
     * 
     * public void update(){
     * player.update();
     * controllerLevel.update();
     * }
     * 
     * public void render(){
     * player.render();
     * controllerLevel.draw(g);
     * }
     */
}
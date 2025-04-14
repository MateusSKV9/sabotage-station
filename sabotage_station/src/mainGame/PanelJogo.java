package mainGame;

import javax.swing.JPanel;
import java.awt.Graphics;

import controllers.ControllerLevel;
import objsTemp.Personagem;

import visual.levels.AbstractLevel;

import visual.levels.Level01;
import visual.levels.Level02;
import visual.levels.Level03;

public class PanelJogo extends JPanel {

    // private GameThread
    private Personagem player;
    private ControllerLevel controllerLevel;

    public PanelJogo() {

        setLayout(null);

        // ESCOLHER O LEVEL
        AbstractLevel level;
        int numeroFase = 1; // Valor Default vai ser na primeira fase
        switch (numeroFase) {
            case 2:
                level = new Level02();
                break;
            case 3:
                level = new Level03();
                break;
            default:
                level = new Level01();
                break;
        }

        controllerLevel = new ControllerLevel(this, level);

        player = new Personagem();
        add(player);
        // foco automático para o player quando exibir o painel (TECLADO)
        addHierarchyListener(e -> {
            if (isShowing()) {
                player.requestFocusInWindow();
            }
        });
        // player.requestFocusInWindow();
        // setFocusable(true);
        // requestFocusInWindow();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (controllerLevel != null) {
            controllerLevel.draw(g); // desenha objetos do mapa
        }
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

package mainGame;

import visual.Frame;

public class Principal {
    private Frame frame;

    private PanelJogo panelJogo;

    public Principal() {
        panelJogo = new PanelJogo();
        frame = new Frame(panelJogo);
    }
}
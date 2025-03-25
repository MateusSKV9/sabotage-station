package visual;

import java.awt.Color;
import javax.swing.JFrame;
import mainGame.PanelJogo;

public class Frame extends JFrame {
	public Frame(PanelJogo panelJogo) {
		getContentPane().setBackground(new Color(0, 0, 0));
		this.setSize(800, 800);
		this.setContentPane(panelJogo);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}

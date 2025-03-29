package visual;

import java.awt.Color;
import javax.swing.JFrame;
import mainGame.PanelJogo;

//vai atualizar a janela cm o painel recebido, independente do inicial
public class Frame extends JFrame {
	public Frame(javax.swing.JPanel panel) {
		getContentPane().setBackground(new Color(0, 0, 0));
		this.setSize(800, 800);
		this.setContentPane(panel);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}

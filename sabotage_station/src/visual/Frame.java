package visual;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import mainGame.PanelJogo;

//vai atualizar a janela cm o painel recebido, independente do inicial
public class Frame extends JFrame {
	public Frame(javax.swing.JPanel panel) {
		getContentPane().setBackground(new Color(0, 0, 0));
		this.setSize(1000, 500);
		this.setContentPane(panel);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		// GARANTIR QUE QQR PANEL ENCAIXE 100%
		panel.setPreferredSize(new Dimension(1000, 500));
		this.pack();

	}

}

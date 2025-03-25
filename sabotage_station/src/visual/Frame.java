package visual;

import java.awt.Color;

import javax.swing.JFrame;

public class Frame extends JFrame {
	public Frame() {
		getContentPane().setBackground(new Color(0, 0, 0));
		this.setSize(800, 800);
		this.setVisible(true);
		getContentPane().setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}

package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import mainGame.PanelJogo;
import visual.Frame;
import visual.PanelStart;

public class ControllerFrame implements ActionListener {
	Frame frame;
	PanelStart panelStart;
	PanelJogo panelJogo;
	ControllerStart controllerStart;

	public ControllerFrame() {
		panelStart = new PanelStart();
		frame = new Frame(panelStart);

		controllerStart = new ControllerStart(panelStart, frame);
		frame.setContentPane(panelStart);

		frame.revalidate();
		frame.repaint();
	}

	public static void main(String[] args) {
		new ControllerFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// trocar panel qnd clica no botao
		if (e.getSource() == panelStart.getBtnStart()) {
			panelJogo = new PanelJogo();
			frame.setContentPane(panelJogo);

			frame.revalidate();
			frame.repaint();
		}
	}
}

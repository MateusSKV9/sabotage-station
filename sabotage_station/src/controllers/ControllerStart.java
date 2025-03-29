package controllers;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.PanelStart;

public class ControllerStart implements ActionListener {
	Frame frame;
	PanelStart panelStart;
	ControllerFrame controllerFrame;

	public ControllerStart(PanelStart panelStart, Frame frame) {
		this.frame = frame;
		this.panelStart = panelStart;
		this.controllerFrame = controllerFrame;
		addEventos();
	}

	private void addEventos() {
		panelStart.getBtnStart().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == panelStart.getBtnStart()) {
			controllerFrame.actionPerformed(e);
			frame.revalidate();
			frame.repaint();
		}

	}
}

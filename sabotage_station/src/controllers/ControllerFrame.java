package controllers;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import visual.Frame;
import visual.PanelStart;

public class ControllerFrame implements ActionListener {
	Frame frame; 
	PanelStart panelStart;
	ControllerStart controllerStart;
	
	public ControllerFrame() {
		frame = new Frame();
		panelStart = new PanelStart();
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
		// TODO Auto-generated method stub
	}
}

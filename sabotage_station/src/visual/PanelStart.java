package visual;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class PanelStart extends JPanel {

	private JButton btnStart;
	
	public PanelStart() {
		setLayout(null);
		add(getBtnStart());
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setIcon(new ImageIcon(PanelStart.class.getResource("/assets/sabotage-station-img-800.jpg")));
		lblNewLabel.setBounds(0, 0, 800, 800);
		add(lblNewLabel);
	}
	
	
	public JButton getBtnStart() {
		if (btnStart == null) {
			btnStart = new JButton();
			btnStart.setBounds(319, 375, 161, 49);
			btnStart.setText("ENTRAR");
			btnStart.setForeground(new Color(251, 0, 0));
			btnStart.setFont(new Font("JetBrains Mono ExtraBold", Font.PLAIN, 30));
		}
		return btnStart;
	}
}



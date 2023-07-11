package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPanelDraw extends JPanel {

	public JPanelDraw() {
		this.setBackground(Color.LIGHT_GRAY);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.drawLine(10, 10, 150, 10);

		g.setColor(Color.ORANGE);
		g.drawRect(10, 100, 150, 100);

		g.setColor(Color.BLUE);
		g.drawOval(10, 300, 150, 150);

		g.setColor(Color.GREEN);
		g.fillRect(300, 100, 150, 100);

		g.setColor(Color.YELLOW);
		g.fillOval(300, 300, 150, 150);

		g.setColor(Color.CYAN);
		Font font = new Font("Arial", Font.BOLD, 20);
		g.setFont(font);
		g.drawString("Hello every body", 300, 30);

	}
}

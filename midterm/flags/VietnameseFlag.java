package midterm.flags;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class VietnameseFlag extends JPanel {
	public VietnameseFlag() {
		setBackground(new Color(218, 37, 29));
	}
	@Override
	public void paintComponent(Graphics graphics2D) {
		super.paintComponent(graphics2D);
		Graphics2D g = (Graphics2D) graphics2D;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		int width = getWidth();
		int height = getHeight();
		double starRadius = 50;
		double centerX = width / 2.0;
		double centerY = height / 2.0;
		Shape shape = createDefaultStar(starRadius, centerX, centerY);
		g.setColor(new Color(255, 255, 0));
		g.fill(shape);
	}
	public Path2D createDefaultStar(double radius, double centerX, double centerY) {
		return null;
	}
	
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Vietnamese Flag");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(750, 600);
		jFrame.add(new VietnameseFlag());
		jFrame.setVisible(true);
	}
}

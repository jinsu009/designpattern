package ch22;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawCanvas extends Canvas implements Drawable {

	private Color color = Color.blue;
	private int radius = 6;
	private MacroCommand history;
	public DrawCanvas(int width, int height, MacroCommand history) {
		setSize(width, height);
		setBackground(Color.white);
		this.history = history;
	}
	
	public void paint(Graphics g) {
		history.execute();
	}
	
	@Override
	public void draw(int x, int y) {
		// TODO Auto-generated method stub
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(x-radius, y-radius, radius*2, radius*2);
	}

}

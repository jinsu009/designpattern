package ch22;


import java.awt.Point;

public class DrawCommand implements Command{

	protected Drawable drawable;
	
	private Point position;
	
	// 생성자 
	public  DrawCommand(Drawable drawable, Point position) {
		this.drawable = drawable;
		this.position = position;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		drawable.draw(position.x, position.y);
	}

}

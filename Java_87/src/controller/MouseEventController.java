package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import view.MouseEventView;

public class MouseEventController implements MouseListener, MouseMotionListener {

	private MouseEventView mouseEventView;

	public MouseEventController(MouseEventView mouseEventView) {
		this.mouseEventView = mouseEventView;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.mouseEventView.addClick();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.mouseEventView.enter();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		this.mouseEventView.exit();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		this.mouseEventView.updatePosition(x, y);
	}

}

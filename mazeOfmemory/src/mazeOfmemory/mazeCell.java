package mazeOfmemory;

public class mazeCell {
	private boolean up;
	private boolean down;
	private boolean left;
	private boolean right;
	
	public mazeCell() {
		// TODO Auto-generated constructor stub
		up=true;
		down=true;
		left=true;
		right=true;
	}
	
	public boolean canGoUp() {
		return up;
	}
	public void setUp(boolean up) {
		this.up = up;
	}
	public boolean canGoDown() {
		return down;
	}
	public void setDown(boolean down) {
		this.down = down;
	}
	public boolean canGoLeft() {
		return left;
	}
	public void setLeft(boolean left) {
		this.left = left;
	}
	public boolean canGoRight() {
		return right;
	}
	public void setRight(boolean right) {
		this.right = right;
	}

}

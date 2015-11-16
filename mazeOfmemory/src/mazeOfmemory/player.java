package mazeOfmemory;

public class player {

	private int _xlocation;
	private int _ylocation;
	private int _moveCount;
	
	
	public player(){
		this._xlocation = 0;
		this._ylocation = 0;
	}
	public player(int x,int y){
		set_xlocation(x);
		set_ylocation(y);
	}
	public int get_xlocation() {
		return _xlocation;
	}
	
	public void set_xlocation(int _xlocation) {
		this._xlocation = _xlocation;
	}
	public int get_ylocation() {
		return _ylocation;
	}
	public void set_ylocation(int _ylocation) {
		this._ylocation = _ylocation;
	}
	
	public int get_moveCount(){
		return _moveCount;
	}
	
	public void increaseMoveCount(){
		_moveCount++;
	}
	
	
	public boolean moveLeft(){
		//로케이션이 7을 넘으면(판을 넘어가면 안돼)
		this._xlocation--;
		if(this._xlocation<0){outOfBoundary();return false;}
		return true;
	}
	public boolean moveRight(){
		this._xlocation++;
		if(this._xlocation>6){outOfBoundary();return false;}
		return true;
	}
	public boolean moveUp(){
		this._ylocation++;
		if(this._ylocation>6){outOfBoundary();return false;}
		return true;
	}
	public boolean moveDown(){
		this._ylocation--;
		if(this._ylocation<0){outOfBoundary();return false;}
		return true;

	}
	
	public void moveFailed(){
		set_xlocation(0);
		set_ylocation(0);
	}
	
	
	//메소드는 필요하지만, 지금 당장 별다른 메세지를 출력할 필요는 없을 것 같아서 비워뒀어요~
	private void outOfBoundary(){
		
	}


}

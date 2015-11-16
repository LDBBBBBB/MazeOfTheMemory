package mazeOfmemory;

import java.util.Scanner;

import javax.swing.plaf.metal.MetalBorders.Flush3DBorder;

public class AppController {


	private player user1;
	private player user2;
	private mazeBoard1 board1;
	private mazeBoard2 board2;
	Scanner _Scanner = new Scanner(System.in);

	final int user1home=1;
	final int user2home=2;

	public AppController() {
		// TODO Auto-generated constructor stub
	}

	private int playstart(){
		System.out.println("플레이를 시작하겠습니다. 1.싱글 2.배틀 3.게임방법설명");
		return _Scanner.nextInt();

	}
	private char move(){
		System.out.println("이동을 입력하세요 wasd");
		return _Scanner.next().charAt(0);
	}
	public void run(){

		//싱글 플레이 
		user1 = new player(0,0);
		board1=new mazeBoard1();
		board1.set();
		//이동을 입력하세요 wasd 

		while(playstart()==1){

			while(canMove(move())){

				current();
				System.out.println(c);
				if(countHit>5){endgame();break;}
			}
		}

	}
	private void endgame(){
		System.out.println("게임이 종료되었습니다.");
	}
	private boolean canMove(char move){
		switch (move) {
		case 'w':
			if(board1.a[user1.get_xlocation()][user1.get_ylocation()].canGoUp()){
				user1.moveUp();
			}else{
				System.out.println("미로에 걸렸습니다.");
				user1.moveFailed();
			}
			break;
		case 's':
			if(board1.a[user1.get_xlocation()][user1.get_ylocation()].canGoDown()){
				user1.moveDown();
			}else{
				System.out.println("미로에 걸렸습니다.");
				user1.moveFailed();
			}
			break;
		case 'a':
			if(board1.a[user1.get_xlocation()][user1.get_ylocation()].canGoLeft()){
				user1.moveLeft();
			}else{
				System.out.println("미로에 걸렸습니다.");
				user1.moveFailed();
			}
			break;
		case 'd':
			if(board1.a[user1.get_xlocation()][user1.get_ylocation()].canGoRight()){
				user1.moveRight();
			}else{
				System.out.println("미로에 걸렸습니다.");
				user1.moveFailed();
			}
			break;

		default:
			break;
		}
		return true;
	}
	private void current(){
		System.out.println("지금 위치는 : "+user1.get_xlocation()+","+user1.get_ylocation());
	}
	private boolean selectMaze(){
		return false;
	}

}

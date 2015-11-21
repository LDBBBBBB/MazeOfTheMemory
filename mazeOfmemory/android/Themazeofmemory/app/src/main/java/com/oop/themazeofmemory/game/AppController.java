package com.oop.themazeofmemory.game;

import java.util.Scanner;

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
	private char direction(){
		System.out.println("이동을 입력하세요 wasd");
		return _Scanner.next().charAt(0);
	}
	public void run(){

		//싱글 플레이 
		user1 = new player(0,0);
		board1=new mazeBoard1();
		board1.set();
		//이동을 입력하세요 wasd 

		//############################
		// 이하의 메뉴는 안드로이드 ui에 따라 달라질 여지가 있습니다
		//지금은 위에 있는 방식대로 진행합니다.
		if(playstart()==1){
			
			while(move(direction())){				
					current();
					user1.increaseMoveCount();
					System.out.println(user1.get_moveCount());
					if(user1.get_moveCount()>=5){endgame();break;}
					
			}

			
		}
		else if(playstart()==2){
			System.out.println("미구현");
		}
		else{
			System.out.println("게임방법설명");
		}
	}
		
	private void endgame(){
		System.out.println("게임이 종료되었습니다.");
	}
	
	
	private boolean move(char direction){
		switch (direction) {
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

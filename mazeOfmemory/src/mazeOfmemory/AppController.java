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
		System.out.println("�÷��̸� �����ϰڽ��ϴ�. 1.�̱� 2.��Ʋ 3.���ӹ������");
		return _Scanner.nextInt();

	}
	private char move(){
		System.out.println("�̵��� �Է��ϼ��� wasd");
		return _Scanner.next().charAt(0);
	}
	public void run(){

		//�̱� �÷��� 
		user1 = new player(0,0);
		board1=new mazeBoard1();
		board1.set();
		//�̵��� �Է��ϼ��� wasd 

		while(playstart()==1){

			while(canMove(move())){

				current();
				System.out.println(c);
				if(countHit>5){endgame();break;}
			}
		}

	}
	private void endgame(){
		System.out.println("������ ����Ǿ����ϴ�.");
	}
	private boolean canMove(char move){
		switch (move) {
		case 'w':
			if(board1.a[user1.get_xlocation()][user1.get_ylocation()].canGoUp()){
				user1.moveUp();
			}else{
				System.out.println("�̷ο� �ɷȽ��ϴ�.");
				user1.moveFailed();
			}
			break;
		case 's':
			if(board1.a[user1.get_xlocation()][user1.get_ylocation()].canGoDown()){
				user1.moveDown();
			}else{
				System.out.println("�̷ο� �ɷȽ��ϴ�.");
				user1.moveFailed();
			}
			break;
		case 'a':
			if(board1.a[user1.get_xlocation()][user1.get_ylocation()].canGoLeft()){
				user1.moveLeft();
			}else{
				System.out.println("�̷ο� �ɷȽ��ϴ�.");
				user1.moveFailed();
			}
			break;
		case 'd':
			if(board1.a[user1.get_xlocation()][user1.get_ylocation()].canGoRight()){
				user1.moveRight();
			}else{
				System.out.println("�̷ο� �ɷȽ��ϴ�.");
				user1.moveFailed();
			}
			break;

		default:
			break;
		}
		return true;
	}
	private void current(){
		System.out.println("���� ��ġ�� : "+user1.get_xlocation()+","+user1.get_ylocation());
	}
	private boolean selectMaze(){
		return false;
	}

}

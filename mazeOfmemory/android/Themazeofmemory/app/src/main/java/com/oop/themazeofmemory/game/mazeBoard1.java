package com.oop.themazeofmemory.game;

public class mazeBoard1 implements mazeBoard{
	mazeCell[][] a = new mazeCell[7][7];
	public mazeBoard1() {
		// TODO Auto-generated constructor stub
		for(int i=0;i<7;i++){
			for(int j=0; j<7;j++){
				a[i][j] = new mazeCell();
			}
		}
	}
	public void set(){
		a[0][0].setRight(false);
		a[1][0].setLeft(false);
	
		a[1][2].setUp(false);
		a[1][3].setDown(false);
		
		a[2][2].setUp(false);
		a[2][3].setDown(false);
		
		a[2][2].setLeft(false);
		a[3][2].setRight(false);
		
		a[2][1].setRight(false);
		a[3][1].setLeft(false);
		
		a[4][1].setUp(false);
		a[4][2].setDown(false);
		
		a[4][2].setRight(false);
		a[5][2].setLeft(false);
		
		a[3][3].setRight(false);
		a[4][3].setLeft(false);
		
		a[3][4].setRight(false);
		a[4][4].setLeft(false);
		
		a[5][5].setUp(false);
		a[5][6].setDown(false);
		
		a[1][4].setUp(false);
		a[1][5].setDown(false);
		
		a[2][4].setUp(false);
		a[2][5].setDown(false);
		
	}
	

}

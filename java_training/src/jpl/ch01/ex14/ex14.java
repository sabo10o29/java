package jpl.ch01.ex14;

public class ex14 {

	static final int MAX = 10;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Walkman walkman[] = new Walkman[MAX];

		for(int i = 0;i<MAX;i++){
			walkman[i] = new Walkman(Factory.getNextSirial(), "Ver. 1");
			System.out.println("シリアル番号："+walkman[i].getSirial()+"モデル："+walkman[i].getModel()+"端子数"+walkman[i].getTerminal());
		}



	}

}

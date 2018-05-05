package Pharmasy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private boolean b = true;
	private MyThread th;
	private int numberMusic = 1;
	public void menu(User user) throws Exception{
		Scanner scn = new Scanner(System.in);
		Goods goods = new Goods();
		Check check = new Check();
		Inventory inventory = new Inventory();
		Receipts receipts = new Receipts();
		int pick ;
		int work = 1;
		while(!(work == 2)){
			goods.sortGoods();
		System.out.println("1-List of Goods!! "+" 2-buy item "+" 3-Register new user "+
		"4 - Replenishment of the goods "+" 5-Inventory"+" 6 - Sales statictics "+" 7-Go out!!"+" 8 - Play music!!"+" 9 - Make a playlist");
		pick = scn.nextInt();
		switch (pick){
		case 1:
			goods.printGoods();
		break;
		case 2:
			check.check(user.getName());
		break;
		case 3:
			goods.register();
		break;
		case 4:
			receipts.receipts(user.getName());
		break;
		case 5:
			inventory.intventory();
		break;
		case 6:
			check.sales();
		break;
		case 7:System.out.println("Good bye "+user.getName());
		System.exit(0);
		break;
		case 8:
			if(b){
		th = new MyThread(user.getName());
		th.player();
		b = false;
			}
		System.out.println("Switch music?! Yes-\"1\"!,Next-\"2\", No -\"3\"");
		int switchMusic = scn.nextInt();
			switch (switchMusic){
				case 1:
						System.out.println("Select the music number!!!");
						th.switchMusic();
						numberMusic = scn.nextInt();
						th = new MyThread(user.getName());
						th.setNumberMusic(numberMusic-1);
						th.player();
						break;
				case 2:
						th.switchMusic();
						int index = th.getNumberMusic();
						th = new MyThread(user.getName());
						th.setNumberMusic(index);
						th.player();
						break;
				case 3:
					break;
			}
		
		break;
		case 9:
			Track.showTracks(user);
		break;
		}
		System.out.println("Continue working? Yes:pick \"1\"; No:pick \"2\"!!");
		work = scn.nextInt();
		}
		System.exit(0);
	}

}

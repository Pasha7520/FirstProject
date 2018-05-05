package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
	Map<Integer , Team > maps = new HashMap<Integer , Team >();
		maps.put(1,  (new Team("Челсі",34,26,5,3,72,29,81)));
		maps.put(2, (new Team("Тотенгем",34,23,8,3,71,22,77)));
		maps.put(3, (new Team("Ліверпуль",35,20,9,6,71,42,69)));
		maps.put(4,(new Team("Манчестер Сіті",34,19,9,6,65,37,66)));
		maps.put(5, (new Team("Манчестер Юнайтед",34,17,14,3,51,25,65)));
		maps.put(6, (new Team("Арсенал",33,18,6,9,64,42,60)));
		maps.put(7, (new Team ("Евертон",35,16,10,9,60,40,58)));
		maps.put(8, (new Team("Вест Бромвіч",34,12,8,14,39,43,44)));
		maps.put(9,(new Team("Саутгемптон",33,11,8,14,39,44,41)));
		maps.put(10, (new Team("Борнмут",35,11,8,16,50,63,41)));
		maps.put(11, (new Team ("Лестер",34,11,7,16,42,54,40)));
		maps.put(12, (new Team("Сток Сіті",35,10,10,15,37,50,40)));
		maps.put(13, (new Team("Уортфорт",34,11,7,16,37,55,40)));
		maps.put(14, (new Team ("Бернли",35,11,6,18,35,49,39)));
		maps.put(15, (new Team("Вестхем",35,10,9,16,44,59,39)));
		maps.put(16, (new Team("Кристал Пелас",35,11,5,19,46,56,38)));
		maps.put(17, (new Team("Халл Сити",35,9,7,19,36,67,34)));
		maps.put(18, (new Team("Соунсі",35,9,5,21,40,69,32)));
		maps.put(19, (new Team("Мидлсбро",35,5,13,17,26,45,28)));
		maps.put(20, (new Team("Сандерленд",34,5,6,23,26,60,21)));
		////////
		
	Mean.pointLow(maps);
	
		
	
	}
}

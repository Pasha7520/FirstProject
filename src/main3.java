
public class main3 {

	public static void main(String[] args) {
	String[] strings = new String[5];
	strings[0] = "Привет";
	strings[1] = "Пока";
	strings[2] = "Пока";
	strings[3] = "Пока";
	strings[4] = "джава";
	for(int i = 0;i < strings.length;i++){
		
		if(i==1)continue;
		System.out.println(strings[i]);
	}
	}

}


public class main3 {

	public static void main(String[] args) {
	String[] strings = new String[5];
	strings[0] = "������";
	strings[1] = "����";
	strings[2] = "����";
	strings[3] = "����";
	strings[4] = "�����";
	for(int i = 0;i < strings.length;i++){
		
		if(i==1)continue;
		System.out.println(strings[i]);
	}
	}

}

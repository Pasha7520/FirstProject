package contrary;

public class contrary {
	public static String Back(String str){
		char prob = ' ';
		int word = 0;
		for(int i=0;i < str.length();i++){
			if(!(str.charAt(i)==prob)){
				
			}
			else{
				word++;
				System.out.println(word);
				while(str.charAt(i+1)==prob){
					i++;
				}
			}
		}
		String [] S = new String[word+1];
		int ind = 0;
		for(int i =0;i < str.length();i++){
			if(!(str.charAt(i)==prob)){
				if(S[ind]==null)S[ind]="";
				S[ind]=S[ind]+str.charAt(i);
			}
			else{
				ind++;
				
				while(str.charAt(i+1)==prob){
					i++;
				}
			}
		}
		String BackS = "";
		while(ind>=0){
			if(ind>0){BackS = BackS + S[ind]+prob;
			ind--;
			}
			else{BackS = BackS + S[ind];
			ind--;
			}
		}
		return BackS;
	}
	
	public static String AllBack(String str){

		String S ="";
		for(int i=str.length()-1;i >=0;i--){
			S=S+str.charAt(i);
		}
		return S;
	}
	
	public static String autoBack(String str){
		String S = "";
		String [] S1 = str.split(" ");
		for(int i=S1.length-1;i >= 0;i--){
			S=S+" "+S1[i];
		}
		return S;
	}
}

import java.util.Scanner;


public class main4 {

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);	
		System.out.println("¬веди к≥льк≥сть елемент≥в " );
		int n = scn.nextInt();
		int [] num = new int [n];
			for(int i = 0;i < num.length;i++){
				System.out.println("¬веди значенн€ масиву" );
			num[i] = scn.nextInt();
			}
		int max = num[0]; int min = num[0];
			for(int i = 1;i < num.length;i++){
				if( max < num[i] ) max = num[i];
				else if(min > num[i]) min = num[i];
			}
			System.out.println("\nmax = "+max+"\nmin = "+min);
			System.out.println("¬веди пор€док ");
			int y = scn.nextInt();
				if(y==1){
					int t=0;
					for(int i = 0;i < num.length;i++){
						for(int j = 0;j < num.length-1;j++){
							if(num[j] > num[j+1]){
								t=num[j];
								num[j]=num[j+1];
								num[j+1]=t;
							}
						}
					}
				}
					
				 if (y == 2){
					 
					 int r=0;
					 for(int i=0;i < num.length;i++){
						 for(int j=0; j < num.length-1;j++){
							 if(num[j] < num[j+1]){
								 r=num[j];
								 num[j]=num[j+1];
								 num[j+1]=r;
							 }
						 }
					 }
				 }
				 
			for(int i = 0;i < num.length;i++){
					System.out.println(num[i]);}
				 
					
					
					
					
				
				
				
				
				
				
				
			
			
			
			
		}
}

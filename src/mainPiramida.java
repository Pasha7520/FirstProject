import java.util.Scanner;


public class mainPiramida {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
			System.out.println("¬веди висоту " );
			int y=scn.nextInt();
			for(int i = 0; i < y;i++){
				for(int j = 0;j < y-i;j++){
					System.out.print("\t");
					}
				for(int j=0;j <= i;j++){
					System.out.print("*\t\t");
				}
				System.out.println();
				
				
		
			}
			
	}

}

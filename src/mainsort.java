import java.util.Scanner;


public class mainsort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int longg;int  whitchMethod;
		int first;
		int second;
		System.out.println("Hello!!");
		System.out.println("Enter the length of the array");
		longg = scn.nextInt();
		int [] numbers = new int[longg];
		for(int i = 0;i < numbers.length;i++){
		System.out.println("Enter a value array \""+i+"\"");
		numbers[i]=scn.nextInt();
		}
		System.out.println("This is your array");
		printAction(numbers);
		System.out.println("which method we should use");
		System.out.println("1-bubble sort");
		System.out.println("2-select sort");
		System.out.println("3-insert sort");
		System.out.println("4-shell sort");


		whitchMethod =scn.nextInt();
			switch(whitchMethod){
				case 1 : 
			
					numbers=bubbleSort(numbers);
					System.out.print("array after bubbleSort ");
					printAction(numbers);
					
					break;
				case 2 :
					numbers=selectSort(numbers);
					System.out.print("array after selectSort");
					printAction(numbers);
					break;
				case 3 : 
					numbers=insertSort(numbers);
					System.out.println("array after insertSort");
					printAction(numbers);
					break;
				case 4 : 
					numbers = shellSort(numbers);
					System.out.println("array after shellSort");
					printAction(numbers);
					break;
				case 5 : 
					break;
				case 6 : 
					break;
				case 7 : 
					break;
				default:
					System.out.println("indicated nonexistent method");
			}
			System.out.println("enter what you need");
			System.out.println("1-meanvalue");
			System.out.println("2-median");
			System.out.println("3-moda");
			int action2 =scn.nextInt();
			switch(action2){
				case 1:					
					printAction(numbers);
					System.out.println(meanvalue(numbers));
					break;
			
				case 2:
				
					median(numbers);
					break;
				case 3:
					if(!(moda(numbers)==null)){
					printmedianmoda(moda(numbers),numbers);
					}
					else{
						System.out.println("Моди немаэ");
					}
						
					break;
			}
		
	}
			private static void printAction(int[]numbers){
				for(int i = 0;i < numbers.length;i++){
				System.out.print(numbers[i]+",");
				}System.out.println();
			}
			private static int[] bubbleSort(int[]numbers){
				int temp;
				for(int j = 0;j < numbers.length-1;j++){
					for(int i = 0;i < numbers.length-1;i++){
						if(numbers[i]>numbers[i+1]){
							temp=numbers[i];
							numbers[i]=numbers[i+1];
							numbers[i+1]=temp;
							printAction(numbers);
							}
						}
					}
				return numbers;
			}
			private static int[] selectSort(int[]numbers){
				int mintemp;int maxtemp;
				int minIndex;
				for(int i = 0;i < numbers.length-1;i++){
					minIndex=i;
					for(int j=i+1;j < numbers.length;j++){
						minIndex=i;
						if(numbers[minIndex] > numbers[j]){
							maxtemp=j;
							mintemp=numbers[j];
							numbers[maxtemp]=numbers[i];
							numbers[i]=mintemp;
							printAction(numbers);
						}
					}
				}
				return numbers;
			}
			private static int[] insertSort(int[]numbers){
				int temp;int ins;
					for(int i = 0;i < numbers.length-1;i++){
						if(numbers[i] > numbers[i+1]){
							ins=i;
							temp=numbers[i];
							numbers[i]=numbers[i+1];
							numbers[i+1]=temp;
							printAction(numbers);
							while(ins!=0 && numbers[ins] < numbers[ins-1]){
								temp=numbers[ins];
								numbers[ins]=numbers[ins-1];
								numbers[ins-1]=temp;
								ins--;
								printAction(numbers);

							}
						}
					}
					return numbers;
			}
			private static int[] shellSort(int[]numbers){
				int temp;
				int step;
				int back;
				step =numbers.length/2;
				while(step > 0){
					for(int i =0;i < numbers.length-step;i++){
						back=i-step;
						if(numbers[i] > numbers[i+step]){
							temp=numbers[i];
							numbers[i]=numbers[i+step];
							numbers[i+step]=temp;
							printAction(numbers);

							
								
							while(back >= 0){
								if(numbers[i] < numbers[i-step]){
									temp=numbers[i];
									numbers[i]=numbers[i-step];
									numbers[i-step]=temp;
									back=back-step;
									printAction(numbers);
								}
								else{
									back=-1;
								}
							}
						}
					}
					step=step/2;
					
				}
					return numbers;
			}
			
			
					
			private static double meanvalue(int[] numbers222){
				double mean = 0;
				for(int i = 0;i < numbers222.length;i++){
					mean=mean+numbers222[i];
					
				}
				mean=mean/numbers222.length;
				

				return mean;
			}
			private static double median(int[] numbersmedian){
				double mean=0;
				numbersmedian=bubbleSort(numbersmedian);
				if(numbersmedian.length%2==0){
				
					int betwean = numbersmedian.length/2;
					mean=(double)(numbersmedian[betwean-1]+numbersmedian[betwean])/2;
					System.out.println(mean);
				}
				
				if(!(numbersmedian.length%2==0)){
	
					mean=numbersmedian[numbersmedian.length/2];
					printmedianmoda((int)mean,numbersmedian);
				}
				
				return mean;
			}
			private static void printmedianmoda(int mean,int[] numbersprintmedian){
				for(int i = 0;i < numbersprintmedian.length;i++){
					if(numbersprintmedian[i]==numbersprintmedian[mean]){
						System.out.print("["+numbersprintmedian[i]+"]"+",");
					}
					else{
						System.out.print(numbersprintmedian[i]+",");
					}
				}
				System.out.println();
			
			}
			private static Integer moda(int[] numbersmoda){
				int mean=0;
				int b = 0;
				for(int i=0;i < numbersmoda.length-1;i++){
					int a = 0;
					for(int j=i+1;j < numbersmoda.length;j++){
						if(numbersmoda[i]==numbersmoda[j]){
							a++;
						}
					}
					if(a > b){
						b=a;
						mean=numbersmoda[i];
					}
				}
				if(mean==0){
					return null;
				}
				else{
					return mean;
				}
				
			}
}

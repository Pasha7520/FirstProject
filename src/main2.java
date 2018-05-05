
public class main2 {

	public static void main(String[] args) {
	int number = 4;
	int[] numbers = new int[number];// 0 1 2 3 4
		/*for(int i=0;i<numbers.length;i++){
			numbers[i] = i*58;
		}
		for(int i = 0;i<numbers.length;i++){
			System.out.println(numbers[i]);
		}
		System.out.println();
		
		int[] numbers1 = {1,23,3,44,5};
		System.out.println(numbers1[0]);
		System.out.println();
		for(int i=0;i<numbers1.length;i++){
			numbers1[i]=i*2;
					
			System.out.println(numbers1[i]);
		}*/
		
		for(int i = 0;i<numbers.length;i++){
			numbers[i] = (int) Math.round(Math.random()*100);
			System.out.println(numbers[i]);
			
		}
		
		int min = numbers[0];
	
			for( int j = 1; j < numbers.length;j++){
				if(min > numbers[j]) min = numbers[j];
			}
			
		
		int max = 0 ;
		for(int i = 0;i < numbers.length;i++){
			max = numbers[i];
			for(int h = 0;h < numbers.length;h++){
				if(max < numbers[h]) max = numbers[h];
			}
		}
		System.out.println("min = " + min);
		System.out.println("max = "+ max);
		System.out.println();
		
		int sum = 0 ;
		for(int i = 0;i < numbers.length;i++){
			sum += numbers[i];
		}System.out.println("sum = "+ sum);
		//--------------------------------------------------
		
	int t=0;
		for(int i = 0;i < numbers.length;i++){
			for(int j = 0;j < numbers.length-1;j++){
				if(numbers[j] > numbers[j+1]){
					t=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=t;
				}
			}
		}
		
		for(int i = 0;i < numbers.length;i++){
		System.out.println(numbers[i]);
		}
	}

}

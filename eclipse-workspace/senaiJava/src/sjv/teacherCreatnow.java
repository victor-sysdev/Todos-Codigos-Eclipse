package sjv;

public class teacherCreatnow {
	
	public static void main(String[] args) {
		
		
		for(int i = 1; i <= 10; i++){	
			for(int j = 1; j <= 10; j++){
				if(j == 4) {
					System.out.print(" X ");
			}else{
				System.out.print(j + " ");
				
			}	
		 }
			if(i == 3) {
				
				System.out.println("M");
				
			}else {
				
				System.out.println(i + " ");
				
			}
		
		}
		
	}

}

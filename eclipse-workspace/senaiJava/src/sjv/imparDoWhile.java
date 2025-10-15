package sjv;

public class imparDoWhile {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		while(i < 1000) {
			
			i++;
			
			
			if(i % 2 == 0) {
				
				continue;
				
			}
			System.out.println("Numero impar: " + i);
		}
		
	}

}

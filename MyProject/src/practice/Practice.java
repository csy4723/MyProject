package practice;

public class Practice {

	public static void main(String[] args) {
		for(int i = 0; i<9; i++) {
			for(int j = 0; j < 0; j++) {
				int point = 8;
				
				if(j >= point-i) {
					System.out.println("*");
				}else {
					System.out.println(" ");
				}
				System.out.println();
			}
		}
		

			
	}

		
}

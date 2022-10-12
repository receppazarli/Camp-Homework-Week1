package findNumber;

public class Main {

	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int findNumber = 5;
		boolean isThere = false;
		
		for (int number : numbers) {
			isThere=true;
			break;
			
		}
		
		if (isThere) {
			System.out.println("Number is avaliable");
		}else {
			System.out.println("Number is not avaliable");
		}
	}

}

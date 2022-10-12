package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {
		case 'A': {

			System.out.println("Perfect : Successful");
			break;
		}
		case 'B':
		case 'C': {

			System.out.println("Good : Successful");
			break;
		}
		case 'D': {

			System.out.println("Not bad : Successful");
			break;
		}
		case 'F': {

			System.out.println("Sorry you stayed");
			break;
		}
		default:
			System.out.println("You entered an invalid grade");
		}

	}

}

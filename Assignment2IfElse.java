
public class Assignment2IfElse {

	public static void main(String[] args) {
		int maths = 70, physics = 60, chemistry = 60;
	
		int average = (maths + physics + chemistry)/3; // bracket for order of operation adds scores then divides by 3 for average
		
		if (maths < 35 || physics < 35 || chemistry < 35) { 
			System.out.println("Student has failed");
		} else if (average <= 59) {
			System.out.println(" C");
		} else if (average <= 69) {
			System.out.println("B");
		} else {
			System.out.println(" A");
		}

	}
}

// short circuit operator || means if maths < 35 it wont execute others 
package lanch;

import java.util.Scanner;

public class SwitchCaseTester {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter a year: ");
//		int year = input.nextInt();
//		switch (year % 12) {
//		default:
//		System.out.println("tricheur"); break;
//		case 0: System.out.println("monkey"); break;
//		case 1: System.out.println("rooster"); break;
//		case 2: System.out.println("dog"); break;
//		case 3: System.out.println("pig"); break;
//		case 4: System.out.println("rat"); break;
//		case 5: System.out.println("ox"); break;
//		case 6: System.out.println("tiger"); break;
//		case 7: System.out.println("rabbit"); break;
//		case 8: System.out.println("dragon"); break;
//		case 9: System.out.println("snake"); break;
//		case 10: System.out.println("horse"); break;
//		case 11: System.out.println("sheep");
//		}
//		input.close();
		
		// Nouvelle methode 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		var result = switch(year % 12) {
		case 0 -> "Monkey";
		case 1 -> "rooster";
		case 2 -> "dog";
		case 3 -> "pig";
		case 4 -> "rat";
		case 5 -> "ox";
		case 6 -> "tiger";
		case 7 -> "rabbit";
		case 8 -> {System.out.println("actual year"); yield "dragon";}
		default -> 42;
		};
		input.close();
		System.out.println(result);
	}
}

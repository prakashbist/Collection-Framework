package List.ArrayList;

import java.util.Scanner;

public class BasicAraryMD {

	public static void main(String[] args) {

		int length;
		Scanner in = new Scanner(System.in);
		System.out.println("enter how many numbers");
		length = in.nextInt();

		String[] name = new String[length];

		for (int counter = 0; counter < length; counter++) {
			System.out.println("enter the name of" + (counter + 1));
			name[counter] = in.next();
		}
		in.close();
		System.out.println("************");
		System.out.println("name are");
		for (int counter = 0; counter < length; counter++) {
			System.out.println(name[counter]);
			
		}
	}
}
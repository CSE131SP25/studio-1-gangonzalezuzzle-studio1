package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What year is it?");
		int year = in.nextInt();
		boolean four = (year % 4 == 0); 
		boolean hundred = (year % 100 != 0);
		boolean fourhundred = (year % 400 == 0);
		boolean leapyear = ((four&&hundred) || fourhundred); 
		System.out.println(year + " is a leap year- " + leapyear);
	}

}

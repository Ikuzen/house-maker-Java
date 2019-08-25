package util;

import java.io.IOException;
import java.util.Scanner;

public class Util {
	public static int intInput(String flavor, String error) {
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println(flavor);
			int newInput = sc.nextInt();
			return newInput;
		}
		catch(Exception e) {
	        System.out.println(error);
	        return intInput(flavor,error);
		}
		finally {
//			sc.close();
		}
	}
	
	public static String stringInput(String flavor,String error) {
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.print(flavor);
			String newInput = sc.nextLine();
			return newInput;
		}
		catch(Exception e) {
	        System.out.println(error);
	        return stringInput(flavor,error);
		}
		finally {
//			sc.close();
		}
	}
	public final static void clearConsole()
	{
		for (int i = 0; i < 50; ++i) System.out.println();
	}


}
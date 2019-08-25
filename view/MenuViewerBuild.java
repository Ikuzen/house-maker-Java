package view;

import util.Util;

public class MenuViewerBuild {
//	Main menu //
	public static int buildMenuInput() {
		Util.clearConsole();
		String flavor = "1 - build a new house \n"
				+ "2 - add rooms to a house \n"
				+ "3 - add furnitures to a room \n"
				+ "4 - destroy a house \n"
				+ "5 - back";
		String error = "enter a correct input (only integers accepted)\n";
		return Util.intInput(flavor,error );
	}
// 
	
	// menu 1 : build a new house functions //
	public static String nameHouseInput() {

		String flavor = "name of the house you want to build :\n";
		String error = "enter a correct name (only string accepted)\n";
		return Util.stringInput(flavor,error );
}
	//
	
	// menu 2 : add rooms to a house functions //
	public static int houseSelecterInput() {

		String flavor = "select number of house you want to add rooms to :\n";
		String error = "select a correct number\n";
		return Util.intInput(flavor,error);

	}
	public static int roomBuildInput() {

		String flavor = "1 - add a room \n"
				+ "2 - remove a room \n"
				+ "3 - back \n";
		String error = "enter a correct input (only integers accepted)\n";
		return Util.intInput(flavor,error );
	}
	//
//	public static int 
}

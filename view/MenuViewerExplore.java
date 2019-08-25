package view;

import util.Util;

public class MenuViewerExplore {
	public static int houseSelecterInput() {
		String flavor = "select number of house you want to visit :\n";
		String error = "select a correct number\n";
		return Util.intInput(flavor,error);

	}
}

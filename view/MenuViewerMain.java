package view;
import util.Util;
public class MenuViewerMain {



	public static int menuInput() {
			String flavor = "What will you do ?\n"
					+ " 1 - Build your house\n"
					+ " 2 - Visit your house\n"
					+ " 3 - Leave\n";
			String error = "enter a correct number (1 2 or 3)\n";
			return Util.intInput(flavor,error);

	}
	
	

}
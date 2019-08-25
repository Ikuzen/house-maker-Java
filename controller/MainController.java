package controller;

public class MainController {
	public void run() {
		do 
		{
			HouseController.select();
		}
		while(!HouseController.isEnded);
	}
}

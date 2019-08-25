package controller;

import java.util.ArrayList;
import java.util.Arrays;

import view.MenuViewerMain;
import view.MenuViewerBuild;
import view.MenuViewerExplore;

import model.House;
import model.Room;
import util.Util;

public class HouseController {
	protected static ArrayList<House> houses = new ArrayList<House>(); 
	protected static boolean isEnded = false;
	
	public static boolean isEnded() {
		return isEnded;
	}
	public static void setEnded(boolean isEnded) {
		HouseController.isEnded = isEnded;
	}
	public ArrayList<House> getHouses() {
		return houses;
	}
	public void setHouses(ArrayList<House> houses) {
		this.houses = houses;
	}
	public static void describeAll() {
		for(int i=0; i<houses.size(); i++) {
			System.out.println("house number "+ (int)(i+1)+"\n");
			houses.get(i).describe();
		}
	}
	public static void select () {
		int choice = MenuViewerMain.menuInput();
		System.out.println(choice);
		switch (choice) {
		case 1 :
			build();
			break;
		case 2 :
			if(houses.size() != 0) {
				explore();
			}
			else {
				Util.clearConsole();
				System.out.println("There is no house ! ");
			}
			break;
		case 3 :
			System.out.println("you left");
			isEnded = true;
			break;
		default: 	
			System.out.println("enter a correct choice (1,2 or 3");
			select();
		}

	}
	public static void createHouse() {
		String nameHouse = MenuViewerBuild.nameHouseInput();
		ArrayList<String> pieces = new ArrayList<String>(); 
		House house = new House(nameHouse,pieces);
		house.getPieces().add("Entry");
		houses.add(house);
		System.out.println("new house created ! \n");

	}
	public static void createRoom(House house) {
		System.out.println(Arrays.toString(Room.roomList));
		int number = Util.intInput("Select number of the room you want to add","error, enter a valid number (integer)");
		try {
			house.getPieces().add(Room.roomList[number-1]);
		}
		catch(Exception e){
			System.out.println("select a correct number");
			createRoom(house);
		}
		
	}
	public static void build() {
		int menuInput = MenuViewerBuild.buildMenuInput();
		switch (menuInput) {
		case 1 :
			Util.clearConsole();
			createHouse();
			break;
		case 2:
			Util.clearConsole();
			if(houses.size() == 0) {
				Util.clearConsole();
				System.out.println("create a house first ! \n");
			}
			else {
			Util.clearConsole();
			describeAll();
			int numHouse = MenuViewerBuild.houseSelecterInput();
			if(numHouse > houses.size() || numHouse <= 0) {
				System.out.println("this number doesn't correspond to any house");
				build();
			}
			else {
				System.out.println("chose house "+numHouse);
				createRoom(houses.get(numHouse-1));
			}
			}
			break;
		case 3:
			Util.clearConsole();
			if(houses.size() == 0) {
				Util.clearConsole();
				System.out.println("create a house first ! \n");
			}
			else {
			System.out.println("which room to add furnitures ?\n");
			}
			break;
			
		case 4:
			Util.clearConsole();
			if(houses.size() == 0) {
				Util.clearConsole();
				System.out.println("create a house first ! \n");
			}
			else {
			System.out.println("which house to destroy ?\n");
			}
			break;
		case 5:
			Util.clearConsole();
			break;
		default: 
			Util.clearConsole();
			System.out.println("enter a correct choice (1,2 or 3");
			build();
		}
	
		
	}
	
	public static int toVisit() {
		Util.clearConsole();
		describeAll();
		int numHouse = MenuViewerExplore.houseSelecterInput();
		if(numHouse > houses.size() || numHouse <= 0) {
			System.out.println("this number doesn't correspond to any house .\n");
			toVisit();
		}
		return numHouse;
	}
	public static void explore() {
		System.out.println("current house(s) are : \n\n");
		describeAll();
		int numHouse = toVisit();
		System.out.println("visiting house number "+numHouse+": "+houses.get(numHouse-1).getName());
	}
	
}

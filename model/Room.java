package model;

import java.util.ArrayList;

public class Room extends Element {
	protected int size;
	protected String furniture;
	protected String adjacentRoom;
	public static String[] roomList = {"1 - Hall","2 - dining room","3 - bathroom","4 - bedroom","5 - kitchen","6 - cellar","7 - basement","8 - living room","9 - restroom","10 - custom room"};
//	public ArrayList<String> roomlist2 = new ArrayList<String>();
	
	

	public Room(String name, int size, String furniture, String adjacentRoom) {
		super(name);
		this.size = size;
		this.furniture = furniture;
		this.adjacentRoom = adjacentRoom;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getFurniture() {
		return furniture;
	}
	public void setFurniture(String furniture) {
		this.furniture = furniture;
	}
	public String getAdjacentRoom() {
		return adjacentRoom;
	}
	public void setAdjacentRoom(String adjacentRoom) {
		this.adjacentRoom = adjacentRoom;
	}

}

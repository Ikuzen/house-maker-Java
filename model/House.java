package model;
import java.util.ArrayList;

public class House extends Element {
	protected ArrayList<String> pieces;
	
	public House (String name,ArrayList<String> pieces){
		super(name);
		this.pieces = pieces;
	}





	public ArrayList<String> getPieces() {
		return pieces;
	}

	public void setPieces(ArrayList<String> pieces) {
		this.pieces = pieces;
	}
	public void describe() {
		System.out.println("nom de la maison : "+name);
		System.out.println("nombre de pieces : "+pieces.size()+"\n");
		for(int i =0; i<pieces.size(); i++) {
			System.out.println("room "+(i+1)+" : "+pieces.get(i)+"\n");
		}

	}
}

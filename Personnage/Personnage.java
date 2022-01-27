package Personnage;

public class Personnage{

	private String nom;
	private int vie;
	
	public Personnage(String name, int life){
	
		this.vie = life;
		this.nom = name;	
		
	}	
	
	public String Lenom(){
	
		return this.nom;
		
	}
}

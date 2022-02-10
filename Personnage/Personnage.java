package Personnage;

public class Personnage{

	private String nom;
	private int vie;
	private int endurance;

	public Personnage(String name, int life, int endurance){

		this.vie = life;
		this.nom = name;
		this.endurance = endurance;
		
	}

	public String getNom() {
		return this.nom;
	}

	public int getVie() {
		return this.vie;
	}

	public int getEndurance(){
		return  this.endurance;
	}

	public void heal(int vie) {
		this.vie += vie;
	}

	public void damage(Personnage cible, int degats){
		cible.vie -= degats;
		this.endurance -= degats/3;
		System.out.println(this.getNom() + " attaque " + cible.getNom() + " qui perd " + degats + " Points de vie");

	}

	public String display(){
		String retour = this.getNom() + " --> " + this.getVie() + "points de vie et " + this.getEndurance() + " points d'endurance";
		return retour;
	}

	public boolean estMort(){
		if(this.vie > 0){
			return false;
		}
		return true;
	}

}

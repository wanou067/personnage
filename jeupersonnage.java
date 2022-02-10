
import Personnage.*;

public class jeupersonnage {

	public static void main(String args[]){

		String a = System.lineSeparator();

		Personnage chat = new Personnage("Tom", 200, 100);
		Personnage souris = new Personnage("Jerry", 50, 300);

		System.out.println(a);
		System.out.println("Il était une fois un chat qui s'appelait Tom qui avait 200HP et 100 points d'endurance");
		System.out.println("Une souris nommée Jerry extremement jalouse était présente avec 50HP et 300 points d'endurance");

		System.out.println(a + "Folle de jalousie la souris attaque le chat");
		souris.damage(chat, 130);
		System.out.println("Le chat est blessé, voici ses informations !");
		System.out.println(chat.display());
		System.out.println(souris.display());

		System.out.println(a+"Assoifé de vengeance le chat saute sur la souris puis l'avale !");
		chat.damage(souris, 50);
		System.out.println(chat.display());
		System.out.println(souris.display());
		System.out.println("Jerry est morte ? " + souris.estMort());

		System.out.println(a+"Le chat fier de son coup digère la souris et régénère 100 hp");
		chat.heal(100);
		System.out.println(chat.display());

}}

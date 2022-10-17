package scenarios;

import personnages.*;

public class Histoire {

	public static void main(String[] args) {
		Druide Panoramix = new Druide("Panoramix", 5, 10);
		Gaulois Obelix = new Gaulois("Obélix", 10);
		Gaulois Asterix = new Gaulois("Astérix", 8);
		Romain Minus = new Romain("Minus", 27);
		
		Panoramix.parler("Je vais aller préparer une potion...");
		Panoramix.preparerPotion();
		Panoramix.booster(Obelix);
		Obelix.parler("Par Bélénos, ce n'est pas juste !");
		Asterix.boirePotion(6);
		Asterix.parler("Bonjour");
		Minus.parler("UN GAU... UN GAUGAU...");
		Asterix.frapper(Minus);
		Asterix.frapper(Minus);
		Asterix.frapper(Minus);
	}

}

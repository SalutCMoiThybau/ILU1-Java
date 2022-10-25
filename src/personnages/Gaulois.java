package personnages;

public class Gaulois {

	private String nom;
	private int force;
	private int nbTrophees;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getEffetPotion() {
		return effetPotion;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

//	private String prendreParole() {
//		return "Le gaulois " + nom + ": ";
//	}

	
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	
	
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
//		romain.recevoirCoup((force / 3) * effetPotion);
//	}
	
	
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans lamâchoire de " + romain.getNom());
		Equipement[] trphees = romain.recevoirCoup((force / 3) *effetPotion);
		for (int i = 0; trphees != null && i < trphees.length; i++,nbTrophees++) {
			this.trophees[nbTrophees] = trphees[i];
		}
	}

	
	

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée");
	}
	
	public String faireUneDonnation(Musee musee) {
		if (trophees != null) {
			return "oui";
		} else {
			return "non";
		}
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);
		System.out.println(asterix.nom);

//		System.out.println(Asterix.prendreParole());
		asterix.parler("Salut je suis Astérix !");
		Romain asterus = new Romain("Astérus", 6);
		asterix.frapper(asterus);

		asterix.boirePotion(2);

		asterix.frapper(asterus);
	}

}

package personnages;

public class Romain {
	private String nom;
	private int force;
	private int forcePred;
	private Equipement equipements[];
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		assert force>0;
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + ": ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert force>0;
		forcePred = force;
		force -= forceCoup;
		if (force > 0) {
			parler("A�e !");
		} else {
			parler("J'abandonne...");
		}
		assert forcePred>force;
	}
	
	public void sEquiper(Equipement equipement) {
		switch (equipement) {
		case CASQUE:
			
			break;

		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		Romain Asterus = new Romain("Astérus", 6);
		Asterus.parler("Salut je suis Astérus !");
		Asterus.recevoirCoup(2);
		Asterus.recevoirCoup(4);
		
		System.out.println(Equipement.CASQUE + " " + Equipement.BOUCLIER);
	}
	
}

package personnages;

public class Romain {
	private String nom;
	private int force;
	private int forcePred;
	
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
	
	public static void main(String[] args) {
		Romain Asterus = new Romain("Astérus", 6);
		Asterus.parler("Salut je suis Astérus !");
		Asterus.recevoirCoup(2);
		Asterus.recevoirCoup(4);
	}
	
}

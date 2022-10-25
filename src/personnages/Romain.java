package personnages;

public class Romain {
	private String nom;
	private int force;
	private int forcePred;
	private Equipement[] equipements = new Equipement[2];
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
		switch (nbEquipement) {
		case 0:
			extracted(equipement);
			break;
		case 1:
			if (equipements[0]==equipement) {
				System.out.println("Le soldat " + nom + " possède déjà " + equipement + " !");
			} else {
				extracted(equipement);
			}
			break;
		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		default:
			break;
		}
	}

	private void extracted(Equipement equipement) {
		equipements[nbEquipement]=equipement;
		System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
		nbEquipement++;
	}
	
	public static void main(String[] args) {
		Romain Asterus = new Romain("Astérus", 6);
		Asterus.parler("Salut je suis Astérus !");
		Asterus.recevoirCoup(2);
		Asterus.recevoirCoup(4);
		
		System.out.println(Equipement.CASQUE + " " + Equipement.BOUCLIER);
		
		Romain Minus = new Romain("Minus", 6);
		Minus.sEquiper(Equipement.CASQUE);
		Minus.sEquiper(Equipement.CASQUE);
		Minus.sEquiper(Equipement.BOUCLIER);
		Minus.sEquiper(Equipement.CASQUE);
	}
	
}

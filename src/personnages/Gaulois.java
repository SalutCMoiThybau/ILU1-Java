package personnages;

public class Gaulois {
	
	private String nom;
	private int force;
	private int effetPotion = 1;
	
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
	
	private String prendreParole() {
		return "Le gaulois " + nom + ": ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
//	public static void main(String[] args) {
////		TODO
//	}
	
//	public static void main(String[] args) {
//		if (condition) {
//			
//		} else {
//
//		}
//		
//		switch (key) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
//		
//		for (int i = 0; i < args.length; i++) {
//			
//		}
//		
//		do {
//			
//		} while (condition);
//		
//		
//	}
	
}

package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	
	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}
	
	public String getNom() {
		return nom;
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des irréductibles", 30);

//		Gaulois gaulois = village.trouverHabitant(30);
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 30
//		le village est initialisé à 30 villageois, allant de 0 à 29 et non pas 30 -> Gaulois gaulois = village.trouverHabitant(29);
		
		Chef Abraracourcix = new Chef("Abraracourcix", 6, village);
		Gaulois Asterix = new Gaulois("Astérix", 8);
		village.setChef(Abraracourcix);
		village.ajouterHabitant(Asterix);
		
		Gaulois Obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(Obelix);
		
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
//		null
//		l'habitant que l'on cherche est à l'emplacement 0 -> Gaulois gaulois = village.trouverHabitant(0);

		village.afficherVillageois();
	}
}

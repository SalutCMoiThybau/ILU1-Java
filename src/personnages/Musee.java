package personnages;

public class Musee {
	private Trophee[] trophees = new Trophee[200];
	private int nbTrophee = 0;
	
	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		trophees[nbTrophee] = new Trophee(gaulois, equipement);
	}
}

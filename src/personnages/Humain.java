package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public void parler(String texte) {
		System.out.println(nom + " : " + "<< " + texte + ">>");
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}

	public boolean acheter(String bien, int prix) {
		if (prix <= argent) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			argent = argent - prix;
			return true;
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix
					+ " sous.");
			return false;
		}
	}

	public int gagnerArgent(int gain) {
		if (gain > 0) {
			argent = argent + gain;
			parler("J'ai gagné de l'argent. Maintenant, j'ai " + argent + " d'argent.");
		}
		return argent;
	}

	public int perdreArgent(int perte) {
		if (perte < 0) {
			parler("Je n'ai pas perdu d'argent. HAHA! J'ai toujours " + argent + " d'argent.");
		} else if (perte > argent) {
			argent = 0;
			parler("J'ai perdu tout mon argent. Maintenant, j'ai " + argent + " d'argent.");
		} else {
			argent = argent - perte;
			parler("J'ai perdu " + perte + " d'argent. Maintenant, j'ai " + argent + " d'argent.");
		}
		return argent;

	}

}

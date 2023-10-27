package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	public int seFaireExtorquer() {
		argent = 0;
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return argent;
	}

	public void recevoir(int argent1) {
		argent = argent + argent1;
		parler(argent1 + " sous ! Je te remercie généreux donnateur!");
	}
}

package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à  la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		parler("J'ai piqué les" + victime.getArgent() + " sous de " + victime.getNom() + ", ce qui me fait" + argent
				+ "sous dans poche. HiHi !");
		reputation=reputation+1;
	}
	
	
	
	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public void gagner(Ronin ronin) {
		reputation=reputation+1;
		int vol=ronin.getArgent();
		argent= argent+vol;
		parler("Ce ronin pensait vraiment battre "+ getNom() +" du clan "+clan
				+ " Je l'ai dépouillé de ses "+vol+" sous");
	}
	
	public void perdre(Ronin ronin) {
		int perte=argent;
		argent=0;
		reputation=reputation-1;
		parler("J'ai perdu mon duel et mes "+perte+" sous, snif... J'ai déshonoré le clan de "+clan);
	}
}

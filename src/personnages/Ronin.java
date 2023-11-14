package personnages;

public class Ronin extends Humain {
	int honneur=1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = argent/10;
		argent=argent-don;
		parler(beneficiaire.getNom()+" prends ces "+don+" sous.");
		beneficiaire.recevoir(don);
	}
	
	public void provoquer(Yakuza yakuza) {
		int force = 2*honneur;
		if(force>=yakuza.getReputation()) {
			parler("Je t'ai retrouvé vermine,"
					+ " tu vas payer pour ce que tu as fait à  ce pauvre marchand!");
			argent=argent + yakuza.getArgent();
			parler("Je t'ai eu petit yakuza");
			honneur=honneur+1;
			yakuza.perdre(this);
		}else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			honneur=honneur-1;
			yakuza.gagner(this);
			argent=0;
		}
	}
}

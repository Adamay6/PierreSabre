package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Humain;
import personnages.Yakuza;
public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kambucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		Commercant marco = new Commercant("Marco", "thé", 66);
		marco.direBonjour();
		Yakuza yaku= new Yakuza("Yaku Le Noir","whisky",5,"Warsong");
		yaku.direBonjour();
		yaku.extorquer(marco);
		marco.recevoir(15);
		marco.boire();
		Ronin roro=new Ronin("Roro","shochu",60);
		roro.donner(marco);
		marco.recevoir(15);
		yaku.extorquer(marco);
		marco.recevoir(15);
		yaku.extorquer(marco);
		roro.provoquer(yaku);
	}

}

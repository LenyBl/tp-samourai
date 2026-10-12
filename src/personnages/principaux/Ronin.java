package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain {

    private int honneur = 1;

    public Ronin(String nom, int argent, String boisson) {

        super(nom, argent, boisson);

    }

    public void donner(int n, Commercant c) {

        parler("Tiens marchens voilà " + n + " sous.");
        c.recevoir(n);
        this.perdreArgent(n);

    }

    public void provoquer(Yakusa y) {

        if ((this.honneur * 2) > y.getReputation()) {

            this.gagnerArgent(y.getArgent());
            this.honneur += 1;
            y.perdreDuel();
            this.parler("Je t’ai eu petit yakusa!");
        } else {
            this.honneur -= 1;
            y.gagnerDuel();
            this.parler(" Roooooh je viens de perdre contre le grand yakusa!");
        }
    }

}

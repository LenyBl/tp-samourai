package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {

    public Commercant(String nom, int argent) {
        super(nom, argent, "thé");
    }

    public int seFaireExtorquer() {

        this.perdreArgent(this.getArgent());
        this.parler("J’ai tout perdu! Le monde est trop\n" +
                "injuste...");
        return this.getArgent();

    }

    public void recevoir(int n) {

        this.gagnerArgent(n);
        this.parler("Je te remercie généreux donateur!");

    }
}

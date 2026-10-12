package personnages.principaux;

import personnages.Humain;

public class Yakusa extends Humain {

    private String clan;
    private int reputation = 0;

    public Yakusa(String nom, int argent, String boisson, String clan) {
        super(nom, argent, boisson);
        this.clan = clan;
    }

    public void extorquer(Commercant commercant) {

        int argentGagne = commercant.getArgent();
        commercant.seFaireExtorquer();
        this.gagnerArgent(argentGagne);
        this.reputation += 1;
        this.parler("J’ai piqué le fric de Marchant" );
    }

    public String getClan() {

        return this.clan;

    }

    public int getReputation() {

        return this.reputation;

    }

    public void gagnerDuel() {

        this.reputation += 1;
        this.parler("Je viens de gagner un duel face à un ronin !");

    }

    public int perdreDuel() {

        int argentPerdu = this.getArgent();
        this.perdreArgent(this.getArgent());
        this.reputation -= 1;
        this.parler(" J’ai perdu mon duel et mes " + argentPerdu + " sous, snif...");

        return argentPerdu;
    }

    @Override
    public void direBonjour() {

        String texte = "Bonjour ! Je m'appelle " + this.getNom() + " et j'aime boire du " + this.getBoisson() + " et j'ai " + this.getArgent() + " en poche";
        String clan = "Mon clan est celui de " + this.getClan();
        parler(texte);
        parler(clan);
    }
}

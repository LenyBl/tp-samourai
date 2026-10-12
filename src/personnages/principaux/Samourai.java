package personnages.principaux;

public class Samourai extends Ronin {

    private String nomSeigneur;

    public Samourai(String nom, int argent, String boisson, String seigneur) {

        super(nom, argent, boisson);
        this.nomSeigneur = seigneur;

    }

    public String getNomSeigneur() {

        return this.nomSeigneur;

    }

    @Override
    public void direBonjour() {
        super.direBonjour();
        parler(" et je sers le seigneur " + this.getNomSeigneur() + " !");
    }

    public void boire(String boisson) {

        String texte = "Mmmm, un bon verre de " + boisson + " ! GLOUPS !";
        parler(texte);

    }
}

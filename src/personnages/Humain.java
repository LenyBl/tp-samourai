package personnages;

public class Humain {

    private String nom;
    private int argent;
    private String boisson;

    public Humain(String nom, int argent, String boisson) {

        this.nom = nom;
        this.argent = argent;
        this.boisson = boisson;

    }

    public void parler(String texte) {

        System.out.println((this.nom) + " - " + texte);

    }

    public void direBonjour() {

        String texte = "Bonjour ! Je m'appelle " + this.getNom() + " et j'aime boire du " + this.getBoisson();
        parler(texte);

    }

    public void boire() {

        String texte = "Mmmm, un bon verre de " + this.getBoisson() + " ! GLOUPS !";
        parler(texte);

    }

    public int getArgent() {

        return this.argent;

    }

    public String getNom() {

        return this.nom;

    }

    public String getBoisson() {

        return this.boisson;

    }

    public void gagnerArgent(int n) {

        this.argent += n;

    }

    public void perdreArgent(int n) {

        this.argent -= n;

    }


}

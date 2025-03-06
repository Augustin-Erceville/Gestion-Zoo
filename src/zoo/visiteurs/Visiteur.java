package zoo.visiteurs;

public abstract class Visiteur {
    protected String nom;
    protected int age;
    protected double prixBillet;

    public Visiteur(String nom, int age, double prixBillet) {
        this.nom = nom;
        this.age = age;
        this.prixBillet = prixBillet;
    }

    public abstract void exprimerReaction(String evenement);

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public double getPrixBillet() {
        return prixBillet;
    }

    @Override
    public String toString() {
        return nom + " (" + age + " ans) - Prix du billet : " + prixBillet + "€";
    }
}
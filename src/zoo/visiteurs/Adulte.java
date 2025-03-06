package zoo.visiteurs;

public class Adulte extends Visiteur {
    private static final double PRIX_BILLET = 16.0;

    public Adulte(String nom, int age) {
        super(nom, age, PRIX_BILLET);
    }

    @Override
    public void exprimerReaction(String evenement) {
        System.out.println(nom + " apprécie en voyant " + evenement);
    }
}

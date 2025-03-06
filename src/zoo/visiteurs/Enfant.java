package zoo.visiteurs;

public class Enfant extends Visiteur {
    private static final double PRIX_BILLET = 8.50;

    public Enfant(String nom, int age) {
        super(nom, age, PRIX_BILLET);
    }

    @Override
    public void exprimerReaction(String evenement) {
        System.out.println(nom + " braille en voyant " + evenement);
    }
}

package zoo.animaux;

public class Oiseau extends Animal {
    public Oiseau(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(nom + " chante mélodieusement.");
    }

    @Override
    public void seDeplacer() {
        System.out.println(nom + " vole gracieusement dans les airs.");
    }

    @Override
    public void manger() {
        System.out.println(nom + " picore des graines.");
    }
}

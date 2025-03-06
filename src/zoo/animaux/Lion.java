package zoo.animaux;

public class Lion extends Animal {
    public Lion(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(nom + " hrle fort !");
    }

    @Override
    public void seDeplacer() {
        System.out.println(nom + " marche par terre.");
    }

    @Override
    public void manger() {
        System.out.println(nom + " dévore de viande.");
    }
}

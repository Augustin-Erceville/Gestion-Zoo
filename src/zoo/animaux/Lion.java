package zoo.animaux;

public class Lion extends Animal {
    public Lion(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(nom + " rugit puissamment !");
    }

    @Override
    public void seDeplacer() {
        System.out.println(nom + " marche fièrement dans son enclos.");
    }

    @Override
    public void manger() {
        System.out.println(nom + " dévore une grosse pièce de viande.");
    }
}

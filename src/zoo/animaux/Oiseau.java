package zoo.animaux;

public class Oiseau extends Animal {
    public Oiseau(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(nom + " gazouille.");
    }

    @Override
    public void seDeplacer() {
        System.out.println(nom + " se déplace dans l'airs.");
    }

    @Override
    public void manger() {
        System.out.println(nom + " mange des graines.");
    }
}

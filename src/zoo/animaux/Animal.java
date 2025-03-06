package zoo.animaux;

public abstract class Animal {
    protected String nom;
    protected int age;

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public abstract void faireDuBruit();
    public abstract void seDeplacer();
    public abstract void manger();

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " : " + nom + ", " + age + " ans";
    }
}

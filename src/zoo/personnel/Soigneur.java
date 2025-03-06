package zoo.personnel;

import zoo.animaux.Animal;
import zoo.infrastructure.Enclos;
import java.util.Random;

public class Soigneur {
    private String nom;
    private String specialite;

    public Soigneur(String nom, String specialite) {
        this.nom = nom;
        this.specialite = specialite;
    }

    public void diagnostiquer(Animal animal) {
        if (!animal.getClass().getSimpleName().equals(specialite)) {
            System.out.println(nom + " ne fait pas partue de sa spé !");
            return;
        }

        Random random = new Random();
        boolean malade = random.nextBoolean();
        if (malade) {
            System.out.println(nom + " diagnostique " + animal.getNom() + " : l'animal est malade.");
        } else {
            System.out.println(nom + " diagnostique " + animal.getNom() + " : l'animal est pas malade.");
        }
    }

    public void soigner(Animal animal) {
        if (!animal.getClass().getSimpleName().equals(specialite)) {
            System.out.println(nom + " ne peut pas soigner l'animal !");
            return;
        }
        System.out.println(nom + " soigne " + animal.getNom() + ".");
    }

    public void nettoyer(Enclos enclos) {
        System.out.println(nom + " nettoie l'enclos " + enclos.getNom() + ".");
        enclos.reinitialiserProprete();
    }

    public String getNom() {
        return nom;
    }

    public String getSpecialite() {
        return specialite;
    }
}

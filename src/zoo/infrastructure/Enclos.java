package zoo.infrastructure;

import zoo.animaux.Animal;
import java.util.ArrayList;
import java.util.List;

public class Enclos {
    private String nom;
    private int capaciteMax;
    private int proprete;
    private List<Animal> animaux;

    public Enclos(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.proprete = 0;
        this.animaux = new ArrayList<>();
    }

    public boolean ajouterAnimal(Animal animal) {
        if (animaux.size() < capaciteMax) {
            animaux.add(animal);
            System.out.println(animal.getNom() + " a été affecter à l'enclos " + nom + ".");
            return true;
        } else {
            System.out.println("L'enclos " + nom + " est plein ! Impossible de mettre " + animal.getNom() + ".");
            return false;
        }
    }

    public void retirerAnimal(Animal animal) {
        if (animaux.remove(animal)) {
            System.out.println(animal.getNom() + " a été retiré de l'enclos " + nom + ".");
        } else {
            System.out.println(animal.getNom() + " n'est pas dans l'enclos " + nom + ".");
        }
    }

    public void degraderProprete() {
        if (proprete < 10) {
            proprete++;
            System.out.println("La propreté de l'enclos " + nom + " a diminué. Niveau actuel : " + proprete);
        } else {
            System.out.println("L'enclos " + nom + " est sale !");
        }
    }

    public void reinitialiserProprete() {
        proprete = 0;
        System.out.println("L'enclos " + nom + " a été nettoyé !");
    }

    public String getNom() {
        return nom;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public int getProprete() {
        return proprete;
    }

    public List<Animal> getAnimaux() {
        return animaux;
    }

    @Override
    public String toString() {
        return "Enclos : " + nom + " | Capacité : " + animaux.size() + "/" + capaciteMax +
                " | Propreté : " + proprete + "/10";
    }
}

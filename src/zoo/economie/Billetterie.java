package zoo.infrastructure;

import zoo.visiteurs.Visiteur;
import java.util.ArrayList;
import java.util.List;

public class Billetterie {
    private List<Visiteur> visiteurs;
    private double recettes;

    public Billetterie() {
        this.visiteurs = new ArrayList<>();
        this.recettes = 0.0;
    }

    public void vendreBillet(Visiteur visiteur) {
        visiteurs.add(visiteur);
        recettes += visiteur.getPrixBillet();
        System.out.println(visiteur.getNom() + " a acheté un billet pour " + visiteur.getPrixBillet() + "€.");
    }

    public double getRecettes() {
        return recettes;
    }

    public int getNombreDeVisiteurs() {
        return visiteurs.size();
    }

    public void afficherRecettes() {
        System.out.println("Total des recettes : " + recettes + "€.");
    }

    public void afficherListeVisiteurs() {
        System.out.println("Liste des visiteurs :");
        for (Visiteur visiteur : visiteurs) {
            System.out.println(visiteur);
        }
    }
}

package zoo;

import zoo.animaux.Lion;
import zoo.animaux.Oiseau;
import zoo.animaux.Serpent;
import zoo.infrastructure.Enclos;
import zoo.infrastructure.Billetterie;
import zoo.personnel.Soigneur;
import zoo.visiteurs.Adulte;
import zoo.visiteurs.Enfant;

public class Main {
    public static void main(String[] args) {

        Lion simba = new Lion("Matou", 5);
        Oiseau perruche = new Oiseau("Pioupiou", 2);
        Serpent cobra = new Serpent("Zouik", 3);

        Enclos enclosLion = new Enclos("Savane", 2);
        Enclos enclosOiseau = new Enclos("Volière", 3);
        Enclos enclosSerpent = new Enclos("Jungle", 5);

        Soigneur paul = new Soigneur("Henry", "Lion");
        Soigneur lucie = new Soigneur("Lucie", "Serpent");

        Adulte paulVisiteur = new Adulte("Paul", 24);
        Enfant lucasVisiteur = new Enfant("Lucas", 12);

        paulVisiteur.exprimerReaction("le rugissement d'un lion");
        lucasVisiteur.exprimerReaction("un perroquet qui parle");
        System.out.print("\n");
        enclosLion.ajouterAnimal(simba);
        enclosOiseau.ajouterAnimal(perruche);
        enclosSerpent.ajouterAnimal(cobra);
            System.out.print("\n");
        paul.diagnostiquer(simba);
        paul.soigner(simba);
            System.out.print("\n");
        lucie.diagnostiquer(cobra);
        lucie.soigner(cobra);
            System.out.print("\n");
        enclosLion.degraderProprete();
        enclosLion.degraderProprete();
        enclosOiseau.degraderProprete();
        enclosSerpent.degraderProprete();
        System.out.println(enclosLion);
            System.out.print("\n");
        enclosLion.reinitialiserProprete();
        System.out.println(enclosLion);
            System.out.print("\n");
        Billetterie billetterie = new Billetterie();
        billetterie.vendreBillet(paulVisiteur);
        billetterie.vendreBillet(lucasVisiteur);
            System.out.print("\n");
        billetterie.afficherRecettes();
        billetterie.afficherListeVisiteurs();
            System.out.print("\n");
        System.out.println(enclosLion);
        System.out.println(enclosOiseau);
        System.out.println(enclosSerpent);
    }
}

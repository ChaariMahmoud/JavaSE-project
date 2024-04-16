package gestionCompte;

//1.1.3. Exécutable – pour les tests
/*
public class TestCompte {
    public static void main(String[] args) {
        // Instanciation de la classe Compte avec un solde initial de 100
        Compte compte = new Compte(100);

        // Utilisation des méthodes pour déposer, retirer et obtenir le solde
        System.out.println("Solde initial: " + compte.getSolde());

        compte.depotDe(50); // Déposer 50
        System.out.println("Solde après dépôt de 50: " + compte.getSolde());

        compte.retraitDe(20); // Retirer 20
        System.out.println("Solde après retrait de 20: " + compte.getSolde());

        compte.depotDe(30); // Déposer 30
        System.out.println("Solde après dépôt de 30: " + compte.getSolde());
    }
}
*/

////1.2. Gestion du compte avec encapsulation
/*package gestionCompte;

public class TestCompte {
    public static void main(String[] args) {
        // Instanciation de la classe Compte avec un solde initial de 100
        Compte compte = new Compte(100);

        // Utilisation des méthodes pour déposer, retirer et obtenir le solde
        System.out.println("Solde initial: " + compte.getSolde());

        compte.depotDe(50); // Déposer 50
        System.out.println("Solde après dépôt de 50: " + compte.getSolde());

        compte.retraitDe(20); // Retirer 20
        System.out.println("Solde après retrait de 20: " + compte.getSolde());

        compte.depotDe(30); // Déposer 30
        System.out.println("Solde après dépôt de 30: " + compte.getSolde());
    }
}
*/

//1.3. Suppression de la variable solde
/*package gestionCompte;

public class TestCompte {
    public static void main(String[] args) {
        // Instanciation de la classe Compte avec un solde initial de 100
        Compte compte = new Compte(100);

        // Utilisation des méthodes pour déposer, retirer et obtenir les sommes
        System.out.println("Solde initial: " + compte.getSolde());

        compte.depotDe(50); // Déposer 50
        compte.retraitDe(20); // Retirer 20
        compte.depotDe(30); // Déposer 30

        // Affichage des sommes déposées et retirées
        System.out.println("Somme des dépôts: " + compte.getSommeDepots());
        System.out.println("Somme des retraits: " + compte.getSommeRetraits());

        // Affichage du solde
        System.out.println("Solde après dépôts et retraits: " + compte.getSolde());
    }
}
*/

//1.4. Gestion des découverts
/*package gestionCompte;

public class TestCompte {
    public static void main(String[] args) {
        // Instanciation de la classe Compte avec un découvert autorisé de 100
        Compte compte = new Compte(100);

        // Utilisation des méthodes pour déposer, retirer et obtenir les sommes
        System.out.println("Solde initial: " + compte.getSolde());

        compte.depotDe(50); // Déposer 50
        compte.retraitDe(20); // Retirer 20
        compte.depotDe(30); // Déposer 30

        // Affichage des sommes déposées et retirées
        System.out.println("Somme des dépôts: " + compte.getSommeDepots());
        System.out.println("Somme des retraits: " + compte.getSommeRetraits());

        // Affichage du solde
        System.out.println("Solde après dépôts et retraits: " + compte.getSolde());
        
        // Affichage du découvert
        System.out.println("Découvert autorisé: " + compte.getDecouvert());
    }
}
*/

//6. GESTION BANCAIRE - EXCEPTIONS
/*// Classe de test pour Compte
public class TestCompte {
    public static void main(String[] args) {
        // Test de la classe Compte avec gestion des exceptions
        Compte compte = new Compte(1000);

        try {
            compte.depotDe(500);
            compte.depotDe(300);
            compte.retraitDe(200);
            compte.retraitDe(1000); // Cela doit lever une exception
        } catch (CompteException e) {
            System.out.println("Erreur survenue : " + e.getMessage());
        }

        System.out.println(compte);
    }
}
*/


//7.1. Les génériques
/*// Classe de test pour Compte
public class TestCompte {
    public static void main(String[] args) {
        // Test de la classe Compte avec gestion des exceptions
        Compte compte = new Compte(1000);

        try {
            compte.depotDe(500);
            compte.depotDe(300);
            compte.retraitDe(200);
        } catch (CompteException e) {
            System.out.println("Erreur survenue : " + e.getMessage());
        }

        // Affichage de l'historique avec une boucle for each
        System.out.println("Historique:");
        for (Mouvement mouvement : compte.getHistorique()) {
            System.out.println(mouvement);
        }
    }
}
*/


//7.2. Ajout d’une fille Agio à Mouvement

public class TestCompte {
    public static void main(String[] args) {
        // Test de la classe Compte avec gestion des exceptions
        Compte compte = new Compte(1000);

        try {
            compte.depotDe(500);
            compte.depotDe(300);
            compte.retraitDe(200);
        } catch (CompteException e) {
            System.out.println("Erreur survenue : " + e.getMessage());
        }

        // Ajout d'un Agio à l'historique
        Agio agio = new Agio(50);
        compte.getHistorique().add(agio);

        // Affichage de l'historique avec une boucle for each
        System.out.println("Historique:");
        for (Mouvement mouvement : compte.getHistorique()) {
            System.out.println(mouvement);
        }
    }
}



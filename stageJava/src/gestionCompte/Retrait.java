package gestionCompte;


//4.3. Lien d’héritage
/*public class Retrait extends Mouvement {
    // Constructeur de la classe Retrait
    public Retrait(int montant) {
        super(montant);
    }
}*/

//4.4. Héritage et polymorphisme
/*// Classe spécialisée Retrait héritant de Mouvement
public class Retrait extends Mouvement {
    // Constructeur de la classe Retrait
    public Retrait(int montant) {
        super(montant);
    }

    // Redéfinition de la méthode getMoins pour les retraits
    @Override
    public int getMoins() {
        return getMontant();
    }
}*/

//5.1. Mouvement
/*public class Retrait extends Mouvement {
    // Constructeur de la classe Retrait
    public Retrait(int montant) {
        super(montant);
    }

    // Redéfinition de la méthode getMoins pour les retraits
    @Override
    public int getMoins() {
        return getMontant();
    }

    // Redéfinition de la méthode getPlus pour les retraits (retourne 0 car un retrait ne peut pas être un dépôt)
    @Override
    public int getPlus() {
        return 0;
    }
}*/

//5.2. Redéfinition de toString()
public class Retrait extends Mouvement {
    // Constructeur de la classe Retrait
    public Retrait(int montant) {
        super(montant);
    }

    // Redéfinition de la méthode getMoins pour les retraits
    @Override
    public int getMoins() {
        return getMontant();
    }

    // Redéfinition de la méthode getPlus pour les retraits (retourne 0 car un retrait ne peut pas être un dépôt)
    @Override
    public int getPlus() {
        return 0;
    }

    // Redéfinition de la méthode toString() pour afficher les informations du retrait
    @Override
    public String toString() {
        return "Retrait - " + super.toString();
    }
}












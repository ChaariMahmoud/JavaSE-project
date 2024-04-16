package gestionCompte;


//1.1. Gestion des dépôts et retraits sur un compte en banque
/*public class Compte {
    private int solde;

    // Constructeur
    public Compte(int soldeInitial) {
        this.solde = soldeInitial;
    }

    // Méthode pour déposer de l'argent
    public void depotDe(int montant) {
        this.solde += montant;
    }

    // Méthode pour retirer de l'argent
    public void retraitDe(int montant) {
        this.solde -= montant;
    }

    // Méthode pour obtenir le solde
    public int getSolde() {
        return this.solde;
    }
}*/


//1.2. Gestion du compte avec encapsulation
/*package gestionCompte;

public class Compte {
    private int solde;

    // Constructeur
    public Compte(int soldeInitial) {
        this.solde = soldeInitial;
    }

    // Méthode pour déposer de l'argent
    public void depotDe(int montant) {
        this.solde += montant;
    }

    // Méthode pour retirer de l'argent
    public void retraitDe(int montant) {
        this.solde -= montant;
    }

    // Méthode pour obtenir le solde
    public int getSolde() {
        return this.solde;
    }
}
*/
 //1.3. Suppression de la variable solde
/*package gestionCompte;

public class Compte {
    private int sommeDepots;
    private int sommeRetraits;

    // Constructeur
    public Compte(int soldeInitial) {
        this.sommeDepots = soldeInitial;
        this.sommeRetraits = 0;
    }

    // Méthode pour déposer de l'argent
    public void depotDe(int montant) {
        this.sommeDepots += montant;
    }

    // Méthode pour retirer de l'argent
    public void retraitDe(int montant) {
        this.sommeRetraits += montant;
    }

    // Méthode pour obtenir la somme des dépôts
    public int getSommeDepots() {
        return this.sommeDepots;
    }

    // Méthode pour obtenir la somme des retraits
    public int getSommeRetraits() {
        return this.sommeRetraits;
    }

    // Méthode pour obtenir le solde
    public int getSolde() {
        return this.sommeDepots - this.sommeRetraits;
    }
}
*/

//1.4. Gestion des découverts
/*package gestionCompte;

public class Compte {
    private int sommeDepots;
    private int sommeRetraits;
    private int decouvert;

    // Constructeur sans argument
    public Compte() {
        this.sommeDepots = 0;
        this.sommeRetraits = 0;
        this.decouvert = 0;
    }

    // Constructeur avec le montant du découvert
    public Compte(int decouvertAutorise) {
        this(); // Appel du constructeur sans argument
        this.decouvert = decouvertAutorise;
    }

    // Méthode pour déposer de l'argent
    public void depotDe(int montant) {
        this.sommeDepots += montant;
    }

    // Méthode pour retirer de l'argent
    public boolean retraitDe(int montant) {
        if (verifDecouvert(montant)) {
            this.sommeRetraits += montant;
            return true;
        } else {
            return false;
        }
    }

    // Méthode pour vérifier si un retrait est autorisé en fonction du solde et du découvert
    private boolean verifDecouvert(int montant) {
        return (this.sommeDepots - this.sommeRetraits - montant >= -this.decouvert);
    }

    // Méthode pour obtenir la somme des dépôts
    public int getSommeDepots() {
        return this.sommeDepots;
    }

    // Méthode pour obtenir la somme des retraits
    public int getSommeRetraits() {
        return this.sommeRetraits;
    }

    // Méthode pour obtenir le solde
    public int getSolde() {
        return this.sommeDepots - this.sommeRetraits;
    }

    // Getter et setter pour le découvert
    public int getDecouvert() {
        return this.decouvert;
    }

    public void setDecouvert(int decouvert) {
        this.decouvert = decouvert;
    }
}
*/

//2. GESTION BANCAIRE - TABLEAUX
/*package gestionCompte;

public class Compte {
    private int[] depots;
    private int[] retraits;
    private int iDepots;
    private int iRetraits;
    private int decouvert;

    // Constructeur sans argument
    public Compte() {
        this.depots = new int[100]; // Initialisation avec une taille arbitraire
        this.retraits = new int[100]; // Initialisation avec une taille arbitraire
        this.iDepots = 0;
        this.iRetraits = 0;
        this.decouvert = 0;
    }

    // Constructeur avec le montant du découvert
    public Compte(int decouvertAutorise) {
        this(); // Appel du constructeur sans argument
        this.decouvert = decouvertAutorise;
    }

    // Méthode pour déposer de l'argent
    public void depotDe(int montant) {
        this.depots[this.iDepots++] = montant;
    }

    // Méthode pour retirer de l'argent
    public boolean retraitDe(int montant) {
        if (verifDecouvert(montant)) {
            this.retraits[this.iRetraits++] = montant;
            return true;
        } else {
            return false;
        }
    }

    // Méthode pour vérifier si un retrait est autorisé en fonction du solde et du découvert
    private boolean verifDecouvert(int montant) {
        return (getSolde() - montant >= -this.decouvert);
    }

    // Méthode pour obtenir la somme des dépôts
    public int getSommeDepots() {
        int somme = 0;
        for (int i = 0; i < this.iDepots; i++) {
            somme += this.depots[i];
        }
        return somme;
    }

    // Méthode pour obtenir la somme des retraits
    public int getSommeRetraits() {
        int somme = 0;
        for (int i = 0; i < this.iRetraits; i++) {
            somme += this.retraits[i];
        }
        return somme;
    }

    // Méthode pour obtenir le solde
    public int getSolde() {
        return getSommeDepots() - getSommeRetraits();
    }

    // Getter et setter pour le découvert
    public int getDecouvert() {
        return this.decouvert;
    }

    public void setDecouvert(int decouvert) {
        this.decouvert = decouvert;
    }
}
*/

//3.1. Exploitation traditionnelle de Vector
/*import java.util.Vector;

public class Compte {
    private Vector depots;
    private Vector retraits;
    private int decouvert;

    // Constructeur sans argument
    public Compte() {
        this.depots = new Vector();
        this.retraits = new Vector();
        this.decouvert = 0;
    }

    // Constructeur avec le montant du découvert
    public Compte(int decouvertAutorise) {
        this();
        this.decouvert = decouvertAutorise;
    }

    // Méthode pour déposer de l'argent
    public void depotDe(int montant) {
        this.depots.add(montant);
    }

    // Méthode pour retirer de l'argent
    public boolean retraitDe(int montant) {
        if (verifDecouvert(montant)) {
            this.retraits.add(montant);
            return true;
        } else {
            return false;
        }
    }

    // Méthode pour vérifier si un retrait est autorisé en fonction du solde et du découvert
    private boolean verifDecouvert(int montant) {
        return (getSolde() - montant >= -this.decouvert);
    }

    // Méthode pour obtenir la somme des dépôts
    public int getSommeDepots() {
        int somme = 0;
        for (Object depot : this.depots) {
            somme += (int) depot;
        }
        return somme;
    }

    // Méthode pour obtenir la somme des retraits
    public int getSommeRetraits() {
        int somme = 0;
        for (Object retrait : this.retraits) {
            somme += (int) retrait;
        }
        return somme;
    }

    // Méthode pour obtenir le solde
    public int getSolde() {
        return getSommeDepots() - getSommeRetraits();
    }

    // Getter et setter pour le découvert
    public int getDecouvert() {
        return this.decouvert;
    }

    public void setDecouvert(int decouvert) {
        this.decouvert = decouvert;
    }
}
*/

//3.2. Exploitation de Vector via l’itérateur Enumeration
/*import java.util.Vector;
import java.util.Enumeration;

public class Compte {
    private Vector<Integer> depots;
    private Vector<Integer> retraits;
    private int decouvert;

    // Constructeur sans argument
    public Compte() {
        this.depots = new Vector<>();
        this.retraits = new Vector<>();
        this.decouvert = 0;
    }

    // Constructeur avec le montant du découvert
    public Compte(int decouvertAutorise) {
        this();
        this.decouvert = decouvertAutorise;
    }

    // Méthode pour déposer de l'argent
    public void depotDe(int montant) {
        this.depots.add(montant);
    }

    // Méthode pour retirer de l'argent
    public boolean retraitDe(int montant) {
        if (verifDecouvert(montant)) {
            this.retraits.add(montant);
            return true;
        } else {
            return false;
        }
    }

    // Méthode pour vérifier si un retrait est autorisé en fonction du solde et du découvert
    private boolean verifDecouvert(int montant) {
        return (getSolde() - montant >= -this.decouvert);
    }

    // Méthode pour obtenir la somme des dépôts
    public int getSommeDepots() {
        int somme = 0;
        Enumeration<Integer> enumDepots = this.depots.elements();
        while (enumDepots.hasMoreElements()) {
            somme += enumDepots.nextElement();
        }
        return somme;
    }

    // Méthode pour obtenir la somme des retraits
    public int getSommeRetraits() {
        int somme = 0;
        Enumeration<Integer> enumRetraits = this.retraits.elements();
        while (enumRetraits.hasMoreElements()) {
            somme += enumRetraits.nextElement();
        }
        return somme;
    }

    // Méthode pour obtenir le solde
    public int getSolde() {
        return getSommeDepots() - getSommeRetraits();
    }

    // Getter et setter pour le découvert
    public int getDecouvert() {
        return this.decouvert;
    }

    public void setDecouvert(int decouvert) {
        this.decouvert = decouvert;
    }
}
*/


//4.1. Lien de composition
/*import java.util.Vector;

public class Compte {
    private Vector<Mouvement> depots;
    private Vector<Mouvement> retraits;
    private int decouvert;

    // Constructeur sans argument
    public Compte() {
        this.depots = new Vector<>();
        this.retraits = new Vector<>();
        this.decouvert = 0;
    }

    // Constructeur avec le montant du découvert
    public Compte(int decouvertAutorise) {
        this();
        this.decouvert = decouvertAutorise;
    }

    // Méthode pour déposer de l'argent
    public void depotDe(int montant) {
        Mouvement mouvement = new Mouvement(montant, Mouvement.TypeMouvement.DEPOT);
        this.depots.add(mouvement);
    }

    // Méthode pour retirer de l'argent
    public boolean retraitDe(int montant) {
        if (verifDecouvert(montant)) {
            Mouvement mouvement = new Mouvement(montant, Mouvement.TypeMouvement.RETRAIT);
            this.retraits.add(mouvement);
            return true;
        } else {
            return false;
        }
    }

    // Méthode pour vérifier si un retrait est autorisé en fonction du solde et du découvert
    private boolean verifDecouvert(int montant) {
        return (getSolde() - montant >= -this.decouvert);
    }

    // Méthode pour obtenir la somme des dépôts
    public int getSommeDepots() {
        int somme = 0;
        for (Mouvement mouvement : this.depots) {
            somme += mouvement.getMontant();
        }
        return somme;
    }

    // Méthode pour obtenir la somme des retraits
    public int getSommeRetraits() {
        int somme = 0;
        for (Mouvement mouvement : this.retraits) {
            somme += mouvement.getMontant();
        }
        return somme;
    }

    // Méthode pour obtenir le solde
    public int getSolde() {
        return getSommeDepots() - getSommeRetraits();
    }

    // Getter et setter pour le découvert
    public int getDecouvert() {
        return this.decouvert;
    }

    public void setDecouvert(int decouvert) {
        this.decouvert = decouvert;
    }
}
*/

//4.2. Lien de composition et un seul vecteur
/*import java.util.Vector;

public class Compte {
    private Vector<Mouvement> historique;
    private int decouvert;

    // Constructeur sans argument
    public Compte() {
        this.historique = new Vector<>();
        this.decouvert = 0;
    }

    // Constructeur avec le montant du découvert
    public Compte(int decouvertAutorise) {
        this();
        this.decouvert = decouvertAutorise;
    }

    // Méthode pour déposer de l'argent
    public void depotDe(int montant) {
        Mouvement mouvement = new Mouvement(montant, Mouvement.TypeMouvement.DEPOT);
        this.historique.add(mouvement);
    }

    // Méthode pour retirer de l'argent
    public boolean retraitDe(int montant) {
        if (verifDecouvert(montant)) {
            Mouvement mouvement = new Mouvement(montant, Mouvement.TypeMouvement.RETRAIT);
            this.historique.add(mouvement);
            return true;
        } else {
            return false;
        }
    }

    // Méthode pour vérifier si un retrait est autorisé en fonction du solde et du découvert
    private boolean verifDecouvert(int montant) {
        return (getSolde() - montant >= -this.decouvert);
    }

    // Méthode pour obtenir la somme des dépôts
    public int getSommeDepots() {
        int somme = 0;
        for (Mouvement mouvement : this.historique) {
            if (mouvement.getType() == Mouvement.TypeMouvement.DEPOT) {
                somme += mouvement.getMontant();
            }
        }
        return somme;
    }

    // Méthode pour obtenir la somme des retraits
    public int getSommeRetraits() {
        int somme = 0;
        for (Mouvement mouvement : this.historique) {
            if (mouvement.getType() == Mouvement.TypeMouvement.RETRAIT) {
                somme += mouvement.getMontant();
            }
        }
        return somme;
    }

    // Méthode pour obtenir le solde
    public int getSolde() {
        return getSommeDepots() - getSommeRetraits();
    }

    // Getter et setter pour le découvert
    public int getDecouvert() {
        return this.decouvert;
    }

    public void setDecouvert(int decouvert) {
        this.decouvert = decouvert;
    }
}
*/

////4.3. Lien d’héritage
/*import java.util.Vector;

public class Compte {
    private Vector<Mouvement> historique;
    private int decouvert;

    // Constructeur sans argument
    public Compte() {
        this.historique = new Vector<>();
        this.decouvert = 0;
    }

    // Constructeur avec le montant du découvert
    public Compte(int decouvertAutorise) {
        this();
        this.decouvert = decouvertAutorise;
    }

    // Méthode pour déposer de l'argent
    public void depotDe(int montant) {
        Depot depot = new Depot(montant);
        this.historique.add(depot);
    }

    // Méthode pour retirer de l'argent
    public boolean retraitDe(int montant) {
        if (verifDecouvert(montant)) {
            Retrait retrait = new Retrait(montant);
            this.historique.add(retrait);
            return true;
        } else {
            return false;
        }
    }

    // Méthode pour vérifier si un retrait est autorisé en fonction du solde et du découvert
    private boolean verifDecouvert(int montant) {
        return (getSolde() - montant >= -this.decouvert);
    }

    // Méthode pour obtenir la somme des dépôts
    public int getSommeDepots() {
        int somme = 0;
        for (Mouvement mouvement : this.historique) {
            if (mouvement instanceof Depot) {
                somme += mouvement.getMontant();
            }
        }
        return somme;
    }

    // Méthode pour obtenir la somme des retraits
    public int getSommeRetraits() {
        int somme = 0;
        for (Mouvement mouvement : this.historique) {
            if (mouvement instanceof Retrait) {
                somme += mouvement.getMontant();
            }
        }
        return somme;
    }

    // Méthode pour obtenir le solde
    public int getSolde() {
        return getSommeDepots() - getSommeRetraits();
    }

    // Getter et setter pour le découvert
    public int getDecouvert() {
        return this.decouvert;
    }

    public void setDecouvert(int decouvert) {
        this.decouvert = decouvert;
    }
}
*/

//4.4. Héritage et polymorphisme
/*// Classe Compte
public class Compte {
    private Vector<Mouvement> historique;
    private int decouvert;

    // Constructeur sans argument
    public Compte() {
        this.historique = new Vector<>();
        this.decouvert = 0;
    }

    // Constructeur avec le montant du découvert
    public Compte(int decouvertAutorise) {
        this();
        this.decouvert = decouvertAutorise;
    }

    // Méthode pour déposer de l'argent
    public void depotDe(int montant) {
        Depot depot = new Depot(montant);
        this.historique.add(depot);
    }

    // Méthode pour retirer de l'argent
    public boolean retraitDe(int montant) {
        if (verifDecouvert(montant)) {
            Retrait retrait = new Retrait(montant);
            this.historique.add(retrait);
            return true;
        } else {
            return false;
        }
    }

    // Méthode pour vérifier si un retrait est autorisé en fonction du solde et du découvert
    private boolean verifDecouvert(int montant) {
        return (getSolde() - montant >= -this.decouvert);
    }

    // Méthode pour obtenir la somme des dépôts
    public int getSommeDepots() {
        int somme = 0;
        for (Mouvement mouvement : this.historique) {
            somme += mouvement.getPlus(); // Utilisation du polymorphisme
        }
        return somme;
    }

    // Méthode pour obtenir la somme des retraits
    public int getSommeRetraits() {
        int somme = 0;
        for (Mouvement mouvement : this.historique) {
            somme += mouvement.getMoins(); // Utilisation du polymorphisme
        }
        return somme;
    }

    // Méthode pour obtenir le solde
    public int getSolde() {
        return getSommeDepots() - getSommeRetraits();
    }

    // Getter et setter pour le découvert
    public int getDecouvert() {
        return this.decouvert;
    }

    public void setDecouvert(int decouvert) {
        this.decouvert = decouvert;
    }
}*/

//5.1. Mouvement
/*public class Compte {
    private Vector<Mouvement> historique;
    private int decouvert;

    // Constructeur sans argument
    public Compte() {
        this.historique = new Vector<>();
        this.decouvert = 0;
    }

    // Constructeur avec le montant du découvert
    public Compte(int decouvertAutorise) {
        this();
        this.decouvert = decouvertAutorise;
    }

    // Méthode pour déposer de l'argent
    public void depotDe(int montant) {
        Depot depot = new Depot(montant);
        this.historique.add(depot);
    }

    // Méthode pour retirer de l'argent
    public boolean retraitDe(int montant) {
        if (verifDecouvert(montant)) {
            Retrait retrait = new Retrait(montant);
            this.historique.add(retrait);
            return true;
        } else {
            return false;
        }
    }

    // Méthode pour vérifier si un retrait est autorisé en fonction du solde et du découvert
    private boolean verifDecouvert(int montant) {
        return (getSolde() - montant >= -this.decouvert);
    }

    // Méthode pour obtenir la somme des dépôts
    public int getSommeDepots() {
        int somme = 0;
        for (Mouvement mouvement : this.historique) {
            somme += mouvement.getPlus(); // Utilisation du polymorphisme
        }
        return somme;
    }

    // Méthode pour obtenir la somme des retraits
    public int getSommeRetraits() {
        int somme = 0;
        for (Mouvement mouvement : this.historique) {
            somme += mouvement.getMoins(); // Utilisation du polymorphisme
        }
        return somme;
    }

    // Méthode pour obtenir le solde
    public int getSolde() {
        return getSommeDepots() - getSommeRetraits();
    }

    // Getter et setter pour le découvert
    public int getDecouvert() {
        return this.decouvert;
    }

    public void setDecouvert(int decouvert) {
        this.decouvert = decouvert;
    }
}*/

//5.2. Redéfinition de toString()
/*public class Compte {
    private Vector<Mouvement> historique;
    private int decouvert;

    // Constructeur sans argument
    public Compte() {
        this.historique = new Vector<>();
        this.decouvert = 0;
    }

    // Constructeur avec le montant du découvert
    public Compte(int decouvertAutorise) {
        this();
        this.decouvert = decouvertAutorise;
    }

    // Méthode pour déposer de l'argent
    public void depotDe(int montant) {
        Depot depot = new Depot(montant);
        this.historique.add(depot);
    }

    // Méthode pour retirer de l'argent
    public boolean retraitDe(int montant) {
        if (verifDecouvert(montant)) {
            Retrait retrait = new Retrait(montant);
            this.historique.add(retrait);
            return true;
        } else {
            return false;
        }
    }

    // Méthode pour vérifier si un retrait est autorisé en fonction du solde et du découvert
    private boolean verifDecouvert(int montant) {
        return (getSolde() - montant >= -this.decouvert);
    }

    // Méthode pour obtenir la somme des dépôts
    public int getSommeDepots() {
        int somme = 0;
        for (Mouvement mouvement : this.historique) {
            somme += mouvement.getPlus(); // Utilisation du polymorphisme
        }
        return somme;
    }

    // Méthode pour obtenir la somme des retraits
    public int getSommeRetraits() {
        int somme = 0;
        for (Mouvement mouvement : this.historique) {
            somme += mouvement.getMoins(); // Utilisation du polymorphisme
        }
        return somme;
    }

    // Méthode pour obtenir le solde
    public int getSolde() {
        return getSommeDepots() - getSommeRetraits();
    }

    // Getter et setter pour le découvert
    public int getDecouvert() {
        return this.decouvert;
    }

    public void setDecouvert(int decouvert) {
        this.decouvert = decouvert;
    }

    // Redéfinition de la méthode toString() pour afficher les informations du compte
    @Override
    public String toString() {
        return "Solde: " + getSolde() + ", Découvert: " + decouvert;
    }
}
*/
//5.3. Compte – Retour de l’historique
/*import java.util.Vector;

// Classe Compte
public class Compte {
    private Vector<Mouvement> historique;
    private int decouvert;

    // Constructeur sans argument
    public Compte() {
        this.historique = new Vector<>();
        this.decouvert = 0;
    }

    // Constructeur avec le montant du découvert
    public Compte(int decouvertAutorise) {
        this();
        this.decouvert = decouvertAutorise;
    }

    // Méthode pour déposer de l'argent
    public void depotDe(int montant) {
        Depot depot = new Depot(montant);
        this.historique.add(depot);
    }

    // Méthode pour retirer de l'argent
    public boolean retraitDe(int montant) {
        if (verifDecouvert(montant)) {
            Retrait retrait = new Retrait(montant);
            this.historique.add(retrait);
            return true;
        } else {
            return false;
        }
    }

    // Méthode pour vérifier si un retrait est autorisé en fonction du solde et du découvert
    private boolean verifDecouvert(int montant) {
        return (getSolde() - montant >= -this.decouvert);
    }

    // Méthode pour obtenir la somme des dépôts
    public int getSommeDepots() {
        int somme = 0;
        for (Mouvement mouvement : this.historique) {
            somme += mouvement.getPlus(); // Utilisation du polymorphisme
        }
        return somme;
    }

    // Méthode pour obtenir la somme des retraits
    public int getSommeRetraits() {
        int somme = 0;
        for (Mouvement mouvement : this.historique) {
            somme += mouvement.getMoins(); // Utilisation du polymorphisme
        }
        return somme;
    }

    // Méthode pour obtenir le solde
    public int getSolde() {
        return getSommeDepots() - getSommeRetraits();
    }

    // Getter et setter pour le découvert
    public int getDecouvert() {
        return this.decouvert;
    }

    public void setDecouvert(int decouvert) {
        this.decouvert = decouvert;
    }

    // Méthode pour obtenir le contenu du vecteur historique sous forme de chaîne de caractères
    public String getHistoriqueAsString() {
        StringBuilder sb = new StringBuilder();
        for (Mouvement mouvement : this.historique) {
            sb.append(mouvement.toString()).append("\n");
        }
        return sb.toString();
    }

    // Redéfinition de la méthode toString() pour afficher les informations du compte
    @Override
    public String toString() {
        return "Solde: " + getSolde() + ", Découvert: " + decouvert + "\nHistorique:\n" + getHistoriqueAsString();
    }
}
*/

//6. GESTION BANCAIRE - EXCEPTIONS
/*import java.util.Vector;

// Classe Compte
public class Compte {
    private Vector<Mouvement> historique;
    private int decouvert;

    // Constructeur sans argument
    public Compte() {
        this.historique = new Vector<>();
        this.decouvert = 0;
    }

    // Constructeur avec le montant du découvert
    public Compte(int decouvertAutorise) {
        this();
        this.decouvert = decouvertAutorise;
    }

    // Méthode pour déposer de l'argent
    public void depotDe(int montant) {
        Depot depot = new Depot(montant);
        this.historique.add(depot);
    }

    // Méthode pour retirer de l'argent
    public void retraitDe(int montant) throws CompteException {
        if (!verifDecouvert(montant)) {
            throw new CompteException("Impossible de retirer la somme demandée : découvert insuffisant");
        }
        Retrait retrait = new Retrait(montant);
        this.historique.add(retrait);
    }

    // Méthode pour vérifier si un retrait est autorisé en fonction du solde et du découvert
    private boolean verifDecouvert(int montant) {
        return (getSolde() - montant >= -this.decouvert);
    }

    // Méthode pour obtenir la somme des dépôts
    public int getSommeDepots() {
        int somme = 0;
        for (Mouvement mouvement : this.historique) {
            somme += mouvement.getPlus(); // Utilisation du polymorphisme
        }
        return somme;
    }

    // Méthode pour obtenir la somme des retraits
    public int getSommeRetraits() {
        int somme = 0;
        for (Mouvement mouvement : this.historique) {
            somme += mouvement.getMoins(); // Utilisation du polymorphisme
        }
        return somme;
    }

    // Méthode pour obtenir le solde
    public int getSolde() {
        return getSommeDepots() - getSommeRetraits();
    }

    // Getter et setter pour le découvert
    public int getDecouvert() {
        return this.decouvert;
    }

    public void setDecouvert(int decouvert) {
        this.decouvert = decouvert;
    }

    // Méthode pour obtenir le contenu du vecteur historique sous forme de chaîne de caractères
    public String getHistoriqueAsString() {
        StringBuilder sb = new StringBuilder();
        for (Mouvement mouvement : this.historique) {
            sb.append(mouvement.toString()).append("\n");
        }
        return sb.toString();
    }

    // Redéfinition de la méthode toString() pour afficher les informations du compte
    @Override
    public String toString() {
        return "Solde: " + getSolde() + ", Découvert: " + decouvert + "\nHistorique:\n" + getHistoriqueAsString();
    }
}
*/


//7.1. Les génériques
import java.util.List;
import java.util.Vector;
import java.util.ArrayList;

// Classe Compte
public class Compte {
    private Vector<Mouvement> historique;
    private int decouvert;

    // Constructeur sans argument
    public Compte() {
        this.historique = new Vector<>();
        this.decouvert = 0;
    }

    // Constructeur avec le montant du découvert
    public Compte(int decouvertAutorise) {
        this();
        this.decouvert = decouvertAutorise;
    }

    // Méthode pour déposer de l'argent
    public void depotDe(int montant) {
        Depot depot = new Depot(montant);
        this.historique.add(depot);
    }

    // Méthode pour retirer de l'argent
    public void retraitDe(int montant) throws CompteException {
        if (!verifDecouvert(montant)) {
            throw new CompteException("Impossible de retirer la somme demandée : découvert insuffisant");
        }
        Retrait retrait = new Retrait(montant);
        this.historique.add(retrait);
    }

    // Méthode pour vérifier si un retrait est autorisé en fonction du solde et du découvert
    private boolean verifDecouvert(int montant) {
        return (getSolde() - montant >= -this.decouvert);
    }

    // Méthode pour obtenir la somme des dépôts
    public int getSommeDepots() {
        int somme = 0;
        for (Mouvement mouvement : this.historique) {
            somme += mouvement.getPlus(); // Utilisation du polymorphisme
        }
        return somme;
    }

    // Méthode pour obtenir la somme des retraits
    public int getSommeRetraits() {
        int somme = 0;
        for (Mouvement mouvement : this.historique) {
            somme += mouvement.getMoins(); // Utilisation du polymorphisme
        }
        return somme;
    }

    // Méthode pour obtenir le solde
    public int getSolde() {
        return getSommeDepots() - getSommeRetraits();
    }

    // Getter et setter pour le découvert
    public int getDecouvert() {
        return this.decouvert;
    }

    public void setDecouvert(int decouvert) {
        this.decouvert = decouvert;
    }

    // Méthode pour obtenir l'historique sous forme de List<Mouvement>
    public List<Mouvement> getHistorique() {
        return new ArrayList<>(this.historique);
    }

    // Redéfinition de la méthode toString() pour afficher les informations du compte
    @Override
    public String toString() {
        return "Solde: " + getSolde() + ", Découvert: " + decouvert + "\nHistorique:\n" + getHistoriqueAsString();
    }

    // Méthode pour obtenir le contenu du vecteur historique sous forme de chaîne de caractères
    private String getHistoriqueAsString() {
        StringBuilder sb = new StringBuilder();
        for (Mouvement mouvement : this.historique) {
            sb.append(mouvement.toString()).append("\n");
        }
        return sb.toString();
    }
}


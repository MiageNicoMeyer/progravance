
/**
 * @author Michel Buffa + modification Philippe Lahire
 * Inspir� par la classe Reflectiontest.java de
 * Cay S. Horstmann & Gary Cornell, publi�e dans le livre Core Java, Sun Press
 */

import java.lang.reflect.*;
import java.io.*;

public class AnalyseurDeClasseSquelette {

  public static void analyseClasse(String nomClasse) throws ClassNotFoundException {
    // R�cup�ration d'un objet de type Class correspondant au nom pass� en param�tres
    Class cl = // CODE A ECRIRE !

    afficheEnTeteClasse(cl);

    System.out.println();
    afficheInnerClasses(cl);

    System.out.println();
    afficheAttributs(cl);

    System.out.println();
    afficheConstructeurs(cl);

    System.out.println();
    afficheMethodes(cl);

    // L'accolade fermante de fin de classe !
    System.out.println("}");
  }


  /** Retourne la classe dont le nom est pass� en param�tre */
  public static Class getClasse(String nomClasse) throws ClassNotFoundException {
    // CODE A ECRIRE
  }

  /** Cette m�thode affiche par ex "public class C1 extends C2 implements I1, I2 {" */
  public static void afficheEnTeteClasse(Class cl) {
    //  Affichage du modifier et du nom de la classe
    // CODE A ECRIRE

   // R�cup�ration de la superclasse si elle existe (null si cl est le type Object)
    Class supercl = // CODE A ECRIRE

    // On ecrit le "extends " que si la superclasse est non nulle et diff�rente de Object
    // CODE A ECRIRE

    // Affichage des interfaces que la classe implemente
    // CODE A ECRIRE

    // Accolade ouvrante de d�but de classe
    System.out.print(" {\n");
  }

/** Cette m�thode affiche les classes imbriqu�es statiques ou pas
        A faire apr�s avoir fait fonctionner le reste */
 public static void afficheInnerClasses(Class cl) {
    // CODE A ECRIRE
  }

  public static void afficheAttributs(Class cl) {
    // CODE A ECRIRE
  }

  public static void afficheConstructeurs(Class cl) {
    // CODE A ECRIRE
      System.out.println("{}");

    }
  }

  public static void afficheMethodes(Class cl) {
    // CODE A ECRIRE
     System.out.println("{}");
    }
  }

 /* Facultatif au moins dans un premier temps */
/* tester le programme en passant un nom de classe complet en param�tre
     Modifier la m�thode "main" en cons�quence
*/
 public static String litChaineAuClavier() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      return br.readLine();
  }

  public static void main(String[] args) {
    boolean ok = false;

    while(!ok) {
      try {
        System.out.print("Entrez le nom d'une classe (ex : java.util.Date): ");
        String nomClasse = litChaineAuClavier();

       analyseClasse(nomClasse);
        ok = true;
      } catch(ClassNotFoundException e) {
        System.out.println("Classe non trouv�e.");
      }catch(IOException e) {
        System.out.println("Erreur d'E/S!");
      }
    }
  }
}

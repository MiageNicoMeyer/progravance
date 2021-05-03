import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnalyseurDeClasse {

    public static String litChaineAuClavier() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    @MiageBasics(nom = "", prenom = "", annneeUniv = 0, module = "")
    @MiageAdvanced
    public static void main(String[] args) {
        boolean ok = false;

        while(!ok) {
            try {
                System.out.print("Entrez le nom d'une classe (ex : java.util.Date): ");
                String nomClasse = litChaineAuClavier();

                /* Exo 1 : */
                analyseClasse(nomClasse);
                ok = true;

                /* Exo 2 :
                Class cl = getClasse(nomClasse);
                System.out.println(toString(cl,0));
                */

            } catch(ClassNotFoundException e) {
                System.out.println("Classe non trouv�e.");
            } catch(IOException e) {
                System.out.println("Erreur d'E/S!");
            }
        }
    }

    public static void analyseClasse(String nomClasse) throws ClassNotFoundException {
        // R�cup�ration d'un objet de type Class correspondant au nom pass� en param�tres
        Class cl = getClasse(nomClasse);

        afficheEnTeteClasse(cl);

        System.out.println();
        afficheInnerClasses(cl);

        System.out.println();
        afficheAttributs(cl);

        System.out.println();
        afficheConstructeurs(cl);

        System.out.println();
        afficheMethodes(cl);

        System.out.println();
        afficheAnnotations(cl);

        // L'accolade fermante de fin de classe !
        System.out.println("}");
    }

    /** Retourne la classe dont le nom est pass� en param�tre */
    public static Class getClasse(String nomClasse) throws ClassNotFoundException {
        return Class.forName(nomClasse);
    }

    /** Cette m�thode affiche par ex "public class C1 extends C2 implements I1, I2 {" */
    public static void afficheEnTeteClasse(Class cl) {

        System.out.println(cl.getName());

        // R�cup�ration de la superclasse si elle existe (null si cl est le type Object)
        Class supercl = cl.getSuperclass() == null ? null : cl.getSuperclass();

        if(supercl != null && supercl != Object.class) {
            // On ecrit le "extends " que si la superclasse est non nulle et diff�rente de Object
            System.out.println(" extends " + supercl.getName() + "");

            // Affichage des interfaces que la classe implemente
            for(Class interfasse : cl.getInterfaces()) {
                System.out.println(interfasse.getName());
            }

            // Accolade ouvrante de d�but de classe
            System.out.print(" { ");
        }

    }

    /** Cette m�thode affiche les classes imbriqu�es statiques ou pas
     A faire apr�s avoir fait fonctionner le reste */
    public static void afficheInnerClasses(Class cl) {
        System.out.println("InnerClasses : {");
        for(Class innerClass : cl.getClasses()) {
            System.out.println(innerClass.getName());
        }
        System.out.println("}");
    }

    @MiageBasics(nom = "", prenom = "", annneeUniv = 0, module = "")
    public static void afficheAttributs(Class cl) {
        System.out.println("Attributs : {");
        for(Field field : cl.getDeclaredFields()) {
            System.out.println(field.getName());
        }
        System.out.println("}");
    }

    private static void afficheAnnotations(Class cl) {
        System.out.println("Annotations : {");
        for(Annotation annotation: cl.getAnnotations()) {
            System.out.println(annotation.toString());
        }
        System.out.println("}");
    }

    @MiageBasics(nom = "", prenom = "", annneeUniv = 0, module = "")
    public static void afficheConstructeurs(Class cl) {
        System.out.println("Constructeurs : {");
        for(Constructor constructor : cl.getConstructors()) {
            System.out.println(constructor.getName());
        }
        System.out.println("}");
    }

    @MiageBasics(nom = "", prenom = "", annneeUniv = 0, module = "")
    public static void afficheMethodes(Class cl) {
        System.out.println("Methodes : {");
        for(Method method : cl.getMethods()) {
            System.out.println(method.getName());
        }
        System.out.println("}");
    }

    public static void toString(Object object, Integer profondeur) throws Exception {
        if (object.getClass().getFields().length == 0) {

        } else if (profondeur == 0) {
            analyseClasse(object.getClass().getName());
        } else {
            analyseClasse(object.getClass().getName());
            for (Field field : object.getClass().getFields()){
                Constructor<?>[] constructors = field.getClass().getConstructors();
                if (constructors.length > 0) {
                    toString(constructors[0].newInstance(),profondeur-1);
                }
                else {
                    analyseClasse(field.getType() + "");
                }
            }
        }
    }
}


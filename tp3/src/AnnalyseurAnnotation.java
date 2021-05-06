@MiageBasics(nom = "Meyer",
        prenom = "Nicolas",
        anneeUniv = 2020,
        module = "MODULE",
        seance = 1)
public class AnnalyseurAnnotation {

    /** MAIN **/
    public static void main(String[] args) {

    }

    /** ATTRIBUTS **/
    @MiageBasics(nom = "Meyer",
            prenom = "Nicolas",
            anneeUniv = 2021,
            module = "Module",
            seance = 1)
    public Integer integerObject;
    @MiageBasics(nom = "Meyer",
            prenom = "Nicolas",
            anneeUniv = 2020,
            module = "Module",
            seance = 2)
    public int intPrimitif;
    @MiageBasics(nom = "Meyer",
            prenom = "Nicolas",
            anneeUniv = 2020,
            module = "Module",
            seance = 2)
    public String stringObject;

    /** CONSTRUCTEUR **/
    @MiageBasics(nom = "Meyer",
            prenom = "Nicolas",
            anneeUniv = 2021,
            module = "Module",
            seance = 1)
    @MiageAdvanced(etat = MiageAdvanced.Completquali.VERSION_FINALISE,
            etatTest = true,
            automatisation = true)
    public AnnalyseurAnnotation() {
        integerObject = 0;
    }

    /** METHODES **/
    @MiageBasics(nom = "Meyer",
            prenom = "Nicolas",
            anneeUniv = 2021,
            module = "Module",
            seance = 1)
    @MiageAdvanced(etat = MiageAdvanced.Completquali.VERSION_FINALISE)
    public Integer getIntegerObject() {
        return integerObject;
    }

    @MiageBasics(nom = "Meyer",
            prenom = "Nicolas",
            anneeUniv = 2020,
            module = "Module",
            seance = 1)
    @MiageAdvanced(etat = MiageAdvanced.Completquali.DRAFT_PARTIEL)
    public int getIntPrimitifAdvancedOneOption() {
        return intPrimitif;
    }

    @MiageBasics(nom = "Meyer",
            prenom = "Nicolas",
            anneeUniv = 2020,
            module = "Module",
            seance = 1)
    @MiageAdvanced(etat = MiageAdvanced.Completquali.DRAFT_COMPLET,
            etatTest = true,
            automatisation = true)
    public String getStringObjectAdvancedFull() {
        return stringObject;
    }

    /** CLASSE INTERNE **/
    @MiageBasics(nom = "Meyer",
            prenom = "Nicolas",
            anneeUniv = 2020,
            module = "Module",
            seance = 1)
    public static class classInterne {
        private String stringObject;
    }
}

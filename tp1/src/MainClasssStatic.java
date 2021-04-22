import java.util.ArrayList;

public class MainClasssStatic {

    private static Utils utils = new Utils();

    public static void main(String[] args) {

        ArrayList<UeClass> arrayListUeClass = utils.generateArray();

        System.out.println("|------- TRAITEMENT UN --------|");
        arrayListUeClass.forEach(new UeClass.TraitementUn());

        System.out.println("|------- TRAITEMENT DEUX --------|");
        arrayListUeClass.forEach(new UeClass.TraitementDeux());

        System.out.println("|------- TRAITEMENT TROIS --------|");
        arrayListUeClass.forEach(new UeClass.TraitementTrois());
    }
}

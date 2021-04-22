import java.util.ArrayList;

public class MainClassLambda {

    private static Utils utils = new Utils();

    public static void main(String[] args) {

        ArrayList<UeClass> arrayListUeClass = utils.generateArray();

        System.out.println("|------- TRAITEMENT UN --------|");
        arrayListUeClass.forEach(ueClass -> {
            ueClass.setAnneeCrea(ueClass.getAnneeCrea() + 1);
            System.out.println(ueClass.getAnneeCrea());
        });

        System.out.println("|------- TRAITEMENT DEUX --------|");
        arrayListUeClass.forEach(ueClass -> {
            if(ueClass.getNomEnseignementResp().equals("Dupont")) {
                ueClass.setAnneeCrea(ueClass.getAnneeCrea() + 1);
                System.out.println(ueClass.getAnneeCrea());
            }
        });

        System.out.println("|------- TRAITEMENT TROIS --------|");
        arrayListUeClass.forEach(ueClass -> {
            if (ueClass.getTypeControle().equals("QCM") && ueClass.getRattrapage()) {
                ueClass.setRattrapage(false);
                System.out.println(ueClass.getRattrapage());
            }
        });
    }
}

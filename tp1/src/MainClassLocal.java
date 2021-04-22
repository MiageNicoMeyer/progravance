import java.util.ArrayList;

public class MainClassLocal {

    private static Utils utils = new Utils();

    public static void main(String[] args) {

        ArrayList<UeClass> arrayListUeClass = utils.generateArray();

        TraitementUn traitementUn = new TraitementUn();

        System.out.println("|------- TRAITEMENT UN --------|");
        for(UeClass ueClass : arrayListUeClass) {
            traitementUn.traitementUn(ueClass);
        }

        TraitementDeux traitementDeux = new TraitementDeux();

        System.out.println("|------- TRAITEMENT DEUX --------|");
        for(UeClass ueClass : arrayListUeClass) {
            traitementDeux.traitementDeux(ueClass);
        }

        TraitementTrois traitementTrois = new TraitementTrois();

        System.out.println("|------- TRAITEMENT TROIS --------|");
        for(UeClass ueClass : arrayListUeClass) {
            traitementTrois.traitementTrois(ueClass);
        }
    }

    static class TraitementUn {
        void traitementUn(UeClass ueClass) {
            ueClass.setAnneeCrea(ueClass.getAnneeCrea() + 1);
            System.out.println(ueClass.getAnneeCrea());
        }
    }

    static class TraitementDeux {
        void traitementDeux(UeClass ueClass) {
            if(ueClass.getNomEnseignementResp().equals("Dupont")) {
                ueClass.setAnneeCrea(ueClass.getAnneeCrea() + 1);
                System.out.println(ueClass.getAnneeCrea());
            }
        }
    }

    static class TraitementTrois {
        void traitementTrois(UeClass ueClass) {
            if (ueClass.getTypeControle().equals("QCM") && ueClass.getRattrapage()) {
                ueClass.setRattrapage(false);
                System.out.println(ueClass.getRattrapage());
            }
        }
    }
}

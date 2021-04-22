import java.util.ArrayList;

public class MainClassAnonyme {

    private static Utils utils = new Utils();

    interface TraitementUn {
        void innerTraitementUn(UeClass ueClass);
    }

    interface TraitementDeux {
        void innerTraitementDeux(UeClass ueClass);
    }

    interface TraitementTrois {
        void innerTraitementTrois(UeClass ueClass);
    }

    public static void main(String[] args) {

        MainClassAnonyme mainClassAnonyme = new MainClassAnonyme();

        ArrayList<UeClass> arrayListUeClass = utils.generateArray();

        System.out.println("|------- TRAITEMENT UN --------|");
        for(UeClass ueClass : arrayListUeClass) {
            mainClassAnonyme.traitementUn(ueClass);
        }

        System.out.println("|------- TRAITEMENT DEUX --------|");
        for(UeClass ueClass : arrayListUeClass) {
            mainClassAnonyme.traitementDeux(ueClass);
        }

        System.out.println("|------- TRAITEMENT TROIS --------|");
        for(UeClass ueClass : arrayListUeClass) {
            mainClassAnonyme.traitementTrois(ueClass);
        }
    }

    public void traitementUn(UeClass ueClass) {
        class TraitementUnClass implements TraitementUn {

            @Override
            public void innerTraitementUn(UeClass ueClass) {
                ueClass.setAnneeCrea(ueClass.getAnneeCrea() + 1);
                System.out.println(ueClass.getAnneeCrea());
            }
        }
        TraitementUn traitementUn = new TraitementUnClass();
        traitementUn.innerTraitementUn(ueClass);
    }

    public void traitementDeux(UeClass ueClass) {
        class TraitementDeuxClass implements TraitementDeux {

            @Override
            public void innerTraitementDeux(UeClass ueClass) {
                if(ueClass.getNomEnseignementResp().equals("Dupont")) {
                    ueClass.setAnneeCrea(ueClass.getAnneeCrea() + 1);
                    System.out.println(ueClass.getAnneeCrea());
                }
            }
        }
        TraitementDeux traitementDeux = new TraitementDeuxClass();
        traitementDeux.innerTraitementDeux(ueClass);
    }

    public void traitementTrois(UeClass ueClass) {
        class TraitementTroisClass implements TraitementTrois {

            @Override
            public void innerTraitementTrois(UeClass ueClass) {
                if (ueClass.getTypeControle().equals("QCM") && ueClass.getRattrapage()) {
                    ueClass.setRattrapage(false);
                    System.out.println(ueClass.getRattrapage());
                }
            }
        }
        TraitementTrois traitementTrois = new TraitementTroisClass();
        traitementTrois.innerTraitementTrois(ueClass);
    }
}

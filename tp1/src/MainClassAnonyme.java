import java.util.ArrayList;

public class MainClassAnonyme {

    private static ArrayList<UeClass> arrayListUeClass = new ArrayList<>();

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

        arrayListUeClass.add(new UeClass("nomModule1", 2, "nomDiplome1", "nomEnseignementResp1", "QCM", false));
        arrayListUeClass.add(new UeClass("nomModule2", 2, "nomDiplome2", "nomEnseignementResp2", "QCM", true));
        arrayListUeClass.add(new UeClass("nomModule3", 2, "nomDiplome3", "nomEnseignementResp3", "QCM", false));
        arrayListUeClass.add(new UeClass("nomModule4", 2, "nomDiplome4", "Dupont", "QCM", false));
        arrayListUeClass.add(new UeClass("nomModule5", 2, "nomDiplome5", "nomEnseignementResp5", "questions de synthèse", false));
        arrayListUeClass.add(new UeClass("nomModule6", 2, "nomDiplome6", "nomEnseignementResp6", "questions de synthèse", false));
        arrayListUeClass.add(new UeClass("nomModule7", 2, "nomDiplome7", "nomEnseignementResp7", "questions de synthèse", false));
        arrayListUeClass.add(new UeClass("nomModule8", 2, "nomDiplome8", "Dupont", "questions de synthèse", false));
        arrayListUeClass.add(new UeClass("nomModule9", 2, "nomDiplome9", "nomEnseignementResp9", "questions de synthèse", false));
        arrayListUeClass.add(new UeClass("nomModule10", 2, "nomDiplome10", "nomEnseignementResp10", "Projet", true));

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

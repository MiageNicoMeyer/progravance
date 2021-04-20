import java.util.ArrayList;
import java.util.function.Consumer;

public class MainClassNonStatic {

    private static ArrayList<UeClass> arrayListUeClass = new ArrayList<>();

    public void main(String[] args) {

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
        arrayListUeClass.forEach(new TraitementUn());

        System.out.println("|------- TRAITEMENT DEUX --------|");
        arrayListUeClass.forEach(new TraitementDeux());

        System.out.println("|------- TRAITEMENT TROIS --------|");
        arrayListUeClass.forEach(new TraitementTrois());
    }

    public class TraitementUn implements Consumer<UeClass> {
        @Override
        public void accept(UeClass ueClass) {
            ueClass.setAnneeCrea(ueClass.getAnneeCrea() + 1);
            System.out.println(ueClass.getAnneeCrea());
        }
    }

    public class TraitementDeux implements Consumer<UeClass> {
        @Override
        public void accept(UeClass ueClass) {
            if(ueClass.getNomEnseignementResp() == "Dupont") {
                ueClass.setAnneeCrea(ueClass.getAnneeCrea() + 1);
                System.out.println(ueClass.getAnneeCrea());
            }
        }
    }

    public class TraitementTrois implements Consumer<UeClass> {
        @Override
        public void accept(UeClass ueClass) {
            if (ueClass.getTypeControle() == "QCM" && ueClass.getRattrapage()) {
                ueClass.setRattrapage(false);
                System.out.println(ueClass.getRattrapage());
            }
        }
    }
}

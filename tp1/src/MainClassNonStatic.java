import java.util.ArrayList;
import java.util.function.Consumer;

public class MainClassNonStatic {

    private static Utils utils = new Utils();

    public void main(String[] args) {

        ArrayList<UeClass> arrayListUeClass = utils.generateArray();

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
            if(ueClass.getNomEnseignementResp().equals("Dupont")) {
                ueClass.setAnneeCrea(ueClass.getAnneeCrea() + 1);
                System.out.println(ueClass.getAnneeCrea());
            }
        }
    }

    public class TraitementTrois implements Consumer<UeClass> {
        @Override
        public void accept(UeClass ueClass) {
            if (ueClass.getTypeControle().equals("QCM") && ueClass.getRattrapage()) {
                ueClass.setRattrapage(false);
                System.out.println(ueClass.getRattrapage());
            }
        }
    }
}

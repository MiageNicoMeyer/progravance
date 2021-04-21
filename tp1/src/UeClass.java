import java.util.function.Consumer;

public class UeClass {

    private String nomModule;
    private Integer anneeCrea;
    private String nomDiplome;
    private String nomEnseignementResp;
    private String typeControle;
    private Boolean rattrapage;

    public UeClass(String nomModule, Integer anneeCrea, String nomDiplome, String nomEnseignementResp, String typeControle, Boolean rattrapage) {
        this.nomModule = nomModule;
        this.anneeCrea = anneeCrea;
        this.nomDiplome = nomDiplome;
        this.nomEnseignementResp = nomEnseignementResp;
        this.typeControle = typeControle;
        this.rattrapage = rattrapage;
    }

    public UeClass() {

    }

    public String getNomModule() {
        return nomModule;
    }

    public void setNomModule(String nomModule) {
        this.nomModule = nomModule;
    }

    public Integer getAnneeCrea() {
        return anneeCrea;
    }

    public void setAnneeCrea(Integer anneeCrea) {
        this.anneeCrea = anneeCrea;
    }

    public String getNomDiplome() {
        return nomDiplome;
    }

    public void setNomDiplome(String nomDiplome) {
        this.nomDiplome = nomDiplome;
    }

    public String getNomEnseignementResp() {
        return nomEnseignementResp;
    }

    public void setNomEnseignementResp(String nomEnseignementResp) {
        this.nomEnseignementResp = nomEnseignementResp;
    }

    public String getTypeControle() {
        return typeControle;
    }

    public void setTypeControle(String typeControle) {
        this.typeControle = typeControle;
    }

    public Boolean getRattrapage() {
        return rattrapage;
    }

    public void setRattrapage(Boolean rattrapage) {
        this.rattrapage = rattrapage;
    }

    public static class TraitementUn implements Consumer<UeClass> {
        @Override
        public void accept(UeClass ueClass) {
            ueClass.setAnneeCrea(ueClass.getAnneeCrea() + 1);
            System.out.println(ueClass.getAnneeCrea());
        }
    }

    public static class TraitementDeux implements Consumer<UeClass> {
        @Override
        public void accept(UeClass ueClass) {
            if(ueClass.getNomEnseignementResp().equals("Dupont")) {
                ueClass.setAnneeCrea(ueClass.getAnneeCrea() + 1);
                System.out.println(ueClass.getAnneeCrea());
            }
        }
    }

    public static class TraitementTrois implements Consumer<UeClass> {
        @Override
        public void accept(UeClass ueClass) {
            if (ueClass.getTypeControle().equals("QCM") && ueClass.getRattrapage()) {
                ueClass.setRattrapage(false);
                System.out.println(ueClass.getRattrapage());
            }
        }
    }
}

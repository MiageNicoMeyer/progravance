public @interface MiageBasics {

    public String nom();
    public String prenom();
    public int annneeUniv();
    public String module();
    public int seance() default 1;

}
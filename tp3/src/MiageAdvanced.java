public @interface MiageAdvanced {

    public enum completquali {DRAFT_PARTIEL, DRAFT_COMPLET, VERSION_FINALISE};
    public boolean etatTest() default false;
    public boolean automatisation() default false;


}

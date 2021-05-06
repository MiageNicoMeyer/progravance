import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR,
        ElementType.METHOD})
public @interface MiageAdvanced {
    public enum Completquali {DRAFT_PARTIEL, DRAFT_COMPLET, VERSION_FINALISE};

    Completquali etat() default Completquali.DRAFT_PARTIEL;
    public boolean etatTest() default false;
    public boolean automatisation() default false;
}

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR,
        ElementType.METHOD,
        ElementType.FIELD,
        ElementType.TYPE})
public @interface MiageBasics {

    public String nom();
    public String prenom();
    public int anneeUniv();
    public String module();
    public int seance() default 1;

}
import java.util.Objects;

public class Par {
    private final String desde;
    private final String a;

    public Par(String desde, String a) {
        this.desde = desde;
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Par par = (Par) o;
        return Objects.equals(desde, par.desde) &&
                Objects.equals(a, par.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desde, a);
    }
}

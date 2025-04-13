/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from asz
 */
public final class asz_2<T extends asu_2>
implements asy_2<T> {
    private static final Logger a = Logger.getLogger(asz_2.class);
    private final T b;

    public asz_2(T t) {
        this.b = t;
    }

    @Override
    public T a(int n) {
        try {
            if (asw_2.a().a(n, this.b)) {
                return this.b;
            }
        }
        catch (Exception exception) {
            a.error((Object)("Probl\u00e8me avec " + this.b.getClass().getSimpleName() + " d'id=" + n), (Throwable)exception);
        }
        return null;
    }
}


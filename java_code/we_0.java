/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Comparator;
import org.apache.log4j.Logger;

/*
 * Renamed from WE
 */
public abstract class we_0 {
    private static final Logger c = Logger.getLogger(we_0.class);
    public static final Comparator<we_0> a = (we_02, we_03) -> {
        if (we_02 == null || we_02.b == null) {
            return we_03 != null && we_03.b != null ? -1 : 0;
        }
        if (we_03 == null || we_03.b == null) {
            return 1;
        }
        return we_02.b.f(we_03.b);
    };
    protected final wt_0 b;

    protected we_0(wu_0 wu_02) {
        this.b = new wt_0(wu_02);
    }

    public wu_0 a() {
        return this.b;
    }

    public abstract void a(wq_0 var1);

    public we_0 a(int n, int n2, int n3, int n4) {
        this.b.a(n, n2, n3, n4);
        return this;
    }

    public we_0 a(wi_0 wi_02) {
        this.b.b(wi_02.f(), wi_02.e(), wi_02.d(), wi_02.c(), wi_02.b(), wi_02.a());
        return this;
    }
}


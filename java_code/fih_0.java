/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fiH
 */
public class fih_0 {
    protected static final Logger a = Logger.getLogger(fih_0.class);
    protected final TIntObjectHashMap<fie_0> b = new TIntObjectHashMap();
    private static final fih_0 c = new fih_0();
    private fig_0 d;

    protected fih_0() {
    }

    public static fih_0 a() {
        return c;
    }

    public void a(fig_0 fig_02) {
        this.d = fig_02;
    }

    public void a(fie_0 fie_02) {
        if (fie_02 != null) {
            this.b.put((int)fie_02.p(), (Object)fie_02);
        }
    }

    @Nullable
    public fie_0 a(int n) {
        if (this.b.containsKey(n)) {
            return (fie_0)this.b.get(n);
        }
        fie_0 fie_02 = this.d(n);
        if (fie_02 == null) {
            return null;
        }
        this.b.put((int)fie_02.p(), (Object)fie_02);
        return fie_02;
    }

    public void b(int n) {
        if (this.d == null) {
            return;
        }
        fie_0 fie_02 = this.d.a(n);
        if (fie_02 == null) {
            return;
        }
        this.b.put((int)fie_02.p(), (Object)fie_02);
    }

    @Nullable
    private fie_0 d(int n) {
        if (this.d == null) {
            return null;
        }
        return this.d.a(n);
    }

    public fie_0 c(int n) {
        short s2 = fie_0.b(n);
        return this.a(s2);
    }
}


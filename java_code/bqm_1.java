/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bQm
 */
public abstract class bqm_1<T extends erz_1>
implements ajh_1,
Comparable<bqm_1> {
    protected static final int a = 0;
    protected static final int b = 1;
    public static final String d = "type";
    public static final String e = "memberName";
    public static final String f = "date";
    private static final String[] h = new String[0];
    protected final T g;

    public bqm_1(T t) {
        this.g = t;
    }

    @Override
    public String[] d() {
        return h;
    }

    @Override
    public Object b(String string) {
        if (string.equals(e)) {
            return ((erz_1)this.g).a();
        }
        if (string.equals(f)) {
            wt_0 wt_02 = wt_0.b(((erz_1)this.g).b());
            return bae.h().c(wt_02);
        }
        if (string.equals(d)) {
            return this.a();
        }
        return null;
    }

    protected abstract int a();

    public int a(@NotNull bqm_1 bqm_12) {
        return Hw.e(((erz_1)bqm_12.g).b() - ((erz_1)this.g).b());
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((bqm_1)object);
    }
}


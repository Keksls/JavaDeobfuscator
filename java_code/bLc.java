/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class bLc
implements ajh_1 {
    public static final String a = "priceFieldModes";
    public static final String b = "quantityFieldModes";
    private static final String[] d;
    private static final List<bWe> e;
    private static final List<bWe> f;
    private static final String[] g;

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return bLb.i;
        }
        if (b.equals(string)) {
            return bLb.k;
        }
        bWe bWe2 = (bWe)bWe.a(string);
        if (bWe2 != null) {
            if (e.contains(bWe2)) {
                return bLc.a(bWe2);
            }
            if (f.contains(bWe2)) {
                return bLc.b(bWe2);
            }
        }
        return null;
    }

    @Override
    public String[] d() {
        return g;
    }

    public static boolean a(bWe bWe2) {
        return ((bvx_0)ans_0.D().h()).a(bWe2);
    }

    public static bLb b(bWe bWe2) {
        return bLb.a(((bvx_0)ans_0.D().h()).d(bWe2));
    }

    static {
        int n;
        d = new String[]{a, b};
        e = List.of(bWe.aY, bWe.aZ, bWe.ba, bWe.bd, bWe.bg, bWe.bh, bWe.bi);
        f = List.of(bWe.bb, bWe.bc, bWe.be, bWe.bf);
        g = new String[d.length + e.size() + f.size()];
        System.arraycopy(d, 0, g, 0, d.length);
        for (n = 0; n < e.size(); ++n) {
            bLc.g[bLc.d.length + n] = e.get(n).b();
        }
        for (n = 0; n < f.size(); ++n) {
            bLc.g[bLc.d.length + bLc.e.size() + n] = f.get(n).b();
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from buC
 */
public class buc_1
implements bvi_2 {
    private static final TIntHashSet b = new TIntHashSet(new int[]{10, 35, 36});
    public static final aqr_2 a = new bvk_2(new bvj_2("filtr\u00e9", new aqo_2("Id du type de message d'erreur")));
    private final int d;

    public buc_1(int n) {
        this.d = n;
    }

    public static boolean a(int n) {
        return b.contains(n);
    }

    @Override
    public String[] a() {
        return new String[]{String.valueOf(this.d)};
    }

    @Override
    public aqr_2 c_() {
        return a;
    }

    @Override
    public int b() {
        return bvl_2.p.a();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.procedure.TIntIntProcedure
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.procedure.TIntIntProcedure;
import java.io.File;

/*
 * Renamed from arG
 */
public class arg_1 {
    private static final int a = 4096;
    private final TIntIntHashMap b = new TIntIntHashMap(0, 1.0f);
    private final String c;
    private final int d;

    public arg_1(String string) {
        this(string, 4096);
    }

    public arg_1(String string, int n) {
        int n2 = 4;
        byte[] byArray = gg_0.a(string, 4);
        arf_1 arf_12 = arf_1.a(byArray);
        int n3 = arf_12.c();
        int n4 = n3 + 4;
        arf_1 arf_13 = arf_1.a(gg_0.a(string, n4));
        arf_13.e(4);
        int n5 = arf_13.c();
        this.b.ensureCapacity(n5);
        for (int k = 0; k < n5; ++k) {
            this.b.put(arf_13.c(), arf_13.c() + n4);
        }
        this.c = string.replace('\\', '/');
        this.d = n;
    }

    public String a() {
        return this.c;
    }

    public arh_1 a(String string) {
        int n = this.b.get(string.hashCode());
        return this.a(n);
    }

    public arh_1 a(int n) {
        are_1 are_12 = new are_1(new File(this.c), this.d);
        are_12.a(n);
        byte[] byArray = new byte[8];
        for (int k = 0; k != 8; k += are_12.a(byArray, k, 8 - k)) {
        }
        long l = arf_1.a(byArray).j();
        return new arh_1(are_12, n + 8, l);
    }

    public boolean b(String string) {
        return this.b.containsKey(string.hashCode());
    }

    public void a(TIntIntProcedure tIntIntProcedure) {
        this.b.forEachEntry(tIntIntProcedure);
    }
}


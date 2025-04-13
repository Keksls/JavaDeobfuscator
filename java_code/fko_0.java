/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from fko
 */
public abstract class fko_0<B extends fkn_0> {
    private final TIntObjectHashMap<B> a = new TIntObjectHashMap();
    private boolean b;

    public void a(String string) {
        arf_1 arf_12 = arf_1.a(gg_0.b(string));
        int n = arf_12.c();
        for (int k = 0; k < n; ++k) {
            int n2 = arf_12.c();
            B b2 = this.b(n2);
            ((fkn_0)b2).a(arf_12);
            this.a.put(n2, b2);
        }
        this.b = true;
    }

    protected abstract B b(int var1);

    public B c(int n) {
        return (B)((fkn_0)this.a.get(n));
    }

    public boolean a() {
        return this.b;
    }
}


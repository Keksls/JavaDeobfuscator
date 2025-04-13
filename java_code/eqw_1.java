/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TObjectIntHashMap
 */
import gnu.trove.map.hash.TObjectIntHashMap;

/*
 * Renamed from eqw
 */
public final class eqw_1 {
    private TObjectIntHashMap<fic_0> a;
    private TObjectIntHashMap<fic_0> b;

    public void a(int n, fic_0 fic_02) {
        if (this.a == null) {
            this.a = new TObjectIntHashMap();
        }
        this.a.adjustOrPutValue((Object)fic_02, n, n);
    }

    public void b(int n, fic_0 fic_02) {
        if (this.b == null) {
            this.b = new TObjectIntHashMap();
        }
        this.b.adjustOrPutValue((Object)fic_02, n, n);
    }

    public int a(fic_0 fic_02) {
        if (this.a == null) {
            return 0;
        }
        return this.a.get((Object)fic_02);
    }

    public int b(fic_0 fic_02) {
        if (this.b == null) {
            return 0;
        }
        return this.b.get((Object)fic_02);
    }

    public void a() {
        this.a = null;
        this.b = null;
    }

    public int a(eps_0 eps_02, fic_0 fic_02) {
        if (eps_02 == eps_0.c) {
            return this.a(fic_02);
        }
        if (eps_02 == eps_0.j) {
            return this.b(fic_02);
        }
        return 0;
    }
}


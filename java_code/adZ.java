/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;

public class adZ
extends aej_0 {
    private static final adZ a = new adZ();
    private final TIntObjectHashMap<adS> b = new TIntObjectHashMap();
    final aeb c = new aeb(1024);
    private final aec d = new aec();

    public static adZ b() {
        return a;
    }

    private adZ() {
    }

    @Override
    public void a() {
        this.c.a();
        if (!this.b.isEmpty()) {
            float f2 = 1.0f;
            this.b.forEachValue((TObjectProcedure)new aea(this));
        }
    }

    @Override
    public void b(int n) {
    }

    @Override
    public int e() {
        return 600;
    }

    @Override
    public boolean d() {
        return this.b.isEmpty();
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        this.c.a(n, n2, n3, fArray);
    }

    void a(float f2, int n) {
        int n2;
        this.d.a(f2, n);
        if (!this.b.isEmpty()) {
            this.b.forEachValue((TObjectProcedure)this.d);
        }
        if ((n2 = this.d.a.size()) != 0) {
            for (int k = 0; k < n2; ++k) {
                this.a(this.d.a.getQuick(k));
            }
        }
    }

    public final void a(adS adS2) {
        this.b.put(adS2.d(), (Object)adS2);
        aic_0.a.a(adS2);
    }

    public final void a(int n) {
        adS adS2 = (adS)this.b.remove(n);
        aic_0.a.b(adS2);
    }

    public final void c() {
        this.b.clear();
    }

    public final adS c(int n) {
        return (adS)this.b.get(n);
    }

    @Override
    public void a(int n, int n2, int n3, int n4) {
        this.c.a(n, n2, n3, n4);
    }
}


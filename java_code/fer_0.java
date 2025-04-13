/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteIntHashMap
 *  gnu.trove.procedure.TByteIntProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TByteIntHashMap;
import gnu.trove.procedure.TByteIntProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from feR
 */
public class fer_0 {
    private static final Logger g = Logger.getLogger(fer_0.class);
    public static final float a = -0.5f;
    public static final float b = 0.5f;
    private final faX h;
    private final TByteIntHashMap i = new TByteIntHashMap();
    private final fet_0 j = new fet_0();
    private final ArrayList<feq_0> k = new ArrayList();
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;

    public fer_0(faX faX2) {
        this.h = faX2;
    }

    public boolean a(feq_0 feq_02) {
        return !this.k.contains(feq_02) && this.k.add(feq_02);
    }

    public boolean a(faU faU2, fep_0 fep_02) {
        if (faU2 == null || fep_02 == null) {
            return false;
        }
        faV faV2 = faU2.fE();
        fep_0 fep_03 = faV2.v();
        int n = this.a(faU2);
        if (n != 0) {
            switch (n) {
                case 2: {
                    g.error((Object)("[Nation] Impossible de prendre en compte l'opinion du joueur " + faU2 + " car il n'a pas vot\u00e9"));
                    break;
                }
                case 1: {
                    g.error((Object)("[Nation] Impossible de prendre en compte l'opinion du joueur " + faU2 + " car un vote est en cours"));
                    break;
                }
                case 3: {
                    g.error((Object)("[Nation] Impossible de prendre en compte l'opinion du joueur " + faU2 + " car il n'y a pas de gouverneur"));
                }
            }
            return false;
        }
        this.i.adjustValue(fep_03.d, -1);
        this.i.adjustOrPutValue(fep_02.d, 1, 1);
        faV2.a(fep_02);
        this.g();
        return true;
    }

    public void a() {
        this.i.clear();
        this.i.put(fep_0.b.d, this.h.C().b());
        this.g();
    }

    public void b() {
        this.i.clear();
    }

    public int a(fep_0 fep_02) {
        return this.i.get(fep_02.d);
    }

    public int c() {
        return this.j.c();
    }

    public float d() {
        return this.j.b();
    }

    public boolean e() {
        return fer_0.a(this.j.b());
    }

    public boolean f() {
        return fer_0.b(this.j.b());
    }

    public static boolean a(float f2) {
        return f2 <= -0.5f;
    }

    public static boolean b(float f2) {
        return f2 >= 0.5f;
    }

    private void g() {
        float f2 = this.j.b();
        this.j.a();
        this.i.forEachEntry((TByteIntProcedure)this.j);
        float f3 = this.j.b();
        if (f3 != f2) {
            for (int k = 0; k < this.k.size(); ++k) {
                this.k.get(k).a(this.h, f2, f3);
            }
        }
    }

    public int a(faU faU2) {
        wt_0 wt_02;
        faV faV2 = faU2.fE();
        fep_0 fep_02 = faV2.v();
        if (this.h.v()) {
            return 1;
        }
        wu_0 wu_02 = faV2.p();
        if (wu_02.b(wt_02 = this.h.C().c())) {
            return 2;
        }
        if (this.i.get(fep_02.d) <= 0) {
            return 2;
        }
        if (faV2.m().D().c() == null) {
            return 3;
        }
        return 0;
    }

    public void a(wx_1 wx_12) {
        this.i.forEachEntry((TByteIntProcedure)new fes_0(wx_12));
    }

    public void b(wx_1 wx_12) {
        int n = wx_12.a.size();
        for (int k = 0; k < n; ++k) {
            wy_1 wy_12 = wx_12.a.get(k);
            this.i.put(wy_12.a, wy_12.b);
        }
        this.g();
    }
}


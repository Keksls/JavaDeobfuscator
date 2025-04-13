/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from baA
 */
public class baa_0 {
    protected static final Logger a = Logger.getLogger(baa_0.class);
    private static final baa_0 b = new baa_0();
    private final TIntObjectHashMap<ala_2> c = new TIntObjectHashMap();

    private baa_0() {
    }

    public static baa_0 a() {
        return b;
    }

    public akx_1 a(bvx_2 bvx_22, aku_1 aku_12) {
        if (bvx_22 == null || aku_12 == null) {
            return null;
        }
        return this.a(bvx_22.c(), aku_12);
    }

    public akx_1 a(int n, aku_1 aku_12) {
        ala_2 ala_22 = this.d(n);
        return ala_22.a(aku_12);
    }

    public void a(bwh_0 bwh_02) {
        if (bwh_02 == null) {
            return;
        }
        this.a(bwh_02.c());
    }

    public void a(int n) {
        ala_2 ala_22 = this.d(n);
        ala_22.f();
    }

    private ala_2 d(int n) {
        ala_2 ala_22 = (ala_2)this.c.get(n);
        if (ala_22 == null) {
            ala_22 = new ala_2();
            this.c.put(n, (Object)ala_22);
        }
        return ala_22;
    }

    public void b(int n) {
        ala_2 ala_22 = (ala_2)this.c.get(n);
        if (ala_22 != null) {
            ala_22.h();
        }
        this.c.remove(n);
    }

    public void c(int n) {
        ala_2 ala_22 = (ala_2)this.c.remove(n);
        if (ala_22 != null) {
            ala_22.b();
        }
    }
}


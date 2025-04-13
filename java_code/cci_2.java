/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from ccI
 */
public class cci_2
implements ess_2 {
    public static final cci_2 a = new cci_2();
    private static final Logger b = Logger.getLogger(cci_2.class);
    private ccy_2 c;
    private ccr_2 d;
    private byte[] e;
    private byte[] f;
    private final HashMap<Long, long[]> g = new HashMap();
    private esm_2 h;
    private static boolean i = false;

    private cci_2() {
        cci_2.b();
    }

    public void a() {
        if (this.h == null) {
            return;
        }
        long l = this.h.g();
        this.c = new ccy_2(l);
        this.c.a(this.e);
        this.c.a(this.f, true);
        this.d = this.a(this.c);
        YX.a(l, this.d);
        this.j();
    }

    public static void b() {
        if (i) {
            return;
        }
        try {
            cck_2.a.a(azs_0.z("partitionPatchFile"));
            cdm_1.a.a(azs_0.z("buildingFile"));
        }
        catch (Exception exception) {
            b.error((Object)"", (Throwable)exception);
        }
        i = true;
    }

    private void i() {
        this.c = null;
        this.h = null;
        this.j();
    }

    private void j() {
        this.e = null;
        this.f = null;
    }

    public void c() {
        this.i();
    }

    public void a(byte[] byArray) {
        this.e = byArray;
    }

    public void b(byte[] byArray) {
        this.f = byArray;
    }

    public void a(long l, long[] lArray) {
        this.g.put(l, lArray);
    }

    public long[] a(long l) {
        return this.g.get(l);
    }

    public esm_2 d() {
        return this.h;
    }

    private ccr_2 a(ccy_2 ccy_22) {
        return new ccr_2(ccy_22);
    }

    public ccy_2 e() {
        return this.c;
    }

    public ccr_2 f() {
        return this.d;
    }

    public boolean g() {
        return this.h != null;
    }

    public void a(esm_2 esm_22) {
        this.h = esm_22;
    }

    public void h() {
        czn_2 czn_22 = new czn_2();
        azu_0.j().K().c(czn_22);
    }
}


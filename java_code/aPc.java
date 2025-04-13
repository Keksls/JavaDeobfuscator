/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.iterator.TLongObjectIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.iterator.TLongObjectIterator;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aPc {
    public static final int a = 2;
    private static final Logger b = Logger.getLogger(aPc.class);
    private static final aPc c = new aPc();
    private final aoo_0 d = new aoo_0();
    private final aPe e = new aPe();
    private final aPd f = new aPd();
    private final aon_0 g = new aon_0();
    private final ArrayList<abz_0> h = new ArrayList();
    private int i;
    private boolean j;
    private float k;

    private aPc() {
        this.a();
    }

    public void a() {
        this.i = -1;
        aoy_0.a();
    }

    public void b() {
        this.e.a(false);
    }

    public void c() {
        this.e.a(true);
    }

    public void d() {
        this.e.b(false);
    }

    public void e() {
        this.e.b(true);
    }

    public void a(blx_1 blx_12, int n) {
        bwh_0 bwh_02 = bwj_1.a().a(n);
        aox_0 aox_02 = this.d(bwh_02 != null ? bwh_02.c() : 0);
        aox_02.a(bwh_02, blx_12);
    }

    private aox_0 d(int n) {
        if (n == this.i) {
            return this.f;
        }
        return this.g;
    }

    public void b(blx_1 blx_12, int n) {
        bwh_0 bwh_02;
        if (azu_0.j().k() == blx_12) {
            this.c(-1);
        }
        aox_0 aox_02 = this.d((bwh_02 = bwj_1.a().a(n)) != null ? bwh_02.c() : 0);
        aox_02.b(bwh_02, blx_12);
    }

    public void a(bwh_0 bwh_02, sr_0 sr_02) {
        aox_0 aox_02 = this.d(bwh_02 != null ? bwh_02.c() : 0);
        aox_02.a(bwh_02, sr_02);
    }

    public void b(bwh_0 bwh_02, sr_0 sr_02) {
        aox_0 aox_02 = this.d(bwh_02 != null ? bwh_02.c() : 0);
        aox_02.b(bwh_02, sr_02);
    }

    public void c(bwh_0 bwh_02, sr_0 sr_02) {
        aox_0 aox_02 = this.d(bwh_02 != null ? bwh_02.c() : 0);
        aox_02.c(bwh_02, sr_02);
    }

    public boolean a(int n) {
        bwh_0 bwh_02 = bwj_1.a().a(n);
        if (bwh_02 == null) {
            return this.d(n).a();
        }
        return this.d(n).a();
    }

    public boolean b(int n) {
        return this.d(n).b();
    }

    public void a(bvw_2 bvw_22) {
        aox_0 aox_02 = this.d(bvw_22.c());
        aox_02.a(bvw_22);
    }

    public ArrayList<abz_0> a(float f2, float f3) {
        this.h.clear();
        aoy_0.a(this.h);
        for (int k = this.h.size() - 1; k >= 0; --k) {
            if (this.h.get(k).a(f2, f3)) continue;
            this.h.remove(k);
        }
        return this.h;
    }

    public static aPc f() {
        return c;
    }

    public int g() {
        return this.i;
    }

    public void c(int n) {
        this.i = n;
    }

    public float h() {
        return this.k;
    }

    public void a(float f2) {
        this.k = f2;
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    public void i() {
        aoy_0.a();
        TIntObjectIterator<bwh_0> tIntObjectIterator = bwj_1.a().b();
        while (tIntObjectIterator.hasNext()) {
            try {
                tIntObjectIterator.advance();
                bwh_0 bwh_02 = (bwh_0)tIntObjectIterator.value();
                if (bwh_02.e() == elp_0.e) continue;
                aox_0 aox_02 = this.d(bwh_02.c());
                aox_02.a(bwh_02);
            }
            catch (Exception exception) {
                b.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public static void a(bwh_0 bwh_02) {
        aoy_0.i(bwh_02);
        TLongObjectIterator<ahv> tLongObjectIterator = ahs.d().i();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ahv ahv2 = (ahv)tLongObjectIterator.value();
            ahv2.c(ahv2.d().P());
        }
    }

    public static void b(bvw_2 bvw_22) {
        aoy_0.b((bwh_0)bvw_22);
    }
}


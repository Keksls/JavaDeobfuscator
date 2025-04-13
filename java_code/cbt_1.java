/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from cbT
 */
public class cbt_1
implements Runnable {
    public static final cbt_1 a = new cbt_1();
    protected static final Logger b = Logger.getLogger(cbt_1.class);
    public static final int c = 5000;
    private fjt_0 e = fjt_0.a;
    private cbr_1 f;
    private final cbe_1 g = new cbe_1(0.0f);
    private final cbe_1 h = new cbe_1(cby_1.c.a());
    private final cbx_1 i = new cbx_1();
    private boolean j;
    private final HashMap<fjt_0, cbr_1> k = new HashMap();
    private cbv_1 l;
    private boolean m = true;
    private final ArrayList<cbr_1> n = new ArrayList();

    private cbt_1() {
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    private long e() {
        return System.currentTimeMillis();
    }

    public void a() {
        cbj_2 cbj_22 = new cbj_2();
        cbm_2 cbm_22 = new cbm_2();
        cbo_2 cbo_22 = new cbo_2();
        cbf_1 cbf_12 = new cbf_1();
        this.a(fjt_0.b, cbj_22);
        this.a(fjt_0.c, cbj_22);
        this.a(fjt_0.e, cbo_22);
        this.a(fjt_0.h, cbo_22);
        this.a(fjt_0.g, cbf_12);
        this.a(fjt_0.d, cbm_22);
        this.a(fjt_0.f, cbm_22);
        this.n.add(this.i);
    }

    public void a(float f2) {
        assert (f2 >= 0.0f && f2 <= 1.0f);
        for (cbr_1 cbr_12 : this.n) {
            if (!(cbr_12 instanceof cbj_2)) continue;
            ((cbj_2)cbr_12).a(f2);
        }
    }

    private void a(fjt_0 fjt_02, cbr_1 cbr_12) {
        this.k.put(fjt_02, cbr_12);
        if (!this.n.contains(cbr_12)) {
            this.n.add(cbr_12);
        }
    }

    public void b() {
        ado_1.a().a(this, 50L);
    }

    public void b(boolean bl) {
        if (!bl) {
            this.m = false;
            return;
        }
        if (!this.m) {
            this.m = true;
            for (cbr_1 cbr_12 : this.n) {
                if (cbr_12 == null) continue;
                cbr_12.b(0.0f);
            }
        }
    }

    public void c() {
        if (this.f != null) {
            this.d(this.e);
        }
        for (cbr_1 cbr_12 : this.n) {
            if (cbr_12 == null) continue;
            cbr_12.b(0.0f);
            cbr_12.a();
        }
        this.e = null;
        this.f = null;
    }

    public void c(boolean bl) {
        for (cbr_1 cbr_12 : this.n) {
            if (cbr_12 == null) continue;
            cbr_12.a(bl);
        }
    }

    private cev_0 b(fjt_0 fjt_02) {
        if (fjt_02 == null) {
            return null;
        }
        switch (fjt_02) {
            case c: 
            case e: 
            case h: {
                return cev_0.a;
            }
            case d: 
            case f: {
                return cev_0.c;
            }
        }
        return null;
    }

    public void d() {
        this.c(this.e);
    }

    private void c(fjt_0 fjt_02) {
        if (fjt_02 == null) {
            return;
        }
        switch (fjt_02) {
            case a: 
            case b: 
            case g: {
                break;
            }
            case c: 
            case e: 
            case h: {
                cdw_0.n().a(new cew_1(cev_0.a));
                break;
            }
            case d: 
            case f: {
                cdw_0.n().a(new cew_1(cev_0.c));
            }
        }
    }

    private void d(fjt_0 fjt_02) {
        if (fjt_02 == null) {
            return;
        }
        switch (fjt_02) {
            case a: 
            case b: 
            case g: {
                break;
            }
            case c: 
            case e: 
            case h: {
                cdw_0.n().a(new cew_1(cev_0.b));
                break;
            }
            case d: 
            case f: {
                cdw_0.n().a(new cew_1(cev_0.d));
            }
        }
    }

    public void a(fjt_0 fjt_02, int n) {
        if (this.j) {
            return;
        }
        if (fjt_02 == this.e) {
            return;
        }
        long l = this.e();
        cbr_1 cbr_12 = this.k.get((Object)fjt_02);
        if (cbr_12 != this.f) {
            if (this.f != null) {
                this.f.a(0.0f, n, l);
            }
            this.f = cbr_12;
        }
        if (this.b(fjt_02) != this.b(this.e)) {
            this.d(this.e);
            this.c(fjt_02);
        }
        this.e = fjt_02;
        if (this.f != null) {
            switch (this.e) {
                case b: 
                case g: {
                    this.f.a(0.33f, n, l);
                    break;
                }
                case c: 
                case d: {
                    this.f.a(0.66f, n, l);
                    break;
                }
                case e: 
                case f: {
                    this.f.a(1.0f, n, l);
                    break;
                }
                case a: {
                    this.f.a(1.0f, n, l);
                    break;
                }
                case h: {
                    this.f.a(1.0f, n, l);
                }
            }
        }
    }

    public void a(fjt_0 fjt_02) {
        this.a(fjt_02, 5000);
    }

    public void b(float f2) {
        this.a(f2, 5000);
    }

    private void a(float f2, int n) {
        this.g.a(f2, n, this.e());
    }

    public void a(cby_1 cby_12) {
        this.a(cby_12, 5000);
    }

    private void a(cby_1 cby_12, int n) {
        this.h.a(cby_12.a(), n, this.e());
    }

    @Override
    public void run() {
        if (this.e == null) {
            return;
        }
        try {
            ace_0 ace_02 = ans_0.D().c();
            if (!this.m) {
                for (int k = 0; k < this.n.size(); ++k) {
                    cbr_1 cbr_12 = this.n.get(k);
                    if (cbr_12 == null) continue;
                    cbr_12.a(ace_02, 0.0f, 0.0f);
                }
                return;
            }
            long l = this.e();
            if (this.l == null) {
                this.a(l, ace_02);
            } else {
                this.l.a(l, this.g, this.h, this.i, this.k);
            }
            float f2 = this.h.a();
            f2 += Math.abs(f2) * aet_2.a(0.0f, l, 1.0f, 5, aez_2.b);
            float f3 = this.g.a();
            f3 += Math.abs(f3) * aet_2.a(1.0f, l, 1.0f, 5, aez_2.b);
            for (int k = 0; k < this.n.size(); ++k) {
                cbr_1 cbr_13 = this.n.get(k);
                if (cbr_13 == null) continue;
                if (cbr_13.e() > 0.0f && !cbr_13.d()) {
                    cbr_13.a(ace_02);
                }
                cbr_13.a(ace_02, f2, f3);
            }
        }
        catch (Exception exception) {
            b.error((Object)"Exception ", (Throwable)exception);
        }
    }

    private void a(long l, ahg_0 ahg_02) {
        this.g.b(l);
        this.h.b(l);
        if (this.g.a() > 0.0f && !this.i.d()) {
            this.i.a(ahg_02);
        }
        for (int k = 0; k < this.n.size(); ++k) {
            cbr_1 cbr_12 = this.n.get(k);
            if (cbr_12 == null) continue;
            cbr_12.a(l);
        }
    }

    public void a(cbv_1 cbv_12) {
        this.l = cbv_12;
    }

    public static void a(ahq_0 ahq_02, azj_2 azj_22) {
        cbt_1.a(ahq_02, azj_22, 200, 1000, -2.5f, -0.5f);
    }

    public static void a(ahq_0 ahq_02, azj_2 azj_22, int n, int n2, float f2, float f3) {
        int n3 = Hw.b(1, 3);
        int n4 = 0;
        int n5 = 0;
        for (int k = 0; k < n3; ++k) {
            int n6 = cbt_1.a(n4, azj_22);
            n5 = n4 + n6;
            n4 += Hw.b(n, n2);
        }
        n5 = Math.max(800, n5);
        adm_0 adm_02 = new adm_0();
        adm_02.a(ahq_02);
        adm_02.a(true);
        adm_02.a(70.0f, Hw.a(f2, f3));
        adm_02.a(new adP(100, 100, n5 / 2, n5 / 2));
        aui_1.a().a(adm_02);
        cdw_0.n().a(new cew_1(cev_0.e));
    }

    private static int a(int n, azj_2 azj_22) {
        adp_0 adp_02 = new adp_0();
        adp_02.a("snow.tga");
        adp_02.a(axn_2.e, axn_2.b);
        adp_02.a(azj_22.q(), azj_22.r(), azj_22.s(), azj_22.p());
        float f2 = Hw.a(0.7f, 1.0f) + 2.0f;
        float f3 = Hw.a(-2.0f, 2.0f);
        float f4 = Hw.a(0.0f, 1.0f) + f2 * 0.5f;
        adp_02.a(f3, f4);
        adp_02.b(f2, f2);
        int n2 = Hw.b(0, 200) + 100;
        adp_02.a(new adP(n, 25, n2, 75));
        aui_1.a().a(adp_02);
        return n2;
    }
}


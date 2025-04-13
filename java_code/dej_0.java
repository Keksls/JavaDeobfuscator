/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from dej
 */
public class dej_0
implements ahr_1 {
    private static final float[] b = new float[]{0.0f, 0.3f, 0.6f, 0.6f};
    private static final float[] c = new float[]{1.0f, 0.0f, 0.0f, 0.6f};
    private static final Logger d = Logger.getLogger(dej_0.class);
    private static final dej_0 e = new dej_0();
    private exk_2 f;
    protected blx_1 a;
    private final abv_0 g;
    private final aff_1 h = new aff_1();
    private boolean i;

    private dej_0() {
        this.g = new abv_0("useItemSelectCell", b);
    }

    public static dej_0 a() {
        return e;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void a(blx_1 blx_12) {
        this.a = blx_12;
    }

    public void a(exk_2 exk_22) {
        this.f = exk_22;
    }

    public exk_2 c() {
        return this.f;
    }

    protected Sm d() {
        return this.f;
    }

    private boolean g() {
        if (this.f == null || this.a == null) {
            return false;
        }
        aff_1 aff_12 = this.a.gg();
        int n = this.h.e(aff_12);
        bjw_1 bjw_12 = (bjw_1)this.f.T();
        switch (bjw_12.j()) {
            case c: {
                if (bjw_12.I() > n || n > bjw_12.H()) {
                    return false;
                }
                return Math.abs(aff_12.f() - this.h.f()) <= this.a.fV();
            }
            case b: {
                return true;
            }
        }
        return false;
    }

    protected void a(int n, int n2, short s2) {
        clw_0 clw_02 = new clw_0();
        clw_02.a(this.f.a());
        clw_02.a(n, n2, s2);
        azu_0.j().K().c(clw_02);
    }

    protected String e() {
        if (this.f == null) {
            return null;
        }
        return (String)this.f.b("iconUrl");
    }

    private aff_1 a(int n, int n2, boolean bl) {
        return agz.a(ans_0.D().c(), n, n2, bl);
    }

    public aff_1 f() {
        return new aff_1(this.h);
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 19751: {
                dhL dhL2 = (dhL)adt_12;
                this.a(dhL2.r(), dhL2.s());
                return false;
            }
            case 16119: {
                dhL dhL3 = (dhL)adt_12;
                if (!dhL3.o()) {
                    azu_0.j().b(this);
                    return false;
                }
                if (this.a != null && this.g.b(this.h.d(), this.h.e(), this.h.f()) && this.g()) {
                    int n = this.h.d();
                    int n2 = this.h.e();
                    short s2 = this.h.f();
                    if (dab_0.a(this.a, this.c(), new aff_1(this.h))) {
                        if (this.c().iterator().hasNext()) {
                            this.a(n, n2, s2);
                        }
                        aUh.b("chat.item.selfUse", aUi.a(this.f));
                    }
                }
                azu_0.j().b(this);
                return false;
            }
        }
        return true;
    }

    private boolean a(int n, int n2) {
        aff_1 aff_12 = this.a(n, n2, true);
        if (aff_12 == null) {
            this.h.c(Integer.MAX_VALUE, Integer.MAX_VALUE, (short)Short.MAX_VALUE);
            this.g.a();
            return true;
        }
        if (aff_12.equals(this.h)) {
            return true;
        }
        this.h.g(aff_12);
        this.g.a();
        if (this.g()) {
            this.g.a(b);
        } else {
            this.g.a(c);
        }
        if (this.f != null && this.a != null) {
            this.g.a(this.h.d(), this.h.e(), this.h.f());
        }
        return false;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (this.i) {
            return;
        }
        this.i = true;
        String string = this.e();
        if (string != null) {
            fyt_0.a().a(frb_0.s, true);
            fzd_0.a().a(string, null, 10, -30, frs_0.a);
        } else {
            fyt_0.a().c();
            fzd_0.a().d();
        }
        ace_0 ace_02 = ans_0.D().c();
        this.a(ace_02.c(), ace_02.d());
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!this.i) {
            return;
        }
        this.g.a();
        fyt_0.a().c();
        fzd_0.a().d();
        this.i = false;
        this.h.c(Integer.MAX_VALUE, Integer.MAX_VALUE, (short)Short.MAX_VALUE);
    }
}


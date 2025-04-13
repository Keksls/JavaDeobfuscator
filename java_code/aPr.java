/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class aPr {
    private static final Logger d = Logger.getLogger(aPr.class);
    private static final aPr e = new aPr();
    private aPw f = aPw.d;
    private bvx_2 g;
    private boolean h = false;
    private boolean i = false;
    final aja_1 j = ajz_12 -> this.a(ajz_12.l());
    final aja_1 k = ajz_12 -> this.b(ajz_12.l());
    final aja_1 l = ajz_12 -> this.a((byte)ajz_12.o(), false);
    protected final agr_0 a = new aPs(this);
    protected final agr_0 b = new aPt(this);
    protected final agr_0 c = new aPu(this);

    public static aPr a() {
        return e;
    }

    private aPr() {
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        bvx_02.a(this.c);
        ajb_1 ajb_12 = bWe.H.a(bvx_02);
        if (ajb_12 != null) {
            ajb_12.a(bWe.H.b(), this.l);
            this.a((byte)bvx_02.d(bWe.H), false);
        }
        bvx_02.a(this.b);
        ajb_1 ajb_13 = bWe.J.a(bvx_02);
        if (ajb_13 != null) {
            ajb_13.a(bWe.J.b(), this.k);
            this.b(bvx_02.a(bWe.J));
        }
        bvx_02.a(this.a);
        ajb_1 ajb_14 = bWe.K.a(bvx_02);
        if (ajb_14 != null) {
            ajb_14.a(bWe.K.b(), this.j);
            this.a(bvx_02.a(bWe.K));
        }
    }

    public void a(boolean bl) {
        if (this.i == bl) {
            return;
        }
        this.i = bl;
        if (this.f == aPw.b) {
            this.c(false);
        }
    }

    public boolean b() {
        return this.i;
    }

    public void b(boolean bl) {
        if (this.h == bl) {
            return;
        }
        this.h = bl;
        if (this.f == aPw.b) {
            this.a(ans_0.D().c());
        }
    }

    public boolean c() {
        return this.h;
    }

    public aPw d() {
        return this.f;
    }

    public void a(byte by, boolean bl) {
        this.a(aPw.a(by), bl);
    }

    public void a(aPw aPw2, boolean bl) {
        boolean bl2 = azs_0.a().a("disableTacticalView", false);
        if (bl2 && this.f == aPw.a) {
            return;
        }
        if (this.f != aPw2) {
            this.f = aPw2;
            this.c(bl);
        }
    }

    public void a(bvx_2 bvx_22) {
        if (bvx_22 != this.g) {
            this.g = bvx_22;
            this.c(false);
        }
    }

    private void c(boolean bl) {
        ace_0 ace_02 = ans_0.D().c();
        if (this.g == null) {
            this.a(ace_02, false);
            return;
        }
        switch (this.f) {
            case d: {
                try {
                    aed.a.a(false);
                    ace_02.a(new aPm(this.g, this.f.b(), false));
                    ace_02.g(false);
                    ace_02.a(this.f.b().d());
                }
                catch (Exception exception) {
                    d.error((Object)"Error occured during activation of Full TacticalMode", (Throwable)exception);
                    this.a(ace_02, !bl);
                }
                break;
            }
            case b: {
                try {
                    aed.a.a(true);
                    ace_02.a(new aPn(this.g, this.f.b(), this.i));
                    this.a(ace_02);
                }
                catch (Exception exception) {
                    d.error((Object)"Error occured during activation of Semi TacticalMode", (Throwable)exception);
                    this.a(ace_02, !bl);
                }
                break;
            }
            case a: {
                this.a(ace_02, false);
                break;
            }
            default: {
                d.error((Object)String.format("Unmanaged TacticalMode (%s) is used !", this.f));
                this.a(ace_02, true);
            }
        }
    }

    private void a(ace_0 ace_02) {
        if (this.h) {
            ace_02.g(true);
            this.b(ace_02);
        } else {
            ace_02.g(false);
            ace_02.a(this.f.b().d());
        }
    }

    private void a(ace_0 ace_02, boolean bl) {
        if (this.f != aPw.a && bl) {
            this.f = aPw.a;
            ((bvx_0)ans_0.D().h()).a((agp_0)bWe.H, this.f.a());
        }
        aed.a.a(true);
        ace_02.a(ahl_0.a);
        ace_02.g(true);
        this.b(ace_02);
    }

    private void b(ace_0 ace_02) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return;
        }
        long l = bmr_12.T_();
        cct_1 cct_12 = ccs_1.a().a((short)l);
        if (cct_12 != null) {
            ace_02.a(cct_12.q);
        }
    }
}


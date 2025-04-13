/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class bbN
extends bam_0
implements bbo_0 {
    private final bbP m = new bbP(this);
    private final ejh_0 o;
    private final boolean p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private long u;

    public bbN(int n, int n2, int n3, int n4, ejh_0 ejh_02, boolean bl) {
        super(n, n2, n3, n4);
        this.o = ejh_02;
        this.p = bl;
        this.a(new caq_2(this));
        this.e(bbN.f(((efh_0)this.o.f()).j()));
    }

    public void r() {
        bwh_0 bwh_02 = this.B();
        if (this.o != null) {
            if (bwh_02 != null) {
                this.o.a(bwh_02.h());
            } else {
                this.o.a(bgg_0.k());
            }
        }
    }

    public void s() {
        int n;
        this.q = true;
        if (this.o == null) {
            return;
        }
        bwh_0 bwh_02 = this.B();
        if (bwh_02 != null) {
            this.o.a(bwh_02.h());
        } else {
            this.o.a(bgg_0.k());
        }
        if (this.h() != 0L) {
            this.o.b(this.h());
        }
        if (this.u != 0L) {
            this.o.c(this.u);
        }
        if (this.o.i() != null) {
            this.c(this.o.i().a_());
        }
        if (this.o.h() != null) {
            this.b(this.o.h().a_());
        }
        if ((n = this.K()) != 0) {
            this.e(n);
        }
        this.r = this.o.n();
        if (this.o instanceof eGq) {
            this.s = ((eGq)((Object)this.o)).a();
            this.t = ((eGq)((Object)this.o)).b();
        } else {
            this.s = 0;
            this.t = 0;
        }
    }

    public void b(boolean bl) {
        this.q = bl;
    }

    @Override
    public long h() {
        if (this.q) {
            return super.h();
        }
        if (super.h() == Long.MIN_VALUE && this.o != null && this.o.i() != null) {
            this.c(this.o.i().a_());
        }
        return super.h();
    }

    @Override
    public long t() {
        return this.f();
    }

    @Override
    public Optional<Byte> u() {
        efa_0 efa_02 = this.o.br_();
        return Optional.ofNullable(efa_02 != null ? Byte.valueOf(efa_02.a()) : null);
    }

    @Override
    public long o() {
        this.s();
        return super.o();
    }

    public long v() {
        return super.o();
    }

    private int K() {
        if (this.o.f() == null) {
            return 0;
        }
        return ((efh_0)this.o.f()).W();
    }

    @Override
    public void l() {
        try {
            this.m.a();
        }
        catch (Exception exception) {
            a.error((Object)"Exception levee", (Throwable)exception);
        }
        this.L();
        super.l();
        this.o.bv();
    }

    private void L() {
        this.o.B();
        sd_0.bs_();
        this.o.V();
        if (this.p) {
            this.o.af();
            this.o.a(null, true);
        } else {
            if (this.o.as()) {
                boolean bl = false;
                Su su = this.o.h();
                boolean bl2 = this.o.S() && !this.o.R();
                boolean bl3 = this.o.ar();
                if (bl3 || bl2) {
                    if (su != null && su.x_() != null) {
                        su.x_().a((sd_0)this.o);
                        bl = true;
                    }
                } else if (this.o.i() != null && this.o.i().x_() != null) {
                    this.o.i().x_().a((sd_0)this.o);
                    bl = true;
                }
                this.o.Y();
                if (!bl) {
                    if (this.o.f() != null) {
                        a.warn((Object)("Unable to find a valid RunningEffectManager to apply effect d'id " + ((efh_0)this.o.f()).i()));
                    } else {
                        a.warn((Object)("Unable to find a valid RunningEffectManager to apply effect " + this.o));
                    }
                }
            }
            if (this.o.as() && !this.o.at()) {
                this.o.bd();
            }
            if (!this.o.P()) {
                this.o.a(this.o.v(), false);
            }
        }
    }

    public void a(String string) {
        if (string != null && !string.isEmpty()) {
            n.a(string);
        }
    }

    public void e(long l) {
        this.u = l;
    }

    private static int f(int n) {
        efd_0 efd_02 = (efd_0)efc_0.a().a(n);
        if (efd_02 == null) {
            return -1;
        }
        return efd_02.d();
    }

    @Override
    public int w() {
        return this.r;
    }

    @Override
    public byte x() {
        return this.o.bk();
    }

    @Override
    public ejh_0 y() {
        return this.o;
    }

    @Override
    public aff_1 z() {
        Object object;
        if (this.o instanceof eHV && ((eHV)(object = (eHV)this.o)).aG()) {
            return ((eHV)object).aF();
        }
        object = this.o.i();
        if (object != null) {
            return new aff_1(object.G(), object.H(), object.I());
        }
        return this.o.j();
    }

    @Override
    public aff_1 F() {
        aff_1 aff_12 = this.o.j();
        if (aff_12 != null) {
            return aff_12;
        }
        Su su = this.o.i();
        if (su != null) {
            return new aff_1(su.G(), su.H(), su.I());
        }
        return null;
    }

    @Override
    public aff_1 G() {
        Su su = this.o.h();
        if (su != null) {
            return new aff_1(su.G(), su.H(), su.I());
        }
        a.error((Object)"ATTENTION : on veut r\u00e9cup\u00e9rer la position du caster d'un effet mais celui ci est inconnu, \u00e0 d\u00e9faut on renvoie la cellule cible");
        return this.o.j();
    }

    @Override
    public aff_1 H() {
        se_0 se_02 = this.o.A();
        if (se_02 == null) {
            return null;
        }
        Su su = se_02.f();
        if (su == null) {
            return null;
        }
        return su.P_();
    }

    @Override
    public int I() {
        return this.s;
    }

    @Override
    public int J() {
        return this.t;
    }

    @Override
    public int m() {
        if (this.o != null && this.o.f() != null) {
            return ((efh_0)this.o.f()).i();
        }
        return super.m();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Optional;

/*
 * Renamed from bck
 */
public class bck_0
extends alb_2
implements bbo_0 {
    private final ejh_0 m;
    private final boolean n;

    public bck_0(int n, int n2, int n3, ejh_0 ejh_02, boolean bl) {
        super(n, n2, n3);
        this.m = ejh_02;
        this.n = bl;
        this.a(new caq_2(this));
        this.e(this.g(this.m.bt_()));
    }

    @Override
    public long t() {
        return this.f();
    }

    @Override
    public int C() {
        return -1;
    }

    @Override
    public Optional<Byte> u() {
        efa_0 efa_02 = this.m.br_();
        return Optional.ofNullable(efa_02 != null ? Byte.valueOf(efa_02.a()) : null);
    }

    @Override
    public long o() {
        int n;
        if (this.m != null) {
            this.m.a(bgg_0.k());
            if (this.m.i() != null) {
                this.c(this.m.i().a_());
            }
            if (this.m.h() != null) {
                this.b(this.m.h().a_());
            }
        }
        if ((n = this.r()) != 0) {
            this.e(n);
        }
        return super.o();
    }

    private int r() {
        if (this.m.k() != null && ((efi_0)this.m.k()).G_() == 33) {
            return -1;
        }
        if (this.m.f() == null) {
            return 0;
        }
        return ((efh_0)this.m.f()).W();
    }

    @Override
    protected void l() {
        int n = this.m.bt_();
        try {
            this.f(n);
        }
        catch (Exception exception) {
            a.error((Object)"Exception levee lors de l'affichage, on continue cependant l'execution de notre effet", (Throwable)exception);
        }
        this.s();
        this.m.bv();
    }

    private void s() {
        this.m.B();
        sd_0.bs_();
        if (this.n) {
            this.m.af();
            this.m.a(null, true);
        } else {
            if (this.m.as()) {
                if (this.m.i() != null && this.m.i().x_() != null) {
                    this.m.i().x_().a((sd_0)this.m);
                }
                this.m.Y();
            }
            if (this.m.as() && !this.m.at()) {
                this.m.an();
            }
            if (!this.m.P()) {
                this.m.a(this.m.v(), false);
            }
        }
        this.m.bv();
    }

    private void f(int n) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 != this.m.h() && bmr_12 != this.m.i() && this.m.h() != null && euw_2.a.d(this.m.h().a_()) == null && this.m.i() != null && euw_2.a.d(this.m.i().a_()) == null) {
            return;
        }
        if (this.m.k() != null && ((efi_0)this.m.k()).G_() == 33) {
            return;
        }
        if ((bmf_2.a().c(this.h()) != null || euw_2.a.d(this.h()) != null) && n != 30 && n != 40 && n != 190 && !(this.m instanceof eja_0) && (((efh_0)this.m.f()).G() || ((efh_0)this.m.f()).H() && bmr_12 == this.m.h() || ((efh_0)this.m.f()).I() && bmr_12 == this.m.i())) {
            ani_2 ani_22 = new ani_2();
            ArrayList<String> arrayList = new ArrayList<String>();
            ani_22.i().a(aug_0.h).a((CharSequence)bzf_1.a(this.h()).dp()).a((CharSequence)" : ");
            String string = null;
            if (bae.h().a(13, (long)this.m.o())) {
                string = bae.h().a(13, this.m.o());
            }
            if ((string == null || string.length() == 0) && bae.h().a(10, (long)n)) {
                string = bae.h().a(30, n);
            }
            if (string.length() > 0) {
                Object object;
                ani_22.j();
                ani_22.i().a(aug_0.g);
                ani_22.a((CharSequence)string);
                if (n == efc_0.eq.a()) {
                    object = (eGm)this.m;
                    bpe_0 bpe_02 = (bpe_0)fih_0.a().a(((eGm)object).aI());
                    String string2 = String.valueOf(((eGm)object).aJ());
                    arrayList.add(bpe_02.g());
                    arrayList.add(string2);
                } else if (n == efc_0.es.a()) {
                    object = (bpe_0)fih_0.a().a(this.m.n());
                    arrayList.add(((bpe_0)object).g());
                } else if (n == efc_0.dq.a()) {
                    arrayList.add(bae.h().a(6, (long)this.m.n(), new Object[0]));
                } else {
                    arrayList.add(String.valueOf(this.m.n()));
                }
                try {
                    aul_0.a().c(Cr.a(ani_22.r(), arrayList.toArray()));
                }
                catch (Exception exception) {
                    a.error((Object)"Exception during chatInfo", (Throwable)exception);
                }
            }
        }
    }

    private int g(int n) {
        efd_0 efd_02 = (efd_0)efc_0.a().a(n);
        if (efd_02 == null) {
            return -1;
        }
        return efd_02.d();
    }

    @Override
    public int w() {
        return this.m.n();
    }

    @Override
    public byte x() {
        return this.m.bk();
    }

    @Override
    public ejh_0 y() {
        return this.m;
    }

    @Override
    public aff_1 z() {
        Su su = this.m.i();
        if (su != null) {
            return new aff_1(su.G(), su.H(), su.I());
        }
        return this.m.j();
    }

    @Override
    public aff_1 F() {
        aff_1 aff_12 = this.m.j();
        if (aff_12 != null) {
            return aff_12;
        }
        Su su = this.m.i();
        if (su != null) {
            return new aff_1(su.G(), su.H(), su.I());
        }
        return null;
    }

    @Override
    public aff_1 G() {
        Su su = this.m.h();
        if (su != null) {
            return new aff_1(su.G(), su.H(), su.I());
        }
        a.error((Object)"ATTENTION : on veut r\u00e9cup\u00e9rer la position du caster d'un effet mais celui ci est inconnu, \u00e0 d\u00e9faut on renvoie la cellule cible");
        return this.m.j();
    }

    @Override
    public aff_1 H() {
        se_0 se_02 = this.m.A();
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
        if (this.m instanceof eGq) {
            return ((eGq)((Object)this.m)).a();
        }
        return 0;
    }

    @Override
    public int J() {
        if (this.m instanceof eGq) {
            return ((eGq)((Object)this.m)).b();
        }
        return 0;
    }
}


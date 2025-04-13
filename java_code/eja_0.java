/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.Sets;
import java.util.BitSet;
import java.util.Collections;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eJa
 */
public class eja_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("param\u00e8tre d'etat", new eFu("id", eFx.a), new eFu("level", eFx.c)));
    private static final Set<Short> w = Collections.unmodifiableSet(Sets.union((Set)Sets.newHashSet((Object[])new Short[]{(short)7034, (short)2812}), eoU.g));
    private long x;
    private long y;
    private boolean z = false;
    private long A;
    private boolean B;
    private boolean C;
    private boolean D;
    private final BitSet E = new BitSet();
    private fie_0 F;
    private boolean G;

    @Override
    public aqr_2 c_() {
        return v;
    }

    @Nullable
    public static eja_0 a(So<efh_0> so, Su su, efi_0 efi_02, int n) {
        eja_0 eja_02 = new eja_0();
        eja_02.F = null;
        eja_02.i = efc_0.b.a();
        eja_02.l = ((ejh_0)efc_0.b.b()).e();
        eja_02.M();
        eja_02.e = su;
        eja_02.A = su != null ? su.a_() : 0L;
        eja_02.h = so;
        eja_02.E.clear();
        eja_02.m = n;
        eja_02.z = true;
        boolean bl = eja_02.aV();
        if (!bl) {
            a.error((Object)String.format("Unable to checkout a state with id %s : unknown base state id (%s)", n, fie_0.b(n)));
            return null;
        }
        eja_02.O = eja_02.F.o();
        eja_02.n = -1;
        eja_02.G = false;
        eja_02.x = -1L;
        eja_02.y = 0L;
        eja_02.C = false;
        eja_02.D = false;
        return eja_02;
    }

    public void aD() {
        this.aV();
        if (this.F != null) {
            this.F.a(true);
        }
    }

    public eja_0 aE() {
        eja_0 eja_02 = new eja_0();
        eja_02.E.clear();
        eja_02.E.or(this.E);
        eja_02.F = this.F;
        eja_02.z = true;
        eja_02.O = this.O;
        eja_02.A = this.A;
        eja_02.G = this.G;
        if (this.G) {
            eja_02.j = this.j;
        }
        eja_02.B = this.B;
        eja_02.x = this.x;
        eja_02.y = this.y;
        eja_02.C = this.C;
        eja_02.D = this.D;
        return eja_02;
    }

    @Override
    protected void b(sd_0<efh_0, efi_0> sd_02) {
        super.b(sd_02);
        if (this.G) {
            this.j = sd_02.c();
        }
        this.y = ((eja_0)sd_02).y;
    }

    public eja_0 b(So<efh_0> so) {
        this.d(true);
        eja_0 eja_02 = (eja_0)this.w();
        eja_02.j = this.j;
        eja_02.h = so;
        eja_02.aV();
        if (this.y > 0L) {
            return eja_02;
        }
        se_0 se_02 = this.A();
        if (se_02 instanceof eJL) {
            long l = ((eJL)se_02).e(this);
            eja_02.O = (int)Math.max(1L, l);
        } else {
            eja_02.O = this.O;
        }
        return eja_02;
    }

    public fie_0 aF() {
        return this.F;
    }

    public boolean aG() {
        return this.G;
    }

    public void d(boolean bl) {
        this.G = bl;
    }

    @Override
    public void a(BitSet bitSet) {
        if (bitSet != null) {
            this.E.or(bitSet);
        }
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.m > 0 && this.z) {
            if (this.f != null && this.f.x_() != null) {
                this.aV();
                if (this.F != null) {
                    if (this.D()) {
                        if (this.aG()) {
                            this.j(true);
                        }
                        if (!this.aO()) {
                            this.c(sd_02, bl);
                        }
                        if (this.F.C() && this.y <= 0L) {
                            this.y = wc_0.p().j().h();
                        }
                        for (efh_0 efh_02 : this.F) {
                            if (this.F.K() && efh_02.a(1L) != this.D) continue;
                            ejh_0 ejh_02 = (ejh_0)((ejh_0)efc_0.a().b(efh_02.j())).w();
                            if (this.f == null) {
                                a.warn((Object)("Impossible d'executer l'effet " + efh_02.i() + " on a plus de cible"));
                                return;
                            }
                            ejh_02.a(efh_02, this.F, this.h, this.e, null, this.f.G(), this.f.H(), this.f.I(), this.l());
                            if (this.bc()) {
                                ejh_02.h(true);
                            }
                            if (this.h.h() == 1 && this.aq()) {
                                ejh_02.am();
                                break;
                            }
                            if (this.R()) {
                                ejh_02.N = this.N;
                                ejh_02.c(this.f);
                            }
                            ejh_02.q();
                        }
                    }
                    if (this.f != null && this.f instanceof elw_0) {
                        ((elw_0)this.f).a(new epz_0(this));
                    }
                } else {
                    a.error((Object)"State inconnu pour le client, mais vraisemblablement pas pour le serveur");
                }
            }
            this.z = false;
        } else {
            this.j(true);
        }
        this.G = false;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public boolean as() {
        this.aV();
        return this.at() || this.F != null && (this.F.m() > 0 || this.F.o() > 0);
    }

    @Override
    public boolean at() {
        this.aV();
        if (this.F != null) {
            if (this.F.s()) {
                return this.F.o() < 0;
            }
            return this.F.m() < 0 || this.F.o() < 0;
        }
        return false;
    }

    @Override
    public long bo_() {
        if (this.F != null && this.F.C()) {
            return this.aU();
        }
        if (this.O < 0L) {
            this.aV();
            if (this.F != null) {
                return this.F.o();
            }
            return 0L;
        }
        return this.O;
    }

    private long aU() {
        if (this.y > 0L) {
            int n = this.F.o();
            wt_0 wt_02 = wc_0.p().j();
            long l = wt_02.h() - this.y;
            return Math.max(0L, (long)n - l);
        }
        return this.F.o();
    }

    @Override
    public boolean bp_() {
        return this.O > 0L;
    }

    private boolean aV() {
        if (this.F != null) {
            return true;
        }
        fie_0 fie_02 = fih_0.a().c(this.m);
        if (fie_02 == null) {
            return false;
        }
        this.F = fie_02.c(fie_0.c(this.m));
        this.F.c(this.B);
        this.F.r().forEach(this.E::set);
        return true;
    }

    @Override
    protected Long bn_() {
        if (this.F != null) {
            if (this.F.B() && this.e != null) {
                return this.e.a_();
            }
            if (!this.F.B() && this.f != null) {
                return this.f.a_();
            }
        }
        return super.bn_();
    }

    @Override
    public void an() {
        this.aV();
        if (this.F == null) {
            return;
        }
        if (this.h == null || this.h.d() == null) {
            return;
        }
        vx_0 vx_02 = this.F.n();
        if (!this.F.s()) {
            this.a(vx_02);
        }
    }

    @Override
    public void al() {
        super.al();
    }

    public void aM() {
        So so = this.m();
        if (!(so instanceof efq_0)) {
            return;
        }
        elm_0 elm_02 = ((efq_0)so).l();
        if (elm_02 == null) {
            return;
        }
        elm_02.a(1046, this.e, this.f, this.g, this.F);
    }

    @Override
    public void j(sd_0 sd_02) {
    }

    @Override
    public BitSet K() {
        return this.E;
    }

    @Override
    public boolean bm_() {
        return super.bm_();
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R() {
        return true;
    }

    @Override
    public boolean S() {
        return false;
    }

    public boolean aN() {
        this.aV();
        return this.F.s();
    }

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().d(this.y).b(this.x).c(this.O).a(this.c()).a(this.m).a(this.B).b(this.C).f(this.D ? 1 : 0));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            iq_0 iq_02 = iO2.r();
            this.y = iq_02.aa();
            this.x = iq_02.B();
            this.O = iq_02.D();
            this.a(iq_02.k());
            this.m = iq_02.e();
            this.B = iq_02.t();
            this.C = iq_02.v();
            this.D = iq_02.x() == 1;
            this.aV();
        }
    }

    @Override
    protected boolean aA() {
        if (this.F != null && w.contains(this.F.p())) {
            return true;
        }
        return super.aA();
    }

    public long aP() {
        return this.A;
    }

    public boolean aQ() {
        if (this.F == null) {
            return false;
        }
        return this.F.s();
    }

    public boolean aR() {
        return this.C;
    }

    public void e(boolean bl) {
        this.C = bl;
    }

    public void f(boolean bl) {
        this.B = bl;
    }

    public long aS() {
        return this.y;
    }

    public void e(long l) {
        this.y = l;
    }

    @Override
    public void z() {
        super.z();
        this.B = false;
        this.x = -1L;
        this.y = 0L;
        this.C = false;
        this.D = false;
    }

    public void g(boolean bl) {
        this.D = bl;
    }

    public boolean aT() {
        return this.D;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aE();
    }
}


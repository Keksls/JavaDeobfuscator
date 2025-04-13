/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

/*
 * Renamed from eHi
 */
public class ehi_0
extends ejh_0
implements eKf {
    private static final aqr_2 y = new eFw(new eFv("Soins", new eFu("Valeur", eFx.b)), new eFv("Prise en compte des modificateurs (0=fixe + non-r\u00e9ductible, 1=non-r\u00e9ductible, 2=fixe, 3=default)", new eFu("Valeur", eFx.b), new eFu("NONE(0) + DMG_MODIFIER(1) + RES_MODIFIER(2)", eFx.c)), new eFv("Ratio de la valeur des PV max/courant/manquant de la cible/caster", new eFu("Ratio (%)", eFx.b), new eFu("NONE(0) + DMG_MODIFIER(1) + RES_MODIFIER(2)", eFx.c), new eFu("CASTER : 1=max 2=current 3=missing | TARGET : 4=max 5=current 6=missing", eFx.c)));
    private static final BitSet z = new BitSet();
    efa_0 v;
    eKg w;
    int x;
    private int A;

    @Override
    public aqr_2 c_() {
        return y;
    }

    ehi_0() {
    }

    public ehi_0(efa_0 efa_02, eKg eKg2) {
        this.w = eKg2;
        this.v = efa_02;
        this.M();
    }

    public ehi_0 aD() {
        ehi_0 ehi_02 = new ehi_0();
        this.a(ehi_02);
        return ehi_02;
    }

    @Override
    private void a(ehi_0 ehi_02) {
        ehi_02.v = this.v;
        ehi_02.w = this.w;
        ehi_02.x = this.x;
        ehi_02.A = this.A;
    }

    @Override
    public void M() {
        super.M();
        this.c(1);
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.e == null || this.f == null || !this.f.a(eps_0.b)) {
            this.j(true);
            return;
        }
        if (this.m < 0) {
            this.m = 0;
            a.warn((Object)("HPGain with negative value : " + ((efh_0)this.c).i()));
        }
        if (!this.f.a(eoz_1.t) || this.a(eff_0.F)) {
            this.aM();
        } else {
            ehj_0 ehj_02 = ehj_0.a(this.h, this.v, eKg.a, this.m, this.f);
            ehj_02.a(efn_0.a(true, true, (ejh_0)this.v()));
            this.a(ehj_02);
            ehj_02.a(this);
            ehj_02.a(this.e);
            ehj_02.ad();
            this.j(true);
        }
    }

    @Override
    private void a(ehj_0 ehj_02) {
        if (((efh_0)this.c).G()) {
            if (((efh_0)this.c).f()) {
                ehj_02.a(eFF.a().b(-11));
            } else {
                ehj_02.a(eFF.a().b(-3));
            }
        } else if (((efh_0)this.c).f()) {
            ehj_02.a(eFF.a().b(-8));
        } else {
            ehj_02.a(eFF.a().b(-12));
        }
    }

    private void aM() {
        rs_0 rs_02 = this.f.b(eps_0.b);
        int n = this.m;
        int n2 = n - rs_02.c(n);
        rs_0 rs_03 = this.f.b(eps_0.T);
        if (rs_03 != null && rs_03.c() > 0) {
            int n3 = rs_03.c(n2);
            n2 -= n3;
        }
        this.m -= n2;
        if (this.f instanceof epq_2) {
            ((epq_2)this.f).v(this.m);
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.e == null || this.f == null || !this.f.a(eps_0.b)) {
            return;
        }
        this.aE();
        this.aG();
    }

    public void aE() {
        this.aF();
        if (this.c != null) {
            short s2 = this.aZ();
            switch (((efh_0)this.c).F()) {
                case 1: {
                    this.m = ((efh_0)this.c).a(0, s2, eFb.a);
                    break;
                }
                case 2: {
                    this.m = ((efh_0)this.c).a(0, s2, eFb.a);
                    this.x = ((efh_0)this.c).a(1, s2, eFb.a);
                    break;
                }
                case 3: {
                    this.m = ((efh_0)this.c).a(0, s2, eFb.a);
                    this.x = ((efh_0)this.c).a(1, s2, eFb.a);
                    this.w = eKg.a((byte)((efh_0)this.c).a(2, s2, eFb.a));
                    break;
                }
                default: {
                    a.error((Object)("Nombre de param\u00e9tres incorrect dans un HPGain : " + ((efh_0)this.c).F() + ", effectId : " + ((efh_0)this.c).i()));
                }
            }
        }
        this.m = eiu_0.a(this.m, this.w, this.e, this.f);
    }

    protected void aF() {
        this.m = 0;
        this.w = eKg.a;
        this.x = 3;
    }

    protected void aG() {
        boolean bl = this.c != null && ((efh_0)this.c).a(1L);
        boolean bl2 = false;
        eKi eKi2 = new eKi(this.e, this.f, this.v, (efh_0)this.c);
        eKi2.c(this.A);
        eKi2.b(this.m);
        eKi2.a(this.x);
        eKi2.a(false);
        eKi2.b(bl);
        eKi2.d(0);
        eKi2.e(0);
        eKi2.b();
        this.m = eKi2.a();
    }

    @Override
    public void a(int n, float f2, boolean bl) {
        super.a(n, f2, bl);
        switch (n) {
            case 0: {
                if (!bl) {
                    this.m = (int)((float)this.m + (float)this.m * f2 / 100.0f);
                    break;
                }
                this.m = (int)Math.floor((float)this.m * f2 / 100.0f);
                break;
            }
            case 1: {
                if (!bl) {
                    this.m = (int)((float)this.m + f2);
                    break;
                }
                this.m = (int)Math.floor(f2);
                break;
            }
        }
    }

    @Override
    public int g(int n) {
        return this.A += n;
    }

    @Override
    protected boolean bq_() {
        return this.bi();
    }

    @Override
    public efa_0 br_() {
        return this.v;
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    public boolean R() {
        return true;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public BitSet L() {
        if (this.f != null && this.f.a(eoz_1.t)) {
            return z;
        }
        return super.L();
    }

    @Override
    public void z() {
        this.w = eKg.a;
        this.v = efa_0.a;
        this.x = 3;
        this.A = 0;
        super.z();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eIq
 */
public final class eiq_0
extends eHV {
    private static final aqr_2 v = new eFw(new eFv("Params", new eFu("Sym\u00e9trie par rapport \u00e0 (0 = caster, 1 = target)", eFx.c)), new eFv("Avec pr\u00e9cision d'angle", new eFu("Sym\u00e9trie par rapport \u00e0 (0 = caster, 1 = target)", eFx.c), new eFu("Angle de sym\u00e9trie (sens horaire) (0 = 90\u00b0, 1 = 180\u00b0 (default), 2 = 270\u00b0)", eFx.c)));
    private boolean C;
    private int D;
    @Nullable
    private aff_1 E;

    public eiq_0() {
        this.M();
    }

    @Override
    public void j(sd_0 sd_02) {
        short s2 = this.aZ();
        this.B = null;
        if (this.c == null) {
            return;
        }
        if (fim_0.a() == null) {
            return;
        }
        fil_0 fil_02 = fim_0.a().a(((efh_0)this.c).i());
        if (fil_02 != null) {
            this.B = fil_02.b(s2);
        }
        this.C = ((efh_0)this.c).a(0, this.aZ(), eFb.a) == 1;
        int n = ((efh_0)this.c).F() >= 2 ? ((efh_0)this.c).a(1, this.aZ(), eFb.a) : 1;
        switch (n) {
            case 0: {
                this.D = 90;
                break;
            }
            case 2: {
                this.D = 270;
                break;
            }
            default: {
                this.D = 180;
            }
        }
        this.aM();
    }

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eiq_0 aD() {
        return new eiq_0();
    }

    private void aM() {
        int n;
        tg_0 tg_02 = this.h.e();
        if (tg_02 == null) {
            return;
        }
        aff_1 aff_12 = this.C ? this.a(this.g.d(), this.g.e(), this.e.P_().d(), this.e.P_().e()) : this.a(this.e.P_().d(), this.e.P_().e(), this.g.d(), this.g.e());
        if (aff_12 == null) {
            return;
        }
        int n2 = aff_12.d();
        if (tg_02.c(n2, n = aff_12.e())) {
            aff_12.a(tg_02.i(aff_12.d(), aff_12.e()));
            this.E = aff_12;
        }
    }

    @Override
    @NotNull
    public aff_1 aF() {
        if (this.E != null) {
            return this.E;
        }
        return super.aF();
    }

    @Override
    public boolean aG() {
        return true;
    }

    @Override
    public boolean ab() {
        return super.ab() && this.E != null;
    }

    @Nullable
    private aff_1 a(int n, int n2, int n3, int n4) {
        tg_0 tg_02 = this.h.e();
        if (tg_02 == null) {
            return null;
        }
        aff_1 aff_12 = new aff_1();
        switch (this.D) {
            case 90: {
                aff_12.b(n - (n4 - n2));
                aff_12.c(n2 + (n3 - n));
                break;
            }
            case 270: {
                aff_12.b(n + (n4 - n2));
                aff_12.c(n2 - (n3 - n));
                break;
            }
            default: {
                aff_12.b(2 * n - n3);
                aff_12.c(2 * n2 - n4);
            }
        }
        if (!tg_02.c(aff_12.d(), aff_12.e())) {
            return null;
        }
        aff_12.a(tg_02.i(aff_12.d(), aff_12.e()));
        return aff_12;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S() {
        return true;
    }

    @Override
    boolean a_(sd_0 sd_02) {
        if (((efh_0)this.c).F() >= 2 && ((efh_0)this.c).a(1, this.aZ(), eFb.a) == 1) {
            return true;
        }
        return super.a_(sd_02);
    }

    @Override
    public /* synthetic */ eHV aE() {
        return this.aD();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}


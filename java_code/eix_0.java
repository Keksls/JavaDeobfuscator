/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eIX
 */
public class eix_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("modifie la cible de l'effet d\u00e9clencheur par la cible de cet effet", new eFu[0]), new eFv("partage la valeur de l'effet declencheur entre caster et target", new eFu("% de la valeur de l'effet declencheur redirig\u00e9 vers la cible de cet effet (inf ou egal a 100)", eFx.b)), new eFv("Ne d\u00e9passe pas une valeur max de la nouvelle cible", new eFu("% de la valeur de l'effet declencheur redirig\u00e9 vers la cible de cet effet (inf ou egal a 100)", eFx.b), new eFu("Cap de la valeur redirig\u00e9e (-1=valeur des hp de la cible)", eFx.b)));
    private int w;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eix_0 aD() {
        eix_0 eix_02 = new eix_0();
        eix_02.w = this.w;
        return eix_02;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (!this.D()) {
            return;
        }
        sd_0 sd_03 = this.m(sd_02);
        if (sd_03 == null || this.e == null) {
            this.ba();
            return;
        }
        if (sd_03.bt_() == efc_0.eF.a()) {
            this.ba();
            return;
        }
        int n = sd_03.n();
        int n2 = n * this.m / 100;
        int n3 = this.aF();
        if (n3 > 0) {
            n2 = Math.min(n2, n3);
        }
        if (n2 == 0) {
            this.ba();
            return;
        }
        if (n2 >= n) {
            sd_03.b(this.f);
            return;
        }
        sd_0 sd_04 = sd_03.w();
        sd_03.b(n - n2);
        sd_04.a(this.g(sd_03));
        sd_04.b(this.f);
        sd_04.a(efn_0.a(true, true, null));
        sd_04.b(n2);
        sd_04.B();
        sd_04.ad();
    }

    private int aF() {
        int n = this.w;
        if (this.aE() && this.f.a(eps_0.b)) {
            n = this.f.c(eps_0.b);
        }
        return n;
    }

    public boolean aE() {
        return this.w == -1;
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        this.m = ((efh_0)this.c).F() == 0 ? 100 : Math.min(((efh_0)this.c).a(0, this.aZ(), eFb.a), 100);
        if (((efh_0)this.c).F() >= 2) {
            this.w = ((efh_0)this.c).a(1, this.aZ(), eFb.a);
        }
    }

    @Override
    public void z() {
        this.w = 0;
        super.z();
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
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}


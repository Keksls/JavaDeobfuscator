/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eHh
 */
public class ehh_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Boost de HP en fonction du bonus dmg d'un element", new eFu("Element (0=neutre, 1=feu, 2=eau, 3=terre, 4=air, 5=stasis, 6=lumi\u00e8re)", eFx.b), new eFu("% de la valeur \u00e0 ajouter", eFx.b), new eFu("Augmente la valeur courante (0 non 1 oui)", eFx.c), new eFu("Diminue \u00e0 la d\u00e9sapplication (0 g\u00e9n\u00e9ralement. Si vous h\u00e9sitez, demandez ! Bug \u00e0 l'horizon)", eFx.c)));
    private boolean w = true;
    private boolean x = true;
    private int y;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public ehh_0() {
        this.M();
    }

    public ehh_0 aD() {
        ehh_0 ehh_02 = new ehh_0();
        return ehh_02;
    }

    @Override
    public void M() {
        super.M();
        this.c(3);
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f == null || !this.f.a(eps_0.b)) {
            this.j(true);
            return;
        }
        rs_0 rs_02 = this.f.b(eps_0.b);
        int n = rs_02.c();
        int n2 = rs_02.d();
        rs_02.e(this.m);
        if (this.D()) {
            this.m = rs_02.d() - n2;
            this.y = rs_02.c() - n;
        }
        if (this.w) {
            rs_02.c(this.y);
            this.P = true;
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        short s2 = this.aZ();
        int n = ((efh_0)this.c).a(0, s2, eFb.a);
        int n2 = ((efh_0)this.c).a(1, s2, eFb.a);
        if (((efh_0)this.c).a(2, s2, eFb.a) == 0) {
            this.w = false;
        }
        if (((efh_0)this.c).a(3, s2, eFb.a) == 0) {
            this.x = false;
        }
        this.m = 0;
        efa_0 efa_02 = efa_0.a((byte)n);
        if (efa_02 == efa_0.g || efa_02 == efa_0.f) {
            efa_02 = eiu_0.a(this.e);
        }
        if (efa_02 != null) {
            this.m += eiu_0.a(efa_02.c(), this.e);
        }
        if (this.e.a(eps_0.p)) {
            this.m += this.e.c(eps_0.p);
        }
        if (this.e.a(eps_0.af)) {
            this.m += this.e.c(eps_0.af);
        }
        if (this.e.a(eps_0.ad)) {
            this.m += this.e.c(eps_0.ad);
        }
        if (this.e.a(eps_0.ac)) {
            this.m += this.e.c(eps_0.ac);
        }
        this.m = (this.m + 100) * n2 / 100;
    }

    @Override
    public void al() {
        if (this.P && this.f != null && this.f.a(eps_0.b)) {
            int n;
            int n2 = this.f.c(eps_0.b);
            int n3 = n = this.y > n2 ? n2 - 1 : this.y;
            if (this.x) {
                this.f.b(eps_0.b).d(n);
            }
            this.f.b(eps_0.b).e(-this.m);
        }
        super.al();
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

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().d(this.w).e(this.x).a(this.y));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            iq_0 iq_02 = iO2.r();
            this.w = iq_02.O();
            this.x = iq_02.Q();
            this.y = iq_02.e();
        }
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}


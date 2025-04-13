/*
 * Decompiled with CFR 0.152.
 */
public class eHp
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Absorbe des d\u00e9g\u00e2ts subis et les convertit en perte de Kamas", new eFu("Kamas perdus par point de d\u00e9g\u00e2t annul\u00e9", eFx.b), new eFu("% des d\u00e9g\u00e2ts absorb\u00e9s", eFx.b), new eFu("Perte de Kamas maximale pour 1 source de d\u00e9g\u00e2ts", eFx.b), new eFu("Perte de Kamas minimale pour 1 source de d\u00e9g\u00e2ts", eFx.b)));
    private float w;
    private int x;
    private int y;
    private int z;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eHp aD() {
        return new eHp();
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
    public void j(sd_0 sd_02) {
        short s2 = this.aZ();
        this.w = ((efh_0)this.c).a(0, s2);
        this.x = ((efh_0)this.c).a(1, s2, eFb.a);
        this.y = (int)Math.floor(((efh_0)this.c).a(2, s2) / this.w);
        this.z = ((efh_0)this.c).a(3, s2, eFb.a);
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (sd_02 != null && bl) {
            this.k(sd_02);
        }
        this.j(true);
    }

    void k(sd_0 sd_02) {
        Su su = sd_02.i();
        if (!(su instanceof epq_2)) {
            return;
        }
        epq_2 epq_22 = (epq_2)su;
        long l = epq_22.cq();
        if (l < (long)this.z) {
            return;
        }
        int n = (int)Math.floor((float)l / this.w);
        int n2 = this.a((float)(sd_02.n() * this.x) / 100.0f);
        if (n2 > this.y) {
            n2 = this.y;
        }
        if (n2 > n) {
            n2 = n;
        }
        int n3 = Math.max((int)Math.ceil((float)n2 * this.w), this.z);
        epq_22.e(n3);
        ewd_1.a("KamaShield", ewf_1.a(epq_22), null, ewf_1.e(n3), ewf_1.c(epq_22.T_(), (long)this.o()));
        sd_02.a(1, (float)(-n2), false);
    }

    protected int a(float f2) {
        return xh_0.a(f2);
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}


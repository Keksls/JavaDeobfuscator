/*
 * Decompiled with CFR 0.152.
 */
public class eJj
extends ejh_0 {
    private static final aqr_2 x = new eFw(new eFv("Invocation d'une image", new eFu("ID de la breed qui servira de base \u00e0 l'image", eFx.b), new eFu("Niveau de l'invocation (<= 0 = niveau du controller)", eFx.b)));
    private static final short y = 0;
    private short z;
    private long A;
    protected erg_2 v;
    public final fo_1 w = new ejk_0(this);

    @Override
    public aqr_2 c_() {
        return x;
    }

    public eJj() {
        this.M();
    }

    public eJj aD() {
        eJj eJj2 = new eJj();
        return eJj2;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.e instanceof epq_2) {
            a.info((Object)("Instanciation d'une nouvelle invocation avec un id de " + this.A));
            epq_2 epq_22 = (epq_2)this.e;
            epq_2 epq_23 = epq_22.b(this.A, this.g, this.z, this.v, null, false, null);
            if (this.D()) {
                this.v.a(epq_23.Z());
            }
            this.c(sd_02, bl);
            if (this.D() && ((epq_2)this.e).ck() != null) {
                ((epq_2)this.e).ck().Q(epq_23);
            }
            epq_23.c(eoz_1.ag);
            epq_23.c(eoz_1.s);
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        epq_2 epq_22 = (epq_2)this.e;
        short s2 = this.aZ();
        this.z = (short)((efh_0)this.c).a(0, s2, eFb.a);
        this.m = ((efh_0)this.c).a(1, s2, eFb.a);
        if (this.m <= 0) {
            this.m = epq_22.dr();
        }
        this.A = this.h.f().a((byte)1);
        fiz<? extends fio_0> fiz2 = epq_22.aZ();
        fiz<fio_0> fiz3 = new fiz<fio_0>(0, fiz2.a(), fiz2.e(), false, false, false);
        this.v = erg_2.b().b(epq_22.Z_().s(), epq_22.dp() + " clone", epq_22.c(eps_0.b), (short)this.m, epq_22, fiz3);
    }

    @Override
    public boolean Q() {
        return true;
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
    protected void a(iQ iQ2) {
        super.a(iQ2);
        iQ2.a(is_0.m().b(this.A).c(this.z).n());
    }

    @Override
    protected void b(iO iO2) {
        super.b(iO2);
        if (iO2.A()) {
            is_0 is_02 = iO2.B();
            this.A = is_02.i();
            this.z = Hw.c((long)is_02.k());
            this.f = null;
        }
    }

    @Override
    public fo_1 ax() {
        return this.w;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}


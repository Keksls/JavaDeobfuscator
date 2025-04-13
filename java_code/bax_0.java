/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bax
 */
public class bax_0
extends alc_1
implements abq_1 {
    private bwh_0 e;
    private static final abm_1 f = new abm_1(new bay_0());

    public static bax_0 a(int n, int n2, int n3, bwh_0 bwh_02) {
        try {
            bax_0 bax_02 = (bax_0)f.borrowObject();
            bax_02.a(n);
            bax_02.b(n2);
            bax_02.c(n3);
            bax_02.a(bwh_02);
            return bax_02;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut sur un EndPlacementAction : ", exception);
        }
    }

    @Override
    public void release() {
        try {
            f.returnObject(this);
        }
        catch (Exception exception) {
            a.error((Object)("Exception dans le release de " + this.getClass().toString() + "(normalement impossible)"));
        }
    }

    @Override
    public void onCheckOut() {
    }

    @Override
    public void onCheckIn() {
        this.e = null;
    }

    bax_0() {
        super(0, 0, 0);
    }

    @Override
    protected long o() {
        for (blx_1 blx_12 : this.e.j()) {
            biI biI2;
            if (!(blx_12 instanceof bnh_1) || (biI2 = blx_12.bv()).bQ() != bwy_0.g()) continue;
            blx_12.bj();
        }
        if (azu_0.j().k().cP() != this.e) {
            return 0L;
        }
        dlx.a().a(new dlw(dly.f, bae.h().a("fight.start", new Object[0]), 3000));
        try {
            ((bvx_2)this.e).D();
        }
        catch (Exception exception) {
            a.error((Object)"Erreur lors du placement : ", (Throwable)exception);
        }
        fis_1.a().a("isInFightCreationOrPlacement", false);
        bvx_2 bvx_22 = (bvx_2)this.e;
        bvx_22.G().clear();
        bvx_22.H().clear();
        return 0L;
    }

    @Override
    protected void l() {
        this.release();
    }

    public bwh_0 n() {
        return this.e;
    }

    public void a(bwh_0 bwh_02) {
        this.e = bwh_02;
    }
}


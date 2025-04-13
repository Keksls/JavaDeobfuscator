/*
 * Decompiled with CFR 0.152.
 */
public class baZ
extends alc_1
implements abq_1 {
    private bwh_0 e;
    private boolean f;
    private int g;
    private static final abm_1 h = new abm_1(new bba());

    public static baZ a(int n, int n2, int n3, bwh_0 bwh_02) {
        try {
            baZ baZ2 = (baZ)h.borrowObject();
            baZ2.a(n);
            baZ2.b(n2);
            baZ2.c(n3);
            baZ2.b(bwh_02);
            return baZ2;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    @Override
    public void release() {
        try {
            h.returnObject(this);
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
        this.f = false;
        this.g = 0;
    }

    baZ() {
        super(0, 0, 0);
    }

    @Override
    protected long o() {
        this.a(this.e);
        try {
            if (this.f) {
                ((bvx_2)this.e).A().b(this.g);
            }
            ((bvx_2)this.e).aa();
        }
        catch (Exception exception) {
            a.error((Object)"Error : ", (Throwable)exception);
        }
        fis_1.a().a("isInFightCreationOrPlacement", false);
        return 0L;
    }

    public void a(bwh_0 bwh_02) {
        for (blx_1 blx_12 : bwh_02.j()) {
            blx_12.bv().cd();
        }
    }

    @Override
    protected void l() {
        this.release();
    }

    public bwh_0 n() {
        return this.e;
    }

    public void b(bwh_0 bwh_02) {
        this.e = bwh_02;
    }

    public void b(boolean bl) {
        this.f = bl;
    }

    public void e(int n) {
        this.g = n;
    }
}


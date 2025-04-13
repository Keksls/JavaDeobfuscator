/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from baP
 */
public class bap_0
extends alc_1
implements abq_1 {
    private Iterable<blx_1> e;
    private blx_1 f;
    private blx_1 g;
    private static final abm_1 h = new abm_1(new baQ());

    public static bap_0 a(int n, int n2, int n3, Iterable<blx_1> iterable, blx_1 blx_12) {
        try {
            bap_0 bap_02 = (bap_0)h.borrowObject();
            bap_02.a(n);
            bap_02.b(n2);
            bap_02.c(n3);
            bap_02.e = iterable;
            bap_02.f = blx_12;
            return bap_02;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    public static bap_0 a(int n, int n2, int n3, blx_1 blx_12, blx_1 blx_13) {
        try {
            bap_0 bap_02 = (bap_0)h.borrowObject();
            bap_02.a(n);
            bap_02.b(n2);
            bap_02.c(n3);
            bap_02.g = blx_12;
            bap_02.f = blx_13;
            return bap_02;
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
        this.f = null;
        this.g = null;
    }

    bap_0() {
        super(0, 0, 0);
    }

    @Override
    protected long o() {
        aff_1 aff_12 = this.f.P_();
        if (this.e != null) {
            for (blx_1 blx_12 : this.e) {
                bap_0.a(aff_12, blx_12);
            }
        }
        if (this.g != null) {
            bap_0.a(aff_12, this.g);
        }
        return 100L;
    }

    private static void a(aff_1 aff_12, blx_1 blx_12) {
        aff_1 aff_13 = blx_12.P_();
        blx_12.a(afr_2.b(aff_12.d() - aff_13.d(), aff_12.e() - aff_13.e()));
    }

    @Override
    protected void l() {
        this.release();
    }
}


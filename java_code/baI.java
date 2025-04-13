/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

public class baI
extends alc_1
implements abq_1 {
    private Collection<blx_1> e;
    private byte f;
    private static final abm_1 g = new abm_1(new baJ());

    public static baI a(int n, int n2, int n3, Collection<blx_1> collection, byte by) {
        try {
            baI baI2 = (baI)g.borrowObject();
            baI2.a(n);
            baI2.b(n2);
            baI2.c(n3);
            baI2.e = collection;
            baI2.f = by;
            return baI2;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    @Override
    public void release() {
        try {
            g.returnObject(this);
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
        this.f = 0;
    }

    baI() {
        super(0, 0, 0);
    }

    @Override
    protected long o() {
        for (blx_1 blx_12 : this.e) {
            bwh_0 bwh_02 = bwj_1.a().a(blx_12.bA());
            if (bwh_02 == null || !(blx_12 instanceof bnh_1) || bwh_02.e() != elp_0.b && bwh_02.e() != elp_0.d) continue;
            blx_12.bv().e(this.f);
        }
        return 0L;
    }

    @Override
    protected void l() {
        this.release();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

public class baG
extends alc_1
implements abq_1 {
    private Collection<blx_1> e;
    private int f = -1;
    private static final abm_1 g = new abm_1(new baH());

    public static baG a(int n, int n2, int n3, Collection<blx_1> collection, int n4) {
        try {
            baG baG2 = (baG)g.borrowObject();
            baG2.a(n);
            baG2.b(n2);
            baG2.c(n3);
            baG2.e = collection;
            baG2.f = n4;
            return baG2;
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
        this.f = -1;
    }

    @Override
    public void onCheckIn() {
        this.e = null;
    }

    baG() {
        super(0, 0, 0);
    }

    @Override
    protected long o() {
        bwh_0 bwh_02 = bwj_1.a().a(this.f);
        if (bwh_02 == null) {
            return 250L;
        }
        for (blx_1 blx_12 : this.e) {
            byte by = blx_12.Y();
            blx_12.bv().c(by);
        }
        return 250L;
    }

    @Override
    protected void l() {
        this.release();
    }
}


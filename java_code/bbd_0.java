/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;

/*
 * Renamed from bbd
 */
public class bbd_0
extends alc_1
implements abq_1 {
    private ArrayList<blx_1> e;
    private blx_1 f;
    private static final abm_1 g = new abm_1(new bbe());

    public static bbd_0 a(int n, int n2, int n3, Collection<blx_1> collection) {
        try {
            bbd_0 bbd_02 = (bbd_0)g.borrowObject();
            bbd_02.a(n);
            bbd_02.b(n2);
            bbd_02.c(n3);
            bbd_02.e = new ArrayList<blx_1>(collection);
            return bbd_02;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    public static bbd_0 a(int n, int n2, int n3, blx_1 blx_12) {
        try {
            bbd_0 bbd_02 = (bbd_0)g.borrowObject();
            bbd_02.a(n);
            bbd_02.b(n2);
            bbd_02.c(n3);
            bbd_02.f = blx_12;
            return bbd_02;
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
        this.f = null;
    }

    bbd_0() {
        super(0, 0, 0);
    }

    @Override
    protected long o() {
        int n;
        int n2 = 75;
        if (this.e != null && this.e.size() > 0) {
            for (n = this.e.size() - 1; n >= 0; --n) {
                blx_1 blx_12 = this.e.get(n);
                int n3 = this.a(blx_12);
                if (n3 <= n2) continue;
                n2 = n3;
            }
        }
        if (this.f != null && (n = this.a(this.f)) > n2) {
            n2 = n;
        }
        return n2;
    }

    private int a(blx_1 blx_12) {
        if (blx_12 instanceof bmv_1) {
            bmv_1 bmv_12 = (bmv_1)blx_12;
            biI biI2 = bmv_12.bv();
            biI2.e((byte)-1);
            return bwa_0.b(blx_12);
        }
        if (blx_12 instanceof bnh_1) {
            if (blx_12 == azu_0.j().k()) {
                cdw_0.n().F();
            }
            blx_12.bv().cc();
            blx_12.bj();
            return 0;
        }
        return 0;
    }

    @Override
    protected void l() {
        this.release();
    }
}


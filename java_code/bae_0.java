/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from baE
 */
public class bae_0
extends alc_1
implements abq_1 {
    private static final Logger e = Logger.getLogger(bae_0.class);
    private final ArrayList<blx_1> f = new ArrayList();
    private final ArrayList<aff_1> g = new ArrayList();
    private boolean h = true;
    private static final abm_1 i = new abm_1(new baf_0());

    public static bae_0 a(int n, int n2, int n3, blx_1 blx_12, aff_1 aff_12, boolean bl) {
        bae_0 bae_02 = bae_0.a(n, n2, n3, blx_12, aff_12);
        bae_02.h = bl;
        return bae_02;
    }

    public static bae_0 a(int n, int n2, int n3, blx_1 blx_12, aff_1 aff_12) {
        try {
            bae_0 bae_02 = (bae_0)i.borrowObject();
            bae_02.a(n);
            bae_02.b(n2);
            bae_02.c(n3);
            bae_02.f.add(blx_12);
            bae_02.g.add(aff_12);
            bae_02.h = false;
            return bae_02;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    @Override
    public void release() {
        try {
            i.returnObject(this);
        }
        catch (Exception exception) {
            e.error((Object)("Exception dans le release de " + this.getClass().toString() + "(normalement impossible)"));
        }
    }

    @Override
    public void onCheckOut() {
        this.h = true;
    }

    @Override
    public void onCheckIn() {
        this.f.clear();
        this.g.clear();
    }

    bae_0() {
        super(0, 0, 0);
    }

    @Override
    protected long o() {
        int n = 0;
        for (blx_1 blx_12 : this.f) {
            aff_1 aff_12 = this.g.get(n);
            boolean bl = false;
            if (this.h) {
                bl = blx_12.bv().c(aff_12, false, false);
            }
            if (!bl) {
                blx_12.a(aff_12.d(), aff_12.e(), aff_12.f(), false);
            }
            ++n;
        }
        return 0L;
    }

    @Override
    protected void l() {
        this.release();
    }

    public void a(blx_1 blx_12, aff_1 aff_12) {
        this.f.add(blx_12);
        this.g.add(aff_12);
    }
}


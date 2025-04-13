/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from baC
 */
public class bac_0
extends bao_0
implements abq_1 {
    private static final Logger e = Logger.getLogger(bac_0.class);
    private final ArrayList<biI> f = new ArrayList();
    private final ArrayList<ael_2> g = new ArrayList();
    private final ArrayList<Boolean> h = new ArrayList();
    private Object i;
    private static final abm_1 m = new abm_1(new baD());

    public static bac_0 a(int n, int n2, int n3, biI biI2, ael_2 ael_22) {
        try {
            bac_0 bac_02 = (bac_0)m.borrowObject();
            bac_02.a(n);
            bac_02.b(n2);
            bac_02.c(n3);
            if (ael_22.e() > 0) {
                bac_02.f.add(biI2);
                bac_02.g.add(ael_22);
                bac_02.h.add(false);
            }
            return bac_02;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    @Override
    public void release() {
        try {
            m.returnObject(this);
        }
        catch (Exception exception) {
            e.error((Object)("Exception dans le release de " + this.getClass() + "(normalement impossible)"));
        }
    }

    @Override
    public void onCheckOut() {
        this.i = new Object();
    }

    @Override
    public void onCheckIn() {
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.i = null;
    }

    bac_0() {
        super(0, 0, 0);
    }

    @Override
    protected long o() {
        for (int k = this.f.size() - 1; k >= 0; --k) {
            biI biI2 = this.f.get(k);
            e.info((Object)("onRun :" + biI2.a()));
            biI2.b(this);
            biI2.a(this.g.get(k));
        }
        return 7000L;
    }

    @Override
    protected void l() {
        this.release();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        Object object = this.i;
        synchronized (object) {
            afe_02.c(this);
            boolean bl = true;
            for (int k = this.f.size() - 1; k >= 0; --k) {
                if (this.f.get(k) == afe_02) {
                    e.info((Object)("pathEnded :" + this.f.get(k).a()));
                    this.h.remove(k);
                    this.h.add(k, true);
                }
                if (this.h.get(k).booleanValue()) continue;
                bl = false;
                e.info((Object)("all finish :" + this.f.get(k).a()));
            }
            if (bl) {
                adi_2.a().a(this.l);
                this.j();
            }
        }
    }

    public void a(biI biI2, ael_2 ael_22) {
        if (ael_22.e() > 0) {
            this.f.add(biI2);
            this.g.add(ael_22);
            this.h.add(false);
        }
    }
}


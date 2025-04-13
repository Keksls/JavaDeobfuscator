/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.console.command.display.AlphaMaskCommand;
import org.apache.log4j.Logger;

public class bbb
extends alc_1
implements abq_1 {
    private static final Logger e = Logger.getLogger(bbb.class);
    private bwh_0 f;
    private int g;
    private long h;
    private static final abm_1 i = new abm_1(new bbc());

    public static bbb a(int n, int n2, int n3, bwh_0 bwh_02, int n4, long l) {
        try {
            bbb bbb2 = (bbb)i.borrowObject();
            bbb2.a(n);
            bbb2.b(n2);
            bbb2.c(n3);
            bbb2.f = bwh_02;
            bbb2.g = n4;
            bbb2.h = l;
            return bbb2;
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
    }

    @Override
    public void onCheckIn() {
        this.f = null;
        this.g = 0;
        this.h = 0L;
    }

    bbb() {
        super(0, 0, 0);
    }

    @Override
    protected long o() {
        if (this.f instanceof bvx_2) {
            bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
            try {
                boolean bl = bvx_02.a(bWe.r);
                if (bl) {
                    AlphaMaskCommand.c(true);
                }
                cIi.proceedHideFightOccluders(bvx_02.a(bWe.s));
                cIi.proceedFightersTransparency(bvx_02.a(bWe.t));
            }
            catch (Exception exception) {
                e.error((Object)"Exception levee", (Throwable)exception);
            }
            if (cZI.A()) {
                cZI.a().c();
            }
            long l = System.currentTimeMillis();
            long l2 = (long)this.g - (l - this.h);
            try {
                ((bvx_2)this.f).b((int)l2);
            }
            catch (Exception exception) {
                e.error((Object)"Erreur lors du d\u00e9but du placement : ", (Throwable)exception);
            }
        } else if (this.f instanceof bvw_2) {
            ((bvw_2)this.f).a(elp_0.b);
        }
        return 0L;
    }

    @Override
    protected void l() {
        this.release();
    }
}


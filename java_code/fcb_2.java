/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fCB
 */
public class fcb_2
extends fck_2 {
    private static final Logger i = Logger.getLogger(fcb_2.class);
    private Object j = null;
    private static final ObjectPool k = new abm_1(new fcc_2());
    private static int r = 0;
    private static int s = 0;

    public static fcb_2 a(fyb_0 fyb_02, frd_0 frd_02, Object object) {
        fcb_2 fcb_22;
        ++r;
        try {
            fcb_22 = (fcb_2)k.borrowObject();
            fcb_22.a = k;
        }
        catch (Exception exception) {
            i.error((Object)"Probl\u00e8me au borrowObject.");
            fcb_22 = new fcb_2();
            fcb_22.onCheckOut();
        }
        fcb_22.c(fyb_02);
        fcb_22.a(frd_02);
        fcb_22.a(object);
        return fcb_22;
    }

    public static fcb_2 a(fck_2 fck_22, fyb_0 fyb_02, frd_0 frd_02, Object object) {
        fcb_2 fcb_22;
        ++r;
        try {
            fcb_22 = (fcb_2)k.borrowObject();
            fcb_22.a = k;
        }
        catch (Exception exception) {
            i.error((Object)"Probl\u00e8me au borrowObject.");
            fcb_22 = new fcb_2();
            fcb_22.onCheckOut();
        }
        fcb_22.e(fck_22.o);
        fcb_22.f(fck_22.p);
        fcb_22.b(fck_22.l);
        fcb_22.c(fck_22.m);
        fcb_22.d(fck_22.n);
        fcb_22.b(fck_22.g());
        fcb_22.c(fyb_02);
        fcb_22.a(frd_02);
        fcb_22.a(object);
        return fcb_22;
    }

    @Override
    public void release() {
        super.release();
        ++s;
    }

    public Object j() {
        return this.j;
    }

    public void a(Object object) {
        this.j = object;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.j = null;
    }
}


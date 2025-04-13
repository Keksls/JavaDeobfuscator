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
 * Renamed from fCG
 */
public class fcg_2
extends fck_2 {
    private static final Logger i = Logger.getLogger(fcg_2.class);
    private static final ObjectPool j = new abm_1(new fch_2());
    private float k;
    private float r;
    private Object s;

    public static fcg_2 j() {
        fcg_2 fcg_22;
        try {
            fcg_22 = (fcg_2)j.borrowObject();
            fcg_22.a = j;
        }
        catch (Exception exception) {
            i.error((Object)"Probl\u00e8me au borrowObject.");
            fcg_22 = new fcg_2();
            fcg_22.onCheckOut();
        }
        return fcg_22;
    }

    public static fcg_2 a(fck_2 fck_22, float f2, float f3, Object object) {
        fcg_2 fcg_22 = fcg_2.j();
        fcg_22.e(fck_22.o);
        fcg_22.f(fck_22.p);
        fcg_22.b(fck_22.l);
        fcg_22.c(fck_22.m);
        fcg_22.d(fck_22.n);
        fcg_22.c((fyb_0)fck_22.e());
        fcg_22.a(f2);
        fcg_22.b(f3);
        fcg_22.a(object);
        return fcg_22;
    }

    public float k() {
        return this.k;
    }

    public void a(float f2) {
        this.k = f2;
    }

    public float l() {
        return this.r;
    }

    public void b(float f2) {
        this.r = f2;
    }

    public Object m() {
        return this.s;
    }

    public void a(Object object) {
        this.s = object;
    }
}


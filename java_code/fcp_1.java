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
 * Renamed from fCp
 */
public class fcp_1
extends fck_2 {
    private static final Logger i = Logger.getLogger(fcp_1.class);
    private fsv_0 j = null;
    private Object k = null;
    private Object r = null;
    private static final ObjectPool s = new abm_1(new fcq_2());

    public fcp_1() {
    }

    public fcp_1(fsv_0 fsv_02, Object object) {
        this.a(fsv_02);
        this.e = fsv_02;
        this.r = object;
    }

    public static fcp_1 a(fck_2 fck_22, fyb_0 fyb_02, Object object) {
        fcp_1 fcp_12;
        try {
            fcp_12 = (fcp_1)s.borrowObject();
            fcp_12.a = s;
        }
        catch (Exception exception) {
            i.error((Object)"Probl\u00e8me au borrowObject.");
            fcp_12 = new fcp_1();
            fcp_12.onCheckOut();
        }
        fcp_12.e(fck_22.o);
        fcp_12.f(fck_22.p);
        fcp_12.b(fck_22.l);
        fcp_12.c(fck_22.m);
        fcp_12.d(fck_22.n);
        fcp_12.c(fyb_02);
        fcp_12.a(frd_0.d);
        fcp_12.a((fsv_0)fyb_02);
        fcp_12.r = object;
        return fcp_12;
    }

    public fsv_0 j() {
        return this.j;
    }

    public void a(fsv_0 fsv_02) {
        ftj_0 ftj_02;
        if (fsv_02 instanceof fyb_0) {
            this.j = fsv_02;
        }
        if (fsv_02 != null && (ftj_02 = fsv_02.getRenderableParent()) != null) {
            this.k = ftj_02.getItemValue();
        }
    }

    public Object k() {
        return this.k;
    }

    public void a(Object object) {
        this.k = object;
    }

    public Object l() {
        return this.r;
    }

    public void b(Object object) {
        this.r = object;
    }

    @Override
    public frd_0 f() {
        return frd_0.d;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 */
import org.apache.commons.pool.ObjectPool;

/*
 * Renamed from fCr
 */
public class fcr_1
extends fck_2 {
    private fsv_0 i = null;
    private Object j = null;
    private Object k = null;
    private fsv_0 r = null;
    private Object s = null;
    private static final ObjectPool t = new abm_1(new fcs_2());

    public fcr_1() {
    }

    public fcr_1(fsv_0 fsv_02, fsv_0 fsv_03, Object object) {
        this.a(fsv_02);
        this.b(fsv_03);
        this.e = fsv_02;
        this.k = object;
    }

    public static fcr_1 a(fck_2 fck_22, fsv_0 fsv_02, fsv_0 fsv_03, Object object) {
        fcr_1 fcr_12;
        try {
            fcr_12 = (fcr_1)t.borrowObject();
            fcr_12.a = t;
        }
        catch (Exception exception) {
            fcr_12 = new fcr_1();
            fcr_12.onCheckOut();
        }
        fcr_12.e(fck_22.o);
        fcr_12.f(fck_22.p);
        fcr_12.b(fck_22.l);
        fcr_12.c(fck_22.m);
        fcr_12.d(fck_22.n);
        fcr_12.c(fsv_02);
        fcr_12.a(frd_0.e);
        fcr_12.a(fsv_02);
        fcr_12.b(fsv_03);
        fcr_12.k = object;
        return fcr_12;
    }

    public fsv_0 j() {
        return this.i;
    }

    public void a(fsv_0 fsv_02) {
        ftj_0 ftj_02;
        if (fsv_02 instanceof fyb_0) {
            this.i = fsv_02;
        }
        if (fsv_02 != null && (ftj_02 = fsv_02.getRenderableParent()) != null) {
            this.j = ftj_02.getItemValue();
        }
    }

    public fsv_0 k() {
        return this.r;
    }

    public void b(fsv_0 fsv_02) {
        ftj_0 ftj_02;
        if (fsv_02 instanceof fyb_0) {
            this.r = fsv_02;
        }
        if (fsv_02 != null && (ftj_02 = fsv_02.getRenderableParent()) != null) {
            this.s = ftj_02.getItemValue();
        }
    }

    public Object l() {
        return this.j;
    }

    public Object m() {
        return this.s;
    }

    public Object n() {
        return this.k;
    }

    @Override
    public frd_0 f() {
        return frd_0.e;
    }
}


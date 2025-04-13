/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 */
import org.apache.commons.pool.ObjectPool;

/*
 * Renamed from fCt
 */
public class fct_2
extends fck_2 {
    private fsv_0 i = null;
    private Object j = null;
    private Object k = null;
    private fsv_0 r = null;
    private Object s = null;
    private static final ObjectPool t = new abm_1(new fcu_2());

    public fct_2() {
    }

    public fct_2(fsv_0 fsv_02, fsv_0 fsv_03, Object object) {
        this.a(fsv_02);
        this.b(fsv_03);
        this.e = fsv_02;
        this.k = object;
    }

    public static fct_2 a(fck_2 fck_22, fsv_0 fsv_02, fsv_0 fsv_03, Object object) {
        fct_2 fct_22;
        try {
            fct_22 = (fct_2)t.borrowObject();
            fct_22.a = t;
        }
        catch (Exception exception) {
            fct_22 = new fct_2();
            fct_22.onCheckOut();
        }
        fct_22.e(fck_22.o);
        fct_22.f(fck_22.p);
        fct_22.b(fck_22.l);
        fct_22.c(fck_22.m);
        fct_22.d(fck_22.n);
        fct_22.c(fsv_02);
        fct_22.a(frd_0.f);
        fct_22.a(fsv_02);
        fct_22.b(fsv_03);
        fct_22.k = object;
        return fct_22;
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

    @Override
    public frd_0 f() {
        return frd_0.f;
    }
}


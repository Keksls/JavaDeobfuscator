/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 */
import org.apache.commons.pool.ObjectPool;

/*
 * Renamed from fCv
 */
public class fcv_2
extends fck_2 {
    private fsv_0 i;
    private fsv_0 j;
    private Object k;
    private Object r;
    private Object s;
    private int t;
    private static final ObjectPool u = new abm_1(new fcw_1());

    public fcv_2() {
    }

    public fcv_2(fsv_0 fsv_02, fsv_0 fsv_03, Object object) {
        this.a(fsv_03);
        this.b(fsv_02);
        this.e = fsv_02;
        this.s = object;
    }

    public static fcv_2 a(fck_2 fck_22, fsv_0 fsv_02, fsv_0 fsv_03, Object object) {
        fcv_2 fcv_22;
        try {
            fcv_22 = (fcv_2)u.borrowObject();
            fcv_22.a = u;
        }
        catch (Exception exception) {
            fcv_22 = new fcv_2();
            fcv_22.onCheckOut();
        }
        fcv_22.e(fck_22.o);
        fcv_22.f(fck_22.p);
        fcv_22.b(fck_22.l);
        fcv_22.c(fck_22.m);
        fcv_22.d(fck_22.n);
        fcv_22.c(fsv_02);
        fcv_22.a(frd_0.g);
        fcv_22.a(fsv_03);
        fcv_22.b(fsv_02);
        fcv_22.s = object;
        return fcv_22;
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

    public fsv_0 k() {
        return this.i;
    }

    public void b(fsv_0 fsv_02) {
        ftj_0 ftj_02;
        if (fsv_02 instanceof fyb_0) {
            this.i = fsv_02;
        }
        if (fsv_02 != null && (ftj_02 = fsv_02.getRenderableParent()) != null) {
            this.r = ftj_02.getItemValue();
        }
    }

    public Object l() {
        return this.r;
    }

    public void a(Object object) {
        this.r = object;
    }

    public Object m() {
        return this.k;
    }

    public void b(Object object) {
        this.k = object;
    }

    public Object n() {
        return this.s;
    }

    public void c(Object object) {
        this.s = object;
    }

    public int o() {
        return this.t;
    }

    public void a(int n) {
        this.t = n;
    }

    @Override
    public frd_0 f() {
        return frd_0.g;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 */
import java.awt.event.MouseEvent;
import org.apache.commons.pool.ObjectPool;

/*
 * Renamed from fCx
 */
public class fcx_1
extends fck_2 {
    fsv_0 i;
    Object j;
    Object k;
    private static final ObjectPool r = new abm_1(new fcy_1());

    public fcx_1() {
    }

    public fcx_1(fsv_0 fsv_02, Object object) {
        this.a(fsv_02);
        this.e = fsv_02;
        this.k = object;
    }

    public static fcx_1 a(MouseEvent mouseEvent, fsv_0 fsv_02, Object object) {
        fcx_1 fcx_12;
        try {
            fcx_12 = (fcx_1)r.borrowObject();
            fcx_12.a = r;
        }
        catch (Exception exception) {
            fcx_12 = new fcx_1();
            fcx_12.onCheckOut();
        }
        fcx_12.e(mouseEvent.getButton());
        fcx_12.f(mouseEvent.getClickCount());
        fcx_12.b(mouseEvent.getModifiersEx());
        fcx_12.c(fyf_0.a().c());
        fcx_12.d(fyf_0.a().d());
        fcx_12.c(fsv_02);
        fcx_12.a(frd_0.h);
        fcx_12.a(fsv_02);
        fcx_12.k = object;
        return fcx_12;
    }

    public static fcx_1 a(fck_2 fck_22, fsv_0 fsv_02, Object object) {
        fcx_1 fcx_12;
        try {
            fcx_12 = (fcx_1)r.borrowObject();
            fcx_12.a = r;
        }
        catch (Exception exception) {
            fcx_12 = new fcx_1();
            fcx_12.onCheckOut();
        }
        fcx_12.e(fck_22.o);
        fcx_12.f(fck_22.p);
        fcx_12.b(fck_22.l);
        fcx_12.c(fck_22.m);
        fcx_12.d(fck_22.n);
        fcx_12.c(fsv_02);
        fcx_12.a(frd_0.h);
        fcx_12.a(fsv_02);
        fcx_12.k = object;
        return fcx_12;
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

    public Object k() {
        return this.j;
    }

    public void a(Object object) {
        this.j = object;
    }

    public Object l() {
        return this.k;
    }

    public void b(Object object) {
        this.k = object;
    }

    @Override
    public frd_0 f() {
        return frd_0.h;
    }
}


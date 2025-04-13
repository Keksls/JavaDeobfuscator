/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.awt.event.MouseEvent;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fCK
 */
public class fck_2
extends fca_2 {
    private static final Logger i = Logger.getLogger(fck_2.class);
    private static final ObjectPool j = new abm_1(new fcl_2());
    protected int m;
    protected int n;
    protected int o;
    protected int p;
    protected int q;

    public int a(fvE fvE2) {
        if (fvE2 != null) {
            return this.m - fvE2.getDisplayX();
        }
        return 0;
    }

    public int v() {
        return this.m;
    }

    public void c(int n) {
        this.m = n;
    }

    public int b(fvE fvE2) {
        if (fvE2 != null) {
            return this.n - fvE2.getDisplayY();
        }
        return 0;
    }

    public int w() {
        return this.n;
    }

    public void d(int n) {
        this.n = n;
    }

    public int x() {
        return this.o;
    }

    public void e(int n) {
        this.o = n;
    }

    public int y() {
        return this.p;
    }

    public void f(int n) {
        this.p = n;
    }

    public int z() {
        return this.q;
    }

    public void g(int n) {
        this.q = n;
    }

    public static fck_2 a(MouseEvent mouseEvent) {
        fck_2 fck_22 = fck_2.A();
        fck_22.o = mouseEvent.getButton();
        fck_22.l = mouseEvent.getModifiersEx();
        fck_22.p = mouseEvent.getClickCount();
        return fck_22;
    }

    public static fck_2 A() {
        fck_2 fck_22;
        try {
            fck_22 = (fck_2)j.borrowObject();
            fck_22.a = j;
        }
        catch (Exception exception) {
            i.error((Object)"Probl\u00e8me au borrowObject.");
            fck_22 = new fck_2();
            fck_22.onCheckOut();
        }
        return fck_22;
    }

    public static fck_2 a(fck_2 fck_22) {
        fck_2 fck_23 = fck_2.A();
        fck_23.e(fck_22.o);
        fck_23.f(fck_22.p);
        fck_23.b(fck_22.l);
        fck_23.c(fck_22.m);
        fck_23.d(fck_22.n);
        fck_23.c(fck_22.e);
        return fck_23;
    }

    @Override
    public void release() {
        super.release();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
    }
}


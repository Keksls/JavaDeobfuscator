/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class dbp
implements ahr_1,
Runnable {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 5000;
    protected static final Logger e = Logger.getLogger(dbp.class);
    static final dbp g = new dbp();
    private ans_1 h;
    final LinkedList<bls_1> i = new LinkedList();
    final LinkedList<bls_1> j = new LinkedList();
    private static final int k = 9;
    private static final int l = 1000;
    private static final int m = 100;
    boolean n;
    boolean o;
    private long p;
    public final ArrayList<dby_0> f = new ArrayList();
    private bls_1 q;
    boolean r;
    private boolean s;

    public void a(bls_1 bls_12) {
        this.q = bls_12;
        fis_1.a().a("currentNotification", this.q);
    }

    public void a(boolean bl) {
        this.s = bl;
        if (!this.s) {
            this.f();
        }
    }

    private void f() {
        this.p = System.currentTimeMillis();
    }

    public static dbp a() {
        return g;
    }

    public boolean a(dby_0 dby_02) {
        return !this.f.contains(dby_02) && this.f.add(dby_02);
    }

    public void b(dby_0 dby_02) {
        this.f.remove(dby_02);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16489: {
                dbp dbp2 = g;
                synchronized (dbp2) {
                    dhc dhc2 = (dhc)adt_12;
                    bls_1 bls_12 = new bls_1(dhc2.p(), dhc2.k(), dhc2.o(), dhc2.q(), dhc2.r());
                    if (this.r && this.l() < 9) {
                        this.b(bls_12);
                    } else {
                        this.i.addLast(bls_12);
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.h = new dbq_0(this);
            fpm_0.b().a(this.h);
            fis_1.a().a("notificationPanel", this.j.toArray());
            fso fso2 = (fso)fpm_0.b().a("informationMessageDialog", cfi_0.a("informationMessageDialog"), 139264L, (short)30001);
            this.r = false;
            fso2.setEnablePositionEvents(true);
            fso2.addEventListener(frd_0.Q, new dbr(this, fso2), true);
            fpm_0.b().a("wakfu.notificationPanel", cIg.class);
            this.f();
            ado_1.a().a(this, 1000L, -1);
            cgu_2.a().a(this);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.g();
            fis_1.a().a("notificationPanel");
            fpm_0.b().b(this.h);
            fpm_0.b().o("informationMessageDialog");
            fpm_0.b().e("wakfu.notificationPanel");
            ado_1.a().b(this);
            cgu_2.a().b(this);
        }
    }

    private void g() {
        this.n = false;
        this.o = false;
        this.j.clear();
        this.f.clear();
        this.i.clear();
        ado_1.a().b(this);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    void b(bls_1 bls_12) {
        if (bls_12 == null) {
            return;
        }
        this.f();
        this.j.addFirst(bls_12);
        this.i();
        int n = bls_12.c();
        if (n != -1) {
            cdw_0.n().c((long)n);
        }
        if (this.j.size() > 1) {
            return;
        }
        this.a(bls_12);
        fso fso2 = this.h();
        fso2.removeTweensOfType(dbz_0.class);
        fso2.setVisible(true);
        int n2 = 100;
        dbz_0 dbz_02 = new dbz_0(fso2.getY(), 100, fso2, 0, 1000, fjw_2.b, true);
        dbz_02.a(new dbs(this, dbz_02));
        fso2.addTween(dbz_02);
        fyy_0 fyy_02 = fpm_0.b().h().d("informationMessageDialog");
        ftj_0 ftj_02 = (ftj_0)fyy_02.a("renderableContainer");
        fsQ fsQ2 = (fsQ)fyy_02.a("messagesList");
        new dbv_0(this, bls_12, ftj_02, fsQ2).a();
        this.n = true;
    }

    private fso h() {
        fyy_0 fyy_02 = fpm_0.b().h().d("informationMessageDialog");
        if (fyy_02 == null) {
            return null;
        }
        return (fso)fyy_02.a("mainContainer");
    }

    void i() {
        fis_1.a().a("notificationPanel", (Object)null);
        fis_1.a().a("notificationPanel", this.j.toArray());
    }

    @Override
    public void run() {
        if (this.s) {
            return;
        }
        this.a(false, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(boolean bl, bls_1 bls_12) {
        dbp dbp2 = g;
        synchronized (dbp2) {
            if (this.n) {
                this.o = true;
                return;
            }
            this.o = false;
            if (this.j.isEmpty()) {
                return;
            }
            bls_1 bls_13 = this.j.getFirst();
            if (bls_13 != null) {
                long l;
                if (!bl && (l = System.currentTimeMillis()) - this.p < (long)bls_13.a().c()) {
                    return;
                }
            } else {
                return;
            }
            if (this.j.size() == 1) {
                fso fso2 = this.h();
                this.b(false);
                fso2.removeTweensOfType(dbz_0.class);
                dbz_0 dbz_02 = new dbz_0(fso2.getY(), -200, fso2, 0, 1000, fjw_2.b, false);
                dbz_02.a(new dbt(this, fso2, dbz_02));
                fso2.addTween(dbz_02);
                this.n = true;
            } else {
                bls_1 bls_14;
                if (bl && bls_12 != null) {
                    this.j.remove(bls_12);
                    bls_14 = bls_12;
                } else {
                    bls_14 = this.j.removeLast();
                }
                if (!this.i.isEmpty()) {
                    bls_1 bls_15 = this.i.poll();
                    this.b(bls_15);
                } else {
                    this.f();
                }
                if (bls_14 == this.q) {
                    this.a(this.j.getLast());
                }
                this.i();
            }
        }
    }

    void j() {
        for (int k = this.f.size() - 1; k >= 0; --k) {
            this.f.get(k).a();
        }
    }

    void k() {
        for (int k = this.f.size() - 1; k >= 0; --k) {
            this.f.get(k).b();
        }
    }

    public void b(boolean bl) {
    }

    public void c() {
        fyy_0 fyy_02 = fpm_0.b().h().d("informationMessageDialog");
        ArrayList<fqt> arrayList = new ArrayList<fqt>();
        ftj_0 ftj_02 = (ftj_0)fyy_02.a("renderableContainer");
        this.a(ftj_02.getInnerElementMap(), arrayList);
        fsQ fsQ2 = (fsQ)fyy_02.a("messagesList");
        for (ftj_0 ftj_03 : fsQ2.getRenderables()) {
            this.a(ftj_03.getInnerElementMap(), arrayList);
        }
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            this.a(true, ftj_02, arrayList, true);
        }
    }

    private void a(boolean bl, fvE fvE2, ArrayList<fqt> arrayList, boolean bl2) {
        int n;
        int n2;
        if (bl) {
            n2 = azf_2.b.i();
            n = azf_2.e.i();
        } else {
            n2 = azf_2.e.i();
            n = azf_2.b.i();
        }
        if (n2 != n) {
            if (bl) {
                cdw_0.n().z();
            } else {
                cdw_0.n().A();
            }
            azf_2 azf_22 = new azf_2(n2);
            azf_2 azf_23 = new azf_2(n);
            fvE2.removeTweensOfType(fjo_2.class);
            fjo_2 fjo_22 = new fjo_2(azf_22, azf_23, arrayList, 0, bl2 ? 0 : 1000, 1, fjw_2.b);
            fvE2.addTween(fjo_22);
        }
    }

    private void a(fyy_0 fyy_02, ArrayList<fqt> arrayList) {
        if (fyy_02 == null) {
            return;
        }
        fjj_1 fjj_12 = new fjj_1(fyy_02);
        while (fjj_12.hasNext()) {
            fyb_0 fyb_02 = fjj_12.a();
            if (!(fyb_02 instanceof fvE)) continue;
            fvE fvE2 = (fvE)fyb_02;
            arrayList.add(fvE2.getAppearance());
        }
    }

    public boolean d() {
        return this.l() == 0;
    }

    int l() {
        int n = 0;
        for (bls_1 bls_12 : this.j) {
            if (bls_12 == null) continue;
            ++n;
        }
        return n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void e() {
        dbp dbp2 = g;
        synchronized (dbp2) {
            if (this.d() || this.n) {
                return;
            }
            this.a(true, this.q);
        }
    }

    public boolean a(blr_1 blr_12) {
        for (bls_1 bls_12 : this.j) {
            if (bls_12 == null || bls_12.a() != blr_12) continue;
            return true;
        }
        return false;
    }
}


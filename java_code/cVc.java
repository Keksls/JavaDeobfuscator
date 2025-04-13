/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.log4j.Logger
 */
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;

public abstract class cVc
implements ahr_1,
bNP,
bNQ,
Runnable {
    private static final float[] i = new float[]{0.0f, 1.0f, 0.0f, 0.6f};
    private static final float[] j = new float[]{1.0f, 0.0f, 0.0f, 0.6f};
    private static final float[] k = new float[]{1.0f, 0.5f, 0.0f, 0.6f};
    private static final float[] l = new float[]{1.0f, 1.0f, 0.0f, 0.6f};
    private static final float[] m = new float[]{0.0f, 0.0f, 0.0f, 0.6f};
    private static final float[] n = new float[]{1.0f, 1.0f, 1.0f, 0.6f};
    private static final int[] o = new int[]{36, 10, 35};
    protected static final int a = 8;
    private static final Logger p = Logger.getLogger(cVc.class);
    protected exk_2 b;
    protected final ahf_0 c = new ahf_0();
    protected aff_1 d;
    private aff_1 q;
    protected final abv_0 e;
    protected final abv_0 f;
    protected final LinkedList<cvf_0> g = new LinkedList();
    protected cvf_0 h;
    private afy_0 r;
    private final fdt_1 s = new cVd(this);

    protected cVc() {
        this.e = new abv_0("seedVeryBadRange", i);
        this.f = new abv_0("seedSelectedCells", n);
    }

    public void a(exk_2 exk_22) {
        this.b = exk_22;
    }

    public exk_2 a() {
        return this.b;
    }

    protected Sm c() {
        return this.b;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void d() {
        String string = (String)this.b.b("iconUrl");
        if (string != null) {
            this.a(string);
        } else {
            fzd_0.a().d();
            fyt_0.a().c();
        }
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 19751: {
                dhL dhL2 = (dhL)adt_12;
                aff_1 aff_12 = cVc.b(dhL2.r(), dhL2.s());
                this.a(aff_12, false);
                return false;
            }
            case 18907: {
                dhL dhL3 = (dhL)adt_12;
                aff_1 aff_13 = cVc.b(dhL3.r(), dhL3.s());
                if (!cVc.a(aff_13, this.d) && dhL.t()) {
                    this.g(aff_13);
                    this.d = aff_13;
                }
                return false;
            }
            case 17976: {
                dhL dhL4 = (dhL)adt_12;
                if (dhL4.o()) {
                    this.d = null;
                }
                return false;
            }
            case 16119: {
                dhL dhL5 = (dhL)adt_12;
                if (dhL5.o()) {
                    aff_1 aff_14 = cVc.b(dhL5.r(), dhL5.s());
                    this.g(aff_14);
                } else {
                    this.a(dhL5);
                }
                return false;
            }
        }
        return true;
    }

    private static boolean a(aff_1 aff_12, aff_1 aff_13) {
        if (aff_12 == null && aff_13 == null) {
            return true;
        }
        if (aff_12 == null) {
            return false;
        }
        return aff_12.equals(aff_13);
    }

    private void a(dhL dhL2) {
        boolean bl;
        bpc_2 bpc_22 = azu_0.j().k().eE();
        boolean bl2 = bl = bpc_22 != null && bpc_22.ac_() == 2;
        if ((!this.g.isEmpty() || bl) && dhL2.p()) {
            cvf_0 cvf_02 = this.g.removeLast();
            aff_1 aff_12 = cvf_02.d();
            if (!this.b(aff_12)) {
                this.f.c(aff_12.d(), aff_12.e(), aff_12.f());
            }
        } else {
            if (bl) {
                bpc_22.d();
            }
            azu_0.j().b(this);
        }
    }

    protected void a(aff_1 aff_12, boolean bl) {
        if (aff_12 == null) {
            this.e.a();
            this.d = null;
            this.m();
            return;
        }
        if (aff_12.equals(this.d) && !bl) {
            return;
        }
        this.e.a();
        this.d = aff_12;
        fzd_0.a().a(this.l());
        int n = this.e(aff_12);
        this.a(n);
        this.a(aff_12);
        this.c.b(aff_12.d(), aff_12.e(), aff_12.f());
        if (n < 0) {
            this.m();
            return;
        }
        this.e();
    }

    protected abstract void a(aff_1 var1);

    protected abstract void e();

    protected void a(int n) {
        if (n < 0) {
            this.e.a(m);
        } else if (this.f()) {
            this.e.a(i);
        } else if (n <= 25) {
            this.e.a(j);
        } else if (n <= 50) {
            this.e.a(k);
        } else if (n <= 75) {
            this.e.a(l);
        } else if (n <= 100) {
            this.e.a(i);
        } else {
            this.e.a(m);
            p.error((Object)("Validit\u00e9 inattendue pour planter sur la case [" + this.d + "] : " + n));
        }
    }

    public boolean f() {
        return this.b.T().b(ext_1.f);
    }

    private boolean f(aff_1 aff_12) {
        int n = Math.abs(aff_12.d() - azu_0.j().k().G()) + Math.abs(aff_12.e() - azu_0.j().k().H());
        return n >= 8;
    }

    private boolean g(aff_1 aff_12) {
        if (aff_12 == null || this.e(aff_12) == -1) {
            return false;
        }
        cvf_0 cvf_02 = new cvf_0(aff_12);
        int n = this.g.size();
        if (n > 98 || !this.b(n)) {
            return false;
        }
        if (this.b(aff_12)) {
            return false;
        }
        if (this.h == null) {
            this.a(cvf_02);
        } else {
            this.g.add(cvf_02);
            this.f.a(aff_12.d(), aff_12.e(), aff_12.f());
        }
        return true;
    }

    cvf_0 g() {
        this.h = null;
        if (this.g.isEmpty()) {
            return null;
        }
        return this.g.poll();
    }

    protected boolean b(aff_1 aff_12) {
        if (this.h != null && this.h.d().equals(aff_12)) {
            return true;
        }
        for (cvf_0 cvf_02 : this.g) {
            if (!cvf_02.d().equals(aff_12)) continue;
            return true;
        }
        return false;
    }

    protected void c(aff_1 aff_12) {
        cvf_0[] cvf_0Array = this.g.toArray(new cvf_0[this.g.size()]);
        for (int k = cvf_0Array.length - 1; k >= 0; --k) {
            cvf_0 cvf_02 = cvf_0Array[k];
            if (!cvf_02.d().equals(aff_12)) continue;
            this.g.remove(cvf_02);
        }
    }

    private int h(aff_1 aff_12) {
        int n = 0;
        for (cvf_0 cvf_02 : this.g) {
            if (!cvf_02.d().equals(aff_12)) continue;
            ++n;
        }
        return n;
    }

    public abstract void h();

    public void i() {
        this.j();
        ado_1.a().a(this, 5000L, 1);
    }

    public void j() {
        ado_1.a().b(this);
    }

    @Override
    public void run() {
        p.warn((Object)"[Plantation] timeOut execut\u00e9");
        this.k();
    }

    @Override
    public void b(bNK bNK2) {
        if (this.c(bNK2)) {
            this.a(this.d, true);
        }
    }

    @Override
    public void a(bNK bNK2) {
        if (this.c(bNK2)) {
            this.a(this.d, true);
        }
    }

    private boolean c(bNK bNK2) {
        return this.c != null && this.c.G() == bNK2.G() && this.c.H() == bNK2.H();
    }

    public void k() {
        while (!this.a(this.g())) {
        }
    }

    boolean a(cvf_0 cvf_02) {
        this.h = cvf_02;
        if (cvf_02 == null) {
            return true;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        biI biI2 = bmr_12.bv();
        int n = cvf_02.a();
        int n2 = cvf_02.b();
        short s2 = cvf_02.c();
        aff_1 aff_12 = cvf_02.d();
        float f2 = (float)s2 - biI2.L();
        if (Math.abs(f2) > (float)Math.abs(bmr_12.fV())) {
            p.error((Object)("Plantation impossible sur la cellule " + aff_12 + " : hauteur maximale de saut de " + bmr_12.fV()));
            bQG.a();
            bQG.a(5, new Object[0]);
            this.d(aff_12);
            this.h = null;
            return false;
        }
        if (this.r != null) {
            biI2.c(this.r);
        }
        this.r = new cVe(this, n, n2);
        biI2.b(this.r);
        int n3 = aff_12.c(biI2.G(), biI2.H());
        if (n3 >= 2 || n3 == 0) {
            List<aff_1> list = yz_0.a(aff_12, false);
            if (!biI2.a(false, true, list)) {
                biI2.c(this.r);
                bQG.a();
                bQG.a(2, new Object[0]);
                this.h = null;
                return false;
            }
        } else {
            biI2.c(this.r);
            this.a(n, n2);
        }
        if (this.h(aff_12) <= 1) {
            this.d(aff_12);
        }
        if (!this.b(1)) {
            azu_0.j().b(this);
        }
        return true;
    }

    protected abstract void a(int var1, int var2);

    protected boolean b(int n) {
        exk_2 exk_22 = euu_2.g(azu_0.j().k().U_(), this.b.a());
        if (exk_22 == null) {
            return false;
        }
        eyw_1 eyw_12 = exk_22.T().p();
        if (!eyw_12.l()) {
            return true;
        }
        return exk_22.e() > n;
    }

    protected void d(aff_1 aff_12) {
        this.f.c(aff_12.d(), aff_12.e(), aff_12.f());
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        this.h = null;
        bNT.f().b(this);
        bNT.f().b(this);
        aNF aNF2 = (aNF)ans_0.D().c();
        fyt_0.a().a(frb_0.l, true);
        aNF2.n(true);
        aNF2.o(true);
        aff_1 aff_12 = cVc.b(aNF2.c(), aNF2.d());
        this.a(aff_12, false);
        fta_0.getInstance().addEventListener(frd_0.C, this.s, true);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            bNT.f().c(this);
            bNT.f().c(this);
            fzd_0.a().d();
            fyt_0.a().c();
            this.g.clear();
            this.e.a();
            this.f.a();
            this.d = null;
            this.m();
            fta_0.getInstance().removeEventListener(frd_0.C, this.s, true);
        }
    }

    private static aff_1 b(int n, int n2) {
        aff_1 aff_12 = agz.a(ans_0.D().c(), n, n2, false);
        if (aff_12 == null) {
            return null;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        yz_0.a(bmr_12.W(), bmr_12.X(), bmr_12.fV());
        short s2 = yz_0.a(aff_12.d(), aff_12.e(), aff_12.f());
        if (s2 == Short.MIN_VALUE || Math.abs(aff_12.f() - s2) > 1) {
            return null;
        }
        aff_12.a(s2);
        return aff_12;
    }

    private void a(String string) {
        if (string != null) {
            fzd_0.a().a(string, this.l(), 30, 0, frs_0.d);
        }
    }

    protected abstract String l();

    protected abstract int e(aff_1 var1);

    public void c(int n) {
        if (ArrayUtils.contains((int[])o, (int)n)) {
            azu_0.j().b(this);
            return;
        }
        this.k();
    }

    protected abstract void m();
}


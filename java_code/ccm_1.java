/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from ccm
 */
public class ccm_1
extends agx_0<cch_1, afe_0> {
    private static final ccm_1 g = new ccm_1();

    public static ccm_1 g() {
        return g;
    }

    protected ccm_1() {
    }

    private static int e(int n, int n2) {
        assert (n >= -2 && n <= 2);
        assert (n2 >= -2 && n2 <= 2);
        if (n > 0) {
            if (n2 > 0) {
                return 8;
            }
            if (n2 == 0) {
                return 5;
            }
            return 2;
        }
        if (n == 0) {
            if (n2 > 0) {
                return 7;
            }
            if (n2 == 0) {
                return 4;
            }
            return 1;
        }
        if (n2 > 0) {
            return 6;
        }
        if (n2 == 0) {
            return 3;
        }
        return 0;
    }

    protected cch_1 b(int n, int n2, int n3, int n4, boolean bl) {
        cch_1 cch_12 = new cch_1(n, n2, n3, n4, bl);
        cch_12.g();
        return cch_12;
    }

    protected biI h() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return null;
        }
        return bmr_12.bv();
    }

    public boolean a(bvw_2 bvw_22) {
        assert (this.c != null);
        boolean bl = false;
        for (abo_2<Short, Short> abo_22 : bvw_22.w()) {
            cch_1 cch_12 = (cch_1)this.b(abo_22.a().shortValue(), abo_22.b().shortValue());
            if (cch_12 == null) continue;
            cch_12.c(bvw_22);
            bl |= true;
        }
        return bl;
    }

    public void a(bNK bNK2) {
        assert (this.c != null);
        cch_1[] cch_1Array = (cch_1[])((cch_1)this.c).f();
        for (int k = 0; k < cch_1Array.length; ++k) {
            cch_1 cch_12 = cch_1Array[k];
            if (cch_12 == null || !cch_12.a(bNK2.G(), bNK2.H())) continue;
            cch_12.a(bNK2);
            return;
        }
        b.error((Object)("Impossible d'ajouter une resource hors du champ de vision : resource=[" + bNK2.G() + ":" + bNK2.H() + "] lpmOrigin=[" + this.j() + ":" + this.k() + "]"));
    }

    public void a(bFZ bFZ2) {
        cch_1[] cch_1Array = (cch_1[])((cch_1)this.c).f();
        for (int k = 0; k < cch_1Array.length; ++k) {
            cch_1 cch_12 = cch_1Array[k];
            if (cch_12 == null || !cch_12.a(bFZ2.G(), bFZ2.H())) continue;
            cch_12.b(bFZ2);
            return;
        }
        b.error((Object)("Impossible d'ajouter un \u00e9l\u00e9ment interactif hors du champ de vision (cache disabled): ID=" + bFZ2.a_()));
    }

    public pj_0 a(long l) {
        cch_1[] cch_1Array = (cch_1[])((cch_1)this.c).f();
        for (int k = 0; k < cch_1Array.length; ++k) {
            pj_0 pj_02;
            cch_1 cch_12 = cch_1Array[k];
            if (cch_12 == null || (pj_02 = cch_12.d(l)) == null) continue;
            return pj_02;
        }
        return null;
    }

    public ArrayList<pj_0> i() {
        ArrayList<pj_0> arrayList = new ArrayList<pj_0>();
        cch_1[] cch_1Array = (cch_1[])((cch_1)this.c).f();
        for (int k = 0; k < cch_1Array.length; ++k) {
            cch_1 cch_12 = cch_1Array[k];
            if (cch_12 == null) continue;
            cch_12.b(new ccn_1(this, arrayList));
        }
        return arrayList;
    }

    public void a(afe_0 afe_02, int n, int n2, short s2) {
        biI biI2 = this.h();
        if (biI2 != null && afe_02 == biI2) {
            cch_1[] cch_1Array = (cch_1[])((cch_1)this.c).f();
            for (int k = 0; k < cch_1Array.length; ++k) {
                cch_1 cch_12 = cch_1Array[k];
                if (cch_12 == null) continue;
                cch_12.a(n, n2, s2);
            }
            cco_2.a().b(n, n2);
        }
    }

    @Override
    public void c() {
        super.c();
        this.m();
        this.l();
    }

    @Override
    public void a(int n, int n2, boolean bl) {
        this.m();
        super.a(n, n2);
    }

    private void m() {
        if (this.c != null) {
            cch_1[] cch_1Array = (cch_1[])((cch_1)this.c).f();
            for (int k = 0; k < cch_1Array.length; ++k) {
                cch_1 cch_12 = cch_1Array[k];
                if (cch_12 == null) continue;
                cch_12.h();
            }
        }
    }

    public void b(bvw_2 bvw_22) {
        cch_1[] cch_1Array = (cch_1[])((cch_1)this.c).f();
        for (int k = 0; k < cch_1Array.length; ++k) {
            cch_1 cch_12 = cch_1Array[k];
            if (cch_12 == null || !cch_12.b(bvw_22)) continue;
            cch_12.a(bvw_22);
        }
    }

    public void b(bNK bNK2) {
        cch_1[] cch_1Array = (cch_1[])((cch_1)this.c).f();
        for (int k = 0; k < cch_1Array.length; ++k) {
            cch_1 cch_12 = cch_1Array[k];
            if (cch_12 == null || !cch_12.c(bNK2)) continue;
            cch_12.b(bNK2);
        }
    }

    public void a(pj_0 pj_02) {
        cch_1[] cch_1Array = (cch_1[])((cch_1)this.c).f();
        for (int k = 0; k < cch_1Array.length; ++k) {
            cch_1 cch_12 = cch_1Array[k];
            if (cch_12 == null || !cch_12.c(pj_02.a_())) continue;
            cch_12.a(pj_02);
            return;
        }
    }

    public void b(long l) {
        cch_1[] cch_1Array = (cch_1[])((cch_1)this.c).f();
        for (int k = 0; k < cch_1Array.length; ++k) {
            cch_1 cch_12 = cch_1Array[k];
            if (cch_12 == null || !cch_12.c(l)) continue;
            cch_12.b(l);
            return;
        }
    }

    public void d(int n, int n2) {
        int n3;
        int n4;
        cch_1 cch_12 = (cch_1)((cch_1)this.c).a(4);
        int n5 = XY.a(n);
        int n6 = XY.b(n2);
        int n7 = n5 - cch_12.a();
        int n8 = n6 - cch_12.b();
        int n9 = Math.abs(n7);
        int n10 = n4 = n9 > (n3 = Math.abs(n8)) ? n9 : n3;
        if (n4 != 0) {
            if (n4 == 1) {
                ((cch_1)this.c).b(ccm_1.e(n7, n8));
            } else if (n4 == 2) {
                ((cch_1)this.c).b(ccm_1.e(n7, n8));
                n7 = n5 - ((cch_1)((cch_1)this.c).a(4)).a();
                n8 = n6 - ((cch_1)((cch_1)this.c).a(4)).b();
                ((cch_1)this.c).b(ccm_1.e(n7, n8));
            } else {
                this.a(n, n2, false);
            }
        }
        cch_1 cch_13 = (cch_1)((cch_1)this.c).a(4);
        this.a(this.h(), cch_12, cch_13);
    }

    public int j() {
        assert (this.c != null);
        return ((cch_1)((cch_1)this.c).a(4)).a() * 18;
    }

    public int k() {
        assert (this.c != null);
        return ((cch_1)((cch_1)this.c).a(4)).b() * 18;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void l() {
        List list = this.e;
        synchronized (list) {
            this.e.clear();
        }
    }

    @Override
    protected /* synthetic */ ahh_0 e() {
        return this.h();
    }

    @Override
    public /* synthetic */ void cellPositionChanged(ahh_0 ahh_02, int n, int n2, short s2) {
        this.a((afe_0)ahh_02, n, n2, s2);
    }

    @Override
    protected /* synthetic */ XW a(int n, int n2, int n3, int n4, boolean bl) {
        return this.b(n, n2, n3, n4, bl);
    }
}


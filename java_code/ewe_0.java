/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from ewe
 */
public final class ewe_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private static final String b = "ignoreObstacles";
    private static final String f = "inlineOnly";
    private static final String g = "inPercentMPCaster";
    private boolean h;
    private boolean i;
    private boolean j;
    private float k = 1.0f;
    private long l;

    public ewe_0(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        this.h = false;
        this.l = -1L;
        switch (by) {
            case 1: {
                this.h = ((apd_2)arrayList.get(0)).b().toLowerCase().contains(b.toLowerCase());
                this.i = ((apd_2)arrayList.get(0)).b().toLowerCase().contains(f.toLowerCase());
                this.j = ((apd_2)arrayList.get(0)).b().toLowerCase().contains(g.toLowerCase());
                break;
            }
            case 2: {
                this.l = ((aoq_1)arrayList.get(0)).a(null, null, null, null);
                break;
            }
            case 3: {
                this.h = ((apd_2)arrayList.get(0)).b().toLowerCase().contains(b.toLowerCase());
                this.i = ((apd_2)arrayList.get(0)).b().toLowerCase().contains(f.toLowerCase());
                this.j = ((apd_2)arrayList.get(0)).b().toLowerCase().contains(g.toLowerCase());
                if (this.j) {
                    this.k = (float)((aoq_1)arrayList.get(1)).a(null, null, null, null) / 100.0f;
                    break;
                }
                this.l = ((aoq_1)arrayList.get(1)).a(null, null, null, null);
            }
        }
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        aff_1 aff_12;
        elm_0 elm_02;
        if (object2 == null) {
            return 0;
        }
        epq_2 epq_22 = erQ.a(object, object2, object4, object3);
        if (this.j && epq_22 != null && epq_22.a(eps_0.d)) {
            this.l = Math.round((float)epq_22.a_(eps_0.d).a() * this.k);
        }
        if ((elm_02 = erQ.b(object4)) == null) {
            return -1;
        }
        if (object2 instanceof aff_1) {
            aff_12 = (aff_1)object2;
        } else if (object2 instanceof eqq_1) {
            aff_12 = ((eqq_1)object2).P_();
        } else {
            return -2;
        }
        tg_0 tg_02 = elm_02.g();
        if (this.h) {
            tg_02.a(true);
        }
        uq_0 uq_02 = uq_0.a();
        int n = -1;
        try {
            boolean bl;
            boolean bl2 = epq_22.P_().d() == aff_12.d();
            boolean bl3 = bl = epq_22.P_().e() == aff_12.e();
            if (this.i && !bl2 && !bl) {
                int n2 = -1;
                return n2;
            }
            if (this.i) {
                n = this.a(tg_02, epq_22.P_(), aff_12, bl2, bl);
            } else {
                uq_02.a((int)epq_22.W(), epq_22.X(), epq_22.fV());
                uq_02.a(tg_02);
                uq_02.a(epq_22.P_());
                uq_02.b(aff_12);
                ut_0 ut_02 = new ut_0();
                ut_02.c = (int)this.l;
                ut_02.b = 256;
                uq_02.a(ut_02);
                n = uq_02.g();
            }
        }
        catch (Exception exception) {
            e.error((Object)"Exception levee", (Throwable)exception);
        }
        finally {
            uq_02.release();
            tg_02.a(false);
        }
        if (n == -1) {
            return -1;
        }
        return 0;
    }

    private int a(tg_0 tg_02, aff_1 aff_12, aff_1 aff_13, boolean bl, boolean bl2) {
        int n;
        if (!bl && !bl2) {
            return -1;
        }
        int n2 = 0;
        int n3 = bl ? Math.max(aff_12.e(), aff_13.e()) : Math.max(aff_12.d(), aff_13.d());
        int n4 = n = bl ? Math.min(aff_12.e(), aff_13.e()) : Math.min(aff_12.d(), aff_13.d());
        while (n < n3) {
            short s2;
            int n5;
            int n6 = bl ? aff_12.d() : n;
            if (tg_02.a(n6, n5 = bl2 ? aff_12.e() : n, s2 = tg_02.i(n6, n5))) {
                return -1;
            }
            ++n2;
            ++n;
        }
        if (this.l > 0L && (long)n2 <= this.l) {
            return n2;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.eC;
    }

    static {
        a.add(esa_0.i);
        a.add(esa_0.j);
        a.add(esa_0.l);
        a.add(new aov_1[]{aov_1.a, aov_1.b});
    }
}


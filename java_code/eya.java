/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eya
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private static final int[][] b;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public eya(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    private boolean a(tg_0 tg_02, int n, int n2) {
        if (tg_02.k(n, n2)) {
            return true;
        }
        ti_0 ti_02 = tg_02.g(n, n2);
        if (ti_02 == null || !ti_02.ab()) {
            return false;
        }
        if (!(ti_02 instanceof eqq_1)) {
            e.error((Object)("Unknown obstacle type : " + ti_02));
            return true;
        }
        return !((eqq_1)((Object)ti_02)).a(eqr_1.a);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        aff_1 aff_12;
        if (object2 == null) {
            return 0;
        }
        elm_0 elm_02 = erQ.b(object4);
        if (elm_02 == null) {
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
        int n = 0;
        boolean bl = false;
        aff_1 aff_13 = new aff_1();
        aff_1 aff_14 = new aff_1();
        uq_0 uq_02 = uq_0.a();
        uq_02.a(6, (byte)0, (short)4);
        uq_02.a(tg_02);
        tg_02.a(true);
        try {
            for (int k = 0; k <= b.length; ++k) {
                boolean bl2;
                int n2;
                int[] nArray = b[k % b.length];
                int n3 = aff_12.d() + nArray[0];
                boolean bl3 = tg_02.c(n3, n2 = aff_12.e() + nArray[1]);
                short s2 = bl3 ? tg_02.i(n3, n2) : (short)0;
                aff_14.c(n3, n2, s2);
                boolean bl4 = bl2 = bl3 && !this.a(tg_02, n3, n2);
                if (k != 0) {
                    if (bl2 != bl) {
                        ++n;
                    } else if (bl2 && !uq_02.a(aff_13, aff_14)) {
                        ++n;
                    }
                }
                aff_13.g(aff_14);
                bl = bl2;
            }
        }
        finally {
            tg_02.a(false);
            uq_02.release();
        }
        if (n == 0 || n == 2) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.cs;
    }

    static {
        a.add(aov_1.j);
        b = new int[][]{{-1, -1}, {0, -1}, {1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}};
    }
}


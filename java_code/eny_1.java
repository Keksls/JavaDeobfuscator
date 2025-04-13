/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eNY
 */
public final class eny_1 {
    private static final int a = 8;
    private static final float b = 2.3333333f;
    private static final int c = 0;
    private static final int d = -1;
    private static final int e = -2;
    private emh_1 f;

    public void a(@NotNull emh_1 emh_12) {
        this.f = emh_12;
    }

    public eoc_2 a(Collection<? extends epq_2> collection, aff_1 aff_12) {
        List<? extends epq_2> list = this.b(collection, aff_12);
        if (list.isEmpty()) {
            eoc_2 eoc_22 = new eoc_2();
            eoc_22.a(Collections.emptyList());
            return eoc_22;
        }
        int n = eny_1.a(list);
        int n2 = this.f.fS();
        return this.a(list, n, n2, aff_12);
    }

    private eoc_2 a(List<? extends epq_2> list, int n, int n2, aff_1 aff_12) {
        int n3 = this.a(n, n2, list, aff_12);
        int n4 = Hw.d((float)n3 / 2.0f);
        int n5 = n3 - n4;
        eoc_2 eoc_22 = new eoc_2();
        eoc_22.a(list);
        eoc_22.a(n5);
        eoc_22.b(n4);
        return eoc_22;
    }

    private float a() {
        short s2 = this.f.dr();
        return eny_1.a(s2);
    }

    private static float a(short s2) {
        return Math.min(0.5f + (float)s2 / 200.0f, 1.0f);
    }

    private int a(int n, int n2, List<? extends epq_2> list, aff_1 aff_12) {
        int n3;
        int n4 = Math.max(0, n2);
        float f2 = n4 == (n3 = Math.max(0, n)) ? 2.3333333f * (float)(n3 - n4) : 2.3333333f * (float)(n3 - n4) / (float)(n4 + n3);
        float f3 = Hw.b(f2, -1.0f, 1.0f);
        float f4 = (f3 + 1.0f) * 8.0f / 2.0f * this.a();
        float f5 = f4 + (float)this.a(list, aff_12);
        return Hw.c(Hw.b(0.0f, f5));
    }

    private int a(List<? extends epq_2> list, aff_1 aff_12) {
        un_0 un_02 = eny_1.b(list, aff_12);
        return eny_1.a(un_02);
    }

    private static int a(un_0 un_02) {
        switch (un_02) {
            case d: {
                return 0;
            }
            case b: 
            case c: {
                return -1;
            }
            case a: {
                return -2;
            }
        }
        return 0;
    }

    private static un_0 b(List<? extends epq_2> list, aff_1 aff_12) {
        un_0 un_02 = un_0.a;
        for (epq_2 epq_22 : list) {
            un_0 un_03;
            uo_0 uo_02 = epq_22.k();
            if (uo_02 == null || (un_03 = uo_02.a(aff_12.d(), aff_12.e(), aff_12.f())) == null) continue;
            if ((un_03 == un_0.c || un_03 == un_0.b) && un_02 != un_0.d) {
                un_02 = un_03;
            }
            if (un_03 != un_0.d) continue;
            un_02 = un_03;
        }
        return un_02;
    }

    private static int a(List<? extends epq_2> list) {
        int n = 0;
        int n2 = list.size();
        for (int k = 0; k < n2; ++k) {
            epq_2 epq_22 = list.get(k);
            n += epq_22.fT() / (k + 1);
        }
        return n;
    }

    private List<? extends epq_2> b(Collection<? extends epq_2> collection, aff_1 aff_12) {
        List<? extends epq_2> list = this.c(collection, aff_12);
        eny_1.b(list);
        return list;
    }

    private List<? extends epq_2> c(Collection<? extends epq_2> collection, aff_1 aff_12) {
        ArrayList<? extends epq_2> arrayList = new ArrayList<epq_2>(collection);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            epq_2 epq_22 = (epq_2)iterator.next();
            if (!eoe_2.a(epq_22, this.f, aff_12) && epq_22.a(eps_0.f) && !epq_22.fW()) continue;
            iterator.remove();
        }
        return arrayList;
    }

    private static void b(List<? extends epq_2> list) {
        list.sort(new enz_1());
    }
}


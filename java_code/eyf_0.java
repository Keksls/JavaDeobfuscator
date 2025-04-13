/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eyF
 */
public class eyf_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public eyf_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    protected ArrayList<aov_1[]> f() {
        return a;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        eqq_1 eqq_12 = erQ.a("caster", object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1L;
        }
        aff_1 aff_12 = erQ.d(true, object, object2, object4, object3);
        if (aff_12 == null) {
            return -1L;
        }
        elm_0<?> elm_02 = erQ.a(object, object4);
        if (elm_02 == null) {
            return -1L;
        }
        if (!eyf_0.b(eqq_12, aff_12, elm_02)) {
            return -1L;
        }
        return eyf_0.a(eqq_12, aff_12, elm_02);
    }

    private static int a(eqq_1 eqq_12, aff_1 aff_12, elm_0<?> elm_02) {
        aej_2[] aej_2Array = aej_2.d();
        int n = 0;
        for (int k = 0; k < aej_2Array.length; ++k) {
            aej_2 aej_22 = aej_2Array[k];
            n += eyf_0.a(aff_12, eqq_12, elm_02, aej_22);
        }
        return n;
    }

    public static int a(aff_1 aff_12, eqq_1 eqq_12, elm_0<?> elm_02, aej_2 aej_22) {
        aff_1 aff_13 = new aff_1(aff_12);
        aff_13.a(aej_22);
        byte by = eqq_12.Y();
        HashSet hashSet = new HashSet();
        while (elm_02.d(aff_13) != null) {
            Object t = elm_02.d(aff_13);
            if (((epq_2)t).Y() == by) {
                if (!hashSet.isEmpty()) {
                    return hashSet.size();
                }
                hashSet.clear();
            } else {
                hashSet.add(t);
            }
            aff_13.a(aej_22);
        }
        return 0;
    }

    private static boolean b(eqq_1 eqq_12, aff_1 aff_12, elm_0<?> elm_02) {
        Collection collection = elm_02.i(eqq_12.Y());
        for (epq_2 epq_22 : collection) {
            aff_1 aff_13 = epq_22.P_();
            if (!aff_12.e(aff_13.d(), aff_13.e())) continue;
            return true;
        }
        return false;
    }

    @Override
    public Enum c() {
        return eyO.fU;
    }

    @Override
    public boolean a() {
        return true;
    }

    protected /* synthetic */ List i() {
        return this.f();
    }

    static {
        a.add(esa_0.i);
    }
}


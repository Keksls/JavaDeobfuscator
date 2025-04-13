/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from euc
 */
public final class euc_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private static final int b = 888;
    private String c;

    public euc_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.c = ((apd_2)arrayList.get(0)).b();
    }

    protected ArrayList<aov_1[]> f() {
        return a;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        eqq_1 eqq_12 = erQ.a(this.c, object, object2, object4, object3);
        if (eqq_12 == null) {
            return 0L;
        }
        elm_0<?> elm_02 = erQ.a(object, object4);
        if (elm_02 == null) {
            return 0L;
        }
        int n = 0;
        Collection collection = elm_02.am();
        for (epq_2 epq_22 : collection) {
            eJL eJL2 = epq_22.dR();
            for (sd_0 sd_02 : eJL2) {
                fie_0 fie_02;
                eja_0 eja_02;
                Su su;
                if (!(sd_02 instanceof eja_0) || (su = (eja_02 = (eja_0)sd_02).h()) == null || su.a_() != eqq_12.a_() || (fie_02 = eja_02.aF()) == null || !fie_02.F() && fie_02.p() != 888) continue;
                ++n;
            }
        }
        return n;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public Enum c() {
        return eyO.fB;
    }

    protected /* synthetic */ List i() {
        return this.f();
    }

    static {
        a.add(esa_0.j);
    }
}


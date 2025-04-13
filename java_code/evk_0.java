/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from evk
 */
public final class evk_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public evk_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        long l;
        if (!(object3 instanceof exk_2)) {
            return -1;
        }
        if (!(object instanceof epq_2)) {
            return -1;
        }
        eyz_0 eyz_02 = object4 instanceof eyz_0 ? (eyz_0)object4 : null;
        epq_2 epq_22 = (epq_2)object;
        exk_2 exk_22 = (exk_2)object3;
        int n = exk_22.aT_();
        boolean bl = evk_0.a(epq_22, n, l = exk_22.a(), eyz_02);
        if (bl) {
            return 0;
        }
        return -1;
    }

    private static boolean a(epq_2 epq_22, int n, long l, @Nullable eyz_0 eyz_02) {
        return evk_0.b(epq_22, n, l, eyz_02) || evk_0.a(epq_22, n, l);
    }

    private static boolean b(epq_2 epq_22, int n, long l2, @Nullable eyz_0 eyz_02) {
        eyz_0 eyz_03 = eyz_02 != null ? eyz_02 : epq_22.cG();
        eyt_0 eyt_02 = epq_22.dC();
        if (eyz_03 == null || eyt_02 == null) {
            return false;
        }
        return eyz_03.a().values().stream().map(l -> eyt_02.b((Long)l).orElse(null)).filter(Objects::nonNull).filter(exk_22 -> exk_22.a() != l2).anyMatch(exk_22 -> exk_22.aT_() == n);
    }

    private static boolean a(epq_2 epq_22, int n, long l) {
        exq_2 exq_22 = epq_22.R_();
        if (exq_22 == null) {
            return false;
        }
        ArrayList arrayList = exq_22.d(n);
        return arrayList.stream().anyMatch(exk_22 -> exk_22.a() != l);
    }

    @Override
    public Enum c() {
        return eyO.fb;
    }

    static {
        a.add(esa_0.i);
    }
}


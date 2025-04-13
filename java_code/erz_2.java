/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.ImmutableList
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from erz
 */
public class erz_2 {
    public static boolean a(ery_2 ery_22, eoW eoW2) {
        enp_2 enp_22 = ery_22.d();
        ArrayList<String> arrayList = enp_22.f(ens_2.Q);
        for (String string : arrayList) {
            if (!string.equals(eoW2.b())) continue;
            return true;
        }
        return false;
    }

    public static ImmutableList<xz_0> a(ery_2 ery_22) {
        return erz_2.a(ery_22, (Predicate<xz_0>)Predicates.alwaysTrue());
    }

    public static ImmutableList<xz_0> a(ery_2 ery_22, @NotNull Predicate<xz_0> predicate) {
        Preconditions.checkNotNull(predicate);
        enp_2 enp_22 = ery_22.d();
        boolean bl = !enp_22.d(ens_2.H);
        ArrayList<xz_0> arrayList = new ArrayList<xz_0>();
        if (bl) {
            for (xz_0 xz_02 : xz_0.values()) {
                if (!predicate.apply((Object)xz_02)) continue;
                arrayList.add(xz_02);
            }
            return ImmutableList.copyOf(arrayList);
        }
        List<Long> list = enp_22.h(ens_2.I);
        if (!list.isEmpty()) {
            for (Long l : list) {
                xz_0 xz_03 = xz_0.a(l.intValue());
                if (!predicate.apply((Object)xz_03)) continue;
                arrayList.add(xz_03);
            }
            return ImmutableList.copyOf(arrayList);
        }
        List<Long> list2 = enp_22.h(ens_2.J);
        for (xz_0 xz_04 : xz_0.values()) {
            if (list2.contains(xz_04.a()) || !predicate.apply((Object)xz_04)) continue;
            arrayList.add(xz_04);
        }
        return ImmutableList.copyOf(arrayList);
    }
}


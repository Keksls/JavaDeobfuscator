/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Sets
 */
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;

/*
 * Renamed from IG
 */
class ig_1
implements Predicate<lk_2> {
    final /* synthetic */ kl_1[] a;

    ig_1(kl_1[] kl_1Array) {
        this.a = kl_1Array;
    }

    public boolean a(lk_2 lk_22) {
        return Iterables.contains((Iterable)Sets.newHashSet((Object[])this.a), (Object)((Object)lk_22.a().a()));
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((lk_2)object);
    }
}


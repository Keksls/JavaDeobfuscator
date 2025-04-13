/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
import com.google.common.base.Predicate;
import javax.annotation.Nullable;

/*
 * Renamed from bif
 */
public class bif_2
implements Predicate<Integer> {
    public boolean a(@Nullable Integer n) {
        return n != null && azu_0.j().k().eK().e(n);
    }

    public /* synthetic */ boolean apply(@Nullable Object object) {
        return this.a((Integer)object);
    }
}


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
 * Renamed from bie
 */
public class bie_2
implements Predicate<Integer> {
    public boolean a(@Nullable Integer n) {
        return n != null && azu_0.j().k().eK().m(n) && azu_0.j().k().eK().a((int)n, azu_0.j().k());
    }

    public /* synthetic */ boolean apply(@Nullable Object object) {
        return this.a((Integer)object);
    }
}


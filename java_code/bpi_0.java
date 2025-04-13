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
 * Renamed from bPi
 */
class bpi_0
implements Predicate<bph_0> {
    final /* synthetic */ efa_0 a;

    bpi_0(efa_0 efa_02) {
        this.a = efa_02;
    }

    public boolean a(@Nullable bph_0 bph_02) {
        return bph_02 != null && bph_02.q() == this.a.a();
    }

    public /* synthetic */ boolean apply(@Nullable Object object) {
        return this.a((bph_0)object);
    }
}


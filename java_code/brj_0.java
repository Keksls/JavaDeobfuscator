/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  javax.annotation.Nullable
 */
import com.google.common.base.Function;
import javax.annotation.Nullable;

/*
 * Renamed from bRJ
 */
class brj_0
implements Function<bNS, Integer> {
    brj_0() {
    }

    @Nullable
    public Integer a(bNS bNS2) {
        return bNS2.b();
    }

    @Nullable
    public /* synthetic */ Object apply(Object object) {
        return this.a((bNS)object);
    }
}


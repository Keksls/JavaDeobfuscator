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
 * Renamed from bRI
 */
class bri_0
implements Function<bNS, eAJ> {
    bri_0() {
    }

    @Nullable
    public eAJ a(@Nullable bNS bNS2) {
        return eAJ.a(bNS2.a().j());
    }

    @Nullable
    public /* synthetic */ Object apply(@Nullable Object object) {
        return this.a((bNS)object);
    }
}


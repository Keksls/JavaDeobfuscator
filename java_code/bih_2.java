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
 * Renamed from bih
 */
class bih_2
implements Function<biw_2, Integer> {
    bih_2() {
    }

    @Nullable
    public Integer a(@Nullable biw_2 biw_22) {
        return biw_22 == null ? 0 : biw_22.b();
    }

    @Nullable
    public /* synthetic */ Object apply(@Nullable Object object) {
        return this.a((biw_2)object);
    }
}


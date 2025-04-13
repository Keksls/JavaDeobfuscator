/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.function.Function;
import javax.annotation.Nullable;

/*
 * Renamed from bPo
 */
public class bpo_0
implements Function<bpl_0, Short> {
    @Nullable
    public Short a(@Nullable bpl_0 bpl_02) {
        if (bpl_02 == null || bpl_02.r() == null) {
            return (short)-1;
        }
        return ((bph_0)bpl_02.r()).F();
    }

    @Override
    @Nullable
    public /* synthetic */ Object apply(@Nullable Object object) {
        return this.a((bpl_0)object);
    }
}


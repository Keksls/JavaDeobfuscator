/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  javax.annotation.Nullable
 */
import com.google.common.base.Function;
import javax.annotation.Nullable;

public class bjC
implements Function<bjd_0, Integer> {
    protected static final bjC a = new bjC();

    protected bjC() {
    }

    @Nullable
    public Integer a(@Nullable bjd_0 bjd_02) {
        return bjd_02 == null ? 0 : bjd_02.a();
    }

    @Nullable
    public /* synthetic */ Object apply(@Nullable Object object) {
        return this.a((bjd_0)object);
    }
}


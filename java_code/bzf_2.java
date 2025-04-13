/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bzF
 */
public class bzf_2
implements bzc_1 {
    @NotNull
    private final String b;

    public bzf_2(@NotNull String string) {
        this.b = Cz.e(string);
    }

    @Override
    public boolean a(exk_2 exk_22) {
        return Cz.e(exk_22.N()).contains(this.b);
    }

    @Override
    public boolean a() {
        return !this.b.isEmpty();
    }

    @Override
    public bzd_1 b() {
        return bzd_1.a;
    }

    @NotNull
    public String d() {
        return this.b;
    }
}


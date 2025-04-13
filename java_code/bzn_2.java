/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bzn
 */
public enum bzn_2 {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4);

    private final int f;

    private bzn_2(int n2) {
        this.f = n2;
    }

    public int a() {
        return this.f;
    }

    @Nullable
    public static bzn_2 a(@NotNull String string) {
        for (bzn_2 bzn_22 : bzn_2.values()) {
            if (!bzn_22.name().equalsIgnoreCase(string)) continue;
            return bzn_22;
        }
        return null;
    }
}


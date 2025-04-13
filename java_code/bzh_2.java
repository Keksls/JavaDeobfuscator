/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Comparator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bzH
 */
public enum bzh_2 {
    a(Comparator.comparing(exk_2::N)),
    b(bzh_2.a.h.reversed()),
    c(Comparator.comparingInt(exk_22 -> exk_22.T().G())),
    d(bzh_2.c.h.reversed()),
    e(Comparator.comparingInt(exk_22 -> exk_22.T().F().o())),
    f(bzh_2.e.h.reversed());

    public static final bzh_2 g;
    private final Comparator<exk_2> h;

    private bzh_2(Comparator<exk_2> comparator) {
        this.h = comparator;
    }

    public Comparator<exk_2> a() {
        return this.h;
    }

    @Nullable
    public static bzh_2 a(@NotNull String string) {
        for (bzh_2 bzh_22 : bzh_2.values()) {
            if (!bzh_22.name().equalsIgnoreCase(string)) continue;
            return bzh_22;
        }
        return null;
    }

    static {
        g = d;
    }
}


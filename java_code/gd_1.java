/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from Gd
 */
public enum gd_1 {
    a(1),
    b(2),
    c(3),
    d(4);

    private final int e;

    private gd_1(int n2) {
        this.e = n2;
    }

    public int a() {
        return this.e;
    }

    public static Optional<gd_1> a(int n) {
        gd_1[] gd_1Array;
        for (gd_1 gd_12 : gd_1Array = gd_1.values()) {
            if (gd_12.e != n) continue;
            return Optional.of(gd_12);
        }
        return Optional.empty();
    }
}


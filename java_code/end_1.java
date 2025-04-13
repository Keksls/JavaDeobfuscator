/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from eNd
 */
public enum end_1 {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4),
    f(5),
    g(6),
    h(7);

    private final byte i;

    private end_1(byte by) {
        this.i = by;
    }

    public byte a() {
        return this.i;
    }

    public static Optional<end_1> a(byte by) {
        for (end_1 end_12 : end_1.values()) {
            if (by != end_12.i) continue;
            return Optional.of(end_12);
        }
        return Optional.empty();
    }
}


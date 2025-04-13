/*
 * Decompiled with CFR 0.152.
 */
import java.util.stream.Stream;

/*
 * Renamed from ezA
 */
public enum eza_2 {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4),
    f(5),
    g(6),
    h(7);

    private final int i;

    private eza_2(int n2) {
        this.i = n2;
    }

    public int a() {
        return this.i;
    }

    public static eza_2 a(int n) {
        return Stream.of(eza_2.values()).filter(eza_22 -> eza_22.i == n).findAny().orElse(a);
    }
}


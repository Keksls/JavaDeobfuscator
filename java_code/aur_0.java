/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from aUR
 */
public enum aur_0 {
    a(1, 153, 147),
    b(3, 157, 151),
    c(17, 156, 150),
    d(18, 153, 147),
    e(22, 158, 152),
    f(101, 153, 147),
    g(102, 158, 152);

    private final int h;
    private final int i;
    private final int j;

    private aur_0(int n2, int n3, int n4) {
        this.h = n2;
        this.i = n3;
        this.j = n4;
    }

    public int a() {
        return this.h;
    }

    public int b() {
        return this.i;
    }

    public int c() {
        return this.j;
    }

    public static Optional<aur_0> a(int n) {
        for (aur_0 aur_02 : aur_0.values()) {
            if (aur_02.h != n) continue;
            return Optional.of(aur_02);
        }
        return Optional.empty();
    }
}


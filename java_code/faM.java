/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public enum faM {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4),
    f(5),
    g(6),
    h(7);

    public static final faM i;
    private final int j;

    @NotNull
    public static faM a(int n) {
        for (faM faM2 : faM.values()) {
            if (faM2.j != n) continue;
            return faM2;
        }
        return i;
    }

    public int a() {
        return this.j;
    }

    private faM(int n2) {
        this.j = n2;
    }

    static {
        i = a;
    }
}


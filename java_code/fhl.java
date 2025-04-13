/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public enum fhl {
    a(50L, "D"),
    b(300L, "D"),
    c(700L, "C"),
    d(1300L, "B"),
    e(Long.MAX_VALUE, "A");

    private final long f;
    private final String g;

    private fhl(long l, String string2) {
        this.f = l;
        this.g = string2;
    }

    public String a() {
        return this.g;
    }

    public static fhl a(long l) {
        fhl[] fhlArray;
        for (fhl fhl2 : fhlArray = fhl.values()) {
            if (l >= fhl2.f) continue;
            return fhl2;
        }
        return e;
    }

    public long b() {
        fhl[] fhlArray = fhl.values();
        int n = Arrays.binarySearch((Object[])fhlArray, (Object)this);
        if (n <= 0) {
            return 0L;
        }
        return fhlArray[n - 1].f;
    }

    public long c() {
        return this.f;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from flz
 */
public enum flz_0 {
    a(0, fly_0.values()),
    b(1, new fly_0[0]),
    c(2, fly_0.g),
    d(3, fly_0.b);

    private final byte e;
    private final List<fly_0> f;

    private flz_0(byte by, fly_0 ... fly_0Array) {
        this.e = by;
        this.f = List.of(fly_0Array);
    }

    public static flz_0 a(byte by) {
        for (flz_0 flz_02 : flz_0.values()) {
            if (flz_02.e != by) continue;
            return flz_02;
        }
        return b;
    }

    public byte a() {
        return this.e;
    }

    public List<fly_0> b() {
        return this.f;
    }
}


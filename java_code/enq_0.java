/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumMap;

/*
 * Renamed from eNq
 */
public enum enq_0 {
    a(0),
    b(1),
    c(2),
    d(3);

    private static final EnumMap<enq_0, enq_0> e;
    private final byte f;

    private enq_0(byte by) {
        this.f = by;
    }

    private static EnumMap<enq_0, enq_0> c() {
        EnumMap<enq_0, enq_0> enumMap = new EnumMap<enq_0, enq_0>(enq_0.class);
        enumMap.put(b, c);
        enumMap.put(c, b);
        enumMap.put(d, c);
        return enumMap;
    }

    public enq_0 a() {
        return e.get((Object)this);
    }

    public static enq_0 a(byte by) {
        enq_0[] enq_0Array = enq_0.values();
        for (int k = 0; k < enq_0Array.length; ++k) {
            enq_0 enq_02 = enq_0Array[k];
            if (enq_02.f != by) continue;
            return enq_02;
        }
        return a;
    }

    public byte b() {
        return this.f;
    }

    static {
        e = enq_0.c();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aoA
 */
public class aoa_2
extends apb_2 {
    private final long c;

    public aoa_2(int n, int n2, short s2) {
        this.c = apb_2.a(n, n2, s2);
    }

    @Override
    public double b(Object object, Object object2, Object object3, Object object4) {
        return Double.longBitsToDouble(this.c);
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        return this.c;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public Enum c() {
        return aoc_1.p;
    }
}


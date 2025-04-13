/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bYg
 */
public class byg_0
extends alk_2 {
    private final long a;
    private final short b;

    public byg_0(long l, short s2) {
        this.a = l;
        this.b = s2;
    }

    @Override
    public short a() {
        return 1;
    }

    @Override
    public akq_1 b() {
        return null;
    }

    @Override
    public int hashCode() {
        return new Long(this.a * (long)this.b).hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof byg_0) {
            byg_0 byg_02 = (byg_0)object;
            return this.a == byg_02.a && this.b == byg_02.b;
        }
        return false;
    }
}


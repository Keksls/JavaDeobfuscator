/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from OM
 */
class om_0
extends on_0 {
    private final long[] f;

    om_0(long ... lArray) {
        this.f = (long[])lArray.clone();
    }

    @Override
    int a() {
        return this.b == null ? this.a + this.f.length - 1 : this.b;
    }

    @Override
    public long[] b() {
        return (long[])this.f.clone();
    }
}


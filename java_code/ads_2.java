/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aDS
 */
class ads_2
extends adq_2 {
    protected final long d;

    ads_2(Runnable runnable, long l) {
        super(runnable);
        this.d = l;
    }

    @Override
    public long a(long l) {
        this.b = l + this.d;
        return this.b;
    }
}


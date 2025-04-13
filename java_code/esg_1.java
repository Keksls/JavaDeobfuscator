/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eSg
 */
class esg_1
implements esf_1 {
    private final long a;
    private final long b;

    esg_1(long l, long l2) {
        this.a = l;
        this.b = l2;
    }

    @Override
    public long b() {
        return this.b;
    }

    @Override
    public long a() {
        return this.a;
    }

    public String toString() {
        return "BuildingElementModel{m_uid=" + this.a + "}";
    }
}


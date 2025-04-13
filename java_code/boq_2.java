/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from boq
 */
public class boq_2
extends bon_2 {
    public boq_2(epa_1 epa_12, bor_1 bor_12) {
        this(epa_12, bor_12, -1);
    }

    public boq_2(epa_1 epa_12, bor_1 bor_12, byte by) {
        super(epa_12, by, bor_12);
        this.y.a(this);
    }

    @Override
    protected int a() {
        return this.y.a();
    }

    @Override
    protected int b() {
        return this.y.c();
    }
}


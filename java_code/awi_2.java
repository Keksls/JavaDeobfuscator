/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from awi
 */
public abstract class awi_2
extends avh_1 {
    protected final mg_1 b;

    protected awi_2(mg_1 mg_12) {
        this.b = mg_12;
    }

    public mg_1 b() {
        return this.b;
    }

    public static awi_2 a(mg_1 mg_12) {
        return mg_12.d() ? new awk_2(mg_12) : new awj_2(mg_12);
    }
}


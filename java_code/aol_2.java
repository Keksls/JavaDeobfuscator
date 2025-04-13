/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aoL
 */
public class aol_2
extends aoo_2 {
    private final aoq_1 a;
    private final aoq_1 b;

    private aol_2(aoq_1 aoq_12, aoq_1 aoq_13) {
        this.a = aoq_12;
        this.b = aoq_13;
    }

    public aoq_1 b() {
        return this.a;
    }

    public aoq_1 d() {
        return this.b;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if ((this.a.a() ? (double)this.a.a(object, object2, object3, object4) : this.a.b(object, object2, object3, object4)) != (this.b.a() ? (double)this.b.a(object, object2, object3, object4) : this.b.b(object, object2, object3, object4))) {
            return 0;
        }
        return -1;
    }

    @Override
    public boolean a() {
        return false;
    }

    public static apc_2 a(aot_2 aot_22, aot_2 aot_23) {
        aol_2.a(aot_22, aot_23);
        aoq_1 aoq_12 = (aoq_1)aot_22;
        aoq_1 aoq_13 = (aoq_1)aot_23;
        if (aoq_12.b() && aoq_13.b()) {
            return new aov_2((aoq_12.a() ? (double)aoq_12.a(null, null, null, null) : aoq_12.b(null, null, null, null)) != (aoq_13.a() ? (double)aoq_13.a(null, null, null, null) : aoq_13.b(null, null, null, null)));
        }
        return new aol_2(aoq_12, aoq_13);
    }

    @Override
    public Enum c() {
        return aoc_1.g;
    }
}


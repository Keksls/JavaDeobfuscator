/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aoD
 */
public class aod_1
extends aop_2 {
    private final aoq_1 a;
    private final aoq_1 b;

    private aod_1(aoq_1 aoq_12, aoq_1 aoq_13) {
        this.a = aoq_12;
        this.b = aoq_13;
    }

    public static aoq_1 a(aot_2 aot_22, aot_2 aot_23) {
        aod_1.a(aot_22, aot_23);
        aoq_1 aoq_12 = (aoq_1)aot_22;
        aoq_1 aoq_13 = (aoq_1)aot_23;
        if (aoq_12.b() && aoq_13.b()) {
            return new aow_2((aoq_12.a() ? (double)aoq_12.a(null, null, null, null) : aoq_12.b(null, null, null, null)) / (aoq_13.a() ? (double)aoq_13.a(null, null, null, null) : aoq_13.b(null, null, null, null)));
        }
        return new aod_1(aoq_12, aoq_13);
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public double b(Object object, Object object2, Object object3, Object object4) {
        double d2 = (this.a.a() ? (double)this.a.a(object, object2, object3, object4) : this.a.b(object, object2, object3, object4)) / (this.b.a() ? (double)this.b.a(object, object2, object3, object4) : this.b.b(object, object2, object3, object4));
        if (this.f()) {
            return -1.0 * d2;
        }
        return d2;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        throw new UnsupportedOperationException("Pas de division enti\u00e8re pour le moment");
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public Enum c() {
        return aoc_1.f;
    }
}


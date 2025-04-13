/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aoq
 */
public class aoq_2
extends aop_2 {
    private final aoq_1 a;
    private final aoq_1 b;

    private aoq_2(aoq_1 aoq_12, aoq_1 aoq_13) {
        this.a = aoq_12;
        this.b = aoq_13;
    }

    public static aoq_1 a(aot_2 aot_22, aot_2 aot_23) {
        aoq_2.a(aot_22, aot_23);
        aoq_1 aoq_12 = (aoq_1)aot_22;
        aoq_1 aoq_13 = (aoq_1)aot_23;
        if (aoq_12.b() && aoq_13.b()) {
            if (aoq_12.a() && aoq_13.a()) {
                return new aox_1(aoq_12.a(null, null, null, null) + aoq_13.a(null, null, null, null));
            }
            return new aow_2(aoq_12.b(null, null, null, null) + aoq_13.b(null, null, null, null));
        }
        return new aoq_2(aoq_12, aoq_13);
    }

    @Override
    public boolean a() {
        return this.a.a() && this.b.a();
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        long l = this.a.a(object, object2, object3, object4) + this.b.a(object, object2, object3, object4);
        if (this.f()) {
            return -1L * l;
        }
        return l;
    }

    @Override
    public double b(Object object, Object object2, Object object3, Object object4) {
        double d2 = this.a.b(object, object2, object3, object4) + this.b.b(object, object2, object3, object4);
        if (this.f()) {
            return -1.0 * d2;
        }
        return d2;
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public Enum c() {
        return aoc_1.a;
    }

    public aoq_1 d() {
        return this.a;
    }

    public aoq_1 e() {
        return this.b;
    }
}


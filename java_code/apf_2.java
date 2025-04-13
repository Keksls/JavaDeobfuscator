/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from apf
 */
public class apf_2
extends aot_1 {
    private final apc_2 a;
    private final apc_2 b;

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        boolean bl;
        boolean bl2 = this.a.b(object, object2, object3, object4) && !this.b.b(object, object2, object3, object4);
        boolean bl3 = bl = !this.a.b(object, object2, object3, object4) && this.b.b(object, object2, object3, object4);
        if (bl2 || bl) {
            return 0;
        }
        return -1;
    }

    private apf_2(apc_2 apc_22, apc_2 apc_23) {
        this.a = apc_22;
        this.b = apc_23;
    }

    public apc_2 b() {
        return this.a;
    }

    public apc_2 d() {
        return this.b;
    }

    @Override
    public boolean a() {
        return false;
    }

    public static apc_2 a(aot_2 aot_22, aot_2 aot_23) {
        apf_2.a(aot_22, aot_23);
        apc_2 apc_22 = (apc_2)aot_22;
        apc_2 apc_23 = (apc_2)aot_23;
        if (apc_22.a()) {
            if (apc_22.b(null, null, null, null)) {
                return new aov_2(true);
            }
            return apc_23;
        }
        if (apc_23.a()) {
            if (apc_23.b(null, null, null, null)) {
                return new aov_2(true);
            }
            return apc_22;
        }
        return new apf_2(apc_22, apc_23);
    }

    @Override
    public Enum c() {
        return aoc_1.m;
    }
}


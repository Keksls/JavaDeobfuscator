/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aoR
 */
public class aor_1
extends aot_1 {
    private final apc_2 a;
    private final apc_2 b;

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (this.a.b(object, object2, object3, object4) || this.b.b(object, object2, object3, object4)) {
            return 0;
        }
        return -1;
    }

    private aor_1(apc_2 apc_22, apc_2 apc_23) {
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
        aor_1.a(aot_22, aot_23);
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
        return new aor_1(apc_22, apc_23);
    }

    @Override
    public Enum c() {
        return aoc_1.l;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aoF
 */
public class aof_2
extends apc_2 {
    private final apc_2 a;
    private final apc_2 b;
    private final apc_2 f;

    public static aot_2 a(aot_2 aot_22, aot_2 aot_23, aot_2 aot_24) {
        if (aot_22 == null || aot_22.t_() != aov_1.c) {
            throw new aos_2("La condition d'un if doit \u00eatre un bool\u00e9en");
        }
        if (aot_23 == null || aot_24 == null || aot_23.t_() != aot_24.t_()) {
            throw new aos_2("Les deux branches d'un if doivent exister et avoir le m\u00eame type ");
        }
        if (aot_23.t_() == aov_1.c) {
            if (((apc_2)aot_22).a()) {
                if (((apc_2)aot_22).b(null, null, null, null)) {
                    if (((apc_2)aot_23).a()) {
                        return new aov_2(((apc_2)aot_23).b(null, null, null, null));
                    }
                    return aot_23;
                }
                if (((apc_2)aot_24).a()) {
                    return new aov_2(((apc_2)aot_24).b(null, null, null, null));
                }
                return aot_24;
            }
            return new aof_2((apc_2)aot_22, (apc_2)aot_23, (apc_2)aot_24);
        }
        if (aot_23.t_() == aov_1.b || aot_23.t_() == aov_1.f && aot_23.t_() == aot_24.t_()) {
            if (((apc_2)aot_22).a()) {
                if (((apc_2)aot_22).b(null, null, null, null)) {
                    return aot_23;
                }
                return aot_24;
            }
            return new aog_2((apc_2)aot_22, (aoq_1)aot_23, (aoq_1)aot_24);
        }
        throw new aos_2("Les deux branches d'un if doivent \u00eatre soit bool\u00e9ennes soit num\u00e9riques");
    }

    public aof_2(apc_2 apc_22, apc_2 apc_23, apc_2 apc_24) {
        this.a = apc_22;
        this.b = apc_23;
        this.f = apc_24;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (this.a.b(object, object2, object3, object4)) {
            return this.b.a(object, object2, object3, object4);
        }
        return this.f.a(object, object2, object3, object4);
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public Enum c() {
        return aoc_1.h;
    }
}


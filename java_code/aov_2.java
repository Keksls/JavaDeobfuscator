/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aov
 */
public class aov_2
extends apc_2 {
    public static final aov_2 a = new aov_2(true);
    public static final aov_2 b = new aov_2(false);
    private final boolean f;

    @Override
    public boolean a() {
        return true;
    }

    public aov_2(boolean bl) {
        this.f = bl;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (this.f) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return aoc_1.c;
    }
}


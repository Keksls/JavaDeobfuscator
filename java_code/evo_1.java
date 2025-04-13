/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVo
 */
public class evo_1
extends evk_1 {
    private static final apc_2 a = new aov_2(true);
    private final apc_2 b;

    public evo_1(int n, apc_2 apc_22, int n2, ezy_1 ezy_12, int n3) {
        super(n, n2, ezy_12, n3);
        this.b = apc_22 != null ? apc_22 : a;
    }

    public final apc_2 a() {
        return this.b;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public interface eDp {
    default public int a(ani_2 ani_22, efh_0 efh_02, eDl eDl2) {
        return this.a(ani_22, efh_02, eDl2, Function.identity());
    }

    public int a(ani_2 var1, efh_0 var2, eDl var3, Function<Object[], Object[]> var4);
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class bQG {
    private static final bQG a = new bQG();

    public static bQG a() {
        return a;
    }

    public static void a(int n, Object ... objectArray) {
        if (n == -1) {
            return;
        }
        String string = bQG.b(n, objectArray);
        aul_0.a().b(string);
    }

    @NotNull
    public static String b(int n, Object ... objectArray) {
        return bae.h().a(bQG.a((int)n).co, objectArray);
    }

    @NotNull
    private static bqh_0 a(int n) {
        bqh_0 bqh_02 = bqh_0.a(n);
        return bqh_02 != null ? bqh_02 : bqh_0.b;
    }
}


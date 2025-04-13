/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public final class btf {
    private static final String c = "DungeonLadderCrown";
    public static final String a = "DungeonLadderNoCrown";
    public static final String b = "DungeonGameplay";

    private btf() {
    }

    public static String a(int n) {
        eer_0 eer_02 = eer_0.b(n);
        return azs_0.a().s(String.valueOf(eer_02.b() + 1));
    }

    public static String b(int n) {
        eer_0 eer_02 = eer_0.b(n);
        int n2 = eer_02.b() + 1;
        return c + n2;
    }

    public static String a(@NotNull ezc_2 ezc_22) {
        return b + ezc_22.a();
    }
}


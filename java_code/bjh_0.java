/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bjH
 */
public enum bjh_0 {
    a;


    @Nullable
    public static bjh_0 a(@NotNull String string) {
        bjh_0[] bjh_0Array = bjh_0.values();
        for (int k = 0; k < bjh_0Array.length; ++k) {
            bjh_0 bjh_02 = bjh_0Array[k];
            if (!bjh_02.toString().equals(string)) continue;
            return bjh_02;
        }
        return null;
    }
}


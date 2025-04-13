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
 * Renamed from bjI
 */
public enum bji_0 {
    a;


    @Nullable
    public static bji_0 a(@NotNull String string) {
        bji_0[] bji_0Array = bji_0.values();
        for (int k = 0; k < bji_0Array.length; ++k) {
            bji_0 bji_02 = bji_0Array[k];
            if (!bji_02.toString().equals(string)) continue;
            return bji_02;
        }
        return null;
    }
}


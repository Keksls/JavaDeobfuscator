/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

final class bbI {
    private bbI() {
    }

    public static void a(@Nullable blx_1 blx_12, @Nullable blx_1 blx_13) {
        blx_1 blx_14 = blx_12 != null && blx_12.bp() ? blx_12 : (blx_13 != null && blx_13.bp() ? blx_13 : null);
        if (blx_14 != null) {
            blx_14.ch();
        }
    }
}


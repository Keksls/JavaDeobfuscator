/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from avC
 */
final class avc_2
extends ava_2 {
    @Override
    public boolean a(@NotNull String string, @NotNull String string2, @NotNull String string3) {
        return !d.a(string, string2, string3) && (string.contains("NVIDIA Corporation") || string2.contains("NVIDIA "));
    }
}


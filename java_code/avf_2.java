/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  org.jetbrains.annotations.NotNull
 */
import com.jogamp.opengl.GL;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from avF
 */
final class avf_2
extends ava_2 {
    @Override
    public boolean a(@NotNull GL gL) {
        String string = gL.glGetString(7936);
        return this.a(string);
    }

    public boolean a(@NotNull String string) {
        return string.startsWith("Apple");
    }

    @Override
    public boolean a(@NotNull String string, @NotNull String string2, @NotNull String string3) {
        return this.a(string);
    }
}


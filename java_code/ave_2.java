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
 * Renamed from avE
 */
final class ave_2
extends ava_2 {
    @Override
    public boolean a(@NotNull GL gL) {
        String string = gL.glGetString(7937);
        String string2 = gL.glGetString(7938);
        return this.a(string, string2);
    }

    public boolean a(@NotNull String string, @NotNull String string2) {
        String string3 = "Mesa ";
        return string.contains("Mesa ") || string.contains("Gallium ") || string2.contains("Mesa ");
    }

    @Override
    public boolean a(@NotNull String string, @NotNull String string2, @NotNull String string3) {
        return this.a(string2, string3);
    }
}


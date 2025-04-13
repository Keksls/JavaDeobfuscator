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
 * Renamed from avA
 */
public abstract class ava_2
extends Enum<ava_2> {
    public static final /* enum */ ava_2 a = new avb_2();
    public static final /* enum */ ava_2 b = new avc_2();
    public static final /* enum */ ava_2 c = new avd_2();
    public static final /* enum */ ava_2 d = new ave_2();
    public static final /* enum */ ava_2 e = new avf_2();
    public static final /* enum */ ava_2 f = new avg_2();
    private static final /* synthetic */ ava_2[] g;

    public static ava_2[] values() {
        return (ava_2[])g.clone();
    }

    public static ava_2 valueOf(String string) {
        return Enum.valueOf(ava_2.class, string);
    }

    public boolean a(@NotNull GL gL) {
        String string = gL.glGetString(7936);
        String string2 = gL.glGetString(7937);
        String string3 = gL.glGetString(7938);
        return this.a(string, string2, string3);
    }

    public abstract boolean a(@NotNull String var1, @NotNull String var2, @NotNull String var3);

    static {
        g = new ava_2[]{a, b, c, d, e, f};
    }
}


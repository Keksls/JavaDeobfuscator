/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fqV
 */
public abstract class fqv_0
extends Enum<fqv_0> {
    public static final /* enum */ fqv_0 a = new fqw_0();
    public static final /* enum */ fqv_0 b = new fqx_0();
    private static final /* synthetic */ fqv_0[] c;

    public static fqv_0[] values() {
        return (fqv_0[])c.clone();
    }

    public static fqv_0 valueOf(String string) {
        return Enum.valueOf(fqv_0.class, string);
    }

    @Nullable
    public abstract <T> T a(ArrayList<T> var1, int var2);

    public abstract <T> float a(float var1, ArrayList<T> var2, boolean var3, float var4, float var5, int var6);

    static {
        c = new fqv_0[]{a, b};
    }
}


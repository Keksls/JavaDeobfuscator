/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class acw
implements ahk_0<acb_0> {
    private static final Logger d = Logger.getLogger(acw.class);
    public static final int a = 300;
    static final float[][] e = new float[1][];
    private static final acw f;
    private static final int g = 0;
    public static final int b = 0;
    private boolean h = true;
    int i = Integer.MAX_VALUE;
    private final acx_0 j = new acx_0(this);

    private acw() {
    }

    public static acw a() {
        return f;
    }

    public static boolean a(int n) {
        return n == 0;
    }

    public final float[] a(@NotNull aiG aiG2) {
        boolean bl;
        float[] fArray;
        int n = aiG2.aq();
        try {
            fArray = this.j.a(n);
            if (fArray != null) {
                return fArray;
            }
        }
        catch (Exception exception) {
            d.error((Object)"", (Throwable)exception);
            return new float[]{1.0f, 0.5f, 0.5f, 1.0f};
        }
        try {
            bl = this.a(this.i, n);
        }
        catch (Exception exception) {
            d.error((Object)"", (Throwable)exception);
            return new float[]{1.0f, 1.0f, 1.0f, 1.0f};
        }
        fArray = bl ? new float[]{1.0f, 1.0f, 1.0f, 1.0f} : new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.j.a(n, fArray);
        return fArray;
    }

    public final boolean a(int n, int n2) {
        try {
            return YY.a().a(n, n2);
        }
        catch (Exception exception) {
            return true;
        }
    }

    @Override
    public final void a(@NotNull acb_0 acb_02, float f2, float f3) {
        if (this.j.a == e) {
            this.j.b(YY.a().c());
            assert (this.j.a != e);
        }
    }

    @Override
    public final void a(@NotNull acb_0 acb_02, int n) {
        abY abY2 = acb_02.b();
        int n2 = abY2.a();
        boolean bl = false;
        if (n2 != this.i) {
            this.j.b();
            boolean bl2 = this.b(n2);
            bl = this.h != bl2;
            this.h = bl2;
            this.i = n2;
        }
        try {
            this.j.a(n, bl);
        }
        catch (Exception exception) {
            d.error((Object)("Probl\u00e8lme de fade de layer maskKey=" + n2));
            this.i = n2 == 0 ? Integer.MAX_VALUE : 0;
        }
    }

    public final boolean b() {
        return this.b(this.i);
    }

    public final boolean b(int n) {
        return this.a(n, 0);
    }

    public final void c() {
        this.i = Integer.MAX_VALUE;
        this.h = true;
        this.j.a();
    }

    static {
        acw.e[0] = new float[]{1.0f, 1.0f, 1.0f, 1.0f};
        f = new acw();
    }
}


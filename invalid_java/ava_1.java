/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ava
 */
public class ava_1 {
    private static final Logger c = Logger.getLogger(ava_1.class);
    public static final String a = "gColorScale";
    private final aut_1[] d;
    private final int[] e;
    private final float[] f;

    public static ava_1 a(ava_1 ava_12) {
        if (ava_12 == null) {
            return null;
        }
        return new ava_1(ava_12);
    }

    public float a(String string) {
        int n = this.b(string);
        if (n >= 0) {
            return this.f[n];
        }
        return 0.0f;
    }

    public ava_1(aut_1 ... aut_1Array) {
        this.d = new aut_1[aut_1Array.length + 1];
        this.d[0] = new aut_1(a, auu_1.a);
        System.arraycopy(aut_1Array, 0, this.d, 1, aut_1Array.length);
        int n = this.d.length;
        this.e = new int[n];
        int n2 = 0;
        for (int k = 0; k < n; ++k) {
            this.e[k] = n2;
            n2 += this.d[k].c.a();
        }
        this.f = new float[n2];
        this.a(a, 2.0f);
    }

    private ava_1(ava_1 ava_12) {
        this.d = (aut_1[])ava_12.d.clone();
        this.e = (int[])ava_12.e.clone();
        this.f = (float[])ava_12.f.clone();
    }

    public final void a(String string, float f2) {
        int n = this.b(string);
        assert (this.c(string) == auu_1.a);
        if (n >= 0) {
            this.f[n] = f2;
        }
    }

    public final void a(String string, float f2, float f3) {
        int n = this.b(string);
        assert (this.c(string) == auu_1.b);
        if (n >= 0) {
            this.f[n] = f2;
            this.f[n + 1] = f3;
        }
    }

    public final void a(String string, float f2, float f3, float f4) {
        int n = this.b(string);
        assert (this.c(string) == auu_1.c);
        if (n >= 0) {
            this.f[n] = f2;
            this.f[n + 1] = f3;
            this.f[n + 2] = f4;
        }
    }

    public final void a(String string, float f2, float f3, float f4, float f5) {
        int n = this.b(string);
        assert (this.c(string) == auu_1.d);
        if (n >= 0) {
            this.f[n] = f2;
            this.f[n + 1] = f3;
            this.f[n + 2] = f4;
            this.f[n + 3] = f5;
        }
    }

    public final void a(String string, float[] fArray) {
        this.a(string, fArray, auu_1.c);
    }

    public final void b(String string, float[] fArray) {
        this.a(string, fArray, auu_1.d);
    }

    public final void c(String string, float[] fArray) {
        this.a(string, fArray, auu_1.e);
    }

    public final void a(avb_1 avb_12) {
        int n = this.d.length;
        for (int k = 0; k < n; ++k) {
            avb_12.a(this.d[k], this.e[k], this.f);
        }
    }

    private void a(String string, float[] fArray, auu_1 auu_12) {
        int n = this.b(string);
        if (n >= 0) {
            assert (this.c(string) == auu_12);
            assert (fArray.length == auu_12.a());
            for (float this.f[n + var5_5] : fArray) {
            }
        }
    }

    private int b(String string) {
        int n = this.d.length;
        for (int k = 0; k < n; ++k) {
            if (!this.d[k].b.equals(string)) continue;
            return this.e[k];
        }
        c.error((Object)("pas de variable nomm\u00e9 " + string));
        return -1;
    }

    private auu_1 c(String string) {
        int n = this.d.length;
        for (int k = 0; k < n; ++k) {
            if (!this.d[k].b.equals(string)) continue;
            return this.d[k].c;
        }
        return null;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.Arrays;

/*
 * Renamed from acx
 */
final class acx_0 {
    private static final float d = 0.0033333334f;
    private static final float e = 2.0f;
    float[][] a;
    private final TIntArrayList f = new TIntArrayList(20);
    private int[] g;
    private boolean[] h;
    private boolean[] i;
    static final /* synthetic */ boolean b;
    final /* synthetic */ acw c;

    acx_0(acw acw2) {
        this.c = acw2;
        this.a();
    }

    void a() {
        this.a = acw.e;
        this.h = null;
        this.i = null;
        this.f.reset();
        this.g = null;
    }

    float[] a(int n) {
        return this.a[Math.abs(n)];
    }

    void a(int n, float[] fArray) {
        this.f.add(n);
        if (n < 0) {
            n = -n;
        }
        if (!b && this.a[n] != null) {
            throw new AssertionError((Object)"Le groupe est d\u00e9j\u00e0 en cache");
        }
        this.a[n] = fArray;
        this.g = null;
    }

    void b(int n) {
        if (!b && this.a != acw.e) {
            throw new AssertionError();
        }
        if (!b && this.i != null) {
            throw new AssertionError();
        }
        if (!b && this.h != null) {
            throw new AssertionError();
        }
        this.a = new float[n][];
        this.i = new boolean[n];
        this.h = new boolean[n];
    }

    private boolean a(float[] fArray, float f2) {
        if (fArray == null) {
            return false;
        }
        if (fArray[0] > 0.0f) {
            fArray[0] = fArray[0] - (f2 *= 2.0f);
            fArray[1] = fArray[1] - f2;
            fArray[2] = fArray[2] - f2;
            if (fArray[0] < 0.0f) {
                fArray[3] = fArray[3] - -fArray[0];
                fArray[2] = 0.0f;
                fArray[1] = 0.0f;
                fArray[0] = 0.0f;
                if (fArray[3] < 0.0f) {
                    fArray[3] = 0.0f;
                }
            }
            return false;
        }
        if (fArray[3] > 0.0f) {
            fArray[3] = fArray[3] - f2;
            if (fArray[3] < 0.0f) {
                fArray[3] = 0.0f;
            }
            return false;
        }
        return true;
    }

    private boolean b(float[] fArray, float f2) {
        if (fArray == null) {
            return false;
        }
        if (fArray[0] > 0.0f) {
            fArray[0] = fArray[0] - f2;
            fArray[1] = fArray[1] - f2;
            fArray[2] = fArray[2] - f2;
            fArray[3] = fArray[3] - f2;
            if (fArray[0] < 0.0f) {
                fArray[3] = 0.0f;
                fArray[2] = 0.0f;
                fArray[1] = 0.0f;
                fArray[0] = 0.0f;
            }
            return false;
        }
        return true;
    }

    private boolean c(float[] fArray, float f2) {
        if (fArray == null) {
            return false;
        }
        if (fArray[3] < 1.0f) {
            fArray[3] = fArray[3] + 2.0f * f2;
            if (fArray[3] > 1.0f) {
                f2 = fArray[3] - 1.0f;
                fArray[0] = fArray[0] + f2;
                fArray[1] = fArray[1] + f2;
                fArray[2] = fArray[2] + f2;
                fArray[3] = 1.0f;
                if (fArray[0] > 1.0f) {
                    fArray[2] = 1.0f;
                    fArray[1] = 1.0f;
                    fArray[0] = 1.0f;
                }
            }
            return false;
        }
        if (fArray[0] < 1.0f) {
            fArray[0] = fArray[0] + f2;
            fArray[1] = fArray[1] + f2;
            fArray[2] = fArray[2] + f2;
            if (fArray[0] > 1.0f) {
                fArray[2] = 1.0f;
                fArray[1] = 1.0f;
                fArray[0] = 1.0f;
            }
            return false;
        }
        return true;
    }

    private boolean d(float[] fArray, float f2) {
        if (fArray == null) {
            return false;
        }
        if (fArray[0] < 1.0f) {
            fArray[0] = fArray[0] + f2;
            fArray[1] = fArray[1] + f2;
            fArray[2] = fArray[2] + f2;
            fArray[3] = fArray[3] + f2;
            if (fArray[0] > 1.0f) {
                fArray[3] = 1.0f;
                fArray[2] = 1.0f;
                fArray[1] = 1.0f;
                fArray[0] = 1.0f;
            }
            return false;
        }
        return true;
    }

    void a(int n, boolean bl) {
        float f2 = 0.0033333334f * (float)n;
        int n2 = this.f.size();
        if (this.g == null) {
            this.g = new int[n2];
            this.f.toArray(this.g, 0, n2);
            Arrays.sort(this.g);
        }
        for (int k = 0; k < n2; ++k) {
            int n3;
            int n4 = this.g[k];
            int n5 = n3 = n4 > 0 ? n4 : -n4;
            if (this.i[n3]) continue;
            if (bl) {
                this.h[n3] = true;
            }
            float[] fArray = this.a[n3];
            if (acw.a(n4) || this.h[n3]) {
                if (!this.a(n4, fArray, f2)) continue;
                this.a(n3, n4);
                continue;
            }
            if (!this.b(n4, fArray, f2)) continue;
            this.a(n3, n4);
        }
    }

    private void a(int n, int n2) {
        this.a[n] = null;
        this.h[n] = false;
        ahx_2.a(this.f, n2);
    }

    private boolean a(int n, float[] fArray, float f2) {
        if (this.c.a(this.c.i, n)) {
            if (this.c(fArray, f2)) {
                this.i[n > 0 ? n : -n] = true;
            }
            return false;
        }
        if (this.a(fArray, f2)) {
            this.i[n > 0 ? n : -n] = true;
            return true;
        }
        return false;
    }

    private boolean b(int n, float[] fArray, float f2) {
        if (this.c.a(this.c.i, n)) {
            if (this.d(fArray, f2)) {
                this.i[n > 0 ? n : -n] = true;
            }
            return false;
        }
        if (this.b(fArray, f2)) {
            this.i[n > 0 ? n : -n] = true;
            return true;
        }
        return false;
    }

    void b() {
        int n;
        if (this.i == null) {
            return;
        }
        int n2 = this.i.length;
        for (n = 0; n < n2; ++n) {
            this.i[n] = false;
        }
        n2 = this.h.length;
        for (n = 0; n < n2; ++n) {
            this.h[n] = false;
        }
    }

    static {
        b = !acw.class.desiredAssertionStatus();
    }
}


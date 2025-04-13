/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ajF
 */
public class ajf_0 {
    public static final byte a = 1;
    public static final byte b = 2;
    public static final byte c = 3;
    public static final float d = -2.0f;
    private final float e;
    private final float f;
    private final byte g;
    private boolean h;

    public ajf_0(float f2, float f3, byte by) {
        this.e = f2;
        this.f = f3;
        this.g = by;
    }

    public int a(int n, int n2) {
        if (this.e == -2.0f) {
            return n2;
        }
        return (int)((float)n * this.e);
    }

    public int b(int n, int n2) {
        if (this.f == -2.0f) {
            return n2;
        }
        return (int)((float)n * this.f);
    }

    public int c(int n, int n2) {
        switch (this.g) {
            case 1: 
            case 3: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case 2: {
                return Math.max(0, n2 - n);
            }
        }
        return 0;
    }

    public int d(int n, int n2) {
        switch (this.g) {
            case 1: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case 2: 
            case 3: {
                return 0;
            }
        }
        return 0;
    }

    public boolean a() {
        return this.h;
    }

    public void a(boolean bl) {
        this.h = bl;
    }
}

